package LopCircleVaLopCylinder;

public class Cylinder extends Circle{
    double chieuCao;

    public Cylinder() {
    }

    public Cylinder(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Cylinder(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double theTich(){
        return super.dienTich()*chieuCao;
    }

    @Override
    public String toString() {
        return super.toString() + "Cylinder{" +
                "chieuCao=" + chieuCao +
                '}';
    }
}
