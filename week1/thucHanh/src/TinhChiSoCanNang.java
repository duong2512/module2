import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng");
        double weight = sc.nextDouble();

        System.out.println("Nhập chiều cao");
        double height = sc.nextDouble();


        double bmi = weight / (height * height);
        if (bmi<18.5){
            System.out.println("Underweight");
        } else if (bmi<25.0){
            System.out.println("Normal");
        } else if (bmi<30){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        System.out.println(bmi);
    }
}
