package Controllers;

import Models.Student;
import ReadAndWrite.ReadAndWrite;

import java.util.ArrayList;

import java.util.Scanner;

public class ManagerStudent {
    ArrayList<Student> students = new ArrayList<>();
    ReadAndWrite readAndWrite=new ReadAndWrite();
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        System.out.println("---- Chương Trình Quản Lý Sinh Viên ----");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách sinh viên");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println(readAndWrite.read(students));
                break;
            case 2:
                addStudent();
                break;
            case 3:
                update();
                break;
            case 4:
                remove();
                break;
            case 5:
                sortById();
                break;
            case 6:
                System.out.println(readAndWrite.read(students));
                break;
            case 7:
                readAndWrite.write(students);
                break;
            case 8:
                break;
        }
    }

    public void addStudent(){
        try {
            System.out.println("Nhập mã sinh viên:");
            int msv = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên sinh viên:");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi sinh sinh viên:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập giới tính của sinh viên:");
            String gender = scanner.nextLine();
            System.out.println("Nhập địa chỉ:");
            String address = scanner.nextLine();
            System.out.println("Nhập điểm trung bình");
            int pointTB = Integer.parseInt(scanner.nextLine());
            Student student = new Student(msv, name, age, gender, address, (int) pointTB);
            students.add(student);

        } catch (NumberFormatException e) {
            System.out.println("Nhập lại đi sai cụ m rồi");
        }
    }

    public void update() {
        System.out.println("Nhập mã sinh viên cần sửa: ");
        int msv = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập Mã Sinh Viên");
        int msv1=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên");
        String name=scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Giới Tính: ");
        String gender=scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address=scanner.nextLine();
        System.out.println("Nhập điểm trung bình");
        int pointTB = Integer.parseInt(scanner.nextLine());
        Student student = new Student(msv1,name,age,gender,address,pointTB);
        for (int i = 0; i < students.size(); i++) {
            if (msv==students.get(i).getMsv()){
                students.set(i,student);
            }
            readAndWrite.write(students);
        }
    }

    public void remove(){
        System.out.println("Nhập mã sinh viên bạn muốn xóa");
        int id=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<students.size() ; i++) {
            if (students.get(i).getMsv()==id){
                students.remove(i);
            }
        }
        readAndWrite.write(students);
    }

    public void sortById(){
        students.sort(new Controllers.SortById1());
        readAndWrite.write(students);
        readAndWrite.read(students);
    }
}
