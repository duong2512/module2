package BaiTapAnhToan;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachSan<E> {
    ArrayList<KhachSan>arrayList = new ArrayList<>();

    ArrayList<Nguoi>danhSach = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void menu(){
        System.out.println("1. Tạo phòng mới: ");
        System.out.println("2. Tạo khách hàng mới: ");
        System.out.println("3. Hiển thị các phòng: ");
        System.out.println("4. Hiển thị theo danh sách khách hàng: ");
        System.out.println("5. Tìm kiếm khách hàng theo tên: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                addks(creatPhong());
                break;
            case 2:
                addnguoi(creatKhachHang());
                break;
            case 3:
                arrayList.sort(new SortbyGia());
                showks();
                break;
            case 4:
                danhSach.sort(new SortbyDate());
                showkh();
                break;
            case 5:
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                search(name);
                break;
        }

    }

    public KhachSan creatPhong(){

        System.out.println("1. Nhập Loại Phòng: ");
        String LoaiPhong = scanner.nextLine();
        System.out.println("2. Giá Phòng: ");
        double GiaPhong = Double.parseDouble(scanner.nextLine());
        System.out.println("3. Địa Chỉ: ");
        String DiaChi = scanner.nextLine();

         return new KhachSan(LoaiPhong,GiaPhong,DiaChi);
    }

    public Nguoi creatKhachHang(){
        System.out.println("Họ và tên: ");
        String HoVaTen = scanner.nextLine();
        System.out.println("Ngày sinh: ");
        int NgaySinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Tháng sinh: ");
        int ThangSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Năm sinh: ");
        int NamSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Số CMT: ");
        int CMT = Integer.parseInt(scanner.nextLine());

        return new Nguoi(HoVaTen,new Date(NamSinh -1900,ThangSinh -1,NgaySinh),CMT);
    }

    public void addks(KhachSan ks ){
        arrayList.add(ks);
    }

    public void addnguoi(Nguoi kh){
        danhSach.add(kh);
    }

    public void showks(){
        for (KhachSan ks: arrayList
             ) {
            System.out.println(ks);
        }
    }

    public void showkh(){
        for (Nguoi kh: danhSach
             ) {
            System.out.println(kh);
        }
    }

    public void search(String name){
        for (Nguoi ng: danhSach
             ) {
            if (ng.getHoVaTen().equals(name)){
                System.out.println(ng);
            }
        }
    }


}
