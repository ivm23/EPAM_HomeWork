package main.model.student;

import main.model.marks.Marks;
import main.model.disciplines.Disciplines;

public class DisciplineAndMark {
    private Disciplines discipline;
    private Marks marks;

    public DisciplineAndMark(Disciplines discipline, Marks marks) {
        this.discipline = discipline;
        this.marks = marks;
    }

    public Disciplines getDisciplines() {
        return discipline;
    }

    public void setDisciplines(Disciplines discipline) {
        this.discipline = discipline;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return discipline.getName() + " " + marks.toString();
    }
}
