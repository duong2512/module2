import java.util.Scanner;

public class MinhHoaThuatToanSapXepNoiBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int size = scanner.nextInt();
        int[]list = new int[size];
        System.out.println("Nhập " + list.length + " giá trị:");
        for (int i = 0; i < list.length; i++) {
            list[i]=scanner.nextInt();
        }
        System.out.println("Hiển thị mảng : ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        sapXepNoiBot(list);
    }

    public static void sapXepNoiBot(int[] list) {
        boolean check = true;
        for (int i = 0; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
        }
        if (check== false){
            System.out.println("Mảng đã được sắp xếp");
        }
        for (int a:list
             ) {
            System.out.println(a);
        }
    }
}
