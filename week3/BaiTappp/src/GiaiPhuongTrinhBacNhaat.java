import java.util.Scanner;

public class GiaiPhuongTrinhBacNhaat {
    public static void main(String[] args) {
        int aNumber , bNumber;
        double nghiem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhập số b: ");
        bNumber = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là " + aNumber + "x + " + bNumber + " = 0");
        if (aNumber == 0){
            if (bNumber == 0){
                System.out.println("phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            nghiem =  -bNumber/aNumber;
            System.out.println(nghiem);
        }
    }
}
