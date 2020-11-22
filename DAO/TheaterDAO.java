package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Theater;

public class TheaterDAO {
    public static ArrayList<Theater> getAllTheaters(){
        ArrayList<Theater> theater = new ArrayList<Theater>();
        Connection conn = null;
        Statement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            stm = conn.createStatement();
            String sql = "select * from theater";
            res = stm.executeQuery(sql);
            while(res.next()){
                theater.add( new Theater(res.getInt(1), res.getString(2), res.getString(3)));
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
        return theater;
    }
    public static Theater searchTheater(String ID){
        Theater theater = null;
        Connection conn = null;
        PreparedStatement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "select * from theater where id = ?";
            stm= conn.prepareStatement(sql);
            stm.setString(1, ID);
            res = stm.executeQuery();
            if(res.next()){
                theater= new Theater(res.getInt(1), res.getString(2), res.getString(3));
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
        return theater;
    }
}
