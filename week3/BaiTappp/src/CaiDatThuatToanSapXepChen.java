import java.util.Scanner;

public class CaiDatThuatToanSapXepChen {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int []arr = new int[size];
        System.out.println("Nhập " + arr.length + "giá trị");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Hiển thị mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Mảng đã được sắp xếp: ");
        sapXep(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void sapXep(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int index = i;
            while (index>0&&arr[index-1]>x  ){
                arr[index]= arr[index-1];
                index--;
            }
            arr[index]=x;
        }
    }
}
