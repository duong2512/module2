package BaiTapSlackTH1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HShocsinh extends Nguoi {
    String lop;
    String khoaHoc;
    String kyHoc;

    public HShocsinh() {
    }

    public HShocsinh(String lop, String khoaHoc, String kyHoc) {
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public HShocsinh(String name, Date date, String que, String lop, String khoaHoc, String kyHoc) {
        super(name, date, que);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(String kyHoc) {
        this.kyHoc = kyHoc;
    }

    @Override
    public String toString() {
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        return "HShocsinh{" +
                "lop='" + lop + '\'' +
                ", khoaHoc='" + khoaHoc + '\'' +
                ", kyHoc='" + kyHoc + '\'' +
                ", name='" + name + '\'' +
                ", date=" + f.format(date) +
                ", que='" + que + '\'' +
                '}';
    }
}
