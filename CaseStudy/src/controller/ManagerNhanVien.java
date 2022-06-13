package controller;

import io.ReaderAndWrite;
import model.FullTime;
import model.NhanVien;
import model.PartTime;


import validate.ValidateStaff;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerNhanVien {
    ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    ValidateStaff validateStaff = new ValidateStaff();

    ReaderAndWrite readerAndWrite = new ReaderAndWrite();

    public ManagerNhanVien() {
        readerAndWrite.reader("nhanvien.txt");
    }

    public void menuAdmin() {
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
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập lại lựa chọn !");
        }
    }

    public void menuUser() {
        try {
            System.out.println("-----Menu-----");
            System.out.println("1 .Hiển thị danh sách nhân viên");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice ==1 ) {
                showNhanVien();
            } else {
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
        nhanVienArrayList = readerAndWrite.reader("nhanvien.txt");
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
                            for (NhanVien nv : nhanVienArrayList) {
                                if (nv instanceof FullTime) {
                                    System.out.println(nv.getName() + " = " + nv.getSalary());
                                }
                            }
                            break;
                        case 2:
                            for (NhanVien nv : nhanVienArrayList) {
                                if (nv instanceof PartTime) {
                                    System.out.println(nv.getName() + " = " + nv.getSalary());
                                }
                            }
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
                readerAndWrite.writer(nhanVienArrayList,"nhanvien.csv");
            } catch (NumberFormatException e){
                System.out.println("Nhập sai id vui lòng nhập lại!");
            } catch (Exception e){
                System.out.println("Nhập sai id");
            }
        }
    }
}
