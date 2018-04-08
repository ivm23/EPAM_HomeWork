package test.test;

import javafx.util.Pair;
import main.java.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilmSerializerTest {
    private FilmsCollection filmsCollection;
    private String fileName;
    private Film film;
    private Actor actor;
    private Role role;
    private Pair<Role, Actor> roleActorPair;

    @Before
    public void setUp() {
        filmsCollection = new FilmsCollection();
        actor = new Actor("Jim", "Carrey");
        role = new Role("detective", true);
        roleActorPair = new Pair<Role, Actor>(role, actor);

        film = new Film("23", roleActorPair);
        filmsCollection.addFilm(film);
        fileName = "Films.txt";
    }

    @Test
    public void serializeShouldReturnFalseForNullFileName() {
        assertFalse(FilmSerializer.serialize(filmsCollection, null));
    }

    @Test
    public void deserializeShouldReturnNullForNullFileName() {
        assertNull(FilmSerializer.deserialize(null));
    }

    @Test
    public void serializeShouldReturnTrueAndSerializeObject() {
        assertTrue(FilmSerializer.serialize(filmsCollection, fileName));
    }

    @Test
    public void deserializeShouldReturnObjectFromFile() {
        FilmSerializer.serialize(filmsCollection, fileName);
        assertEquals(filmsCollection.hashCode(), FilmSerializer.deserialize(fileName).hashCode());
    }
}
