import java.io.*;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;

public class TinhTongCacSoTrongFileText {
    public void readerFileText(String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new RuntimeException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng = " + sum);





        } catch (IOException e) {
            System.out.println("File không tồn tại");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file : ");
        Scanner scanner = new Scanner(System.in);
        String filePath=scanner.nextLine();



        TinhTongCacSoTrongFileText tinhTongCacSoTrongFileText = new TinhTongCacSoTrongFileText();
        tinhTongCacSoTrongFileText.readerFileText(filePath);

    }

}
