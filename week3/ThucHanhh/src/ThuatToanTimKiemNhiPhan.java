public class ThuatToanTimKiemNhiPhan {
    static int[] arr = {2,4,7,10,11,45,50,59,60,66,69,70,79};

    static int search(int[]arr,int key){
        int dau = 0;
        int cuoi = arr.length-1;

        while (cuoi>=dau){
            int giua = (dau + cuoi) / 2;
            if (key<arr[giua]){
                cuoi = giua - 1;
            } else if (key == arr[giua]){
                return giua;
            } else {
                dau = giua + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(arr, 2));
        System.out.println(search(arr, 11));
        System.out.println(search(arr, 79));
        System.out.println(search(arr, 1));
        System.out.println(search(arr, 5));
        System.out.println(search(arr, 80));
    }
}


