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

public class Shirt {
    private int productId;
    private String productName;
    private int price;
    private int quantityOnHand;
    private String available;
    private String description;
    private String color;
    private String size;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
       public static Shirt getShirt(String color,String size,String pattern){
    Shirt s = null;
    
    try {
        Connection con = ConnectionBuilder.getConnection();
    String sql = "SELECT * FROM Account WHERE color = ? and size = ? and pattern = ?";
      PreparedStatement pstm = con.prepareStatement(sql);
      pstm.setString(1, color);
      pstm.setString(1, size);
      pstm.setString(1, pattern);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()){
        s = new Shirt();
        getShirt(rs,s);
      }
    }
    catch (SQLException e)
    {
      System.out.println(e);
    }
    return s;
  }
       
     
       
         public static void getShirt(ResultSet rs,Shirt s) throws SQLException{
        s.setAvailable(rs.getString("available"));
        s.setColor(rs.getString("color"));
        s.setDescription(rs.getString("description"));
        s.setPrice(rs.getInt("Price"));
        s.setProductId(rs.getInt("product_id"));
        s.setProductName(rs.getString("product_name"));
        s.setQuantityOnHand(rs.getInt("quantity_on_hand"));
        s.setSize(rs.getString("size"));
      
  }
       
       
       
        public static Shirt findById(int id) {
        Shirt s = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "select  * from customer where customer_id = ?";
            PreparedStatement stm = con.prepareStatement(sqlCmd);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                s = new Shirt();
                getShirt(rs,s);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return s;
    }
}
