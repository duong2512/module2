import java.util.ArrayList;
import java.util.Scanner;

public class quanLiSanPham {
    Scanner scanner = new Scanner(System.in);
    ReaderAndWirte readerAndWirte = new ReaderAndWirte();
    ArrayList<SanPham> sanPhams = readerAndWirte.reader();


    public void menu(){
        System.out.println("----Chương trình quản lý sản phẩm----");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1.  Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tìm sản phẩm có giá đắt nhất");
        System.out.println("7. Đọc vào file");
        System.out.println("8. Ghi vào file");
        System.out.println("9. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                show();
                break;
            case 2:
                addSp(createSp());
                break;
            case 3:
                editSp();
                break;
            case 4:
                delete();
                break;
            case 5:
                sortPrice();
                break;
            case 6:
                findMax();
                break;
            case 7:
                readerAndWirte.reader();
                break;
            case 8:
                readerAndWirte.write(sanPhams);
                break;
            case 9:
                System.exit(0);
        }
    }

    public void show(){
        for (int i = 0; i < sanPhams.size(); i++) {
            if ((i+1) % 3 == 0) {
                System.out.println(sanPhams.get(i));
                scanner.nextLine();
            } else {
                System.out.println(sanPhams.get(i));
            }
        }
    }

    public SanPham createSp(){
        System.out.println("Nhập mã sản phẩm : ");
        int msp = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm : ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm : ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng sản phẩm : ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm : ");
        String describe = scanner.nextLine();

        return new SanPham(msp,name,price,num,describe);
    }

    public void addSp(SanPham sanPham){
        sanPhams.add(sanPham);
    }

    public int getIndexMsp(int msp, ArrayList<SanPham> students) {
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getMsp() == msp) {
                return i;
            }
        }
        return -1;
    }

    public void editSp(){
        System.out.println("Nhập mã sản phẩm cần sửa");
        int msp = Integer.parseInt(scanner.nextLine());
        int index = this.getIndexMsp(msp,sanPhams);
        if (index != -1){
            sanPhams.set(index, createSp());
        } else {
            System.err.println("Mã sản phẩm không tồn tại");
        }
    }

    public void delete(){
            System.out.println("Nhập mã sản phẩm cần xóa");
            int msp = Integer.parseInt(scanner.nextLine());
            int index = this.getIndexMsp(msp,sanPhams);
            if (index != -1){

                sanPhams.remove(index);
            } else {
                System.err.println("Không tìm được sản phẩm với mã sản phẩm trên");
            }
    }

    public void sortPriceTangDan(){
        sanPhams.sort(new SortTangDan());
        System.out.println("Sắp xếp thành công");
    }

    public void sortPriceGiamDan(){
        sanPhams.sort(new SortGiamDan());
        System.out.println("Sắp xếp thành công");
    }

    public void sortPrice(){
        while (true){
            System.out.println("1. Sắp xếp theo giá tăng dần");
            System.out.println("2. Sắp xếp theo giá giảm dần");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1){
                sanPhams.sort(new SortTangDan());
                break;
            } else if (choice == 2){
                sanPhams.sort(new SortGiamDan());
                break;
            } else
                System.out.println("Nhập lại lựa chọn");
        }
    }

    public void findMax(){
        double max = sanPhams.get(0).getPrice();
        int index = 0;
        for (int i=0;i<sanPhams.size();i++){
            if (max<sanPhams.get(i).getPrice()){
                max = sanPhams.get(i).getPrice();
                index = i;
            }
        }
        System.out.println(sanPhams.get(index));
    }


}
