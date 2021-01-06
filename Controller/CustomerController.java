package Controller;

import java.util.ArrayList;
import java.util.HashMap;

import Model.*;

public class CustomerController {
    Customer customer;

    public CustomerController(Customer customer) {
        this.customer = customer;
    }

    public boolean bookTicket(Showtime showtime, int row, int col) {
        Seat seat = new Seat(showtime.getID(), row, col, customer.getID(), 0);
        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(seat);
        return DAO.ShowtimeDAO.bookTickets(seats);
    }

    public boolean bookTicket(ArrayList<Seat> seats) {
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

    public static ArrayList<Showtime> getAllShowtimesBy(int theater, int film) {
        return DAO.ShowtimeDAO.getAllShowtimesBy(theater, film);
    }

    public static ArrayList<Theater> getAllTheaters() {
        return DAO.TheaterDAO.getAllTheaters();
    }

    public static HashMap<String, ArrayList<Showtime>> getAllShowtimesByFilm(int film, String date) {
        return DAO.ShowtimeDAO.getAllShowtimeByFilm(film, date);
    }

    public static HashMap<String, ArrayList<Showtime>> getAllShowtimesByTheater(int theater, String date) {
        return DAO.ShowtimeDAO.getAllShowtimeByTheater(theater,date);
    }
    public static ArrayList<Showtime> getAllShowtimesBy(int theater,int film,String date){
        return DAO.ShowtimeDAO.getAllShowtimeBy(theater,film,date);
    }

}
