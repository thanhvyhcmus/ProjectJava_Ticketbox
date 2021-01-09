package Controller;

import Model.*;
import java.util.ArrayList;

public class AdminController {
    public static boolean addACustomer(Customer customer) {
        return DAO.UserDAO.addACustomer(customer);
    }
    public static ArrayList<User> getAllUsers(){
        return DAO.UserDAO.getAllUser();
    }
    public static  ArrayList<Customer> getAllCustormer(){
        return DAO.UserDAO.getAllCustormer();
    }
    public static  ArrayList<Admin> getAllAdmin(){
        return DAO.UserDAO.getAllAdmin();
    }
    public static boolean addAnAdmin(Admin admin) {
        return DAO.UserDAO.addAnAdmin(admin);
    }
    public static boolean updateACustomer(Customer customer) {
        return DAO.UserDAO.updateACustomer(customer,false);
    }
    public static boolean updateAnUser(User user) {
        return DAO.UserDAO.updateAnUser(user);
    }
    public static boolean addAFilm(Film film)
    {
        return DAO.FilmDAO.addAFilm(film);
    }
    public static boolean deleteACustomer(Customer customer)
    {
        return DAO.UserDAO.deleteACustomer(customer);
    }
    public static boolean deleteAnUser(int ID){
        return DAO.UserDAO.deleteAnUser(ID);
    }
    public static int getReport(Theater theater)
    {
        return DAO.ShowtimeDAO.getReport(theater);
    }
    public static User searchAnUser(int ID, int type)
    {
        return DAO.UserDAO.searchAnUser(ID, type);
    }
    public static ArrayList<User> searchUsers(String username, int type)
    {
        return DAO.UserDAO.searchUsers(username, type);
    }
}
