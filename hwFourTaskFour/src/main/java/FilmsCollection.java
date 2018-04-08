package main.java;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class FilmsCollection implements Serializable {
    private Set<Film> filmSet;

    public FilmsCollection() {
        filmSet = new HashSet<Film>();
    }
    public FilmsCollection(Film film) {
        filmSet = new HashSet<Film>();
        filmSet.add(film);
    }

    public boolean addFilm(Film film) {
        if (null == film.getFilmTitle()) {
            return false;
        }
        if (filmSet.contains(film)) {
            return false;
        }
        filmSet.add(film);
        return true;
    }

    public boolean deleteFilm(Film film) {
        if (null == film) {
            return false;
        }
        if (!filmSet.contains(film)) {
            return false;
        }
        filmSet.remove(film);

        return true;
    }
    public boolean deleteFilm(String filmTitle) {
        if (null == filmTitle) {
            return false;
        }
        if (filmSet.stream().filter(title -> title.getFilmTitle().equals(filmTitle)).count() == 0) {
            return false;
        }

        filmSet.removeIf(title -> title.getFilmTitle().equals(filmTitle));
        return true;
    }

    public Film getFilm(Film film) {
        if (null == film) {
            return null;
        }
        if (!filmSet.contains(film) ) {
            return null;
        }
       return filmSet.stream().filter(data -> data.equals(film)).findAny().get();
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

        FilmsCollection filmsCollection = (FilmsCollection) object;

        for(Film film : filmSet) {
            if (!filmsCollection.filmSet.contains(film)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (null != filmSet ? filmSet.hashCode() : 0);
    }


}
