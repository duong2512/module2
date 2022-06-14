package model;

import java.util.Date;

public class PartTime extends NhanVien {
    private int numberTime;


    public PartTime(int id, String name, int age, String date, String gender, String address, String sdt, String status ,  int numberTime) {
        super(id, name, age , date , gender , address , sdt , status);
        this.numberTime = numberTime;
    }

    @Override
    public double getSalary() {
        return numberTime * 200;
    }

    @Override
    public String toString() {
        return "Nhân viên Part time :" +
                " " + super.toString()
                ;
    }

    public int getNumberTime() {
        return numberTime;
    }

    public void setNumberTime(int numberTime) {
        this.numberTime = numberTime;
    }
}