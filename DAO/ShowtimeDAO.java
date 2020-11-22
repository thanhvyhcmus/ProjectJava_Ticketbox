package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAO.JDBCConnection.JDBCConnection;
import Model.Film;
import Model.Showtime;
import Model.Theater;
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
            stm.setString(1, theater.getID());
            res = stm.executeQuery();
            while(res.next()){
                Film film= FilmDAO.searchAFilm(res.getString(3));
                show.add( new Showtime(res.getString(1), theater, film,res.getString(4)));
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
}