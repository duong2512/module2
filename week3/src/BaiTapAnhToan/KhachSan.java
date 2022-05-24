package BaiTapAnhToan;

public class KhachSan {
    private String LoaiPhong;
    private double GiaPhong;
    private String DiaChi;

    public KhachSan() {
    }

    public KhachSan(String loaiPhong, double giaPhong, String diaChi) {
        LoaiPhong = loaiPhong;
        GiaPhong = giaPhong;
        DiaChi = diaChi;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        LoaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        GiaPhong = giaPhong;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhachSan{" +
                "LoaiPhong='" + LoaiPhong + '\'' +
                ", GiaPhong=" + GiaPhong +
                ", DiaChi='" + DiaChi + '\'' +
                '}';
    }
}
