package mitarbeiter;

import student.Kurs;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class Professor extends AbstractMitarbeiter {

    //OneToMany
    private List<Kurs> kurse = new ArrayList<>();

    public Professor(Long id, String name) {
        super(id, name);
    }

    public List<Kurs> getKurse() {
        return kurse;
    }

    public void setKurse(List<Kurs> kurse) {
        this.kurse = kurse;
    }
}
