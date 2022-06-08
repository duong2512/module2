import java.io.*;
import java.util.ArrayList;

public class ReaderAndWirte {
    public void write(ArrayList<SanPham> sanPhams) {
        File file = new File("sanpham.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SanPham s : sanPhams) {
                bufferedWriter.write(s.write());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SanPham> reader() {
        ArrayList<SanPham> sanPhams = new ArrayList<>();
        File file = new File("sanpham.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(",");
                int msp = Integer.parseInt(arr[0]);
                String name = arr[1];
                double price = Double.parseDouble(arr[2]);
                int num = Integer.parseInt(arr[3]);
                String describe = arr[4];
                sanPhams.add(new SanPham(msp,name,price,num,describe));
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e) {
            System.err.println("File chưa tồn tại");
        }
        return sanPhams;
    }
}
