package banking;

public class Konto {
    private double kontostand;

    private Kunde kunde;

    public Konto(double kontostand, Kunde kunde){
        this.kontostand = kontostand;
        this.kunde = kunde;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public double getKontostand() {
        return kontostand;
    }
}
