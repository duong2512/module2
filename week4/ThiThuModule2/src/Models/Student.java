package Models;

public class Student {
    private int msv;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double pointTB;

    public Student() {
    }

    public Student(int msv, String name, int age, String gender, String address, double pointTB) {
        this.msv = msv;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.pointTB = pointTB;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
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

    public double getPointTB() {
        return pointTB;
    }

    public void setPointTB(double pointTB) {
        this.pointTB = pointTB;
    }

    @Override
    public String toString() {
        return  msv + ',' + name + ',' + gender+','+
                age + ',' + address +
                ',' + pointTB;
    }
}
