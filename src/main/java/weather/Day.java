package weather;

import java.util.Date;

public class Day {
    private Date date;

    public Day(Date date, float max, float min, float average) {
        this.date = date;
        this.max = max;
        this.min = min;
        this.average = average;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    private float max;
    private float min;
    private float average;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
}
