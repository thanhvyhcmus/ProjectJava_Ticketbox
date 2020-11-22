package Controller;

import Model.Customer;
import DAO.UserDAO;

public class SignUpController {
    public static int addAnAccount(Customer account) {
        char[] s = account.getUsername().toCharArray();
        if (s.length ==0)
            return 0;
        for (char c : s) {
            if (!(c >= 32 && c <= 126)) {
                return 0;
            }
        }
        s = account.getPassword().toCharArray();
        if(s.length ==0)
            return 0;
        for (char c : s) {
            if (!(c >= 32 && c <= 126)) {
                return 0;
            }
        }
        if(UserDAO.checkAnAccount(account.getUsername(), account.getPassword())==1 || UserDAO.checkAnAccount(account.getUsername(), account.getPassword())==2 )
            return 0;
        if(UserDAO.addACustomer(account))
            return 1;
        else
            return 0;
        
    }
}
