import java.util.Scanner;

public class UngDungChuyenSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Số cần đọc");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hangChuc = number / 10;
        int hangDonVi = number % 10;
        String result = "";

        if (hangChuc > 0) {
            switch (hangChuc) {
                case 1:
                    result += "One ";
                    break;
                case 2:
                    result += "Two ";
                    break;
                case 3:
                    result += "Three ";
                    break;
                case 4:
                    result += "Four ";
                    break;
                case 5:
                    result += "Five ";
                    break;
                case 6:
                    result += "Six ";
                    break;
                case 7:
                    result += "Seven";
                    break;
                case 8:
                    result += "eight ";
                    break;
                case 9:
                    result += "Nine ";
                    break;
            }
        }
        switch (hangDonVi) {
            case 1:
                result += "One ";
                break;
            case 2:
                result += "Two ";
                break;
            case 3:
                result += "Three ";
                break;
            case 4:
                result += "Four ";
                break;
            case 5:
                result += "Five ";
                break;
            case 6:
                result += "Six ";
                break;
            case 7:
                result += "Seven";
                break;
            case 8:
                result += "eight ";
                break;
            case 9:
                result += "Nine ";
                break;
        }


        System.out.println(result);
    }
}