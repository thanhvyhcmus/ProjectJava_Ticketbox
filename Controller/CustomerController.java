package Controller;

import java.util.ArrayList;
import java.util.HashMap;

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
    public static boolean updateACustomer(Customer customer,boolean ischangePassword){
        return DAO.UserDAO.updateACustomer(customer,ischangePassword);
    }

}
