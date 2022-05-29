package BaiTapSlackTH1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class QLHS<E> {
    ArrayList<HShocsinh> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");


    public void menu(){
        System.out.println("------Menu------");
        System.out.println("1. Nhập Hồ Sơ học sinh: ");
        System.out.println("2. Hiển thị học sinh quê thái nguyên và sinh năm 1985: ");
        System.out.println("3. Hiển thị học sinh lớp 10A1: ");
        System.out.println("4. Hiện thị danh sách học sinh: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                list.add(create());
                break;
            case 2:
                showQueTnNam85();
                break;
            case 3:
                showLop();
                break;
            case 4:
                show();
                break;
        }
    }

    public HShocsinh create(){

        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        Date birthDay=null;
        try {
             birthDay= df.parse(scanner.nextLine());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Nhập quê: ");
        String que = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        String lop = scanner.nextLine();
        System.out.println("Nhập khóa học: ");
        String khoaHoc = scanner.nextLine();
        System.out.println("Nhập kì học: ");
        String kiHoc = scanner.nextLine();

        return new HShocsinh(name,birthDay,que,lop,khoaHoc,kiHoc) ;
    }

    public void add(HShocsinh hShocsinh){
        list.add(hShocsinh);
    }

    public void show(){
        for (HShocsinh a: list
             ) {
            System.out.println(a);
        }
    }

    public void showQueTnNam85(){
        for (int i = 0; i < list.size(); i++) {
            String que=list.get(i).getQue();
            int date = list.get(i).getDate().getYear();
            if (que.equals("Thái Bình") && date == 85){
                System.out.println(list.get(i));
            }
        }
    }

    public void showLop(){
        for (int i = 0; i < list.size(); i++) {
            String lop = list.get(i).getLop();
            if (lop.equals("10A1")){
                System.out.println(list.get(i));
            }
        }
    }
}
