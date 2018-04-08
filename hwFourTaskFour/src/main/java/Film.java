package main.java;

import javafx.util.Pair;
import main.java.exceptions.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Film implements Serializable{
    private String filmTitle;
    private Map<Role, Actor> filmRoles;

    public Film(String filmTitle, Pair<Role, Actor>... actors) {

        this.filmTitle = filmTitle;
        filmRoles = new HashMap<Role, Actor>();

        for (Pair<Role, Actor> roleAndActor : actors) {
            filmRoles.put(roleAndActor.getKey(), roleAndActor.getValue());
        }
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public Actor getActorByRole(Role role) throws RoleIsNull, RoleIsNotExist {
        if (role == null) {
            throw new RoleIsNull();
        }
        if (!filmRoles.containsKey(role)) {
            throw new RoleIsNotExist(role);
        }
        return filmRoles.get(role);
    }

    public List<Role> getRolesByActor(Actor actor) throws ActorIsNull, ActorIsNotExist {
        List<Role> allActorRoles = new ArrayList<Role>();

        if (null == actor) {
            throw new ActorIsNull();
        }

        if (!filmRoles.containsValue(actor)) {
            throw new ActorIsNotExist(actor);
        }
        filmRoles.keySet().forEach(role -> allActorRoles.add(role));
        return allActorRoles;
    }


    public void addNewRoleAndActor(Role role, Actor actor) throws RoleIsNull, ActorIsNull, RoleIsExist {
        if (null == role) {
            throw new RoleIsNull();
        }
        if (null == actor) {
            throw new ActorIsNull();
        }
        if (filmRoles.containsKey(role)) {
            throw new RoleIsExist(role);
        }

        filmRoles.put(role, actor);
    }

    public void deleteRoleAndActor(Role role) throws RoleIsNull, RoleIsNotExist {
        if (null == role) {
            throw new RoleIsNull();
        }
        if (!filmRoles.containsKey(role)) {
            throw new RoleIsNotExist((role));
        }
        filmRoles.remove(role);
    }

    public void printAllRoleAndActor() {
        filmRoles.forEach((role, actor) -> System.out.println(role.toString() + " " + actor.toString()));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (null == object) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }

        Film film = (Film) object;

        if (filmTitle == null) {
            return false;
        }
        if (!filmTitle.equals(film.filmTitle) || filmRoles.size() != film.filmRoles.size()) {
            return false;
        }

        for (Role role: filmRoles.keySet()) {
            if (!film.filmRoles.containsKey(role)) {
                return false;
            }
            if (film.filmRoles.get(role).equals(filmRoles.get(role))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (null != filmTitle ? filmTitle.hashCode() + filmRoles.keySet().hashCode() : 0);
    }

}
