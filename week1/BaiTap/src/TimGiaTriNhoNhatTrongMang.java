public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int min = 100;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mảng arr: " + arr[i]);
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);

    }
}
