import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        File source = new File("C:\\Users\\ADMIN\\IdeaProjects\\Module2\\week4\\ThucHanhhh\\src\\s.txt");
        File target = new File("C:\\Users\\ADMIN\\IdeaProjects\\Module2\\week4\\ThucHanhhh\\src\\t11.txt");

        if (!source.exists()) {
            System.out.println("chú ý file nguồn chưa tồn tại");
        }
        if (target.exists()) {
            System.out.println("đã tồn tại 1 bản sao");
        }
        if (source.exists() && !target.exists()) {
            try {
                FileReader fileReader = new FileReader(source);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(target);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                int c = 0;
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    for (int i = 0; i < line.length() - 1; i++) {
                        if (!(Character.toString(line.charAt(i + 1)).equals(" ")) && (Character.toString(line.charAt(i)).equals(" ") || i == 0)) {
                            c += 1;
                        }
                    }
                }
                bufferedReader.close();
                bufferedWriter.close();
                fileReader.close();
                fileWriter.close();
                System.out.println("So tu co trong file nguon la: " + c);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
