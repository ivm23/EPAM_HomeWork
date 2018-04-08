package main.java.exceptions;

import main.java.Actor;

public class ActorIsNotExist extends Exception {
    public ActorIsNotExist(Actor actor) {
        System.out.println(actor.toString() + "isn't exist in this film!");
    }
}
