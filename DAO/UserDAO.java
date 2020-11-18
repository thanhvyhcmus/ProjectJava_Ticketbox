package DAO;


import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Admin;
import Model.Customer;
import DAO.JDBCConnection.JDBCConnection;
public class UserDAO {
    public   ArrayList<Customer> getAllCustormer(){
        ArrayList<Customer> customer = new ArrayList<Customer>();
        try {
            Connection conn = JDBCConnection.getConnection();
            Statement stm = conn.createStatement();
            String sql = "select * from user";
            ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                customer.add( new Customer(res.getString(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getInt(7),res.getString(8)));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
    }
    public static void main(String[] args)
    {
        UserDAO x = new UserDAO();
        System.out.println(x.checkAnAccount("1df", "12345"));

    }
    public boolean updateACustomer(Customer customer){
        int rs=0;
        try {
            Connection conn = JDBCConnection.getConnection();
            String sql = "update user set id = ?, fullname = ?, dob = ?,username = ?,password = ?, phone= ?,point = ?,favouriteGenre = ?,isadmin = ? where id = ?" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, customer.getId());
            stm.setString(2, customer.getFullname());
            stm.setString(3, customer.getDoB());
            stm.setString(4, customer.getUsername());
            stm.setString(5, customer.getPassword());
            stm.setString(6, customer.getPhone());
            stm.setInt(7, customer.getPoints());
            stm.setString(8, customer.getFavouriteGenre());
            stm.setByte(9, customer.getIsadmin());
            stm.setString(10, customer.getId());
            rs= stm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        if (rs==0)
            return false;
        return true;

    }
    public boolean deleteACustomer(Customer customer){
        int rs=0;
        try {
            Connection conn = JDBCConnection.getConnection();
            String sql = "delete from user  where id = ?" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, customer.getId());
            rs= stm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        if (rs==0)
            return false;
        return true;

    }
    public int checkAnAccount(String username,String password){
        int rs=0;
        try {
            
            Connection conn = JDBCConnection.getConnection();
            String sql = "select isadmin from user where username=? and password= ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2,password);
            ResultSet res= stm.executeQuery();
            if (res.next())
                rs=res.getInt(1)+1;
                
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
//     //check cho cả admin va customer
// //(0: sai, 1: Cus, 2: admin)
    public boolean addACustomer(Customer customer){
        int rs=0;
        try {
            Connection conn = JDBCConnection.getConnection();
            String sql = "insert into  user (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`,`isadmin`) VALUES (?,?,?,?,?,?,?,?,?)" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, customer.getId());
            stm.setString(2, customer.getFullname());
            stm.setString(3, customer.getDoB());
            stm.setString(4, customer.getUsername());
            stm.setString(5, customer.getPassword());
            stm.setString(6, customer.getPhone());
            stm.setInt(7, customer.getPoints());
            stm.setString(8, customer.getFavouriteGenre());
            stm.setByte(9, (byte)0);
            rs= stm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        if (rs==0)
            return false;
        return true;

    }
    public boolean addAnAdmin(Admin admin){
        int rs=0;
        try {
            Connection conn = JDBCConnection.getConnection();
            String sql = "insert into  user (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`,`isadmin`) VALUES (?,?,?,?,?,?,?,?,?)" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, admin.getId());
            stm.setString(2, admin.getFullname());
            stm.setString(3, admin.getDoB());
            stm.setString(4, admin.getUsername());
            stm.setString(5, admin.getPassword());
            stm.setString(6, admin.getPhone());
            stm.setInt(7, 0);
            stm.setString(8, null);
            stm.setByte(9, (byte)1);
            rs= stm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        if (rs==0)
            return false;
        return true;

    }
    public boolean deleteAnAdmin(Admin admin){
        int rs=0;
        try {
            Connection conn = JDBCConnection.getConnection();
            String sql = "delete from user  where id = ?" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, admin.getId());
            rs= stm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        if (rs==0)
            return false;
        return true;

    }
}
    

