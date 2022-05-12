import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền muốn chuyển : " + "$");
        Scanner scanner = new Scanner(System.in);
        int USD = scanner.nextInt();
        int rate = USD * 23000;

        System.out.println("Chuyển về VND có giá trị là : " + rate  +  " VND");
    }
}
