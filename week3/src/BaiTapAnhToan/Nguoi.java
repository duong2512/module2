package BaiTapAnhToan;

import java.sql.Date;

public class Nguoi {
    private String HoVaTen;
    private Date NgaySinh;
    private int CMT;

    public Nguoi() {
    }

    public Nguoi(String hoVaTen, Date ngaySinh, int CMT) {
        HoVaTen = hoVaTen;
        NgaySinh = ngaySinh;
        this.CMT = CMT;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public int getCMT() {
        return CMT;
    }

    public void setCMT(int CMT) {
        this.CMT = CMT;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "HoVaTen='" + HoVaTen + '\'' +
                ", NgaySinh=" + NgaySinh +
                ", CMT=" + CMT +
                '}';
    }
}
