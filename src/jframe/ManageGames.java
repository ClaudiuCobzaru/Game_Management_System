/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import jframe.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author claud
 */
interface ManageGames {

    //metoda pentru adaugarea datelor in tabelul games_details
    public static boolean addGame(int gameId, String gameName, String type, int quantity) {

        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into games_details values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, gameId);
            pst.setString(2, gameName);
            pst.setString(3, type);
            pst.setInt(4, quantity);

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

    //metoda pentru updatarea valorilor din tableul games_details
    public static boolean updateGames(int gameId, String gameName, String type, int quantity) {

        try {
            Connection con = DBConnection.getConnection();
            String sql = "update games_details set game_name = ?, type = ?, quantity = ? where game_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, gameName);
            pst.setString(2, type);
            pst.setInt(3, quantity);
            pst.setInt(4, gameId);

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
    public static boolean deleteGames(int gameId) {

        try {
            Connection con = DBConnection.getConnection();
            String sql = "delete from games_details where game_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, gameId);

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

    public static boolean issueGame(int gameId, int customerId, String gameName, String customerName, Long l1, Long l2) {

        java.sql.Date sIssueDate = new java.sql.Date(l1);
        java.sql.Date sDueDate = new java.sql.Date(l2);

        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into issue_game_details(game_id, game_name, customer_id, customer_name, "
                    + "issue_date, due_date, status) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, gameId);
            pst.setString(2, gameName);
            pst.setInt(3, customerId);
            pst.setString(4, customerName);
            pst.setDate(5, sIssueDate);
            pst.setDate(6, sDueDate);
            pst.setString(7, "pending");

            int rowCount = pst.executeUpdate();

            return rowCount > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;

    }

    //actualizarea game count
    public static boolean updateDecrementGameCount(int gameId) {

        HomePage homepage = new HomePage();

        try {
            Connection con = DBConnection.getConnection();
            String sql = "update games_details set quantity = quantity - 1 where game_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, gameId);

            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                JOptionPane.showMessageDialog(homepage, "Game count updated!");
                return true;
            } else {
                JOptionPane.showMessageDialog(homepage, "Game count couldn't be updated!");
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    //actualizarea game count
    public static void updateIncrementGameCount(int gameId) {

        HomePage homepage = new HomePage();

        try {
            Connection con = DBConnection.getConnection();
            String sql = "update games_details set quantity = quantity + 1 where game_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, gameId);

            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                JOptionPane.showMessageDialog(homepage, "Game count updated!");
            } else {
                JOptionPane.showMessageDialog(homepage, "Game count couldn't be updated!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //verificam daca un joc a fost deja inchiriat de un client
    public static boolean isAlredyIssued(int gameId, int customerId) {

        try {
            Connection con = DBConnection.getConnection();
            String Sql = "select * from issue_game_details where game_id = ? and customer_id = ? and status = ?";
            PreparedStatement pst = con.prepareStatement(Sql);

            pst.setInt(1, gameId);
            pst.setInt(2, customerId);
            pst.setString(3, "pending");

            ResultSet rs = pst.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //return game
    public static boolean returnGame(int gameId, int customerId) {

        try {
            Connection con = DBConnection.getConnection();
            String Sql = "update issue_game_details set status = ? where customer_id = ? and game_id = ? and status = ?";
            PreparedStatement pst = con.prepareStatement(Sql);
            pst.setString(1, "returned");
            pst.setInt(2, customerId);
            pst.setInt(3, gameId);
            pst.setString(4, "pending");

            int rowCount = pst.executeUpdate();

            return rowCount > 0;

        } catch (Exception e) {
        }

        return false;
    }
    
    public static void metoda(){
        
    }
    
    

}
