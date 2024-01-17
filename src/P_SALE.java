
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apoor
 */
public class P_SALE 
{
   private int id;
    private int propertyId;
    private int clientId;
    private String finalPrice;
    private String sellingDate;
    
    public P_SALE(){}
    
    public P_SALE(int ID, int PROPERTY_ID, int CLIENT_ID, String FINAL_PRICE, String SELLING_DATE)
    {
        this.id = ID;
        this.propertyId = PROPERTY_ID;
        this.clientId = CLIENT_ID;
        this.finalPrice = FINAL_PRICE;
        this.sellingDate = SELLING_DATE;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    
    
    
    
     //function to add new Sale
    public boolean addNewSale(P_SALE sale)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `sale`( `property_id`, `client_id`, `final_price`, `sale_date`) VALUES (?,?,?,?)";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            
            return (ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
     public boolean editSale(P_SALE sale)
    {
        
        PreparedStatement ps;
        
        String editQuery = "UPDATE `sale` SET `property_id`=?,`client_id`=?,`final_price`=?,`sale_date`=? WHERE `id`=?";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
             ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            ps.setInt(5, sale.getId());
            
            return (ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
         
    }
    
         public boolean deleteSale(int saleId)
    {
           PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `sale` WHERE `id`=?";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, saleId);
            
            return (ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
