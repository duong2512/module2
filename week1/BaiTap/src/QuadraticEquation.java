import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b,2)-4*this.a*this.c;
    }

    public double  getRoot1(){
        return (-this.b+Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }

    public double getRoot2(){
        return (-this.b-Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        double a = scanner.nextDouble();
        System.out.println("nhập b");
        double b = scanner.nextDouble();
        System.out.println("nhập a");
        double c = scanner.nextDouble();
        System.out.println("");
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        QuadraticEquation pt1 = null;
        if (pt1.getDiscriminant()==0){
            System.out.println("Phuong trinh co nghiem kep x= "+pt1.getRoot1());
        }else if (pt1.getDiscriminant()>0){
            System.out.println("Phuong trinh da cho co 2 nghiem rieng biet la:");
            System.out.println("x1= "+pt1.getRoot1());
            System.out.println("x2= "+pt1.getRoot2());
        }else {
            System.out.println("delta = "+pt1.getDiscriminant()+" , Phuong trinh vo nghiem");
        }

    }

}
