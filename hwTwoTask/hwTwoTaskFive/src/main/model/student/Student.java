package main.model.student;

import main.model.disciplines.Disciplines;
import main.model.marks.Marks;

import java.util.*;

public class Student {
    private String name;
    private Set<DisciplineAndMark> studentJournal;

    public Student(String name) {
        studentJournal = new HashSet<>();
        this.name = name;
    }

    public void setDisciplineWithMarks(Disciplines discipline, Marks marks) {

        studentJournal.add(new DisciplineAndMark(discipline, marks));
    }

    public Set<DisciplineAndMark> getStudentJournal() {
        return studentJournal;
    }

    public Set<Disciplines> getDisciplines() {
        Set<Disciplines> allDisciplines = new HashSet<>();
        for (DisciplineAndMark disciplineAndMark : studentJournal) {
            allDisciplines.add(disciplineAndMark.getDisciplines());
        }
        return allDisciplines;
    }

    public Marks getMarksOfDiscipline(Disciplines discipline) throws StudentHasNotSuchDiscipline {

        for (DisciplineAndMark disciplineAndMarks : studentJournal) {
            if (disciplineAndMarks.getDisciplines() == discipline) {
                return disciplineAndMarks.getMarks();
            }
        }
        throw new StudentHasNotSuchDiscipline(name, discipline.getName());
    }
}
