package main.java.lab.model;

public enum Skills {
    JAVA("java"),
    ENGLISH("english"),
    TEAM_PLAYER("team");

    String description;
    Skills(String description) {
        this.description = description;
    }
}
