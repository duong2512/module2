import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lưu số lượng số nguyên tố cần in ra:(VD:20)");
        int number = scanner.nextInt();

        if (number < 1){
            System.out.println("Nhập Lại");
        } else {
            int count = 1;
            int N = 2;
            while (count<=number){
                boolean check = true;
                for (int i = 2; i <= N / 2; i++){
                    if (N % i == 0 && 2 != N){
                        check = false;
                        break;
                    }
                }
                if (check){
                    System.out.println(count +".  "+ N);
                    count++;
                }
                N++;
            }
        }
    }
}
