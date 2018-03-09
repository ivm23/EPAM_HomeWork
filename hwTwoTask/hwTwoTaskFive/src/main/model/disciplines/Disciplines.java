package main.model.disciplines;

public enum Disciplines {
    MATHEMATICS("Mathematics", 1, 2, 3, 4, 5),
    PHYSICS("Physics", 1, 2, 3, 4, 5),
    CHEMISTRY("Chemistry", 1.0, 2.0, 3.0, 4.0, 5.0),
    BIOLOGY("Biology", 1.0, 2.0, 3.0, 4.0, 5.0);

    private String disciplineName;

    Disciplines(String disciplineName, int... marks) {
        this.disciplineName = disciplineName;
    }

    Disciplines(String disciplineName, double... marks) {
        this.disciplineName = disciplineName;
    }

    public String getName() {
        return disciplineName;
    }
    @Override
    public String toString() {
        return disciplineName;
    }

}