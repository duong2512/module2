import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập a: ");
            int a = scanner.nextInt();
            System.out.println("Nhập b:");
          int  b = scanner.nextInt();
            System.out.println("Nhập c");
           int c = scanner.nextInt();
           isTriangle(a,b,c);

        } catch (IllegalTriangleException e1){
            System.out.println(e1.getMessage());
        }
    }

    static public boolean isTriangle(double a , double b , double c) throws IllegalTriangleException{

        if (a>0 && b>0 && c>0){
            if (a+b>c&&a+c>b&&b+c>a){
                System.out.println("tam giac co canh a:" + a + " tam giac co canh b:" + b + " tam giac co canh c:" + c );
                return true;
            }else throw new  IllegalTriangleException("tong 2 canh <= canh con lai");
        }else throw new  IllegalTriangleException("tam giac co canh <= 0");

    }
}
