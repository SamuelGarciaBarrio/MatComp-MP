package es.uah.matcomp.mp.e1.ejerciciosclases.Date;

import java.text.DecimalFormat;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String toString() {
        DecimalFormat twoDigits = new DecimalFormat("00");
        String Day = twoDigits.format(this.day);
        String Month = twoDigits.format(this.month);

        return Day +"/"+ Month +"/"+year;
    }
}