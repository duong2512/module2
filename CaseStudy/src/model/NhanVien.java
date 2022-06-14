package model;

import java.io.Serializable;

public class NhanVien implements Serializable {
    private int id;
    private String name;
    private int age;
    private String date;
    private String gender;
    private String address;
    private String sdt;
    private String status;

    public NhanVien() {
    }

    public NhanVien(int id, String name, int age, String date, String gender, String address, String sdt, String status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.date = date;
        this.gender = gender;
        this.address = address;
        this.sdt = sdt;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSalary(){
        return 0;
    }


    @Override
    public String toString() {
        return
                "ID : " + id +
                ", Tên : " + name +
                ", Tuổi : " + age +
                ", Sinh nhật : " + date +
                ", Giới tính : " + gender +
                ", Địa chỉ : " + address +
                ", SĐT : " + sdt +
                ",  Trạng thái : " + status
                ;
    }

}
