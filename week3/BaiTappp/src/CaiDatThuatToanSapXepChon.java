public class CaiDatThuatToanSapXepChon {
    static double []arr = {1,6,4,8,4,9,23};

    public static void SapXepChon(double[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            double min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>min){
                    min = arr[j];
                    minIndex = j;
                }
            } if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        for (double a:arr
             ) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        SapXepChon(arr);

    }
}
