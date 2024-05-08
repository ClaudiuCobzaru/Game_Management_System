/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author claud
 */
public interface ManageCustomers {

    //metoda pentru adaugarea datelor in tabelul customer_details
    public static boolean addCustomers(int customerId, String customerName, String customerEmail, String customerContact) {

        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into customers_details values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, customerId);
            pst.setString(2, customerName);
            pst.setString(3, customerEmail);
            pst.setString(4, customerContact);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    //metoda pentru updatarea valorilor din tableul customer_details
    public static boolean updateCustomers(int customerId, String customerName, String customerEmail, String customerContact) {

        try {
            Connection con = DBConnection.getConnection();
            String sql = "update customers_details set customer_name = ?, customer_email = ?, customer_contact = ? where customer_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, customerName);
            pst.setString(2, customerEmail);
            pst.setString(3, customerContact);
            pst.setInt(4, customerId);

            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    //metoda pentru a sterge un entry din tabel
    public static boolean deleteCustomers(int customerId) {

        try {
            Connection con = DBConnection.getConnection();
            String sql = "delete from customers_details where customer_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, customerId);

            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public static boolean validateCustomer(String id, String name, String email, String contact) {

        HomePage homepage = new HomePage();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(homepage, "You did not enter an ID!");
            return false;
        }
        if (name.equals("")) {
            JOptionPane.showMessageDialog(homepage, "You did not enter a Customer Name!");
            return false;
        }

        if (email.equals("") || !email.matches("^(.+)@(.+)$")) {
            JOptionPane.showMessageDialog(homepage, "Invaild Email!");
            return false;
        }
        if (contact.equals("") || !contact.matches("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$")) {
            JOptionPane.showMessageDialog(homepage, "Invalid Contact No!");
            return false;
        }
        if (checkDuplicateEmails(email)) {
            JOptionPane.showMessageDialog(homepage, "Email alredy exists!");
            return false;
        }

        if (checkDuplicateContact(contact)) {
            JOptionPane.showMessageDialog(homepage, "Contact No alredy exists!");
            return false;
        }

        return true;

    }

    //verificarea emailurilor multiple
    public static boolean checkDuplicateEmails(String email) {

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from customers_details where customer_email = ?");

            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    //verificarea nr de telefon existente
    public static boolean checkDuplicateContact(String contact) {

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from customers_details where customer_contact = ?");

            pst.setString(1, contact);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }
    
    
    public static String setName(String email) {
        
        String name = null;
        
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select name from users where email = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                name = rs.getString("name");
                return name;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        
        
        return "ana";

    }
    

}
