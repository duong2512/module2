import java.util.ArrayList;
import java.util.Scanner;

public class quanLiSanPham {
    Scanner scanner = new Scanner(System.in);
    ReaderAndWirte readerAndWirte = new ReaderAndWirte();
    ArrayList<SanPham> sanPhams = readerAndWirte.reader();

    ValidateSanPham validateSanPham =new ValidateSanPham();

    public void menu() {
        while (true) {
            try {
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
                if (choice > 0 && choice < 10) {
                    switch (choice) {
                        case 1 :
                            show();
                            break;
                        case 2 :
                            addSp(createSp());
                            break;
                        case 3 :
                            editSp();
                            break;
                        case 4 :
                            delete();
                            break;
                        case 5 :
                            sortPrice();
                            break;
                        case 6 :
                            findMax();
                            break;
                        case 7 :
                            readerAndWirte.reader();
                            break;
                        case 8 :
                            readerAndWirte.write(sanPhams);
                            break;
                        case 9 :
                            System.exit(0);
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai định dạng");
            } catch (Exception e) {
                System.err.println("Xin vui lòng nhập lại");
            }
        }
    }

    public void show(){
        for (int i = 0; i < sanPhams.size(); i++) {
            if ((i+1) % 5 == 0) {
                System.out.println(sanPhams.get(i));
                scanner.nextLine();
            } else {
                System.out.println(sanPhams.get(i));
            }
        }
    }

    public SanPham createSp(){
                String msp = validateSanPham.checkCodeProduct(sanPhams);
                String name = validateSanPham.checkNameProduct();
                double price = validateSanPham.checkPriceProduct();
                int num = validateSanPham.checkQuantityProduct();
                System.out.println("Nhập mô tả sản phẩm : ");
                String describe = scanner.nextLine();

                return new SanPham(msp,name,price,num,describe);
    }

    public void addSp(SanPham sanPham){
        sanPhams.add(sanPham);
    }

    public void editSp(){
        while (true){
            try {
                System.out.println("Nhập mã sản phẩm cần sửa");
                String msp = scanner.nextLine();
                if(validateSanPham.checkCodeProductExist(sanPhams,msp)>=0){
                    int vt= validateSanPham.checkCodeProductExist(sanPhams,msp);
                    sanPhams.set(vt,createSp());
                }
            } catch (Exception e){
                System.out.println("Vui lòng nhập lại");
            }
        }
    }

    public void delete(){
         while (true){
             System.out.println("Nhập mã sản phẩm cần xóa");
             String msp = scanner.nextLine();
             if(validateSanPham.checkCodeProductExist(sanPhams,msp)>=0){
                 int vt= validateSanPham.checkCodeProductExist(sanPhams,msp);
                 sanPhams.remove(vt);
                 break;
             }
         }
    }

    public void sortPrice(){
        while (true){
            try{
                System.out.println("1. Sắp xếp theo giá tăng dần");
                System.out.println("2. Sắp xếp theo giá giảm dần");
                System.out.println("3. Quay lại menu chính");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1){
                    sanPhams.sort(new SortTangDan());
                    break;
                } else if (choice == 2){
                    sanPhams.sort(new SortGiamDan());
                    break;
                } else
                    System.out.println("Nhập lại lựa chọn");
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng !");
            }
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
