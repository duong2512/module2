package validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHeSo {
    private final String HESO_REGEX = "^[0-9]{2}$";
    Scanner sc = new Scanner(System.in);


    public int Valiheso() {
        System.out.println("Nhập hệ số:");
        try {
            int hs= Integer.parseInt(sc.nextLine());
            if(hs>0){
                return hs;
            }
            throw new Exception();
        } catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng !");
            return Valiheso();
        } catch (Exception e) {
            System.out.println("Nhập lại hệ số");
            return Valiheso();
        }
    }


}


