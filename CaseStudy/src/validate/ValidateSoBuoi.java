package validate;

import java.util.Scanner;

public class ValidateSoBuoi {
    private final String SOBUOI_REGEX = "^[0-9]{2}$";
    Scanner scanner = new Scanner(System.in);


    public int Valisobuoi() {
        System.out.println("Nhập số buổi :");
        try {
            int sb= Integer.parseInt(scanner.nextLine());
            if(sb>0){
                return sb;
            }
            throw new Exception();
        } catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng !");
            return Valisobuoi();
        } catch (Exception e) {
            System.out.println("Nhập lại số buổi");
            return Valisobuoi();
        }
    }
}
