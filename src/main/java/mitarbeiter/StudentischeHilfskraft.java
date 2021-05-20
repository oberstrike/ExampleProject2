package mitarbeiter;

import student.Kurs;

import java.util.ArrayList;
import java.util.List;

public class StudentischeHilfskraft extends AbstractMitarbeiter {


    public StudentischeHilfskraft(Long id, String name) {
        super(id, name);
    }



    public List<Professor> getProfessoren() {
        return professoren;
    }

    public void setProfessoren(List<Professor> professoren) {
        this.professoren = professoren;
    }

    private List<Professor> professoren = new ArrayList<>();

}
