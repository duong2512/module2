package controller;

import model.Staff;
import validate.ValidateStaff;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerNhanVien {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Staff> staff = new ArrayList<>();

    ValidateStaff validateStaff = new ValidateStaff();

    public void menu(){
        System.out.println("Chương trình quản lý nhân viên");
        System.out.println("------Menu------");
        System.out.println("1. Hiển thị danh sách nhân viên");
        System.out.println("2. Thêm mới nhân viên");
        System.out.println("3. Chỉnh sửa thông tin nhân viên");
        System.out.println("4. Thay đổi trạng thái nhân viên");
        System.out.println("5. Tìm kiếm nhân viên");
        System.out.println("6. Kiểm tra trạng thái nhân viên");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                show();
                break;
            case 2:

            case 3:
            case 4:
            case 5:
            case 6:

        }
    }

    public void show(){
        for (int i = 0; i < staff.size(); i++) {
            System.out.println(staff.get(i));
        }
    }

    public Staff createNV(){
        int id = validateStaff.validateID(staff);
        String name = validateStaff.validateName("name :");
        int age = validateStaff.validateAge();


        return null;
    }
}
