package student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String matrikelNummer;

    private List<Kurs> kurse = new ArrayList<>();

    public Student(String matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }

    public String getMatrikelNummer() {
        return matrikelNummer;
    }

    public void setMatrikelNummer(String matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }

    public void setMatrikelNummer(String matrikelNummer, String name){
        System.out.println("Hallo!");
    }

    public List<Kurs> getKurse() {
        return kurse;
    }

    public void setKurse(List<Kurs> kurse) {
        this.kurse = kurse;
    }

    public void addKurs(Kurs kurs) {
        this.kurse.add(kurs);
    }
}
