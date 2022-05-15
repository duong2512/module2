public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {


        int count = 1;
        int N = 2;
        while (N<100) {
            boolean check = true;
            for (int i = 2; i <= N / 2; i++) {
                if (N % i == 0 && 2 != N) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(count +".  "+ N);
                count++;
            }
            N++;
        }
    }
}
