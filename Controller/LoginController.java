package Controller;

import DAO.UserDAO;

public class LoginController {
    public static int checkAnAccount(String username, String password) {
        char[] s = username.toCharArray();
        for (char c : s) {
            if (!(c >= 32 && c <= 126)) {
                return 0;
            }
        }
        s = password.toCharArray();
        for (char c : s) {
            if (!(c >= 32 && c <= 126)) {
                return 0;
            }
        }
        return UserDAO.checkAnAccount(username, password);
    }
}