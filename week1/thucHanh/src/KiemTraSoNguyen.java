import java.util.Scanner;

public class KiemTraSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số Cần Kiểm Tra : ");
        int num = scanner.nextInt();
        boolean songuyen = true ;

        if (num<2){
            songuyen = false;
        } else {
            for (int i = 2;i<num;i++){
                if (num%i==0){
                    songuyen = false;
                }
            }
        }
        if (songuyen){
            System.out.println("Là số nguyên tố");
        } else {
            System.out.println("Không là số nguyên tố");
        }
    }
}
