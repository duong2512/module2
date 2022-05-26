import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        int []arr;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dộ dài của mảng: ");
        size = Integer.parseInt(scanner.nextLine());
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

    }
}
