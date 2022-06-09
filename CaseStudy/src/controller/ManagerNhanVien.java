package controller;

import model.FullTime;
import model.NhanVien;
import model.PartTime;
import validate.ValidateHeSo;
import validate.ValidateSoBuoi;
import validate.ValidateStaff;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerNhanVien {
    ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    ValidateStaff validateStaff = new ValidateStaff();

    public void menu() {
        try {
            System.out.println("-----Menu-----");
            System.out.println("1. Thêm mới nhân viên");
            System.out.println("2 .Hiển thị danh sách nhân viên");
            System.out.println("3 .Cập nhật thông tin nhân viên");
            System.out.println("4 .Xóa nhân viên trong danh sách");
            System.out.println("5 .Cập nhật trạng thái nhân viên");
            System.out.println("6 .Tính lương cho nhân viên");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice>0 && choice<7) {
                switch (choice) {
                    case 1:
                        createNhanVien();
                        break;
                    case 2:
                        showNhanVien();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }
            }
            throw new Exception();
        } catch (NumberFormatException e) {
            System.out.println("Nhập lại lựa chọn !");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public NhanVien createNv(boolean fullTime) {
        int id = validateStaff.validateID(nhanVienArrayList);
        String name = validateStaff.validateName();
        int age = validateStaff.validateAge();
        Date date = validateStaff.validateDate();
        String gender = validateStaff.validateGender();
        String address = validateStaff.validateAddress();
        String sdt = validateStaff.validateSDT();
        String status = validateStaff.validateStatus();

        if (fullTime) {
            ValidateHeSo validateHeSo = new ValidateHeSo();
            int number = validateHeSo.Valiheso();
            return new FullTime(id, name, age, date, gender, address, sdt, status, number);
        } else {
            ValidateSoBuoi validateSoBuoi = new ValidateSoBuoi();
            int number = validateSoBuoi.Valisobuoi();
            return new PartTime(id, name, age, date, gender, address, sdt, status, number);
        }
    }

    public void createNhanVien() {
        while (true){
            try {
                System.out.println("1. Tạo FullTime");
                System.out.println("2. Tạo PartTime");
                int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            NhanVien nhanVienFull = createNv(true);
                            nhanVienArrayList.add(nhanVienFull);
                            break;
                        case 2:
                            NhanVien nhanVienPart = createNv(false);
                            nhanVienArrayList.add(nhanVienPart);
                            break;
                    }
                if (choice1 < 1||choice1>2) {
                    System.out.println("Nhập quá chỉ số vui lòng nhập lại");
                }
            } catch (NumberFormatException e){
                System.out.println("Nhập lại lựa chọn !");
            } catch (Exception e) {
                System.out.println("Chọn 1 hoặc 2 !");
            }
        }
    }
    
    public void showNhanVien(){
        for (NhanVien nv:nhanVienArrayList) {
            System.out.println(nv);
        }
    }
}
