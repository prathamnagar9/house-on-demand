

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class P_PROPERTY {
    
    private int id;
    private int type;
    private int size;
    private int ownerId;
    private String price;
    private String address;
    private int bedroom;
    private int bathroom;
    private int age;
    private boolean balcony;
    private boolean pool;
    private boolean garage;
    private String description;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public P_PROPERTY(){}
    
    public P_PROPERTY(int ID, int TYPE, int SIZE, int OWNER_ID, String PRICE, String ADDRESS, 
                         int BEDROOM, int BATHROOM, int AGE, 
                         boolean BALCONY, boolean POOL, boolean GARAGE, 
                         String DESCRIPTION)
    {
        this.id = ID;
        this .type = TYPE;
        this.size = SIZE; 
        this.ownerId = OWNER_ID;
         this.price = PRICE; 
        this.address = ADDRESS;
        this.age = AGE;
        this.bathroom= BATHROOM;
        this.bedroom = BEDROOM;
        this.description =DESCRIPTION;
        this.balcony = BALCONY;
        this.garage = GARAGE;
        this.pool = POOL;
    }
    
    public boolean addNewProperty(P_PROPERTY property)
    {
         PreparedStatement ps;
        
        String addQuery ="INSERT INTO `the_property`(`type`, `square_feet`, `ownerId`, `price`, `address`, `bedroom`, `bathroom`, `age`, `pool`, `balcony`, `garage`, `description`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1, property.getType());
            ps.setInt (2, property.getSize());
            ps.setInt (3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString (5, property.getAddress());
            ps.setInt (6, property.getBedroom());
            ps.setInt (7, property.getBathroom());
            ps.setInt (8, property.getAge ());
            ps.setBoolean (9, property.isBalcony());
            ps.setBoolean (10, property.isPool());
            ps.setBoolean (11, property.isGarage());
            ps.setString(12, property.getDescription());
            
            return (ps.executeUpdate() >0);
                    } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
        
        
       
    }
    
   

    public boolean editProperty(P_PROPERTY property)
    {
             PreparedStatement ps;
        
        String editQuery ="UPDATE `the_property` SET `type`=?,`square_feet`=?,`ownerId`=?,`price`=?,`address`=?,`bedroom`=?,`bathroom`=?,`age`=?,`pool`=?,`balcony`=?,`garage`=?,`description`=? WHERE `id`=?";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1, property.getType());
            ps.setInt (2, property.getSize());
            ps.setInt (3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString (5, property.getAddress());
            ps.setInt (6, property.getBedroom());
            ps.setInt (7, property.getBathroom());
            ps.setInt (8, property.getAge ());
            ps.setBoolean (9, property.isBalcony());
            ps.setBoolean (10, property.isPool());
            ps.setBoolean (11, property.isGarage());
            ps.setString(12, property.getDescription());
            ps.setInt(13, property.getId());
            
            return (ps.executeUpdate() >0);
                    }
        catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
        
        
    }
    
    public boolean removeProperty(int propertyId)
    {
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `the_property` WHERE `id`=?";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, propertyId);
            
            return (ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public P_PROPERTY findProperty(int propertyId)
    {
        PreparedStatement ps;
        ResultSet rs;
        P_PROPERTY property = null;
        String searchQuery = "SELECT * FROM `the_property` WHERE `id` = ?";
        
        try {
            
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(searchQuery);
            ps.setInt(1, propertyId);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                property = new P_PROPERTY(rs.getInt("id"),
                                          rs.getInt("type"),
                                          rs.getInt("square_feet"),
                                          rs.getInt("ownerId"),
                                           rs.getString("price"),
                                          rs.getString("address"),
                                          rs.getInt("bedroom"),
                                          rs.getInt("bathroom"),
                                          rs.getInt("age"),
                                          rs.getBoolean("pool"),
                                           rs.getBoolean("balcony"),
                                           rs.getBoolean("garage"),
                                          rs.getString("description"));
            }
            return property;
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return property;
    }
    
    public ArrayList<P_PROPERTY> propertiesList()
    {
       ArrayList<P_PROPERTY> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `the_property` ";
        
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            P_PROPERTY property;
            
            while(rs.next())
            {
                property = new P_PROPERTY(rs.getInt("id"),
                                          rs.getInt("type"),
                                          rs.getInt("square_feet"),
                                          rs.getInt("ownerId"),
                                           rs.getString("price"),
                                          rs.getString("address"),
                                          rs.getInt("bedroom"),
                                          rs.getInt("bathroom"),
                                          rs.getInt("age"),
                                          rs.getBoolean("pool"),
                                           rs.getBoolean("balcony"),
                                           rs.getBoolean("garage"),
                                          rs.getString("description"));
                
                
                
                list.add(property);
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
    
    // function to return a list of properties based on the selected type
     public ArrayList<P_PROPERTY> propertiesListByType(int typeId)
    {
       ArrayList<P_PROPERTY> list = new ArrayList<>();
        
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `the_property` WHERE type=? ";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
            ps.setInt(1, typeId);
            rs = ps.executeQuery();
            
            P_PROPERTY property;
            
            while(rs.next())
            {
                property = new P_PROPERTY(rs.getInt("id"),
                                          rs.getInt("type"),
                                          rs.getInt("square_feet"),
                                          rs.getInt("ownerId"),
                                           rs.getString("price"),
                                          rs.getString("address"),
                                          rs.getInt("bedroom"),
                                          rs.getInt("bathroom"),
                                          rs.getInt("age"),
                                          rs.getBoolean("pool"),
                                           rs.getBoolean("balcony"),
                                           rs.getBoolean("garage"),
                                          rs.getString("description"));
                
                
                
                list.add(property);
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
     
     // function to add image to property
     public boolean addImage(int propertyId, String the_image_path)
    {
         PreparedStatement ps;
        
        String addQuery ="INSERT INTO `property_images`(`property_id`, `the_image`) VALUES (?, ?)";
        
        try {
            
             try {
                 FileInputStream propertyImage = new FileInputStream(new File(the_image_path));
                 
                 ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
                 ps.setInt(1, propertyId);
                 
                 ps.setBinaryStream(2, propertyImage);
                 
                 
                 return (ps.executeUpdate() >0);
             } catch (FileNotFoundException ex) {
                 //Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null,ex.getMessage() +  "Invalid File", "Image Error", 2);
                 return false;
             }

           
                    } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
        
        
       
    }
     
     
     // function to display the property image list
      public HashMap<byte[], Integer> propertyImagesList(int propertyId)
    {
       HashMap<byte[], Integer> list = new HashMap<>();
        
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `property_images` WHERE `property_id`=? ";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
            ps.setInt(1, propertyId);
            rs = ps.executeQuery();

            
            while(rs.next())
            {
               list.put(rs.getBytes("the_image"), rs.getInt("id"));
           
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
      
      
      
      
      // display image in jlabel from selected id in jlist
       public byte[] getImageById(int imageId)
    {
     
        
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT `the_image` FROM `property_images` WHERE `id`=?";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
            ps.setInt(1, imageId);
            rs = ps.executeQuery();

            
            if(rs.next())
            {
               return rs.getBytes("the_image");
           
            }
            else{
                    return null;
                    }
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
       
       
       
       // remove property image by id
           public boolean removePropertyImage(int imageId)
    {
     
        
        PreparedStatement ps;
        ResultSet rs;
        String DeleteQuery = "DELETE FROM `property_images` WHERE `id`=?";
        
        try {
            ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(DeleteQuery);
            ps.setInt(1, imageId);
          

            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
    }
}

