package model;

import java.util.Date;

public abstract class Staff {
    private int id;
    private String name;
    private int age;
    private Date date;
    private boolean gender;
    private String sdt;
    private String address;
    private String numberCMT;

    private boolean status;

    public Staff() {
    }

    public Staff(int id, String name, int age, Date date,boolean gender, String sdt, String address, String numberCMT,boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.date = date;
        this.sdt = sdt;
        this.address = address;
        this.numberCMT = numberCMT;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberCMT() {
        return numberCMT;
    }

    public void setNumberCMT(String numberCMT) {
        this.numberCMT = numberCMT;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Staff(boolean gender) {
        this.gender = gender;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", gender='" + gender + '\'' +
                ", sdt='" + sdt + '\'' +
                ", address='" + address + '\'' +
                ", numberCMT='" + numberCMT + '\'' +
                ", status=" + status +
                '}';
    }
}
