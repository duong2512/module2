package controller;

import io.ReaderAndWrite;
import model.Account;
import model.FullTime;
import model.NhanVien;
import model.PartTime;


import validate.ValidateStaff;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerNhanVien {

    ArrayList<NhanVien> nhanVienArrayList ;
    Scanner scanner = new Scanner(System.in);

    ValidateStaff validateStaff = new ValidateStaff();

    ReaderAndWrite readerAndWrite = new ReaderAndWrite();

    public ManagerNhanVien() {
         nhanVienArrayList= readerAndWrite.reader("nhanvien.txt");
    }

    public void menuAdmin(ManagerAccount managerAccount) {
        try {
            System.out.println("Chào mừng Admin");
            System.out.println("-----Menu-----");
            System.out.println("1. Thêm mới nhân viên");
            System.out.println("2 .Hiển thị danh sách nhân viên");
            System.out.println("3 .Cập nhật thông tin nhân viên");
            System.out.println("4 .Xóa nhân viên trong danh sách");
            System.out.println("5 .Cập nhật trạng thái nhân viên");
            System.out.println("6 .Tính lương cho nhân viên");
            System.out.println("7. Thoát");
            System.out.println("8. Hiển thị lương nhân viên");
            System.out.println("9. Đăng xuất");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice>0 && choice<10) {
                switch (choice) {
                    case 1:
                        addNv();
                        break;
                    case 2:
                        showNhanVien();
                        break;
                    case 3:
                        editNV();
                        break;
                    case 4:
                        deleteNV();
                        break;
                    case 5:
                        editStatus();
                        break;
                    case 6:
                        showTinhLuong();
                        break;
                    case 7:
                        System.exit(0);
                    case 8:
                        showSalary();
                        break;
                    case 9:
                        managerAccount.account = null;
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập lại lựa chọn !");
        }
    }

    public void menuUser(ManagerAccount managerAccount) {
        readerAndWrite.reader("nhanvien.txt");
        try {
            System.out.println("Chào mừng " + managerAccount.account.getUserName());
            System.out.println("-----Menu-----");
            System.out.println("1 .Hiển thị danh sách nhân viên");
            System.out.println("2 .Tìm kiếm nhân viên theo ID");
            System.out.println("3. Hiển thị lương toàn bộ nhân viên");
            System.out.println("4. Đăng xuất");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice ==1 ) {
                showNhanVien();
            } else if (choice == 2){
                System.out.println("Nhập ID nhân viên muốn hiển thị :");
                int id = Integer.parseInt(scanner.nextLine());
                int index= getIndexID(id,nhanVienArrayList);
                if (index!=-1){
                    System.out.println(nhanVienArrayList.get(index));
                }
                else {
                    System.out.println("Không tìm thấy ID");
                }
            } else if (choice == 4){
                managerAccount.account = null;
            } else if (choice == 3){
                showSalary();
            }
            else {
                System.err.println("Không tìm thấy lựa chọn");
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập lại lựa chọn !");
        }
    }

    public NhanVien createNv() {
        while (true){
            int id = validateStaff.validateID(nhanVienArrayList);
            String name = validateStaff.validateName();
            int age = validateStaff.validateAge();
            String date = validateStaff.validateDate();
            String gender = validateStaff.validateGender();
            String address = validateStaff.validateAddress();
            String sdt = validateStaff.validateSDT();
            String status = validateStaff.validateStatus();
            System.out.println("1. Tạo FullTime");
            System.out.println("2. Tạo PartTime");
            try {
                int choice1 = Integer.parseInt(scanner.nextLine());
                if (choice1 == 1){
                    int number = validateStaff.Valiheso();
                    return new FullTime(id, name, age, date, gender, address, sdt, status, number);
                } else {
                    int number = validateStaff.Valisobuoi();
                    return new PartTime(id, name, age, date, gender, address, sdt, status, number);
                }
            } catch (NumberFormatException e){
                System.out.println("Nhập quá chỉ số vui lòng nhập lại !");
            }
            return null;
        }
    }

    public void showNhanVien(){
        for (NhanVien nv:nhanVienArrayList) {
            System.out.println(nv);
        }
    }

    public void showTinhLuong() {
        while (true){
            try {
                System.out.println("1. FullTime");
                System.out.println("2. PartTime");
                int choice2 = Integer.parseInt(scanner.nextLine());
                if (choice2>0&&choice2<3){
                    switch (choice2) {
                        case 1:
                            System.out.println("Nhập ID muốn tính lương ");
                            int id = Integer.parseInt(scanner.nextLine());
                            int index = getIndexID(id, nhanVienArrayList);
                                if ( index>= 0) {
                                    if (nhanVienArrayList.get(index) instanceof FullTime) {
                                        int a = validateStaff.Valiheso();
                                        System.out.println(nhanVienArrayList.get(index).getName() + " = " + a * 30 * 500);
                                        readerAndWrite.writer(nhanVienArrayList,"nhanvien.txt");
                                        break;
                                    } else System.out.println("ID nhập không hợp lệ");
                                    break;
                                } else System.out.println("Không có ID này để tính lương");
                            break;
                        case 2:
                            System.out.println("Nhập ID muốn tính lương");
                            int id1 = Integer.parseInt(scanner.nextLine());
                            int index1 = getIndexID(id1, nhanVienArrayList);
                                if (index1 >= 0) {
                                    if (nhanVienArrayList.get(index1) instanceof PartTime) {
                                        int b = validateStaff.Valisobuoi();
                                        System.out.println(nhanVienArrayList.get(index1).getName() + " = " + b * 100);
                                        readerAndWrite.writer(nhanVienArrayList,"nhanvien.txt");
                                        break;
                                    } else System.out.println("ID nhập không hợp lệ");
                                    break;
                                } else System.out.println("Không có ID này để tính lương");
                                break;
                    } break;
                } else System.out.println("Nhập lại lựa chọn");
            } catch (NumberFormatException e){
                System.out.println("Chỉ được nhập 1 hoặc 2");
            } catch (Exception e){
                System.out.println("Nhập lại lựa chọn");
            }
        }
    }

    public void deleteNV(){
        while (true){
            try {
                System.out.println("Nhập id muốn xóa");
                int id = Integer.parseInt(scanner.nextLine());
                int index =-1;
                for (int i = 0; i < nhanVienArrayList.size(); i++) {
                    if (nhanVienArrayList.get(i).getId() == id) {
                        index=i;
                        break;
                    }
                }
                nhanVienArrayList.remove(index);
                readerAndWrite.writer(nhanVienArrayList,"nhanvien.txt");
                break;
            } catch (Exception e){
                System.out.println("Nhập lại id !");
            }
        }

    }

    public void editNV() {
        while (true){
            try {
                System.out.println("Nhập id nhân viên muốn sửa :");
                int id = Integer.parseInt(scanner.nextLine());
                if (getIndexID(id,nhanVienArrayList)>=0){
                    int vt = getIndexID(id,nhanVienArrayList);
                    nhanVienArrayList.set(vt,createNv());
                    readerAndWrite.writer(nhanVienArrayList,"nhanvien.txt");
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập lại !");
            }
        }
    }

    public int getIndexID(int id, ArrayList<NhanVien> nhanVienArrayList) {
        for (int i = 0; i < nhanVienArrayList.size(); i++) {
            if (nhanVienArrayList.get(i).getId()== id) {
                return i;
            }
        }
        return -1;
    }

    public void addNv(){
        nhanVienArrayList.add(createNv());
        readerAndWrite.writer(nhanVienArrayList,"nhanvien.txt");
    }

    public void editStatus(){
        while (true){
            try {
                System.out.println("Nhập id nhân viên muốn sửa trạng thái :");
                int id = Integer.parseInt(scanner.nextLine());
                if (getIndexID(id,nhanVienArrayList)>=0){
                    int vt = getIndexID(id,nhanVienArrayList);
                    String dangLam = "Đang làm việc";
                    String nghiViec = "Đã nghỉ việc";
                    while (true){
                        System.out.println("Chọn trạng thái muốn thay đổi");
                        System.out.println("1. Đang làm việc");
                        System.out.println("2. Đã nghỉ việc");
                        int choice = Integer.parseInt(scanner.nextLine());
                        if (choice==1){
                            nhanVienArrayList.get(vt).setStatus(dangLam);
                            break;
                        } else if (choice == 2){
                            nhanVienArrayList.get(vt).setStatus(nghiViec);
                            break;
                        } else {
                            System.out.println("Nhập lại lựa chọn");
                        }
                    }
                    break;
                } else System.out.println("Không có id , vui lòng nhập lại");
                readerAndWrite.writer(nhanVienArrayList,"nhanvien.txt");
            } catch (NumberFormatException e){
                System.out.println("Nhập sai id vui lòng nhập lại!");
            } catch (Exception e){
                System.out.println("Nhập sai id");
            }
        }
    }

    public void showSalary(){
        for (NhanVien nv:nhanVienArrayList) {
            System.out.println(nv.getId() + " " + nv.getName() + " " + ":" + " " + nv.getSalary());
        }
    }
}
