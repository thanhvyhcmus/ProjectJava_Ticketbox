package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Film;
public class FilmDAO {
    public static ArrayList<Film> getAllFilm() {
        ArrayList<Film> film = new ArrayList<>();
        Connection conn = null;
        Statement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            stm = conn.createStatement();
            String sql = "select * from film";
            res = stm.executeQuery(sql);
            while(res.next()){
                film.add( new Film(res.getInt(1), res.getString(2), res.getString(3),res.getInt(4), res.getString(5), res.getString(6),res.getString(7), res.getString(8), res.getString(9),res.getString(10)));
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
        return film;
    }
    public static boolean updateAFilm(Film film) {
        
        int rs=0;
        Connection conn=null;
        PreparedStatement stm=null;

        try {
            conn = JDBCConnection.getConnection();
            String sql = "update film set id = ?, title = ?, description = ?,duration = ?,genre = ?, director= ?,Cast = ?,releasedate = ?,language = ?,linkFilm = ? where id = ?" ;
            stm = conn.prepareStatement(sql);
            stm.setInt(1, film.getID());
            stm.setString(2, film.getTitle());
            stm.setString(3, film.getDescription());
            stm.setInt(4, film.getDuration());
            stm.setString(5, film.getGenre());
            stm.setString(6, film.getDirector());
            stm.setString(7, film.getCast());
            stm.setString(8, film.getReleasedDate());
            stm.setString(9, film.getLanguage());
            stm.setString(10, film.getLinkimg());
            stm.setInt(11, film.getID());
            rs= stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if(stm!=null)
                    stm.close();
                if(conn!=null)
                    conn.close();    
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        if (rs==0)
            return false;
        return true;
    }
    public static boolean deleteAFilm(Film film){
        int rs=0;
        Connection conn=null; 
        PreparedStatement stm=null; 
        try {
            conn = JDBCConnection.getConnection();
            String sql = "delete from film  where id = ?" ;
            stm = conn.prepareStatement(sql);
            stm.setInt(1, film.getID());
            rs= stm.executeUpdate();
            conn.close();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
                if(stm != null){
                    stm.close();
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        if (rs==0)
            return false;
        return true;
    }
    public static boolean addAFilm(Film film){
        int rs=0;
        Connection conn=null;
        PreparedStatement stm=null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "insert into  film  VALUES (null,?,?,?,?,?,?,?,?,?)" ;
            stm = conn.prepareStatement(sql);
            stm.setString(1, film.getTitle());
            stm.setString(2, film.getDescription());
            stm.setInt(3, film.getDuration());
            stm.setString(4, film.getGenre());
            stm.setString(5, film.getDirector());
            stm.setString(6, film.getCast());
            stm.setString(7, film.getReleasedDate());
            stm.setString(8, film.getLanguage());
            stm.setString(9, film.getLinkimg());
            rs= stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        finally{
            try
            {
                if (stm != null)
                    stm.close();
                if(conn != null)
                    conn.close();
               
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (rs==0)
            return false;
        return true;
    }
    public static Film searchAFilm(int ID) 
    {
        Film film = null;
        Connection conn = null;
        PreparedStatement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "select * from film where id = ?";
            stm= conn.prepareStatement(sql);
            stm.setInt(1,ID);
            res = stm.executeQuery();
            if(res.next()){
                film= new Film(res.getInt(1), res.getString(2), res.getString(3),res.getInt(4), res.getString(5), res.getString(6),res.getString(7), res.getString(8), res.getString(9),res.getString(10));
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
        return film;
        
    }

}   
