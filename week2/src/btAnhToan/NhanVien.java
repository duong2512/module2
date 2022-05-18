package btAnhToan;

import java.sql.Date;

public class NhanVien extends CanBo{
    private String CongViec ;

    public NhanVien(){
    }

    public NhanVien(String name, Date date, String gender, String address, String congViec) {
        super(name, date, gender, address);
        CongViec = congViec;
    }

    public NhanVien(String congViec) {
        CongViec = congViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + "NhanVien{" +
                "CongViec='" + CongViec + '\'' +
                '}' ;
    }
}
