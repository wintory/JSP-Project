package model;

import model.ConnectionBuilder;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account
{
  private int customerId;
  private String fname;
  private String lname;
  private String address;
  private String phone;
  private String email;
  private String password;
  
  
  
  public static boolean register(Account a)
  {
     int x  = 0;
    
    try
    {
      Connection con = ConnectionBuilder.getConnection();
      String sql = "INSERT INTO account(customer_id,cust_fname,cust_lname,password,address,phone,email) "
            + "VALUES(?,?,?,?,?,?,?)";
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setInt(1,a.getCustomerId());
      pstm.setString(2, a.getFname());
      pstm.setString(3, a.getLname());
      pstm.setString(4, a.getPassword());
      pstm.setString(5, a.getAddress());
      pstm.setString(6 ,a.getPhone());
      pstm.setString(7, a.getEmail());
      x  =pstm.executeUpdate();
  
    }
    catch (SQLException e)
    {
        System.out.println(e);
    }
    return x>0;
  }

  public static String Update(Account a)
  {
    String message = "";
    
    try
    {
      Connection con = ConnectionBuilder.getConnection();
      String sql = "update account set cust_fname=?,cust_lname=?,password=?,address=?,phone=?,email=? "
            + "VALUES(?,?,?,?,?,?)";
      PreparedStatement pstm = con.prepareStatement(sql);
   
      pstm.setString(1, a.getFname());
      pstm.setString(2, a.getLname());
      pstm.setString(3, a.getPassword());
      pstm.setString(4, a.getAddress());
      pstm.setString(8, a.getPhone());
      pstm.setString(9, a.getEmail());
      int x = pstm.executeUpdate();
      message = "register Success";
    }
    catch (SQLException e){
        System.out.println(e);
    }
    return message;
  }
  
  public static Account getAccount(String email)
  {
    Account a = null;
    Connection con = ConnectionBuilder.getConnection();
    String sql = "SELECT * FROM account WHERE email = ?";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setString(1, email);
      ResultSet rs = pstm.executeQuery();
      if (rs.next())
      {
        a = new Account();
        a.setAddress(rs.getString("address"));
        a.setCustomerId(rs.getInt("customer_id"));
        a.setEmail(rs.getString("email"));
        a.setFname(rs.getString("cust_fname"));
        a.setLname(rs.getString("cust_lname"));
        a.setPhone(rs.getString("phone"));
       
      }
    }
    catch (SQLException e)
    {
      System.out.println(e);
    }
    return a;
  }
  
  public static boolean checkId(int id){
      boolean check = true;
    Connection con = ConnectionBuilder.getConnection();
    String sql = "SELECT * FROM account WHERE customer_id = ?";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setInt(1, id);
      ResultSet rs = pstm.executeQuery();
      if (rs.next())
      {
        check = false;
      }
    }
    catch (SQLException e)
    {
      System.out.println(e);
    }
    return check;
  }
  
  public static boolean checkEmail(String email){
      boolean check = true;
    Connection con = ConnectionBuilder.getConnection();
    String sql = "SELECT * FROM account WHERE lower(email)= ?";
    try
    {
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setString(1, email.toLowerCase());
      ResultSet rs = pstm.executeQuery();
      if (rs.next())
      {
        check = false;
      }
    }
    catch (SQLException e)
    {
      System.out.println(e);
    }
    return check;
  }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
