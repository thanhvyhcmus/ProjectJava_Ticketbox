package Controller;

import Model.Customer;
import DAO.UserDAO;

public class SignUpController {

    public static int addAnAccount(Customer account) {
        if(!(account.getDoB().length()!=0 && account.getPassword().length()!=0 && account.getUsername().length()!=0 && account.getFullname().length()!=0 && account.getPhone().length()!=0)) 
            return -1;
        if(account.getFullname().length()>45 || account.getUsername().length()>15 || account.getPassword().length()>10 || account.getPhone().length()>10||account.getFavouriteGenre().length()>20)
            return -2;
        if(UserDAO.checkAnAccount(account.getUsername(), account.getPassword())==1 || UserDAO.checkAnAccount(account.getUsername(), account.getPassword())==2 )
            return 0;
        if(UserDAO.addACustomer(account))
            return 1;
        else
            return -2;
        
    }
}
 