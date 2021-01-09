package Controller;

import java.util.ArrayList;
import java.util.HashMap;

import DAO.UserDAO;
import Model.*;

public class CustomerController {
    Customer customer;

    public CustomerController(Customer customer) {
        this.customer = customer;
    }

    public  boolean bookTicket(Showtime showtime, int row, int col) {
        Seat seat = new Seat(showtime.getID(), row, col, customer.getID(), 0);
        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(seat);
        return DAO.ShowtimeDAO.bookTickets(seats);
    }

    public  boolean bookTicket(ArrayList<Seat> seats) {
        System.out.println(customer.getID());
        for(int i=0;i<seats.size();i++)
        {
            seats.get(i).setStatus(customer.getID());
        }
        return DAO.ShowtimeDAO.bookTickets(seats);
    }

    public static ArrayList<Film> getAllFilms() {
        return DAO.FilmDAO.getAllFilm();
    }

    public static ArrayList<Showtime> getAllShowtimesBy(Film film) {
        return DAO.ShowtimeDAO.getAllShowtimesBy(film);
    }

    public static ArrayList<Showtime> getAllShowtimesBy(Theater theater) {
        return DAO.ShowtimeDAO.getAllShowtimesBy(theater);
    }
    public static ArrayList<Showtime> getAllShowtimesBy(String theaterName, String filmName) {
        return DAO.ShowtimeDAO.getAllShowtimesBy(theaterName, filmName);
    }
    public static ArrayList<Showtime> getAllShowtimesBy(String theaterName, String filmName,String date) {
        return DAO.ShowtimeDAO.getAllShowtimesBy(theaterName, filmName, date);
    }

    public static ArrayList<Theater> getAllTheaters() {
        return DAO.TheaterDAO.getAllTheaters();
    }

    public static HashMap<String, ArrayList<Showtime>> getAllShowtimesByFilm(int idfilm, String date) {
        return DAO.ShowtimeDAO.getAllShowtimeByFilm(idfilm, date);
    }

    public static HashMap<String, ArrayList<Showtime>> getAllShowtimesByTheater(int idtheater, String date) {
        return DAO.ShowtimeDAO.getAllShowtimeByTheater(idtheater,date);
    }
    public static ArrayList<Showtime> getAllShowtimesBy(int idtheater,int idfilm,String date){
        return DAO.ShowtimeDAO.getAllShowtimeBy(idtheater,idfilm,date);
    }

    public static ArrayList<Seat> getAllSeatsBy(int idshowtime){
        return DAO.ShowtimeDAO.getAllSeatsBy(idshowtime);
    }
    public static int updateACustomer(Customer account,boolean ischangePassword){
        if(!(account.getDoB().length()!=0 && account.getFullname().length()!=0 && account.getPhone().length()!=0))
            return -1;
        if(account.getFullname().length()>45 || account.getPassword().length()>10 || account.getPhone().length()>10||account.getFavouriteGenre().length()>20)
            return -2;
        if(UserDAO.updateACustomer(account,ischangePassword))
            return 1;
        else
            return 0;
    }

}
