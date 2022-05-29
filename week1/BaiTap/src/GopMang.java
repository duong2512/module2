import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int []array = {7,8,9};
        int length = arr.length + array.length;
        int [] myarr = new int[length];
        int pos = 0;


        for (int a: arr
             ) {
            myarr[pos] = a;
            pos++;
        }

        for (int a: array
             ) {
            myarr[pos]=a;
            pos++;
        }

        System.out.println("2 mảng sau ghi được gộp: ");

        System.out.println(Arrays.toString(myarr));

    }
}
