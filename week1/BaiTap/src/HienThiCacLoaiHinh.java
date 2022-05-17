import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu :");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("In Hình Chữ Nhật :");
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 5; j++) {
                        System.out.print(" *");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("In Hình tam giác vuông, có cạnh góc vuông ở botton-left");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("In Hình tam giác vuông, có cạnh góc vuông ở botton-left");
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("In Hình Tam Giác Cân");
                for (int i = 0; i < 8; i++) {
                    for (int j = 7; j > 0; j--) {
                        if (j < i) {
                            System.out.print(" *");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
