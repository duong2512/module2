package controller;

import io.ReaderAndWrite;
import model.Account;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerAccount implements Serializable {
    public Account account;
    Scanner scanner = new Scanner(System.in);

    ReaderAndWrite readerAndWrite = new ReaderAndWrite();
    ArrayList<Account> accounts ;


    {
        accounts = readerAndWrite.reader("C:\\Users\\ADMIN\\IdeaProjects\\Module2\\account.txt");
        if (accounts.size() == 0) {
            accounts.add(new Account("admin", "2512" , "tungduong2512@gmail.com" , "admin"));
        }
    }

    public ManagerAccount() {
        readerAndWrite.reader("account.txt");
    }

    public void menuAcc(ManagerAccount managerAccount){
        while (true){
            try{
                System.out.println("1. Đăng nhập");
                System.out.println("2. Đăng kí");
                System.out.println("3. Quên mật khẩu");
                System.out.println("Nhập lựa chọn để sử dụng ứng dụng");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice>0&&choice<4) {
                    switch (choice) {
                        case 1:
                            login(managerAccount);
                            break;
                        case 2:
                            regin();
                            break;
                        case 3:
                            forgot();
                            break;
                    }
                } else {
                    System.out.println("Nhập quá chỉ số vui lòng nhập lại");
                }
                break;
            } catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng vui lòng nhập lại");
            }
        }
    }

    public boolean login(ManagerAccount managerAccount){
        System.out.println("Tên đăng nhập :");
        String useName = scanner.nextLine();
        System.out.println("Mật khẩu :");
        String pass = scanner.nextLine();
        for (Account a: accounts) {
            if (a.getUserName().equals(useName)&&a.getPassName().equals(pass)){
                managerAccount.account=a;
                return true;

            }
        }
        return false;

    }

    public void regin(){
        String user = null;
        while (true) {
            System.out.println("Nhập userName :");
             user = scanner.nextLine();
            if (checkUserName(user)) {
                break;
            }else {
                System.err.println("trùng userName");
            }
        }
        System.out.println("Nhập emaill :");
        String email = scanner.nextLine();
        System.out.println("Nhập passWord :");
        String pass = scanner.nextLine();
        accounts.add(new Account(user, email , pass , "user"));

        readerAndWrite.writer(accounts,"account.txt");
    }

    public boolean checkUserName(String userName) {
        for (Account acc : accounts) {
            if (acc.getUserName().equals(userName)) {
                return false;
            }
        }
        return true;
    }

    public void forgot(){
        try {
            int vt = 0;
            String email;
            boolean check=false;
            System.out.println("Nhập email để đổi mật khẩu :");
            email = scanner.nextLine();
            for (int i = 0; i < accounts.size(); i++) {
                vt=i;
                if (accounts.get(i).getEmail().equals(email)){
                    check=true;
                }
            }
            if (check){
                String pass = scanner.nextLine();
                System.out.println("Nhập mật khẩu mới :");
                accounts.get(vt).setPassName(pass);
            }
            readerAndWrite.writer(accounts,"account.txt");
        } catch (Exception e){
            System.out.println(e);
        }
        }
}
