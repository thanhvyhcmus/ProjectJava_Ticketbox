package Controller;

import Model.Admin;
import Model.Customer;
import Model.Film;
import Model.Theater;

public class AdminController {
    public static boolean addACustomer(Customer customer) {
        return DAO.UserDAO.addACustomer(customer);
    }
    public static boolean addAnAdmin(Admin admin) {
        return DAO.UserDAO.addAnAdmin(admin);
    }
    public static boolean addAFilm(Film film)
    {
        return DAO.FilmDAO.addAFilm(film);
    }
    public static boolean deleteACustomer(Customer customer)
    {
        return DAO.UserDAO.deleteACustomer(customer);
    }
    public static int getReport(Theater theater)
    {
        return DAO.ShowtimeDAO.getReport(theater);
    }
}
