package io;

import model.NhanVien;

import java.io.*;
import java.util.ArrayList;

public class ReaderAndWrite<E> {
    public void writer(ArrayList<E> List , String path) {
        File file = new File(path);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(List);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(" ");
        } catch (IOException e) {
            System.out.println(" ");
        }
    }

        public ArrayList<E> reader(String path)  {
            File file = new File(path);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                return (ArrayList<E>) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            System.err.println("File chưa tồn tại");
            }
            return new ArrayList<>();
        }
}
