package BaiTapSlackTH1;

import java.util.Date;

public class Nguoi {
    String name;
    Date date;
    String que;

    public Nguoi() {
    }

    public Nguoi(String name, Date date, String que) {
        this.name = name;
        this.date = date;
        this.que = que;
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

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", que='" + que + '\'' +
                '}';
    }
}
