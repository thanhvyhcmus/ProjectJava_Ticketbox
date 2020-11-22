package Controller;

import Model.Customer;
import DAO.UserDAO;

public class SignUpController {
    public static int addAnAccount(Customer account) {
        if(account.getID().length()!=0 && account.getDoB().length()!=0 && account.getPassword().length()!=0 && account.getUsername().length()!=0 && account.getFullname().length()!=0 && account.getPhone().length()!=0) 
            return -1;
        if(UserDAO.checkAnAccount(account.getUsername(), account.getPassword())==1 || UserDAO.checkAnAccount(account.getUsername(), account.getPassword())==2 )
            return 0;
        if(UserDAO.addACustomer(account))
            return 1;
        else
            return 0;
        
    }
}
