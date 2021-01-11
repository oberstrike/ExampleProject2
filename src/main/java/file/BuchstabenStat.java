package file;

import java.io.*;
import java.util.*;

public class BuchstabenStat {

    //speichert die Buchstaben und wie oft sie auftreten.
    private Map<Character, Integer> buchstabenHaeufigkeiten;

    //speichert wieviele Buchstaben insgesamt gefunden wurden.
    private Long buchstabenAnzahl;

    public BuchstabenStat() {
        buchstabenHaeufigkeiten = new HashMap<>();
        buchstabenAnzahl = 0L;
    }


    private void pruefeDateityp(String dateiname) throws FalscherDateiTypException {
        //Vorbedingungen
        if (dateiname == null)
            throw new NullPointerException("Es wurde kein Dateiname angegbeben");
        if (dateiname.length() < 4)
            throw new FalscherDateiTypException(dateiname);
        String dateiendung = dateiname.substring(dateiname.length() - 4).toLowerCase();
        if (!dateiendung.equals(".txt"))
            throw new FalscherDateiTypException(dateiname);
    }

    private void verarbeiteZeichen(char zeichen) throws UngueltigesZeichenException {
        if (Character.isLetter(zeichen)) {
            buchstabenAnzahl++;
            int neuerZaehler = buchstabenHaeufigkeiten.get(zeichen) + 1;
            buchstabenHaeufigkeiten.put(zeichen, neuerZaehler);
        } else if (!Character.isDefined(zeichen)) {
            throw new UngueltigesZeichenException();
        }
    }

    private void verarbeiteZeile(String zeile) throws UngueltigesZeichenException {
        for (char buchstabe : zeile.toCharArray()) {
            verarbeiteZeichen(buchstabe);
        }

    }

    public void analysiere(String dateiname) throws FalscherDateiTypException, UngueltigesZeichenException {
        pruefeDateityp(dateiname);
        File file;
        try {
            FileReader fileReader = new FileReader(dateiname);
            int zeilennummer = 0;

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    zeilennummer++;
                    verarbeiteZeile(line);
                }
            } catch (IOException ioException) {
                System.out.println("Es gab einen Fehler wärend des lesens");
                System.exit(1);
            } catch (UngueltigesZeichenException ungueltigesZeichenException) {
                throw new UngueltigesZeichenException(dateiname, zeilennummer);
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Es wurde keine Datei mit dem Namen: " + dateiname + " gefunden");
            System.exit(1);

        }


    }

    public void zeigeTop10() {
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(buchstabenHaeufigkeiten.entrySet());
        list.sort(Map.Entry.comparingByValue());

        for (int i = 0; i < 10; i++) {
            Map.Entry<Character, Integer> entry = list.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public List<Map.Entry<Character, Float>> statistik() {
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(buchstabenHaeufigkeiten.entrySet());
        Map<Character, Float> statMap = new HashMap<>();

        Integer summeAllerBuchstaben = 0;

        for (Map.Entry<Character, Integer> entry : list) {
            Integer anzahl = entry.getValue();
            summeAllerBuchstaben += anzahl;
        }

        for (Map.Entry<Character, Integer> entry : list) {
            Integer anzahl = entry.getValue();
            float prozentsatz = anzahl.floatValue() / summeAllerBuchstaben.floatValue();
            statMap.put(entry.getKey(), prozentsatz);
        }

        return new ArrayList<>(statMap.entrySet());
    }

    public void scrheibeStatistik() {
        List<Map.Entry<Character, Float>> statistik = statistik();

        for (Map.Entry<Character, Float> entry : statistik) {
            System.out.println(entry.getKey() + ": " + String.format("%1.2f", entry.getValue()));

        }

    }

}
