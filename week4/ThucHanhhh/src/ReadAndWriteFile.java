//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadAndWriteFile {
//    public List<Integer> readFile (String filePath){
//        List<Integer> number = new ArrayList<>();
//        try {
//            File file = new File(filePath);
//
//            if (!file.exists()){
//                throw new RuntimeException();
//            }
//
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String line = "";
//            while ((line=bufferedReader.readLine())!= null){
//                number.add(Integer.parseInt(line));
//            }
//            bufferedReader.close();
//
//        } catch (IOException e) {
//            System.out.println("File không tồn tại");
//        }
//        return number;
//    }
//
//    public void writeFile(String filePath, int max){
//        try {
//            FileWriter writer = new FileWriter(filePath, true);
//            BufferedWriter bufferedWriter = new BufferedWriter(writer);
//            bufferedWriter.write("Giá trị lớn nhất là: " + max);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static int findMax(List<Integer> numbers) {
//        int max = numbers.get(0);
//        for (int i = 0; i < numbers.size(); i++) {
//            if (max < numbers.get(i)) {
//                max = numbers.get(i);
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
//        int maxValue = findMax(numbers);
//        readAndWriteFile.writeFile("result.txt", maxValue);
//    }
//}
