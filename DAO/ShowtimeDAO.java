package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Film;
import Model.Theater;
import Model.Showtime;
import Model.Seat;
/**
 * ShowtimeDAO
 */
public class ShowtimeDAO {
    public static ArrayList<Showtime> getAllShowtimeBy(Theater theater) {
        ArrayList<Showtime> show = new ArrayList<Showtime>();
        Connection conn = null;
        PreparedStatement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "select * from showtime where idtheater = ? ";
            stm = conn.prepareStatement(sql);
            stm.setInt(1, theater.getID());
            res = stm.executeQuery();
            while(res.next()){
                Film film= FilmDAO.searchAFilm(res.getString("idfilm"));
                Showtime st= new Showtime(res.getInt("id"), theater, film,res.getString("starttime"));
                ArrayList<Seat> seats = ShowtimeDAO.getAllSeatsBy(st.getID());
                st.setSeats(seats);
                show.add(st);
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if(conn != null)
                    conn.close();
                if(res != null)
                    res.close();
                if(stm != null)
                    stm.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return show;
    }
    public static ArrayList<Seat> getAllSeatsBy(int idShowtime ){
        ArrayList<Seat> seats = new ArrayList<Seat>();
        Connection conn = null;
        PreparedStatement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "select * from seatsofshowtime where idshowtime = ? ";
            stm = conn.prepareStatement(sql);
            stm.setInt(1, idShowtime);
            res = stm.executeQuery();
            while(res.next()){
                seats.add(new Seat(res.getInt(1),res.getInt(2),res.getInt(3),res.getInt(4),res.getInt(5)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if(conn != null)
                    conn.close();
                if(res != null)
                    res.close();
                if(stm != null)
                    stm.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return seats;
    }
    public static ArrayList<Showtime> getAllShowtimeBy(Film film) {
        ArrayList<Showtime> show = new ArrayList<Showtime>();
        Connection conn = null;
        PreparedStatement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "select * from showtime where idfilm = ? ";
            stm = conn.prepareStatement(sql);
            stm.setInt(1, film.getID());
            res = stm.executeQuery();
            while(res.next()){
                Theater theater= TheaterDAO.searchTheater(res.getString("idtheater"));
                Showtime st= new Showtime(res.getInt("id"), theater, film,res.getString("starttime"));
                ArrayList<Seat> seats = ShowtimeDAO.getAllSeatsBy(st.getID());
                st.setSeats(seats);
                show.add(st);
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if(conn != null)
                    conn.close();
                if(res != null)
                    res.close();
                if(stm != null)
                    stm.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return show;
    }
    public static boolean bookTickets(ArrayList<Seat> seats)
    {
        Connection conn = null;
        PreparedStatement stm=null;
        int res=0;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "update user set status= ? where idshowtime= ? and idrow=? and idcolumn = ?";
            for (Seat seat : seats) {
                stm = conn.prepareStatement(sql);
                stm.setInt(1, seat.getStatus());
                stm.setInt(2,seat.getIDShowtime());
                stm.setInt(3,seat.getIDRow());
                stm.setInt(4,seat.getIDColumn());
                res += stm.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if(conn != null)
                    conn.close();
                if(stm != null)
                    stm.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if(res== seats.size())
            return true;
        return false;
        
    }
}