package restaurant;

import java.util.*;

public class MenuePlaner {

    private List<Zutat> zutatenListe;
    private Map<String, List<Gericht>> speiseplan;

    public MenuePlaner(Zutat[] zutatenArray) {
        zutatenListe = new ArrayList<Zutat>(Arrays.asList(zutatenArray));
        speiseplan = new HashMap<>();
    }

    private int zufallszahl(int minimum, int maximum) {
        return (int) (Math.random() * (maximum + 1 - minimum)) + minimum;
    }

    private Gericht erstelleGericht() {
        return null;
    }

    private void erstelleMenueFuerWochentag() {

    }

    public void erstelleSpeiseplan() {

    }

    public String getMenueFuerWochentag(String tag) {
        return null;

    }
}
