package main.model.student;

import main.model.disciplines.Discipline;
import main.model.marks.Marks;

import java.util.*;

public class Student {
    private String name;
    private Set<DisciplineRegister> studentJournal;

    public Student(String name) {
        studentJournal = new HashSet<>();
        this.name = name;
    }

    public void setDisciplineWithMarks(Discipline discipline, Marks marks) throws Exception {
        studentJournal.add(new DisciplineRegister(discipline, marks));
    }

    public Set<DisciplineRegister> getStudentJournal() {
        return studentJournal;
    }

    public Set<Discipline> getDisciplines() {
        Set<Discipline> allDisciplines = new HashSet<>();
        for (DisciplineRegister disciplineRegister : studentJournal) {
            allDisciplines.add(disciplineRegister.getDiscipline());
        }
        return allDisciplines;
    }

    public Marks getMarksOfDiscipline(Discipline discipline) throws Exception {

        for (DisciplineRegister disciplineAndMarks : studentJournal) {
            if (disciplineAndMarks.getDiscipline() == discipline) {
                return disciplineAndMarks.getMarks();
            }
        }
        throw new Exception(name + ": " + discipline.getName());
    }
}
