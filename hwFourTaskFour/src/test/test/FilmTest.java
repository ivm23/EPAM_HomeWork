package test.test;

import javafx.util.Pair;
import main.java.Actor;
import main.java.Film;
import main.java.FilmsCollection;
import main.java.Role;
import main.java.exceptions.ActorIsNull;
import main.java.exceptions.RoleIsExist;
import main.java.exceptions.RoleIsNotExist;
import main.java.exceptions.RoleIsNull;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FilmTest {

    private Film film;
    private Actor actor;
    private Role role;
    private Pair<Role, Actor> roleActorPair;

    @Before
    public void setUp() {
        actor = new Actor("Jim", "Carrey");
        role = new Role("detective", true);
        roleActorPair = new Pair<Role, Actor>(role, actor);

        film = new Film("23", roleActorPair);
    }

    @Test(expected = RoleIsNull.class)
    public void addRoleShouldCatchRoleIsNullForNullRole() throws ActorIsNull, RoleIsExist, RoleIsNull {
        film.addNewRoleAndActor(null, actor);
    }

    @Test(expected = ActorIsNull.class)
    public void addRoleShouldCatchActorIsNullForNullActor() throws ActorIsNull, RoleIsExist, RoleIsNull {
        film.addNewRoleAndActor(role, null);
    }

    @Test(expected = RoleIsExist.class)
    public void addRoleShouldCatchRoleIsExistIfRoleAlreadyExist() throws ActorIsNull, RoleIsExist, RoleIsNull {
        Actor newActor = new Actor("Jack", "Johns");
        film.addNewRoleAndActor(role, newActor);
    }

    @Test
    public void getActorByRoleShouldReturnActor() throws RoleIsNull, RoleIsNotExist {
        assertEquals(actor, film.getActorByRole(role));
    }

    @Test (expected = RoleIsNotExist.class)
    public void deleteRoleAndActorShouldCatchRoleIsNotExistAfterDelete() throws RoleIsNull, RoleIsNotExist {
        film.deleteRoleAndActor(role);
        film.getActorByRole(role);
    }

    private FilmsCollection makeFilmsCollection(Film film) {
        return new FilmsCollection(film);
    }
    @Test
    public void addFilmShouldReturnFalseForExistFilm() {
        FilmsCollection filmsCollection = makeFilmsCollection(film);
        assertFalse(filmsCollection.addFilm(film));
    }
    @Test
    public void getFilmShouldReturnFilm() {
        FilmsCollection filmsCollection = makeFilmsCollection(film);
        assertEquals(film, filmsCollection.getFilm(film));
    }

    @Test
    public void deleteFilmShouldReturnTrueForExistFilm() {
        FilmsCollection filmsCollection = makeFilmsCollection(film);
        assertTrue(filmsCollection.deleteFilm(film));
    }

    @Test
    public void deleteFilmByNameShouldReturnTrueForExistFilm() {
        FilmsCollection filmsCollection = makeFilmsCollection(film);
        assertTrue(filmsCollection.deleteFilm(film.getFilmTitle()));
    }
}
