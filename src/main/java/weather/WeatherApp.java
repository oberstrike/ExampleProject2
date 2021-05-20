package weather;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class WeatherApp {

    private Map<String, List<Day>> //TODO

    public static void main(String[] args) throws Exception {
        String kiel_filename = "C:\\Users\\oberstrike\\Desktop\\ex\\weather_kiel.csv";
        String wuerzburg_filename = "C:\\Users\\oberstrike\\Desktop\\ex\\weather_wuerzbug.csv";

        WeatherApp weatherApp = new WeatherApp();
        weatherApp.read(kiel_filename);
        weatherApp.read(wuerzburg_filename);

    }

    public void read(String filename){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");

                String date = data[0];
                String max = data[1];
                String min = data[2];
                String average = data[3];

                SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
                Day day = new Day(
                        format.parse(date),
                        Float.parseFloat(max),
                        Float.parseFloat(min),
                        Float.parseFloat(average)
                );
                days.add(day);
            }
        }
    }

    private String getLocation(String filename){
        return "kiel";
    }

}
