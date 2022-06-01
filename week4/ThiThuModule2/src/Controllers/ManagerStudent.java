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
                show();
                break;
            case 2:
                addStudent(Sinhviencreate());
                break;
            case 3:
                System.out.println("nhap msv can sua");
                int msv = Integer.parseInt(scanner.nextLine());
                update(checkid(msv),Sinhviencreate());
                break;
            case 4:
                remove();
                break;
            case 5:
                sortById();
                break;
            case 6:
               readAndWrite.read(students);
                break;
            case 7:
                addStudent(Sinhviencreate());
                readAndWrite.write(students);
                break;
            case 8:
                break;
        }
    }

    public void addStudent(Student s){
        students.add(s);
        readAndWrite.write(students);
    }
    public Student Sinhviencreate(){
        System.out.println("Nhập Mã Sinh Viên");
        int msv=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên");
        String name=scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Giới Tính: ");
        String gender=scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address=scanner.nextLine();
        System.out.println("Nhập điểm trung bình");
        double pointTB= Double.parseDouble(scanner.nextLine());
        return new Student(msv,name,age,gender,address,pointTB);
    }

    public void update(int index , Student sinhvien) {
        students.set(index,sinhvien);
        readAndWrite.write(students);
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
    
    public void show(){
        for (Student a: students) {
            System.out.println(a.toString());
        }
    }
    public int checkid(int msv){
        for (int i =0; i<students.size(); i++) {
            if (students.get(i).getMsv()==msv){
                int index = i;
                return index;
            }
        }
        return -1;
    }

}
