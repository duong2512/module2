package validate;

import model.Staff;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ValidateStaff {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
    public int getIndexId(int id, ArrayList<Staff> staff) {
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int validateID(ArrayList<Staff> staff) {
        while (true) {
            try {
                System.out.println("Nhập id (nhập bằng số !) ");
                int id = Integer.parseInt(scanner.nextLine());
                if (getIndexId(id, staff) != -1) {
                    throw new RuntimeException();
                }
                return id;
            } catch (Exception e) {
                System.out.println("ID nhập không hợp lệ !");
            }
        }
    }

    public String validateName(String name){
        while (true){
            System.out.println("Nhập " + name);
            String str = scanner.nextLine();
            if (str.equals("")){
                System.err.println("Không được để trống !");
                continue;
            } else {
                return str;
            }
        }
    }

    public int validateAge(){
        while (true){
            try {
                System.out.println("Nhập tuổi :");
                int age = Integer.parseInt(scanner.nextLine());
                return age;
            } catch (Exception e){
                System.out.println("Tuổi không hợp lệ");
            }
        }
    }

    public Date validateDate(){
        Date dateFormat;
        while (true){
            try{
                System.out.println("Nhập vào ngày sinh. (dd/MM/yyyy)");
                dateFormat = df.parse(scanner.nextLine());
                return dateFormat;
            } catch (Exception e){
                System.out.println(e);
            }
        }

    }

    public String validateGender(){
        while (true){
           try{
               System.out.println("Chọn giới tính :");
               System.out.println("1. Nam");
               System.out.println("2. Nữ");
               int choice = Integer.parseInt(scanner.nextLine());
               if (choice == 1){
                   return "Nam";
               } else if (choice == 2){
                   return "Nữ";
               } else
                   return "Chọn 1 hoặc 2 !";
           } catch (NumberFormatException e) {
               throw new RuntimeException(e);
           }

        }
    }

    public String validateSDT (String sdt){
        while (true){
            try {
                ValidateSDT validateSDT = new ValidateSDT();
                String str = scanner.nextLine();
                System.out.println("Nhập" + sdt );
                validateSDT.validate(sdt);
                return str;
            }catch (Exception e){
                System.out.println("Chỉ nhập số ");
                System.out.println("--------------------------------------------------");
            }
        }
    }

    public String validateAddress(String address){
        while(true){
            try{
                System.out.println("Nhập " + address);
                String str = scanner.nextLine();
                return str;
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public String validateCMT (){
        while (true){
            try{
                System.out.println("Nhập số CMT :");
                String cmt = scanner.nextLine();

                return cmt;
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public boolean validateStatus(){
        while (true){
            System.out.println("Chọn trạng thái nhân viên:");
            System.out.println("1. ");
        }
    }






}


