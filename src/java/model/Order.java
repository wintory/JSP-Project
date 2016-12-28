/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willy
 */
public class Order {
    private int orderId;
    private String email;
    private int price;
    private String status;
    private String url;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public static List<Order> findByEmail(String email){
        List<Order> order = null;
        Order or = null;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from myorder "
                    + "where email like ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,email);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                if(order==null){
                    order = new ArrayList();
                }
                or = new Order();
                getOrder(rs,or);
                order.add(or);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    return order;
    }
    
    public static void getOrder(ResultSet rs,Order or) throws SQLException{
        or.setOrderId(rs.getInt("order id"));
        or.setEmail(rs.getString("email"));
        or.setPrice(rs.getInt("price"));
        or.setStatus(rs.getString("status"));
        or.setUrl(rs.getString("url"));
        
    }
    
    
    public static String addOrder(Order or){
        String message = null;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sql = "insert into myorder(order_id,email,price,status,url) value(?,?,?,?,?) ";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1,or.getOrderId());
            pstm.setString(2,or.getEmail());
            pstm.setInt(3,or.getPrice());
            pstm.setString(3,or.getStatus());
            pstm.setString(3,or.getUrl());
            pstm.executeUpdate();
            message = "check out success!!";
            }catch(SQLException e){
            message = "check out not found!!";
        }
        return message;
    }
    
    public static String updateOrder(Order or){
        String message = null;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sql = "update myorder set(price,status,url) value(?,?,?,?,?) ";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(3,or.getStatus());
            pstm.setString(3,or.getUrl());
            pstm.executeUpdate();
            message = "payment success!!";
            }catch(SQLException e){
            message = "payment not found!!";
        }
        return message;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
}

  

   

