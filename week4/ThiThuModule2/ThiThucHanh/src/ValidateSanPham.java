



import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSanPham {
    Scanner sc = new Scanner(System.in);
    public int checkCodeProductExist(ArrayList<SanPham> sanPhams,String maSanPham){
        for(int i=0;i<sanPhams.size();i++){
            if(sanPhams.get(i).getMsp().equals(maSanPham)){
                return i;
            }
        }
        return -1;
    }
    public String checkCodeProduct(ArrayList<SanPham> products){
        final  String codeStrRegex = "[0-9]{6}";
        System.out.println("Nhập mã sản phẩm :");
        String codeProduct = sc.nextLine();
        Pattern p = Pattern.compile(codeStrRegex);
        Matcher m = p.matcher(codeProduct.trim());
        if(m.matches()){
            if(checkCodeProductExist(products,codeProduct)<0){
                return codeProduct;
            }
            else {
                System.out.println("Mã sản phẩm đã tồn tại, vui lòng nhập lại!");
                return checkCodeProduct(products);
            }
        }
        else {
            System.out.println("Mã sản phẩm yêu cầu 6 ký tự số, vui lòng nhập lại!");
            return checkCodeProduct(products);
        }
    }
    public String checkNameProduct(){
        String nameProduct;
        while (true){
            System.out.println("Nhập tên sản phẩm :");
            nameProduct = sc.nextLine();
            if (nameProduct.equals("")) {
                System.out.println("Không được bỏ trống !");
            } else {
                if(checkName(nameProduct)){
                    return nameProduct;
                }else {
                    System.out.println("Nhập tên sản phẩm không có số !");
                }
            }
        }
    }
    public double checkPriceProduct(){
        try {
            System.out.println("Nhập giá sản phẩm");
            double priceProduct = Double.parseDouble(sc.nextLine());
            if(priceProduct>0){
                return priceProduct;
            }
            throw  new Exception();
        }
        catch (NumberFormatException e){
            System.out.println("Nhập định dạng không hợp lệ!");
            return checkPriceProduct();
        }
        catch (Exception e){
            System.out.println("Giá sản phẩm không hợp lệ");
            return checkPriceProduct();
        }
    }
    public  int checkQuantityProduct(){
        try {
            System.out.println("Nhập số lượng sản phẩm:");
            int quantityProduct = Integer.parseInt(sc.nextLine());
            if(quantityProduct>0){
                return quantityProduct;
            }
            throw  new Exception();
        }
        catch (NumberFormatException e){
            System.out.println("Nhập định dạng không hợp lệ!");
            return checkQuantityProduct();
        }
        catch (Exception e){
            System.out.println("Giá sản phẩm không hợp lệ");
            return checkQuantityProduct();
        }
    }

    boolean checkName(String name){
        for (int i=0;i<name.length();i++){
            try {
                Integer.parseInt(Character.toString(name.charAt(i)));
                return false;
            }catch (Exception e){
            }
        }
        return true;
    }

}