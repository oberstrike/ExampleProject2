package mitarbeiter;

import student.Kurs;
import student.Wochentag;

import java.io.*;
import java.util.*;


public class MitarbeiterMain {

    public static String name = "MitarbeiterMain";

    public static void main(String[] args) throws IOException {

        String name = MitarbeiterMain.name;

        List<Integer> start = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int n = 5;

    }


    public static List<Integer> aufgabe9(List<Integer> start, int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < start.size(); i++) {
            Integer wert = start.get(i);
            if (i % n == 0) {
                result.add(wert);
            }
        }


        return result;
    }

}
