/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.JDBCConnection;


import java.sql.Connection;
import java.sql.DriverManager;
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
        final String password="22121999";
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
    public void loadDataFromDatabase(){//ham test thu load data user
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
    
    public static void main(String[] args) {
        JDBCConnection jdbc = new JDBCConnection();
        
        jdbc.loadDataFromDatabase();
    }
    
}
