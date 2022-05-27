import java.util.Scanner;

public class ThemPhanTuVaoTrongMang {


    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử :");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int []arr = new int[x];
        System.out.println("Nhập phần tử vào mảng : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu " +i);
            System.out.println(arr[i] = scanner.nextInt());
        }
        System.out.println("Hiện thị mảng: ");
        for (int a:arr
             ) {
            System.out.println(a);
        }





    }
}
