package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Gericht implements Comparable<Gericht> {

    private List<Zutat> zutaten = new ArrayList<>();

    private double preis = 1.0;

    public Gericht() {

    }

    public void addZutat(Zutat zutat) {
        zutaten.add(zutat);
    }

    public boolean hatZutat(Zutat zutat) {
        return zutaten.contains(zutat);
    }

    public String getName() {
        StringBuilder neuerName = new StringBuilder();
        for (Zutat zutat : zutaten) {
            neuerName.append(zutat.getName().substring(0, 2));
        }
        return neuerName.toString();
    }

    public boolean istVegan() {
        for (Zutat zutat : zutaten) {
            if (!zutat.getVegan())
                return false;
        }
        return true;
    }


    @Override
    public int compareTo(Gericht vergleichsobjekt) {
        return Double.compare(preis, vergleichsobjekt.preis);
    }

    @Override
    public String toString() {
        StringBuilder name = new StringBuilder(getName() + " " + (istVegan() ? "istVegan" : "") + " ");
        for (Zutat zutat : zutaten) {
            name.append(zutat.getName());
        }

        name.append(String.format("%.2f", preis));
        name.append(" Euro");
        return name.toString();
    }
}
