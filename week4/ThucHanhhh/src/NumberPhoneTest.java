import java.util.Scanner;

public class NumberPhoneTest {

    public static final String validPhone ="(84)-(0978489648)";
    public static final String invalidPhone = "(a8)-(22222222)";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sdt");
        String a = scanner.nextLine();
        NumberPhone numberPhone = new NumberPhone();
        System.out.println(numberPhone.validate(a));
    }
    }
