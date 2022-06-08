package model;

import java.util.Date;

public class fullTime extends Staff{
    private int numberDay;

    public fullTime() {
        super();
    }

    public fullTime(int numberDay) {
        this.numberDay = numberDay;
    }

    public fullTime(int id, String name, int age, Date date, boolean gender, String sdt, String address, String numberCMT, boolean status, int numberDay) {
        super(id, name, age, date, gender, sdt, address, numberCMT, status);
        this.numberDay = numberDay;
    }

    @Override
    public double getSalary(){
        return numberDay * 300;
    }

    @Override
    public String toString() {
        return "fullTime{" +
                "numberDay=" + numberDay + super.toString() +
                '}';
    }
}
