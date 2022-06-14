////package validate;
////
////import model.Account;
////
////import java.util.ArrayList;
////import java.util.Scanner;
////import java.util.regex.Matcher;
////import java.util.regex.Pattern;
////
////public class ValidateAccount {
////    Scanner scanner = new Scanner(System.in);
////    ArrayList <Account> accounts;
////
////    public String validateUserName(){
////        System.out.println("Nhập tên người dùng của bạn, tên người dùng bắt buộc phải có chữ thường hoặc số, ít nhất 4 ký tự, không có khoảng trắng:");
////        while (true) {
////            String userName = scanner.nextLine();
////            boolean checkUserName = Pattern.matches("[a-z0-9_]{4,}", userName);
////            if (!checkUserName) {
////                System.err.println("Username failed! Please try again!");
////                continue;
////            } else if (checkUserName(userName)) {
////                System.err.println("Username is existed! Please try again!");
////                continue;
////            }
////            return userName;
////        }
////    }
////
////    public String validatePassword(){
////        System.out.println("Nhập mật khẩu của bạn, mật khẩu bắt buộc phải có ít nhất 4 ký tự, chứa ít nhất một chữ số, một chữ thường & chữ hoa, một ký tự đặc biệt và không có khoảng trắng:");
////        while (true) {
////            String password = scanner.nextLine();
////            boolean checkPassword = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&+^!*=])(?=\\S+$).{4,}$", password);
////            if (!checkPassword) {
////                System.err.println("Mật khẩu không thành công! Vui lòng thử lại!");
////                continue;
////            }
////            return password;
////        }
////    }
////
////    public boolean checkUserName(String userName) {
////        for (Account acc : accounts) {
////            if (acc.getUserName().equals(userName)) {
////                return true;
////            }
////        }
////        return false;
////    }
//}
