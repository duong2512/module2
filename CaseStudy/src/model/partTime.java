package model;

import java.util.Date;

public class partTime extends Staff{
    private int numberTime;

    public partTime(int numberTime) {
        this.numberTime = numberTime;
    }

    public partTime(int id, String name, int age, Date date, boolean gender, String sdt, String address, String numberCMT, boolean status, int numberTime) {
        super(id, name, age, date, gender, sdt, address, numberCMT, status);
        this.numberTime = numberTime;
    }

    @Override
    public double getSalary() {
        return numberTime * 100;
    }

    @Override
    public String toString() {
        return "partTime{" +
                "numberTime=" + numberTime + super.toString() +
                '}';
    }
}
