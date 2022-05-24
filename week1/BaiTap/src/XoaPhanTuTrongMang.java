import java.util.Scanner;

public class XoaPhanTuTrongMang {
    static int[] xoaPhanTu(int[] arr, int value, int c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                c++;
                for (int j = 0; j < arr.length-1; j++) {
                    arr[i] = arr[j+1];
                } arr[arr.length-1]=0;
                return xoaPhanTu(arr,value,c);
            }
        } int []arr1 = new int[arr.length-c];
        System.arraycopy(arr,0,arr1,0,arr1.length);
        return arr1;
    }

    public static void main(String[] args) {
        int[]arr = {10,4,6,7,8,6,0,0,0,0};
        System.out.println("Mảng ban đầu là :");
        for (int a:arr
             ) {
            System.out.println(a);
        }

        System.out.println("Nhập phần tử muốn xóa trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int c = 0;
        System.out.println("Mảng sau khi xóa: ");
        for (int a:xoaPhanTu(arr,value,c)
             ) {
            System.out.println(a);
        }
    }

}
