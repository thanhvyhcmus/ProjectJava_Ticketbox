package Controller;

import java.security.NoSuchAlgorithmException;

import DAO.UserDAO;
import Model.Admin;
import Model.Customer;

public class LoginController {
    public static int checkAnAccount(String username, String password) throws NoSuchAlgorithmException {
        char[] s = username.toCharArray();
        if (s.length==0)
            return 0;
        for (char c : s) {
            if (!(c >= 32 && c <= 126)) {
                return 0;
            }
        }
        s = password.toCharArray();
        if(s.length==0)
            return 0;
        for (char c : s) {
            if (!(c >= 32 && c <= 126)) {
                return 0;
            }
        }
        return UserDAO.checkAnAccount(username,password);
    }
    public static Customer getCustomer(String username,String password) throws NoSuchAlgorithmException {
        return UserDAO.getCustomer(username, UserDAO.hashPassword(password));
    }
    public static Admin getAdmin(String username,String password) throws NoSuchAlgorithmException {
        return UserDAO.getAdmin(username, UserDAO.hashPassword(password));
    }

    
}