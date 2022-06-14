package model;

import java.util.Date;

public class FullTime extends NhanVien{
    private int heSo;


    public FullTime(int id, String name, int age, String date, String gender, String address, String sdt , String status , int heSo) {
        super(id, name, age , date , gender , address , sdt , status);
        this.heSo = heSo;
    }
    @Override
    public double getSalary() {
        return heSo * 30 * 500;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    @Override
    public String toString() {
        return "Nhân viên Full time : " +
                 " " +super.toString()
                ;
    }
}

