package banking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Bank {

    private static final Bank INSTANCE = new Bank();

    private Bank(){ }

    public static Bank getInstance() {
        return INSTANCE;
    }

    private final Banksystem banksystem = new Banksystem();

    public GeldAutomat getBankAutomat(Kunde kunde) {
        return new GeldAutomat(getKontoByKunde(kunde));
    }

    private Konto getKontoByKunde(Kunde kunde) {
        return kundeKontoHashMap.get(kunde);
    }

    private Mitarbeiter getMitarbeiterByMitarbeiterId(String mitarbeiterId){
        for (Mitarbeiter mitarbeiter: mitarbeiterList){
            if(mitarbeiter.getMitarbeiterId().equals(mitarbeiterId)){
                return mitarbeiter;
            }
        }
        return null;
    }

    public MitarbeiterTerminal getMitarbeiterTerminal(String mitarbeiterId, String mitarbeiterPasswort) {
        Mitarbeiter mitarbeiter = getMitarbeiterByMitarbeiterId(mitarbeiterId);
        if(mitarbeiter == null)
            return null;
        if(mitarbeiter.getPassword().equals(mitarbeiterPasswort)){
            return new MitarbeiterTerminal(banksystem);
        }
        return null;
    }


}
