import controller.ManagerAccount;
import controller.ManagerNhanVien;
import model.Account;

public class Main {
    public static void main(String[] args) {
        ManagerNhanVien managerNhanVien = new ManagerNhanVien();
        ManagerAccount managerAccount = new ManagerAccount();
        while (true){
            if (managerAccount.account== null) {
                managerAccount.menuAcc(managerAccount);
            } else {
                if (managerAccount.account.getRole().equals("admin")) {
                    managerNhanVien.menuAdmin(managerAccount);
                } else {
                    managerNhanVien.menuUser(managerAccount);
                }
            }
        }
    }
}
