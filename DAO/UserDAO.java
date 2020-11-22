package DAO;


import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Admin;
import Model.Customer;
import DAO.JDBCConnection.JDBCConnection;
public class UserDAO {
    public static  ArrayList<Customer> getAllCustormer(){
        ArrayList<Customer> customer = new ArrayList<Customer>();
        Connection conn = null;
        Statement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            stm = conn.createStatement();
            String sql = "select * from user";
            res = stm.executeQuery(sql);
            while(res.next()){
                customer.add( new Customer(res.getInt(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getInt(7),res.getString(8)));
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
        return customer;
    }

    public static boolean updateACustomer(Customer customer){
        int rs=0;
        Connection conn=null;
        PreparedStatement stm=null;

        try {
            conn = JDBCConnection.getConnection();
            String sql = "update user set id = ?, fullname = ?, dob = ?,username = ?,password = ?, phone= ?,point = ?,favouriteGenre = ?,isadmin = ? where id = ?" ;
            stm = conn.prepareStatement(sql);
            stm.setInt(1, customer.getID());
            stm.setString(2, customer.getFullname());
            stm.setString(3, customer.getDoB());
            stm.setString(4, customer.getUsername());
            stm.setString(5, customer.getPassword());
            stm.setString(6, customer.getPhone());
            stm.setInt(7, customer.getPoints());
            stm.setString(8, customer.getFavouriteGenre());
            stm.setByte(9, customer.getIsadmin());
            stm.setInt(10, customer.getID());
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
    public static boolean deleteACustomer(Customer customer){
        int rs=0;
        Connection conn=null; 
        PreparedStatement stm=null;
        

        try {
            conn = JDBCConnection.getConnection();
            String sql = "delete from user  where id = ?" ;
            stm = conn.prepareStatement(sql);
            stm.setInt(1, customer.getID());
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
    public static int checkAnAccount(String username,String password){
        int rs=0;
        PreparedStatement stm=null;
        Connection conn=null;
        ResultSet res=null;
        try {
            
            conn = JDBCConnection.getConnection();
            String sql = "select isadmin from user where username=? and password= ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2,password);
            res= stm.executeQuery();
            if (res.next())
                rs=res.getInt(1)+1;
                

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try
            {
                if(stm != null)
                    stm.close();
                if(conn != null)
                    conn.close();
                if(res != null)
                    res.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        return rs;
    }
//     //check cho cả admin va customer
// //(0: sai, 1: Cus, 2: admin)
    public static boolean addACustomer(Customer customer){
        int rs=0;
        Connection conn=null;
        PreparedStatement stm=null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "insert into  user ( `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`,`isadmin`) VALUES (?,?,?,?,?,?,?,?)" ;
            stm = conn.prepareStatement(sql);
            stm.setString(1, customer.getFullname());
            stm.setString(2, customer.getDoB());
            stm.setString(3, customer.getUsername());
            stm.setString(4, customer.getPassword());
            stm.setString(5, customer.getPhone());
            stm.setInt(6, customer.getPoints());
            stm.setString(7, customer.getFavouriteGenre());
            stm.setByte(8, (byte)0);
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
    public static boolean addAnAdmin(Admin admin){
        int rs=0;
        try {
            Connection conn = JDBCConnection.getConnection();
            String sql = "insert into  user (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`,`isadmin`) VALUES (?,?,?,?,?,?,?,?,?)" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, null);
            stm.setString(2, admin.getFullname());
            stm.setString(3, admin.getDoB());
            stm.setString(4, admin.getUsername());
            stm.setString(5, admin.getPassword());
            stm.setString(6, admin.getPhone());
            stm.setInt(7, 0);
            stm.setString(8, null);
            stm.setByte(9, (byte)1);
            rs= stm.executeUpdate();
            conn.close();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        if (rs==0)
            return false;
        return true;

    }
    public static boolean deleteAnAdmin(Admin admin){
        int rs=0;
        try {
            Connection conn = JDBCConnection.getConnection();
            String sql = "delete from user  where id = ?" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, admin.getID());
            rs= stm.executeUpdate();
            conn.close();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        if (rs==0)
            return false;
        return true;

    }
}
    

