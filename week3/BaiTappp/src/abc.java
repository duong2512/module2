import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        int [] arr = {1,3,6,2,9,4,5};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = arr.length-1; j > i ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
