package DAO;


import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Admin;
import Model.Customer;
import Model.User;

import java.math.BigInteger;  
import java.nio.charset.StandardCharsets; 
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException; 
public class UserDAO {
    public static  ArrayList<Customer> getAllCustormer(){
        ArrayList<Customer> customer = new ArrayList<Customer>();
        Connection conn = null;
        Statement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            stm = conn.createStatement();
            String sql = "select * from user where isadmin = 0";
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
    public static  ArrayList<Admin> getAllAdmin(){
        ArrayList<Admin> admin = new ArrayList<Admin>();
        Connection conn = null;
        Statement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            stm = conn.createStatement();
            String sql = "select * from user where isadmin = 1";
            res = stm.executeQuery(sql);
            while(res.next()){
                admin.add( new Admin(res.getInt("id"), res.getString("fullname"), res.getString("dob"),res.getString("phone"),res.getString("username"),res.getString("password")));
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
        return admin;
    }
    public static  ArrayList<User> getAllUser(){
        ArrayList<User> user = new ArrayList<User>();
        Connection conn = null;
        Statement stm=null;
        ResultSet res=null;
        try {
            conn = JDBCConnection.getConnection();
            stm = conn.createStatement();
            String sql = "select * from user ";
            res = stm.executeQuery(sql);
            System.out.println(res);
            while(res.next()){
                if(res.getByte("isadmin")==0){
                    System.out.println(0);
                    user.add(new Customer(res.getInt("id"),res.getString("fullname"),res.getString("dob"),res.getString("username") , res.getString("password"),res.getString("phone"),res.getInt("point"),res.getString("favouritegenre")));
                
                }
                else{
                    System.out.println(1);
                    user.add(new Admin(res.getInt("id"), res.getString("fullname"), res.getString("dob"),res.getString("phone"),res.getString("username") , res.getString("password"))); 
            
                }
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
        return user;
    }
    public static boolean updateACustomer(Customer customer){
        int rs=0;
        Connection conn=null;
        PreparedStatement stm=null;

        try {
            conn = JDBCConnection.getConnection();
            String sql = "update user set  fullname = ?, dob = ?,password = ?, phone= ?,favouriteGenre = ? where id = ?" ;
            stm = conn.prepareStatement(sql);
            stm.setString(1, customer.getFullname());
            stm.setString(2, customer.getDoB());
            stm.setString(3, hashPassword(customer.getPassword()));
            stm.setString(4, customer.getPhone());
            stm.setString(5, customer.getFavouriteGenre());
            stm.setInt(6, customer.getID());
            rs= stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
            stm.setString(2,hashPassword(password));
            res= stm.executeQuery();
            if (res.next()) {
                rs = res.getInt(1) + 1;
                System.out.println(rs);
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
    public static int getACustomer(String username,String password){
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
            String sql = "insert into  user ( `id`,`fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`,`isadmin`) VALUES (null,?,?,?,?,?,?,?,?)" ;
            stm = conn.prepareStatement(sql);
            stm.setString(1, customer.getFullname());
            stm.setString(2, customer.getDoB());
            stm.setString(3, customer.getUsername());
            stm.setString(4, hashPassword(customer.getPassword()));
            stm.setString(5, customer.getPhone());
            stm.setInt(6, customer.getPoints());
            stm.setString(7, customer.getFavouriteGenre());
            stm.setByte(8, (byte)0);
            rs= stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);

        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
            String sql = "insert into  user (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`,`isadmin`) VALUES (null,?,?,?,?,?,?,?,?)" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, admin.getFullname());
            stm.setString(2, admin.getDoB());
            stm.setString(3, admin.getUsername());
            stm.setString(4, admin.getPassword());
            stm.setString(5, admin.getPhone());
            stm.setInt(6, 0);
            stm.setString(7, null);
            stm.setByte(8, (byte)1);
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
    public static boolean addAnUser(User user){
        int rs=0;
        try {
            Connection conn = JDBCConnection.getConnection();
            String sql = "insert into  user (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`,`isadmin`) VALUES (null,?,?,?,?,?,?,?,?)" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, user.getFullname());
            stm.setString(2, user.getDoB());
            stm.setString(3, user.getUsername());
            stm.setString(4, user.getPassword());
            stm.setString(5, user.getPhone());
            stm.setInt(6, 0);
            stm.setString(7, null);
            stm.setByte(8,user.getIsadmin());
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
    public static boolean deleteAnUser(int ID){
        int rs=0;
        try {
            Connection conn = JDBCConnection.getConnection();
            String sql = "delete from user  where id = ?" ;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, ID);
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
    public static boolean updateAnUser(User user){
        int rs=0;
        Connection conn=null;
        PreparedStatement stm=null;

        try {
            conn = JDBCConnection.getConnection();
            String sql = "update user set  fullname = ?, dob = ?,username = ?,password = ?, phone= ? where id = ?" ;
            stm = conn.prepareStatement(sql);
            stm.setString(1, user.getFullname());
            stm.setString(2, user.getDoB());
            stm.setString(3, user.getUsername());
            stm.setString(4, user.getPassword());
            stm.setString(5, user.getPhone());
            stm.setInt(6, user.getID());
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
    public static User searchAnUser(int id,int type)
    {
        User user= null;
        ResultSet res=null;
        PreparedStatement stm=null;
        Connection conn=null;
        String sql=null;
        try{
            conn=JDBCConnection.getConnection();
            if(type!=0)
            {
                sql="select * from user where id = ? and isadmin = ?";
                stm= conn.prepareStatement(sql);
                stm.setInt(1,id);
                stm.setByte(2,(byte)(type-1));
            }
            else
            {
                sql = "select * from user where id = ?";
                stm= conn.prepareStatement(sql);
                stm.setInt(1,id);
            }
            res = stm.executeQuery();
            if(res.next())
            {
                if(res.getByte("isadmin")==0)
                    user = (new Customer(res.getInt("id"),res.getString("fullname"),res.getString("dob"),res.getString("username") , res.getString("password"),res.getString("phone"),res.getInt("point"),res.getString("favouriteGenre")));
                else
                    user = new Admin(res.getInt("id"), res.getString("fullname"), res.getString("dob"),res.getString("phone"),res.getString("username") , res.getString("password")); 
            
                //user = new User(res.getInt("id"),res.getString("fullname"),res.getString("dob"),res.getString("phone"),res.getString("username"),res.getString("password"),res.getByte("isadmin"));
            }
        }catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try
            {
                if(conn != null)
                    conn.close();
                if (stm != null)
                    stm.close();
                if(res != null) 
                    res.close();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }    
        return user;   

    }
    public static ArrayList<User> searchUsers(String username,int type)
    {
        ArrayList<User> user = new ArrayList<User>();
        //User user= null;
        ResultSet res=null;
        PreparedStatement stm=null;
        Connection conn=null;
        String sql=null;
        try{
            conn=JDBCConnection.getConnection();
            if(type!=0)
            {
                sql="select * from user where username like ? and isadmin = ?";
                stm= conn.prepareStatement(sql);
                stm.setString(1,"%"+username+"%");
                stm.setByte(2,(byte)(type-1));
            }
            else
            {
                sql = "select * from user where username like ? ";
                stm= conn.prepareStatement(sql);
                stm.setString(1,"%"+username+"%");
            }
            res = stm.executeQuery();
            if(res.next())
            {
                if(res.getByte("isadmin")==0){
                    System.out.println(0);
                    user.add(new Customer(res.getInt("id"),res.getString("fullname"),res.getString("dob"),res.getString("username") , res.getString("password"),res.getString("phone"),res.getInt("point"),res.getString("favouritegenre")));
                
                }
                else{
                    System.out.println(1);
                    user.add(new Admin(res.getInt("id"), res.getString("fullname"), res.getString("dob"),res.getString("phone"),res.getString("username") , res.getString("password"))); 
            
                }
                //user = new User(res.getInt("id"),res.getString("fullname"),res.getString("dob"),res.getString("phone"),res.getString("username"),res.getString("password"),res.getByte("isadmin"));
            }
        }catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try
            {
                if(conn != null)
                    conn.close();
                if (stm != null)
                    stm.close();
                if(res != null) 
                    res.close();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }    
        return user;   
    }    
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException 
    {  
        // Static getInstance method is called with hashing SHA  
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
  
        // digest() method called  
        // to calculate message digest of an input  
        // and return array of byte 
        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
    } 
    public static String toHexString(byte[] hash) 
    { 
        // Convert byte array into signum representation  
        BigInteger number = new BigInteger(1, hash);  
  
        // Convert message digest into hex value  
        StringBuilder hexString = new StringBuilder(number.toString(16));  
  
        // Pad with leading zeros 
        while (hexString.length() < 32)  
        {  
            hexString.insert(0, '0');  
        }  
  
        return hexString.toString();  
    }
    public static String hashPassword(String password) throws NoSuchAlgorithmException
    {
        return toHexString(getSHA(password));
    }
    public static Customer getCustomer(String username,String password){
        Customer rs=null;
        PreparedStatement stm=null;
        Connection conn=null;
        ResultSet res=null;
        try {
            
            conn = JDBCConnection.getConnection();
            String sql = "select * from user where username=? and password= ? and isadmin =0";
            stm = conn.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2,password);
            res= stm.executeQuery();
            if (res.next())
                rs=new Customer(res.getInt("id"),res.getString("fullname"),res.getString("dob"),res.getString("username") , res.getString("password"),res.getString("phone"),res.getInt("point"),res.getString("favouritegenre"));
                

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
    public static Admin getAdmin(String username,String password){
        Admin rs=null;
        PreparedStatement stm=null;
        Connection conn=null;
        ResultSet res=null;
        try {
            
            conn = JDBCConnection.getConnection();
            String sql = "select * from user where username=? and password= ? and isadmin =1";
            stm = conn.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2,password);
            res= stm.executeQuery();
            if (res.next())
                rs=new Admin(res.getInt("id"), res.getString("fullname"), res.getString("dob"),res.getString("phone"),res.getString("username") , res.getString("password"));
                

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
}
 


