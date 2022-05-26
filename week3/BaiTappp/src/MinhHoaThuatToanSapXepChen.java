public class MinhHoaThuatToanSapXepChen {
    public static void main(String[] args) {
        int []arr = {6,3,8,1,7,2,0,4};
        System.out.println("mang truoc khi sap xep");
        inMang(arr);
        int len = arr.length;

        for (int i = 1; i <len; i++) {
            int x= arr[i];
            int index=i;
            while (index>0 &&x<arr[index-1]){
                arr[index] = arr[index-1];
                index--;
            }
            arr[index]=x;

        }
        System.out.println("-----------------------------");
        System.out.println("mang sau khi sap xep");
        inMang(arr);
    }

    public static void inMang(int[]x){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println();
    }
}
