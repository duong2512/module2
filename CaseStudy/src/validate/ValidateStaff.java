package validate;

import model.NhanVien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateStaff {
    private static final String DATE_REGEX = "^[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}$";
    Scanner scanner = new Scanner(System.in);
    public int getIndexId(int id, ArrayList<NhanVien> nhanVienArrayList) {
        for (int i = 0; i < nhanVienArrayList.size(); i++) {
            if (nhanVienArrayList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int validateID(ArrayList<NhanVien> nhanVienArrayList) {
        while (true) {
            try {
                System.out.println("Nhập id (nhập bằng số !) ");
                int id = Integer.parseInt(scanner.nextLine());
                if (getIndexId(id, nhanVienArrayList) != -1) {
                    throw new RuntimeException();
                }
                return id;
            } catch (Exception e) {
                System.out.println("ID nhập không hợp lệ !");
            }
        }
    }

    public String validateName() {
        String nameNV;
        while (true) {
            System.out.println("Nhập vào Tên");
            nameNV = scanner.nextLine();
            if (nameNV.equals("")) {
                System.out.println("Không được bỏ trống !");

            } else {
                if(checkName(nameNV)){
                    return nameNV;
                }else {
                    System.out.println("Nhập tên không có số !");
                }
            }
        }
    }

    boolean checkName(String name){
        for (int i=0;i<name.length();i++){
            try {
                Integer.parseInt(Character.toString(name.charAt(i)));
                return false;
            }catch (Exception e){
            }
        }
        return true;
    }

    public int validateAge(){
        while (true){
            try {
                System.out.println("Nhập tuổi :");
                int age = Integer.parseInt(scanner.nextLine());
                if (age>18 && age<=50){
                    return age;
                } else System.out.println("Nhập tuổi từ 19 đến 50");
            } catch (NumberFormatException e){
                System.out.println("Nhập tuổi từ 19 đến 50");
            } catch (Exception e){
                System.out.println("Tuổi nhập không hợp lệ");
            }
        }
    }

//    public Date validateDate(){
//        Date dateFormat;
//        while (true){
//            try{
//                System.out.println("Nhập vào ngày/tháng/năm sinh. (dd/MM/yyyy)");
//                dateFormat = df.parse(scanner.nextLine());
//                return dateFormat;
//
//            } catch (Exception e){
//                System.out.println("Nhập sai đinh dạng");
//            }
//        }
//
//    }

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
                   System.out.println("Chọn 1 hoặc 2");
           } catch (NumberFormatException e) {
               System.out.println("Chọn 1 hoặc 2");
           } catch (Exception e){
               System.out.println("Nhập lại lựa chọn");
           }

        }
    }

    public String validateSDT (){
        while (true){
            try {
                ValidateSDT validateSDT = new ValidateSDT();
                System.out.println("Nhập số điện thoại" );
                String str = scanner.nextLine();
                if (validateSDT.validate(str)){
                    return str;
                } else {
                    System.out.println("Nhập theo dạng 0xxxxxxxxx");
                }

            }catch (Exception e){
                System.out.println("Nhập theo dạng 0xxxxxxxxx");
            }
        }
    }

    public String validateAddress(){
        String address;
        while (true) {
            try {
                System.out.println("Nhập địa chỉ");
                address= scanner.nextLine();
                if (address.equals("")) {
                    System.out.println("Không được bỏ trống !");
                } else return address;
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public String validateStatus(){
        while (true){
            try {
                System.out.println("Chọn trạng thái nhân viên:");
                System.out.println("1. Đã nghỉ việc");
                System.out.println("2. Đang làm việc");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1){
                    return "Đã nghỉ việc !";
                } else if (choice == 2){
                    return "Đang làm việc ";
                } else
                    System.out.println("Chọn 1 hoặc 2");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public String validateDate() {
        String date=null;
        while (true)
        try{
            System.out.println("Nhập/ngày/tháng/năm sinh (theo định dạng dd/MM/xxxx)");
            date = scanner.nextLine();
            Pattern pattern = Pattern.compile(DATE_REGEX);
            Matcher matcher = pattern.matcher(date.trim());
            if (matcher.matches()){
                break;
            } else System.out.println("Nhập theo định dạng dd/MM/xxxx ");;
        } catch (Exception e){
            System.out.println("Nhập sai định dạng");
        }
        return date;
    }

    public int Valiheso() {
        int hs=0;
        while (true){
            System.out.println("Nhập hệ số:");
            hs= Integer.parseInt(scanner.nextLine());
            try {
                if(hs>0){
                    return hs;
                } else System.out.println("Nhập lại hệ số");
            } catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng !");
            } catch (Exception e) {
                System.out.println("Nhập lại hệ số");
            }
        }
    }

    public int Valisobuoi() {
        int sb=0;
        while (true){
            System.out.println("Nhập số buổi :");
            sb= Integer.parseInt(scanner.nextLine());
            try {
                if(sb>0){
                    break;
                } else System.out.println("Nhập lại số buổi");
            } catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng !");
            } catch (Exception e) {
                System.out.println("Nhập lại số buổi");
            }
        }
        return sb;
    }
}


