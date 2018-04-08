package main.java;

import java.io.*;

public class FilmSerializer {

    public static boolean serialize(FilmsCollection object, String fileName) {
        if (null == fileName) {
            return false;
        }
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(object);
        } catch (IOException exception) {
            System.out.println(exception);
            return false;
        }
        return true;
    }

    public static FilmsCollection deserialize(String fileName) {
        FilmsCollection filmsCollection;
        if (null == fileName) {
            return null;
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            filmsCollection = (FilmsCollection) objectInputStream.readObject();
        } catch (IOException exception) {
            System.out.println(exception);
            return null;
        } catch (ClassNotFoundException exception) {
            System.out.println(exception);
            return null;
        }
        return filmsCollection;
    }
}
