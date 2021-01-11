package banking;

import java.util.HashMap;
import java.util.List;

public class MitarbeiterTerminal {

    private final Banksystem banksystem;

    public MitarbeiterTerminal(Banksystem banksystem) {
        this.banksystem = banksystem;
    }

    public Kunde addKunde(Kunde kunde) {
        banksystem.addKunde(kunde);
        return kunde;
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        banksystem.addMitarbeiter(mitarbeiter);
    }

}
