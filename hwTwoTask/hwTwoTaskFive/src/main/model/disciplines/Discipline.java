package main.model.disciplines;

public enum Discipline {
    MATHEMATICS("Mathematics", 1, 2, 3, 4, 5),
    PHYSICS("Physics", 1, 2, 3, 4, 5),
    CHEMISTRY("Chemistry", 1.0, 2.0, 3.0, 4.0, 5.0),
    BIOLOGY("Biology", 1.0, 2.0, 3.0, 4.0, 5.0);

    private String disciplineName;
    private int[] intMarks;
    private double[] doubleMarks;

    Discipline(String disciplineName, int... marks) {
        this.disciplineName = disciplineName;
        intMarks = marks;
    }

    Discipline(String disciplineName, double... marks) {
        this.disciplineName = disciplineName;
        doubleMarks = marks;
    }

    public int[] getIntMarks() {
        return intMarks;
    }

    public double[] getDoubleMarks() {
        return doubleMarks;
    }

    public String getName() {
        return disciplineName;
    }

    @Override
    public String toString() {
        return disciplineName;
    }

}