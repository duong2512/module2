import java.util.InputMismatchException;
import java.util.Scanner;

public class GioiHanCuaMang {

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Không có chỉ số này trong mảng");
        } catch (InputMismatchException a){
            System.out.println("Nhập sai định dạng chuỗi");
        }
    }

}
