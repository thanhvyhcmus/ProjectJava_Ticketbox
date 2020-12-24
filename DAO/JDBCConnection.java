package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class JDBCConnection {
    public static Connection getConnection(){
        final String user="root";
        final String password="";
        final String url = "jdbc:mysql://localhost:3306/ticketbox";
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("connected successfully!");
            } catch (SQLException ex) {
                Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    public void loadDataFromDatabase(){
        try {
            Connection conn = getConnection();
            Statement stm = conn.createStatement();
            String sql = "select * from user";
            ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                System.out.println(res.getString(1) + "  " + res.getString(2) 
                        + "  " + res.getString(3)+ "  " + res.getString(4)+ "  " + res.getString(5)+ "  " + res.getString(6)+ "  " + res.getInt(7)+ "  " + res.getString(8));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static boolean addASeat(String idShowtime,int idRow, int idCol, int price ){
        int rs=0;
        Connection conn=null;
        PreparedStatement stm=null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "insert into  seatsofshowtime (`idshowtime`, `idrow`, `idcolumn`, `ticketprice`) VALUES (?,?,?,?)" ;
            stm = conn.prepareStatement(sql);
            stm.setString(1, idShowtime);
            stm.setInt(2, idRow);
            stm.setInt(3, idCol);
            stm.setInt(4, price);
        
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
    public static void main(String[] args) {

        System.out.println("cc");
        

       
        //jdbc.loadDataFromDatabase();
    }
    
}
