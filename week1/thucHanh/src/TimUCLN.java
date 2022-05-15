import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner num = new Scanner(System.in);

        System.out.println("Số thứ nhất :");
        a = num.nextInt();

        System.out.println("Số thứ hai :");
        b = num.nextInt();


        while (b!=0 && a!=0 && a!=b){
            if(a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UCLN la :" + a);

    }
}
