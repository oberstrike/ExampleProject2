package student;

import mitarbeiter.Professor;

import java.util.List;

public class Kurs {

    private List<Student> studenten;

    //ManyToOne
    private Professor professor;

    public Kurs(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudenten() {
        return studenten;
    }

    public void setStudenten(List<Student> studenten) {
        this.studenten = studenten;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student){
        student.addKurs(this);
        this.studenten.add(student);
    }
}
