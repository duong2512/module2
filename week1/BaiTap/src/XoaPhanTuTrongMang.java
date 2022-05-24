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
            int []arr1 = new int[arr.length-c];
            System.arraycopy(arr,0,arr1,0,arr1.length);
            return arr1;
        }
    }

}
