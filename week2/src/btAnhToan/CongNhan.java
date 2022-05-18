package btAnhToan;

import java.sql.Date;

public class CongNhan extends CanBo{
    private int Bac;

    public CongNhan(){
    }

    public CongNhan(String name, Date date, String gender, String address, int bac) {
        super(name, date, gender, address);
        this.Bac = bac;
    }

    public int getBac() {
        return Bac;
    }

    public void setBac(int bac) {
        Bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "CongNhan{" +
                "Bac=" + Bac +
                '}';
    }
}
