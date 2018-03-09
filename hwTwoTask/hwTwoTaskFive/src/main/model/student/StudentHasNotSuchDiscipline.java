package main.model.student;

public class StudentHasNotSuchDiscipline extends Exception {
    String studentName;
    String disciplineName;

    public StudentHasNotSuchDiscipline(String studentName, String disciplineName){
        this.studentName = studentName;
        this.disciplineName = disciplineName;
    }
}
