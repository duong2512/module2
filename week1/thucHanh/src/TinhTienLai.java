import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double tien = 1.0;
        int month = 1;
        double interestRate = 1.0;

        System.out.println("Số Tiền Gửi :");
        tien = nhap.nextDouble();

        System.out.println("Số Tháng Gửi :");
        month = nhap.nextInt();

        System.out.println("Lãi Suất :");
        interestRate = nhap.nextDouble();

        double interestReceived = 0;
        for (int i = 0 ; i < month ; i++){
            interestReceived += tien * interestRate/12 * month ;
        }

        System.out.println("Số Tiền Nhận Được :" + interestReceived);

    }
}
