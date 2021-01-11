package banking;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();

        MitarbeiterTerminal mitarbeiterTerminal = bank.getMitarbeiterTerminal("mitarbeiter#1", "1234");

        Kunde kunde = new Kunde();
        Kunde registrierterKunde = mitarbeiterTerminal.addKunde(kunde);
        mitarbeiterTerminal.addMitarbeiter(new Mitarbeiter("mitarbeiter#2", "neuesPasswort"));

        bank.getBankAutomat(kunde);

    }
}
