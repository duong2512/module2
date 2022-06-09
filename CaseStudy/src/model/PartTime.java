package model;

import java.util.Date;

public class PartTime extends NhanVien {
    private int numberTime;

    public PartTime(int id, String name, int age, String date, String gender, String address, String sdt, String status, int number) {
        super();
    }

    public PartTime(int id, String name, int age, Date date, String gender, String address, String sdt, String status ,  int numberTime) {
        super(id, name, age , date , gender , address , sdt , status);
        this.numberTime = numberTime;
    }


    public double getSalary() {
        return numberTime * 200;
    }


    @Override
    public String toString() {
        return "Nhân viên Part time :" +
                "Số buổi =" + numberTime + super.toString()
                ;
    }
}