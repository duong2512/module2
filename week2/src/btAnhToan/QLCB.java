package btAnhToan;

import java.sql.Date;
import java.util.Scanner;

public class QLCB {
    CanBo[] canBoss = new CanBo[0];
    CanBo[] canBos = new CanBo[0];
    Scanner scanner = new Scanner(System.in);

    public void menu (){
        System.out.println("1. Nhập thông tin mới cho cán bộ");
        System.out.println("2. Hiển thị danh sách cán bộ");
        System.out.println("3. Tìm kiếm theo họ tên");
        System.out.println("4. Hiển thị thông tin cán bộ tìm được ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("1. Tạo Kỹ Sư");
                System.out.println("2. Tạo Công Nhân");
                System.out.println("3. Tạo Nhân Viên");
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1){
                    case 1:
                        CanBo cb= create(1);
                        add(cb);
                        break;
                    case 2:
                        CanBo canBo = create(2);
                        add(canBo);
                        break;
                    case 3:
                        CanBo canBo1 = create(3);
                        add(canBo1);
                        break;
                }
                break;

            case 2:
                for (CanBo a:canBos
                     ) {
                    System.out.println(a);
                }
                break;
            case 3:
                System.out.println("nhập tên ");
                String name=scanner.nextLine();
                search(name);
                break;
            case 4:
                show();
                break;


        }
    }

    public CanBo create(int chucVu){
        System.out.println("Nhập họ và tên");
        String hoVaTen = scanner.nextLine();
        System.out.println("Ngày sinh");
        int ngaySinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Tháng sinh");
        int thangSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Năm sinh");
        int namSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("Địa chỉ");
        String diaChi = scanner.nextLine();

        if (chucVu==1){
            System.out.println("Nhập Ngành Đào Tạo");
            String nganhDaoTao = scanner.nextLine();
            return new KySu(hoVaTen,new Date(namSinh-1900,thangSinh-1,ngaySinh),gioiTinh,diaChi,nganhDaoTao);
        }else if (chucVu==2){
            System.out.println("Nhập Bậc");
            int bac = Integer.parseInt(scanner.nextLine());
            return new CongNhan(hoVaTen,new Date(namSinh-1900,thangSinh-1,ngaySinh),gioiTinh,diaChi,bac);
        }else if (chucVu==3){
            System.out.println("Nhập Công Việc");
            String nhapCongViec = scanner.nextLine();
            return new NhanVien(hoVaTen,new Date(namSinh-1900,thangSinh-1,ngaySinh),gioiTinh,diaChi,nhapCongViec);
        }else {
            System.out.println("Nhập lại");
            return null;
        }
    }

    public void add(CanBo canBo){
        CanBo[] newCB  = new CanBo[canBos.length + 1];

        for (int i = 0; i < canBos.length; i++) {
                newCB[i] = canBos[i];
        }
        newCB[newCB.length-1] = canBo;
        canBos = newCB;
        }

   public CanBo[] search(String name){
        int i = 0 ;
        int c = 0 ;
       for(CanBo cb: canBos){
           if (cb.getName().equals(name)){
               c++;
           }
       }
       CanBo []canBos1=new CanBo[c];
       for (int j=0;j<canBos.length;j++){
           if(canBos[j].getName().equals(name)){
               canBos1[i]=canBos[j];
               i++;
           }
       }
       canBoss=canBos1;
       System.out.println("Có "+c+" kết quả được tìm thấy");
       return canBoss;
   }
    public void show(){
        for (CanBo s:canBoss){
            System.out.println(s);
        }
   }
}
