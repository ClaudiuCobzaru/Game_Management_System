/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.EventDrawer;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author claud
 */
public class HomePage extends javax.swing.JFrame {

    private DrawerController drawer;

    public HomePage() {

        initComponents();
        showPieChart();
        drawer = Drawer.newDrawer(this)
                .drawerWidth(340)
                .background(new Color(51, 51, 51))
                .backgroundTransparent(0.8f)
                .header(new Header())
                .separator(5, new Color(102, 102, 255))
                .space(5)
                .addChild(new DrawerItem("  Home Page").icon(new ImageIcon(getClass().getResource("/adminicons/icons8_Home_26px_2.png"))).build())
                .space(5)
                .separator(2, new Color(102, 102, 255))
                .addChild(new DrawerItem("  GMS Dashboard").icon(new ImageIcon(getClass().getResource("/adminicons/icons8_Building_26px_1.png"))).build())
                .space(5)
                .separator(2, new Color(102, 102, 255))
                .addChild(new DrawerItem("  Manage Games").build())
                .space(5)
                .separator(2, new Color(102, 102, 255))
                .addChild(new DrawerItem("  Manage Customers").icon(new ImageIcon(getClass().getResource("/adminicons/icons8_Read_Online_26px.png"))).build())
                .space(5)
                .separator(2, new Color(102, 102, 255))
                .addChild(new DrawerItem("  Issue Games").icon(new ImageIcon(getClass().getResource("/adminicons/icons8_Sell_26px.png"))).build())
                .space(5)
                .separator(2, new Color(102, 102, 255))
                .addChild(new DrawerItem("  Return Games").icon(new ImageIcon(getClass().getResource("/adminicons/icons8_Return_Purchase_26px.png"))).build())
                .space(5)
                .separator(2, new Color(102, 102, 255))
                .addChild(new DrawerItem("  View Records").icon(new ImageIcon(getClass().getResource("/adminicons/icons8_View_Details_26px.png"))).build())
                .space(5)
                .separator(2, new Color(102, 102, 255))
                .addChild(new DrawerItem("  View Issued Games").build())
                .space(5)
                .separator(2, new Color(102, 102, 255))
                .addChild(new DrawerItem("  Defaulter List").icon(new ImageIcon(getClass().getResource("/adminicons/icons8_Conference_26px.png"))).build())
                .separator(2, new Color(102, 102, 255))
                .space(20)
                .addChild(new DrawerItem("  Logout").icon(new ImageIcon(getClass().getResource("/adminicons/icons8_Exit_26px_23.png"))).build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem di) {
                        if (i == 0) {
                            HomePage_panel.setVisible(true);
                            pageTitle_label.setText("Home Page");
                            ManageGames_panel.setVisible(false);
                            ManageCustomers_panel.setVisible(false);
                            IssueGame_panel.setVisible(false);
                            ReturnGame_panel.setVisible(false);
                            ViewRecord_panel.setVisible(false);

                        } else if (i == 1) {
                            HomePage_panel.setVisible(false);
                            pageTitle_label.setText("GMS Dashboard");
                            ManageGames_panel.setVisible(false);
                            ManageCustomers_panel.setVisible(false);
                            IssueGame_panel.setVisible(false);
                            ReturnGame_panel.setVisible(false);
                            ViewRecord_panel.setVisible(false);

                        } else if (i == 2) {
                            pageTitle_label.setText("Manage Games");
                            ManageGames_panel.setVisible(true);
                            HomePage_panel.setVisible(false);
                            ManageCustomers_panel.setVisible(false);
                            IssueGame_panel.setVisible(false);
                            ReturnGame_panel.setVisible(false);
                            ViewRecord_panel.setVisible(false);

                        } else if (i == 3) {
                            pageTitle_label.setText("Manage Customers");
                            ManageGames_panel.setVisible(false);
                            HomePage_panel.setVisible(false);
                            ManageCustomers_panel.setVisible(true);
                            IssueGame_panel.setVisible(false);
                            ReturnGame_panel.setVisible(false);
                            ViewRecord_panel.setVisible(false);

                        } else if (i == 4) {
                            pageTitle_label.setText("Issue Games");
                            ManageGames_panel.setVisible(false);
                            HomePage_panel.setVisible(false);
                            ManageCustomers_panel.setVisible(false);
                            IssueGame_panel.setVisible(true);
                            ReturnGame_panel.setVisible(false);
                            ViewRecord_panel.setVisible(false);

                        } else if (i == 5) {
                            pageTitle_label.setText("Return Games");
                            ManageGames_panel.setVisible(false);
                            HomePage_panel.setVisible(false);
                            ManageCustomers_panel.setVisible(false);
                            IssueGame_panel.setVisible(false);
                            ReturnGame_panel.setVisible(true);
                            ViewRecord_panel.setVisible(false);

                        } else if (i == 6) {
                            pageTitle_label.setText("View Records");
                            ManageGames_panel.setVisible(false);
                            HomePage_panel.setVisible(false);
                            ManageCustomers_panel.setVisible(false);
                            IssueGame_panel.setVisible(false);
                            ReturnGame_panel.setVisible(false);
                            ViewRecord_panel.setVisible(true);

                        } else if (i == 7) {
                            pageTitle_label.setText("View Issued Games");
                            ManageGames_panel.setVisible(false);
                            HomePage_panel.setVisible(false);
                            ManageCustomers_panel.setVisible(false);
                            IssueGame_panel.setVisible(false);
                            ReturnGame_panel.setVisible(false);
                            ViewRecord_panel.setVisible(false);

                        } else if (i == 8) {
                            pageTitle_label.setText("Defaulter List");
                            ManageGames_panel.setVisible(false);
                            HomePage_panel.setVisible(false);
                            ManageCustomers_panel.setVisible(false);
                            IssueGame_panel.setVisible(false);
                            ReturnGame_panel.setVisible(false);
                            ViewRecord_panel.setVisible(false);

                        } else if (i == 9) /*logout*/ {

                        }
                    }
                })
                .build();

        setGameDetailsToTable();
        setCustomerDetailsToTable();
        setIssueGameDetailsToTable();
   
    }

    public void showPieChart() {

        //create dataset 
        DefaultPieDataset barDataset = new DefaultPieDataset();

        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("mobile sales", barDataset, false, true, false);//explain

        PiePlot piePlot = (PiePlot) piechart.getPlot();

        //changing pie chart blocks colors
        piePlot.setSectionPaint("IPhone 5s", new Color(255, 255, 102));
        piePlot.setSectionPaint("SamSung Grand", new Color(102, 255, 102));
        piePlot.setSectionPaint("MotoG", new Color(255, 102, 153));
        piePlot.setSectionPaint("Nokia Lumia", new Color(0, 204, 204));

        piePlot.setBackgroundPaint(Color.white);

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelPieChart.removeAll();
        panelPieChart.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart.validate();
    }

    //adaugam datele din baza de date in tabel games_details
    public void setGameDetailsToTable() {
        DefaultTableModel model;
        DefaultTableModel model2;

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from games_details");

            while (rs.next()) {
                String gameId = rs.getString("game_id");
                String gameName = rs.getString("game_name");
                String gameType = rs.getString("type");
                int gameQuantity = rs.getInt("quantity");

                Object[] obj = {gameId, gameName, gameType, gameQuantity};
                model = (DefaultTableModel) tbl_gamesDetails.getModel();
                model2 = (DefaultTableModel) tbl_gamesDetailsHome.getModel();
                model.addRow(obj);
                model2.addRow(obj);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //adaugam datele din baza de date in tabel customer_details
    public void setCustomerDetailsToTable() {

        DefaultTableModel model;
        DefaultTableModel model2;

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customers_details");

            while (rs.next()) {
                String customerId = rs.getString("customer_id");
                String customerName = rs.getString("customer_name");
                String customerEmail = rs.getString("customer_email");
                String customerContact = rs.getString("customer_contact");

                Object[] obj = {customerId, customerName, customerEmail, customerContact};
                model = (DefaultTableModel) tbl_customersDetails.getModel();
                model2 = (DefaultTableModel) tbl_customersDetailsHome.getModel();
                model.addRow(obj);
                model2.addRow(obj);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //adaugam datele din baza de date in tabel issue_game_details
    public void setIssueGameDetailsToTable() {

        DefaultTableModel model;

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from issue_game_details");

            while (rs.next()) {
                String issueId = rs.getString("id");
                String gameName = rs.getString("game_name");
                String customerName = rs.getString("customer_name");
                String issueDate = rs.getString("issue_date");
                String dueDate = rs.getString("due_date");
                String status = rs.getString("status");

                Object[] obj = {issueId, gameName, customerName, issueDate, dueDate, status};
                model = (DefaultTableModel) tbl_recordIssueDetails.getModel();

                model.addRow(obj);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //golire tabel games_details
    public void clearGamesTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_gamesDetails.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tbl_gamesDetailsHome.getModel();
        model.setRowCount(0);
        model2.setRowCount(0);
    }
    //golire tabel customers_details

    public void clearCustomersTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_customersDetails.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tbl_customersDetailsHome.getModel();
        model.setRowCount(0);
        model2.setRowCount(0);
    }

    //golire tabel issue_game_details
    public void clearIssueGameDetailsTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_recordIssueDetails.getModel();
        model.setRowCount(0);

    }

    //pentru a lua datele despre game din baza de date 
    public void getGameDetails() {

        int gameId = Integer.parseInt(txt_issueGameId.getText());

        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from games_details where game_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, gameId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                issueGameId_label.setText(rs.getString("game_id"));
                issueGameName_label.setText(rs.getString("game_name"));
                issueGameType_label.setText(rs.getString("type"));
                issueGameQuantity_label.setText(rs.getString("quantity"));
            } else {
                JOptionPane.showMessageDialog(this, "Game Id does not exist!");
                txt_issueGameId.setText("");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //pentru a lua datele despre game din baza de date 
    public void getCustomerDetails() {

        int customerId = Integer.parseInt(txt_issueCustomerId.getText());

        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from customers_details where customer_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, customerId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                issueCustomerId_label.setText(rs.getString("customer_id"));
                issueCustomerName_label.setText(rs.getString("customer_name"));
                issueCustomerEmail_label.setText(rs.getString("customer_email"));
                issueCustomerContact_label.setText(rs.getString("customer_contact"));
            } else {
                JOptionPane.showMessageDialog(this, "Customer Id does not exist!");
                txt_issueCustomerId.setText("");
                issueCustomerId_label.setText("");
                issueCustomerName_label.setText("");
                issueCustomerEmail_label.setText("");
                issueCustomerContact_label.setText("");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void getIssueDetails() {

        int gameId = Integer.parseInt(txt_returnGameId.getText());
        int customerId = Integer.parseInt(txt_returnCustomerId.getText());

        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from issue_game_details where game_id = ? and customer_id = ? and status = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, gameId);
            pst.setInt(2, customerId);
            pst.setString(3, "pending");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lbl_returnIssueId.setText(rs.getString("id"));
                lbl_returnGameName.setText(rs.getString("game_name"));
                lbl_returnCustomerName.setText(rs.getString("customer_name"));
                lbl_returnIssueDate.setText(rs.getString("issue_date"));
                lbl_returnDueDate.setText(rs.getString("due_date"));
            } else {
                JOptionPane.showMessageDialog(this, "No Record Found!");
                lbl_returnIssueId.setText("");
                lbl_returnGameName.setText("");
                lbl_returnCustomerName.setText("");
                lbl_returnIssueDate.setText("");
                lbl_returnDueDate.setText("");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void search() {

        DefaultTableModel model;

        Date uFromDate = dchs_recordIssueDate.getDatoFecha();
        Date uToDate = dchs_recordDueDate.getDatoFecha();

        long l1 = uFromDate.getTime();
        long l2 = uToDate.getTime();

        java.sql.Date fromDate = new java.sql.Date(l1);
        java.sql.Date toDate = new java.sql.Date(l2);

        try {
            Connection con = DBConnection.getConnection();
            String Sql = "select * from issue_game_details where issue_date BETWEEN ? and ?";
            PreparedStatement pst = con.prepareStatement(Sql);
            pst.setDate(1, fromDate);
            pst.setDate(2, toDate);

            ResultSet rs = pst.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "No Record Found!");
            } else {
                while (rs.next()) {

                    String issueId = rs.getString("id");
                    String gameName = rs.getString("game_name");
                    String customerName = rs.getString("customer_name");
                    String issueDate = rs.getString("issue_date");
                    String dueDate = rs.getString("due_date");
                    String status = rs.getString("status");

                    Object[] obj = {issueId, gameName, customerName, issueDate, dueDate, status};
                    model = (DefaultTableModel) tbl_recordIssueDetails.getModel();

                    model.addRow(obj);

                }
            }

        } catch (Exception e) {
        }

    }

    /*
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pageTitle_label = new javax.swing.JLabel();
        menuButton_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitButton_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        HomePage_panel = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customersDetailsHome = new rojeru_san.complementos.RSTableMetro();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_gamesDetailsHome = new rojeru_san.complementos.RSTableMetro();
        panelPieChart = new javax.swing.JPanel();
        IssueGame_panel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        issueCustomerContact_label = new javax.swing.JLabel();
        issueCustomerId_label = new javax.swing.JLabel();
        issueCustomerName_label = new javax.swing.JLabel();
        issueCustomerEmail_label = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txt_issueGameId = new app.bolivia.swing.JCTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txt_issueCustomerId = new app.bolivia.swing.JCTextField();
        jLabel35 = new javax.swing.JLabel();
        dchs_issueDate = new rojeru_san.componentes.RSDateChooser();
        jLabel33 = new javax.swing.JLabel();
        dchs_dueDate = new rojeru_san.componentes.RSDateChooser();
        rSMaterialButtonCircle7 = new rojerusan.RSMaterialButtonCircle();
        jPanel5 = new javax.swing.JPanel();
        issueGameQuantity_label = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        issueGameId_label = new javax.swing.JLabel();
        issueGameName_label = new javax.swing.JLabel();
        issueGameType_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pula = new javax.swing.JLabel();
        ViewRecord_panel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_recordIssueDetails = new rojeru_san.complementos.RSTableMetro();
        jPanel9 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        dchs_recordIssueDate = new rojeru_san.componentes.RSDateChooser();
        dchs_recordDueDate = new rojeru_san.componentes.RSDateChooser();
        rSMaterialButtonCircle10 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle11 = new rojerusan.RSMaterialButtonCircle();
        ManageCustomers_panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_customer_id = new app.bolivia.swing.JCTextField();
        icon_user4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_customer_name = new app.bolivia.swing.JCTextField();
        icon_user5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_customer_email = new app.bolivia.swing.JCTextField();
        icon_user6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_customer_contact = new app.bolivia.swing.JCTextField();
        icon_user7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rSMaterialButtonCircle4 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle5 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle6 = new rojerusan.RSMaterialButtonCircle();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_customersDetails = new rojeru_san.complementos.RSTableMetro();
        ManageGames_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_game_id = new app.bolivia.swing.JCTextField();
        icon_user = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_game_name = new app.bolivia.swing.JCTextField();
        icon_user1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_game_type = new app.bolivia.swing.JCTextField();
        icon_user2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_game_quantity = new app.bolivia.swing.JCTextField();
        icon_user3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle3 = new rojerusan.RSMaterialButtonCircle();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_gamesDetails = new rojeru_san.complementos.RSTableMetro();
        ReturnGame_panel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_returnDueDate = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lbl_returnIssueId = new javax.swing.JLabel();
        lbl_returnGameName = new javax.swing.JLabel();
        lbl_returnCustomerName = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lbl_returnIssueDate = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txt_returnGameId = new app.bolivia.swing.JCTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txt_returnCustomerId = new app.bolivia.swing.JCTextField();
        rSMaterialButtonCircle8 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle9 = new rojerusan.RSMaterialButtonCircle();
        jLabel5 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel4.setText("Bun venit, Admin!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 10, 230, -1));

        pageTitle_label.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        pageTitle_label.setForeground(new java.awt.Color(255, 255, 255));
        pageTitle_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitle_label.setText("Pagina de start");
        jPanel1.add(pageTitle_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 420, 50));

        menuButton_panel.setBackground(new java.awt.Color(51, 51, 51));
        menuButton_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        menuButton_panel.setForeground(new java.awt.Color(51, 51, 51));
        menuButton_panel.setPreferredSize(new java.awt.Dimension(80, 50));
        menuButton_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton_panelMouseExited(evt);
            }
        });
        menuButton_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("|||");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        menuButton_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        jPanel1.add(menuButton_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        exitButton_panel.setBackground(new java.awt.Color(255, 51, 51));
        exitButton_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton_panel.setForeground(new java.awt.Color(255, 51, 51));
        exitButton_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButton_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButton_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButton_panelMouseExited(evt);
            }
        });
        exitButton_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        exitButton_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        jPanel1.add(exitButton_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1850, 10, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 70));

        HomePage_panel.setBackground(new java.awt.Color(255, 255, 255));
        HomePage_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 51)));
        jPanel15.setPreferredSize(new java.awt.Dimension(260, 150));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText(" 10");
        jPanel15.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, -1));

        HomePage_panel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 260, 140));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Customers Details");
        HomePage_panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 180, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("No Of Customers");
        HomePage_panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 180, -1));

        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel16.setPreferredSize(new java.awt.Dimension(260, 150));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_People_50px.png"))); // NOI18N
        jLabel18.setText(" 10");
        jPanel16.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, -1));

        HomePage_panel.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, 140));

        jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 51)));
        jPanel17.setPreferredSize(new java.awt.Dimension(260, 150));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Sell_50px.png"))); // NOI18N
        jLabel20.setText(" 10");
        jPanel17.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, -1));

        HomePage_panel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 80, 260, 140));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Issued Games");
        HomePage_panel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 180, -1));

        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel18.setPreferredSize(new java.awt.Dimension(260, 150));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_List_of_Thumbnails_50px.png"))); // NOI18N
        jLabel22.setText(" 10");
        jPanel18.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, -1));

        HomePage_panel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 80, 260, 140));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Defaulter List");
        HomePage_panel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 40, 180, -1));

        tbl_customersDetailsHome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Name", "Prenume", "Contact"
            }
        ));
        tbl_customersDetailsHome.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_customersDetailsHome.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_customersDetailsHome.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_customersDetailsHome.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tbl_customersDetailsHome.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        tbl_customersDetailsHome.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tbl_customersDetailsHome.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tbl_customersDetailsHome.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        tbl_customersDetailsHome.setRowHeight(40);
        jScrollPane1.setViewportView(tbl_customersDetailsHome);

        HomePage_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 700, 220));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("No Of Games");
        HomePage_panel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Games Details");
        HomePage_panel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 180, -1));

        tbl_gamesDetailsHome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Game Id", "Name", "Type", "Quantity"
            }
        ));
        tbl_gamesDetailsHome.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_gamesDetailsHome.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_gamesDetailsHome.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_gamesDetailsHome.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tbl_gamesDetailsHome.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        tbl_gamesDetailsHome.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tbl_gamesDetailsHome.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tbl_gamesDetailsHome.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        tbl_gamesDetailsHome.setRowHeight(40);
        jScrollPane2.setViewportView(tbl_gamesDetailsHome);

        HomePage_panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, 700, 220));

        panelPieChart.setLayout(new java.awt.BorderLayout());
        HomePage_panel.add(panelPieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 690, 590));

        getContentPane().add(HomePage_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1910, 960));

        IssueGame_panel.setBackground(new java.awt.Color(255, 255, 255));
        IssueGame_panel.setForeground(new java.awt.Color(255, 255, 255));
        IssueGame_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Customer Id:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 140, 50));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Customer Name:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 160, 50));

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Email:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 140, 50));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Contact:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 170, 50));

        issueCustomerContact_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        issueCustomerContact_label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(issueCustomerContact_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 310, 50));

        issueCustomerId_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        issueCustomerId_label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(issueCustomerId_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 310, 50));

        issueCustomerName_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        issueCustomerName_label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(issueCustomerName_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 310, 50));

        issueCustomerEmail_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        issueCustomerEmail_label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(issueCustomerEmail_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 310, 50));

        IssueGame_panel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 520, 800));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_issueGameId.setBackground(new java.awt.Color(255, 255, 255));
        txt_issueGameId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_issueGameId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_issueGameId.setPlaceholder("Enter Game Id...");
        txt_issueGameId.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_issueGameIdComponentAdded(evt);
            }
        });
        txt_issueGameId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_issueGameIdFocusLost(evt);
            }
        });
        txt_issueGameId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_issueGameIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_issueGameIdMouseExited(evt);
            }
        });
        txt_issueGameId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_issueGameIdActionPerformed(evt);
            }
        });
        jPanel6.add(txt_issueGameId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 220, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 51));
        jLabel28.setText("Game Id:");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 50));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setText("Customer Id:");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 120, 50));

        txt_issueCustomerId.setBackground(new java.awt.Color(255, 255, 255));
        txt_issueCustomerId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_issueCustomerId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_issueCustomerId.setPlaceholder("Enter Customer Id...");
        txt_issueCustomerId.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_issueCustomerIdComponentAdded(evt);
            }
        });
        txt_issueCustomerId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_issueCustomerIdFocusLost(evt);
            }
        });
        txt_issueCustomerId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_issueCustomerIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_issueCustomerIdMouseExited(evt);
            }
        });
        txt_issueCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_issueCustomerIdActionPerformed(evt);
            }
        });
        txt_issueCustomerId.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_issueCustomerIdPropertyChange(evt);
            }
        });
        jPanel6.add(txt_issueCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 220, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setText("Issue Date:");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 120, 50));

        dchs_issueDate.setForeground(new java.awt.Color(255, 255, 255));
        dchs_issueDate.setColorBackground(new java.awt.Color(255, 51, 51));
        dchs_issueDate.setColorForeground(new java.awt.Color(255, 51, 51));
        dchs_issueDate.setPlaceholder("Select Issue Date...");
        jPanel6.add(dchs_issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 220, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 51));
        jLabel33.setText("Due Date:");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 120, 50));

        dchs_dueDate.setForeground(new java.awt.Color(255, 255, 255));
        dchs_dueDate.setColorBackground(new java.awt.Color(255, 51, 51));
        dchs_dueDate.setColorForeground(new java.awt.Color(255, 51, 51));
        dchs_dueDate.setPlaceholder("Select Due Date...");
        jPanel6.add(dchs_dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 220, -1));

        rSMaterialButtonCircle7.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle7.setText("Issue game");
        rSMaterialButtonCircle7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle7MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle7ActionPerformed(evt);
            }
        });
        jPanel6.add(rSMaterialButtonCircle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 270, 60));

        IssueGame_panel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 170, 450, 700));

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        issueGameQuantity_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        issueGameQuantity_label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(issueGameQuantity_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 340, 50));

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Game Name:");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 160, 50));

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Type:");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 140, 50));

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Quantity:");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 140, 50));

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Game Id:");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 140, 50));

        issueGameId_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        issueGameId_label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(issueGameId_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 340, 50));

        issueGameName_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        issueGameName_label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(issueGameName_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 340, 50));

        issueGameType_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        issueGameType_label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(issueGameType_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 340, 50));

        IssueGame_panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 520, 800));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background2.png"))); // NOI18N
        IssueGame_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, 960));

        pula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background1.png"))); // NOI18N
        pula.setText("jLabel3");
        IssueGame_panel.add(pula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 960));

        getContentPane().add(IssueGame_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1910, 960));

        ViewRecord_panel.setBackground(new java.awt.Color(255, 255, 255));
        ViewRecord_panel.setForeground(new java.awt.Color(255, 255, 255));
        ViewRecord_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_recordIssueDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue Id", "Game Name", "Customer Name", "Issue Date", "Due Date", "Status"
            }
        ));
        tbl_recordIssueDetails.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_recordIssueDetails.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_recordIssueDetails.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_recordIssueDetails.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tbl_recordIssueDetails.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        tbl_recordIssueDetails.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tbl_recordIssueDetails.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tbl_recordIssueDetails.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        tbl_recordIssueDetails.setRowHeight(40);
        jScrollPane3.setViewportView(tbl_recordIssueDetails);

        ViewRecord_panel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 1010, 810));

        jPanel9.setBackground(new java.awt.Color(102, 102, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Issue Date:");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 50));

        jLabel44.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Due Date:");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 140, 50));

        dchs_recordIssueDate.setForeground(new java.awt.Color(255, 255, 255));
        dchs_recordIssueDate.setColorBackground(new java.awt.Color(255, 51, 51));
        dchs_recordIssueDate.setColorForeground(new java.awt.Color(255, 51, 51));
        dchs_recordIssueDate.setPlaceholder("Select Issue Date...");
        jPanel9.add(dchs_recordIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 220, -1));

        dchs_recordDueDate.setForeground(new java.awt.Color(255, 255, 255));
        dchs_recordDueDate.setColorBackground(new java.awt.Color(255, 51, 51));
        dchs_recordDueDate.setColorForeground(new java.awt.Color(255, 51, 51));
        dchs_recordDueDate.setPlaceholder("Select Due Date...");
        jPanel9.add(dchs_recordDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 220, -1));

        rSMaterialButtonCircle10.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle10.setText("search");
        rSMaterialButtonCircle10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle10MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle10ActionPerformed(evt);
            }
        });
        jPanel9.add(rSMaterialButtonCircle10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 270, 60));

        rSMaterialButtonCircle11.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle11.setText("all");
        rSMaterialButtonCircle11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle11MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle11ActionPerformed(evt);
            }
        });
        jPanel9.add(rSMaterialButtonCircle11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 270, 60));

        ViewRecord_panel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 520, 800));

        getContentPane().add(ViewRecord_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1910, 960));

        ManageCustomers_panel.setBackground(new java.awt.Color(255, 255, 255));
        ManageCustomers_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_customer_id.setBackground(new java.awt.Color(102, 102, 255));
        txt_customer_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_customer_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_customer_id.setPlaceholder("Enter Customer Id...");
        txt_customer_id.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_customer_idComponentAdded(evt);
            }
        });
        txt_customer_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_customer_idMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_customer_idMouseExited(evt);
            }
        });
        txt_customer_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customer_idActionPerformed(evt);
            }
        });
        jPanel3.add(txt_customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 400, -1));

        icon_user4.setBackground(new java.awt.Color(255, 255, 255));
        icon_user4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_user4.setForeground(new java.awt.Color(255, 255, 255));
        icon_user4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Contact_26px.png"))); // NOI18N
        jPanel3.add(icon_user4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 50, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Customer Id:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 140, 50));

        txt_customer_name.setBackground(new java.awt.Color(102, 102, 255));
        txt_customer_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_customer_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_customer_name.setPlaceholder("Enter Customer Name...");
        txt_customer_name.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_customer_nameComponentAdded(evt);
            }
        });
        txt_customer_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_customer_nameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_customer_nameMouseExited(evt);
            }
        });
        txt_customer_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customer_nameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 400, -1));

        icon_user5.setBackground(new java.awt.Color(255, 255, 255));
        icon_user5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_user5.setForeground(new java.awt.Color(255, 255, 255));
        icon_user5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel3.add(icon_user5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 160, 50));

        txt_customer_email.setBackground(new java.awt.Color(102, 102, 255));
        txt_customer_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_customer_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_customer_email.setPlaceholder("Enter Customer Email...");
        txt_customer_email.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_customer_emailComponentAdded(evt);
            }
        });
        txt_customer_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_customer_emailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_customer_emailMouseExited(evt);
            }
        });
        txt_customer_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customer_emailActionPerformed(evt);
            }
        });
        jPanel3.add(txt_customer_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 400, -1));

        icon_user6.setBackground(new java.awt.Color(255, 255, 255));
        icon_user6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_user6.setForeground(new java.awt.Color(255, 255, 255));
        icon_user6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Collaborator_Male_26px.png"))); // NOI18N
        jPanel3.add(icon_user6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 50, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 140, 50));

        txt_customer_contact.setBackground(new java.awt.Color(102, 102, 255));
        txt_customer_contact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_customer_contact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_customer_contact.setPlaceholder("Enter Customer Contact...");
        txt_customer_contact.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_customer_contactComponentAdded(evt);
            }
        });
        txt_customer_contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_customer_contactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_customer_contactMouseExited(evt);
            }
        });
        txt_customer_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customer_contactActionPerformed(evt);
            }
        });
        jPanel3.add(txt_customer_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 400, -1));

        icon_user7.setBackground(new java.awt.Color(255, 255, 255));
        icon_user7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_user7.setForeground(new java.awt.Color(255, 255, 255));
        icon_user7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Unit_26px.png"))); // NOI18N
        jPanel3.add(icon_user7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 50, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Contact:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 140, 50));

        rSMaterialButtonCircle4.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle4.setText("Delete");
        rSMaterialButtonCircle4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle4MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle4ActionPerformed(evt);
            }
        });
        jPanel3.add(rSMaterialButtonCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 170, 60));

        rSMaterialButtonCircle5.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle5.setText("Add");
        rSMaterialButtonCircle5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle5MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle5ActionPerformed(evt);
            }
        });
        jPanel3.add(rSMaterialButtonCircle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 170, 60));

        rSMaterialButtonCircle6.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle6.setText("Update");
        rSMaterialButtonCircle6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle6MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle6ActionPerformed(evt);
            }
        });
        jPanel3.add(rSMaterialButtonCircle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 170, 60));

        ManageCustomers_panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 600, 800));

        tbl_customersDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Name", "Email", "Contact"
            }
        ));
        tbl_customersDetails.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_customersDetails.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_customersDetails.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_customersDetails.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tbl_customersDetails.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        tbl_customersDetails.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tbl_customersDetails.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tbl_customersDetails.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        tbl_customersDetails.setRowHeight(40);
        tbl_customersDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customersDetailsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_customersDetails);

        ManageCustomers_panel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, 730, 790));

        getContentPane().add(ManageCustomers_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1910, 960));

        ManageGames_panel.setBackground(new java.awt.Color(255, 255, 255));
        ManageGames_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_game_id.setBackground(new java.awt.Color(102, 102, 255));
        txt_game_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_game_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_game_id.setPlaceholder("Enter Game Id...");
        txt_game_id.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_game_idComponentAdded(evt);
            }
        });
        txt_game_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_game_idMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_game_idMouseExited(evt);
            }
        });
        txt_game_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_game_idActionPerformed(evt);
            }
        });
        jPanel2.add(txt_game_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 400, -1));

        icon_user.setBackground(new java.awt.Color(255, 255, 255));
        icon_user.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_user.setForeground(new java.awt.Color(255, 255, 255));
        icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Contact_26px.png"))); // NOI18N
        jPanel2.add(icon_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 50, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Game Id:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 140, 50));

        txt_game_name.setBackground(new java.awt.Color(102, 102, 255));
        txt_game_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_game_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_game_name.setPlaceholder("Enter Game Name...");
        txt_game_name.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_game_nameComponentAdded(evt);
            }
        });
        txt_game_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_game_nameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_game_nameMouseExited(evt);
            }
        });
        txt_game_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_game_nameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_game_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 400, -1));

        icon_user1.setBackground(new java.awt.Color(255, 255, 255));
        icon_user1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_user1.setForeground(new java.awt.Color(255, 255, 255));
        icon_user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(icon_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Game Name:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 160, 50));

        txt_game_type.setBackground(new java.awt.Color(102, 102, 255));
        txt_game_type.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_game_type.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_game_type.setPlaceholder("Enter the Type...");
        txt_game_type.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_game_typeComponentAdded(evt);
            }
        });
        txt_game_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_game_typeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_game_typeMouseExited(evt);
            }
        });
        txt_game_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_game_typeActionPerformed(evt);
            }
        });
        jPanel2.add(txt_game_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 400, -1));

        icon_user2.setBackground(new java.awt.Color(255, 255, 255));
        icon_user2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_user2.setForeground(new java.awt.Color(255, 255, 255));
        icon_user2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Collaborator_Male_26px.png"))); // NOI18N
        jPanel2.add(icon_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 50, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 140, 50));

        txt_game_quantity.setBackground(new java.awt.Color(102, 102, 255));
        txt_game_quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_game_quantity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_game_quantity.setPlaceholder("Enter the Quantity...");
        txt_game_quantity.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_game_quantityComponentAdded(evt);
            }
        });
        txt_game_quantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_game_quantityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_game_quantityMouseExited(evt);
            }
        });
        txt_game_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_game_quantityActionPerformed(evt);
            }
        });
        jPanel2.add(txt_game_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 400, -1));

        icon_user3.setBackground(new java.awt.Color(255, 255, 255));
        icon_user3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_user3.setForeground(new java.awt.Color(255, 255, 255));
        icon_user3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Unit_26px.png"))); // NOI18N
        jPanel2.add(icon_user3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 50, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 140, 50));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle1.setText("Delete");
        rSMaterialButtonCircle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle1MouseClicked(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 170, 60));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle2.setText("Add");
        rSMaterialButtonCircle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle2MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 170, 60));

        rSMaterialButtonCircle3.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle3.setText("Update");
        rSMaterialButtonCircle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle3MouseClicked(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 170, 60));

        ManageGames_panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 600, 800));

        tbl_gamesDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Game Id", "Name", "Type", "Quantity"
            }
        ));
        tbl_gamesDetails.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_gamesDetails.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_gamesDetails.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_gamesDetails.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tbl_gamesDetails.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        tbl_gamesDetails.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tbl_gamesDetails.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tbl_gamesDetails.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        tbl_gamesDetails.setRowHeight(40);
        tbl_gamesDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_gamesDetailsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_gamesDetails);

        ManageGames_panel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, 730, 790));

        getContentPane().add(ManageGames_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1910, 960));

        ReturnGame_panel.setBackground(new java.awt.Color(255, 255, 255));
        ReturnGame_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_returnDueDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        lbl_returnDueDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(lbl_returnDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 320, 50));

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Game Name:");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 160, 50));

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Customer name:");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 150, 50));

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Due Date:");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 140, 50));

        jLabel39.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Issue Id:");
        jPanel7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 140, 50));

        lbl_returnIssueId.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        lbl_returnIssueId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(lbl_returnIssueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 320, 50));

        lbl_returnGameName.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        lbl_returnGameName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(lbl_returnGameName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 320, 50));

        lbl_returnCustomerName.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        lbl_returnCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(lbl_returnCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 320, 50));

        jLabel40.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Issue Date:");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 140, 50));

        lbl_returnIssueDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        lbl_returnIssueDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(lbl_returnIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 320, 50));

        ReturnGame_panel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 520, 800));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_returnGameId.setBackground(new java.awt.Color(255, 255, 255));
        txt_returnGameId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_returnGameId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_returnGameId.setPlaceholder("Enter Game Id...");
        txt_returnGameId.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_returnGameIdComponentAdded(evt);
            }
        });
        txt_returnGameId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_returnGameIdFocusLost(evt);
            }
        });
        txt_returnGameId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_returnGameIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_returnGameIdMouseExited(evt);
            }
        });
        txt_returnGameId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_returnGameIdActionPerformed(evt);
            }
        });
        jPanel8.add(txt_returnGameId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 51, 51));
        jLabel41.setText("Game Id:");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 50));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 51, 51));
        jLabel42.setText("Customer Id:");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 50));

        txt_returnCustomerId.setBackground(new java.awt.Color(255, 255, 255));
        txt_returnCustomerId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_returnCustomerId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_returnCustomerId.setPlaceholder("Enter Customer Id...");
        txt_returnCustomerId.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_returnCustomerIdComponentAdded(evt);
            }
        });
        txt_returnCustomerId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_returnCustomerIdFocusLost(evt);
            }
        });
        txt_returnCustomerId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_returnCustomerIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_returnCustomerIdMouseExited(evt);
            }
        });
        txt_returnCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_returnCustomerIdActionPerformed(evt);
            }
        });
        txt_returnCustomerId.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_returnCustomerIdPropertyChange(evt);
            }
        });
        jPanel8.add(txt_returnCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 220, -1));

        rSMaterialButtonCircle8.setBackground(new java.awt.Color(102, 102, 255));
        rSMaterialButtonCircle8.setText("Find details");
        rSMaterialButtonCircle8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle8MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle8ActionPerformed(evt);
            }
        });
        jPanel8.add(rSMaterialButtonCircle8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 270, 60));

        rSMaterialButtonCircle9.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle9.setText("Return game");
        rSMaterialButtonCircle9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle9MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle9ActionPerformed(evt);
            }
        });
        jPanel8.add(rSMaterialButtonCircle9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 270, 60));

        ReturnGame_panel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 180, 430, 400));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/return.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        ReturnGame_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 960));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/boxes.png"))); // NOI18N
        ReturnGame_panel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 1010, 940));

        getContentPane().add(ReturnGame_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1910, 960));

        setSize(new java.awt.Dimension(1905, 1023));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void menuButton_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton_panelMouseClicked
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_menuButton_panelMouseClicked

    private void menuButton_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton_panelMouseEntered
        menuButton_panel.setBackground(new Color(80, 80, 80));
    }//GEN-LAST:event_menuButton_panelMouseEntered

    private void menuButton_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton_panelMouseExited
        menuButton_panel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_menuButton_panelMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        menuButton_panel.setBackground(new Color(80, 80, 80));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        menuButton_panel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLabel1MouseExited

    private void exitButton_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton_panelMouseEntered
        exitButton_panel.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_exitButton_panelMouseEntered

    private void exitButton_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton_panelMouseExited
        exitButton_panel.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_exitButton_panelMouseExited

    private void exitButton_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton_panelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButton_panelMouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        exitButton_panel.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        exitButton_panel.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_jLabel2MouseExited

    private void txt_game_idComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_game_idComponentAdded

    }//GEN-LAST:event_txt_game_idComponentAdded

    private void txt_game_idMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_game_idMouseEntered
        txt_game_id.setBorder(new MatteBorder(0, 0, 2, 0, Color.red));
    }//GEN-LAST:event_txt_game_idMouseEntered

    private void txt_game_idMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_game_idMouseExited
        txt_game_id.setBorder(new MatteBorder(0, 0, 2, 0, Color.white));
    }//GEN-LAST:event_txt_game_idMouseExited

    private void txt_game_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_game_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_idActionPerformed

    private void txt_game_nameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_game_nameComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_nameComponentAdded

    private void txt_game_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_game_nameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_nameMouseEntered

    private void txt_game_nameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_game_nameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_nameMouseExited

    private void txt_game_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_game_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_nameActionPerformed

    private void txt_game_typeComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_game_typeComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_typeComponentAdded

    private void txt_game_typeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_game_typeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_typeMouseEntered

    private void txt_game_typeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_game_typeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_typeMouseExited

    private void txt_game_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_game_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_typeActionPerformed

    private void txt_game_quantityComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_game_quantityComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_quantityComponentAdded

    private void txt_game_quantityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_game_quantityMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_quantityMouseEntered

    private void txt_game_quantityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_game_quantityMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_quantityMouseExited

    private void txt_game_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_game_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_game_quantityActionPerformed

    private void tbl_gamesDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_gamesDetailsMouseClicked

        int rowNo = tbl_gamesDetails.getSelectedRow();
        TableModel model = tbl_gamesDetails.getModel();

        txt_game_id.setText(model.getValueAt(rowNo, 0).toString());
        txt_game_name.setText(model.getValueAt(rowNo, 1).toString());
        txt_game_type.setText(model.getValueAt(rowNo, 2).toString());
        txt_game_quantity.setText(model.getValueAt(rowNo, 3).toString());


    }//GEN-LAST:event_tbl_gamesDetailsMouseClicked

    private void rSMaterialButtonCircle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2MouseClicked
        int game_id = Integer.parseInt(txt_game_id.getText());
        String game_name = txt_game_name.getText();
        String type = txt_game_type.getText();
        int quantity = Integer.parseInt(txt_game_quantity.getText());

        if (ManageGames.addGame(game_id, game_name, type, quantity)) {
            JOptionPane.showMessageDialog(this, "Game Added!");
            clearGamesTable();
            setGameDetailsToTable();
        } else {
            JOptionPane.showMessageDialog(this, "Game couldn't be added!");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle2MouseClicked

    private void rSMaterialButtonCircle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3MouseClicked
        int game_id = Integer.parseInt(txt_game_id.getText());
        String game_name = txt_game_name.getText();
        String type = txt_game_type.getText();
        int quantity = Integer.parseInt(txt_game_quantity.getText());

        if (ManageGames.updateGames(game_id, game_name, type, quantity)) {
            JOptionPane.showMessageDialog(this, "Game Updated!");
            clearGamesTable();
            setGameDetailsToTable();
        } else {
            JOptionPane.showMessageDialog(this, "Game couldn't be updated!");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle3MouseClicked

    private void rSMaterialButtonCircle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1MouseClicked
        int game_id = Integer.parseInt(txt_game_id.getText());

        if (ManageGames.deleteGames(game_id)) {
            JOptionPane.showMessageDialog(this, "Game Deleted!");
            clearGamesTable();
            setGameDetailsToTable();
        } else {
            JOptionPane.showMessageDialog(this, "Game couldn't be deleted!");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle1MouseClicked

    private void txt_customer_idComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_customer_idComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_idComponentAdded

    private void txt_customer_idMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_customer_idMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_idMouseEntered

    private void txt_customer_idMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_customer_idMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_idMouseExited

    private void txt_customer_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customer_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_idActionPerformed

    private void txt_customer_nameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_customer_nameComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_nameComponentAdded

    private void txt_customer_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_customer_nameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_nameMouseEntered

    private void txt_customer_nameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_customer_nameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_nameMouseExited

    private void txt_customer_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customer_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_nameActionPerformed

    private void txt_customer_emailComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_customer_emailComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_emailComponentAdded

    private void txt_customer_emailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_customer_emailMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_emailMouseEntered

    private void txt_customer_emailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_customer_emailMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_emailMouseExited

    private void txt_customer_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customer_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_emailActionPerformed

    private void txt_customer_contactComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_customer_contactComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_contactComponentAdded

    private void txt_customer_contactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_customer_contactMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_contactMouseEntered

    private void txt_customer_contactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_customer_contactMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_contactMouseExited

    private void txt_customer_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customer_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_contactActionPerformed

    private void rSMaterialButtonCircle4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle4MouseClicked

    private void rSMaterialButtonCircle5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle5MouseClicked

        /*
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         */

    }//GEN-LAST:event_rSMaterialButtonCircle5MouseClicked

    private void rSMaterialButtonCircle6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle6MouseClicked

    private void tbl_customersDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customersDetailsMouseClicked

        int rowNo = tbl_customersDetails.getSelectedRow();
        TableModel model = tbl_customersDetails.getModel();

        txt_customer_id.setText(model.getValueAt(rowNo, 0).toString());
        txt_customer_name.setText(model.getValueAt(rowNo, 1).toString());
        txt_customer_email.setText(model.getValueAt(rowNo, 2).toString());
        txt_customer_contact.setText(model.getValueAt(rowNo, 3).toString());

    }//GEN-LAST:event_tbl_customersDetailsMouseClicked

    private void rSMaterialButtonCircle5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle5ActionPerformed
        String id = txt_customer_id.getText();
        int iD = Integer.parseInt(txt_customer_id.getText());
        String name = txt_customer_name.getText();
        String email = txt_customer_email.getText();
        String contact = txt_customer_contact.getText();

        if (ManageCustomers.validateCustomer(id, name, email, contact)) {
            if (ManageCustomers.addCustomers(iD, name, email, contact)) {
                JOptionPane.showMessageDialog(this, "Customer added successfully!");
                clearCustomersTable();
                setCustomerDetailsToTable();
            } else {
                JOptionPane.showMessageDialog(this, "Customer could not be added!");
            }
        }
    }//GEN-LAST:event_rSMaterialButtonCircle5ActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void rSMaterialButtonCircle6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle6ActionPerformed
        String id = txt_customer_id.getText();
        int iD = Integer.parseInt(txt_customer_id.getText());
        String name = txt_customer_name.getText();
        String email = txt_customer_email.getText();
        String contact = txt_customer_contact.getText();

        if (ManageCustomers.updateCustomers(iD, name, email, contact)) {
            JOptionPane.showMessageDialog(this, "Customer updated successfully!");
            clearCustomersTable();
            setCustomerDetailsToTable();
        } else {
            JOptionPane.showMessageDialog(this, "Customer could not be updtated!");
        }

    }//GEN-LAST:event_rSMaterialButtonCircle6ActionPerformed

    private void rSMaterialButtonCircle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle4ActionPerformed

        int id = Integer.parseInt(txt_customer_id.getText());

        if (ManageCustomers.deleteCustomers(id)) {
            JOptionPane.showMessageDialog(this, "Customer deleted successfully!");
            clearCustomersTable();
            setCustomerDetailsToTable();
        } else {
            JOptionPane.showMessageDialog(this, "Customer could not be deleted!");
        }

    }//GEN-LAST:event_rSMaterialButtonCircle4ActionPerformed

    private void txt_issueGameIdComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_issueGameIdComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_issueGameIdComponentAdded

    private void txt_issueGameIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_issueGameIdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_issueGameIdMouseEntered

    private void txt_issueGameIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_issueGameIdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_issueGameIdMouseExited

    private void txt_issueGameIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_issueGameIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_issueGameIdActionPerformed

    private void txt_issueCustomerIdComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_issueCustomerIdComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_issueCustomerIdComponentAdded

    private void txt_issueCustomerIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_issueCustomerIdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_issueCustomerIdMouseEntered

    private void txt_issueCustomerIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_issueCustomerIdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_issueCustomerIdMouseExited

    private void txt_issueCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_issueCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_issueCustomerIdActionPerformed

    private void rSMaterialButtonCircle7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle7MouseClicked

    private void rSMaterialButtonCircle7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle7ActionPerformed
        int gameId = Integer.parseInt(txt_issueGameId.getText());
        int customerId = Integer.parseInt(txt_issueCustomerId.getText());
        String gameName = issueGameName_label.getText();
        String customerName = issueCustomerName_label.getText();

        Date uIssueDate = dchs_issueDate.getDatoFecha();
        Date uDueDate = dchs_dueDate.getDatoFecha();

        Long l1 = uIssueDate.getTime();
        Long l2 = uDueDate.getTime();

        if (issueGameQuantity_label.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Game out of stock!");
        } else {
            if (ManageGames.isAlredyIssued(gameId, customerId) == false) {
                if (ManageGames.issueGame(gameId, customerId, gameName, customerName, l1, l2)) {
                    JOptionPane.showMessageDialog(this, "Game issued successfully!");
                    if (ManageGames.updateDecrementGameCount(gameId)) {
                        int initialCount = Integer.parseInt(issueGameQuantity_label.getText());
                        issueGameQuantity_label.setText(Integer.toString(initialCount - 1));
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Can't issue the game!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "This customer alredy has this game!");
            }
        }
    }//GEN-LAST:event_rSMaterialButtonCircle7ActionPerformed

    private void txt_issueGameIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_issueGameIdFocusLost
        if (!txt_issueGameId.getText().equals("")) {
            getGameDetails();
        }
    }//GEN-LAST:event_txt_issueGameIdFocusLost

    private void txt_issueCustomerIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_issueCustomerIdFocusLost
        if (!txt_issueCustomerId.getText().equals("")) {
            getCustomerDetails();
        }
    }//GEN-LAST:event_txt_issueCustomerIdFocusLost

    private void txt_issueCustomerIdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_issueCustomerIdPropertyChange

    }//GEN-LAST:event_txt_issueCustomerIdPropertyChange

    private void txt_returnGameIdComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_returnGameIdComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnGameIdComponentAdded

    private void txt_returnGameIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_returnGameIdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnGameIdFocusLost

    private void txt_returnGameIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_returnGameIdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnGameIdMouseEntered

    private void txt_returnGameIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_returnGameIdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnGameIdMouseExited

    private void txt_returnGameIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_returnGameIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnGameIdActionPerformed

    private void txt_returnCustomerIdComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_returnCustomerIdComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnCustomerIdComponentAdded

    private void txt_returnCustomerIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_returnCustomerIdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnCustomerIdFocusLost

    private void txt_returnCustomerIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_returnCustomerIdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnCustomerIdMouseEntered

    private void txt_returnCustomerIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_returnCustomerIdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnCustomerIdMouseExited

    private void txt_returnCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_returnCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnCustomerIdActionPerformed

    private void txt_returnCustomerIdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_returnCustomerIdPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnCustomerIdPropertyChange

    private void rSMaterialButtonCircle8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle8MouseClicked

    private void rSMaterialButtonCircle8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle8ActionPerformed
        if (!txt_returnCustomerId.getText().equals("") && !txt_returnGameId.getText().equals("")) {
            getIssueDetails();
        } else {
            JOptionPane.showMessageDialog(this, "Game Id or Customer Id Empty!");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle8ActionPerformed

    private void rSMaterialButtonCircle9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle9MouseClicked

    private void rSMaterialButtonCircle9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle9ActionPerformed
        int customerId = Integer.parseInt(txt_returnCustomerId.getText());
        int gameId = Integer.parseInt(txt_returnGameId.getText());

        if (ManageGames.returnGame(gameId, customerId)) {
            JOptionPane.showMessageDialog(this, "Game Returned Successfully!");
            ManageGames.updateIncrementGameCount(gameId);
            lbl_returnIssueId.setText("");
            lbl_returnGameName.setText("");
            lbl_returnCustomerName.setText("");
            lbl_returnIssueDate.setText("");
            lbl_returnDueDate.setText("");
            txt_returnCustomerId.setText("");
            txt_returnGameId.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Game Returned Failed!");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle9ActionPerformed

    private void rSMaterialButtonCircle10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle10MouseClicked

    private void rSMaterialButtonCircle10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle10ActionPerformed
        if (dchs_recordIssueDate.getDatoFecha() != null && dchs_recordDueDate.getDatoFecha() != null) {
            clearIssueGameDetailsTable();
            search();
        }

    }//GEN-LAST:event_rSMaterialButtonCircle10ActionPerformed

    private void rSMaterialButtonCircle11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle11MouseClicked

    private void rSMaterialButtonCircle11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle11ActionPerformed
        clearIssueGameDetailsTable();
        setIssueGameDetailsToTable();
    }//GEN-LAST:event_rSMaterialButtonCircle11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePage_panel;
    private javax.swing.JPanel IssueGame_panel;
    private javax.swing.JPanel ManageCustomers_panel;
    private javax.swing.JPanel ManageGames_panel;
    private javax.swing.JPanel ReturnGame_panel;
    private javax.swing.JPanel ViewRecord_panel;
    private rojeru_san.componentes.RSDateChooser dchs_dueDate;
    private rojeru_san.componentes.RSDateChooser dchs_issueDate;
    private rojeru_san.componentes.RSDateChooser dchs_recordDueDate;
    private rojeru_san.componentes.RSDateChooser dchs_recordIssueDate;
    private javax.swing.JPanel exitButton_panel;
    private javax.swing.JLabel icon_user;
    private javax.swing.JLabel icon_user1;
    private javax.swing.JLabel icon_user2;
    private javax.swing.JLabel icon_user3;
    private javax.swing.JLabel icon_user4;
    private javax.swing.JLabel icon_user5;
    private javax.swing.JLabel icon_user6;
    private javax.swing.JLabel icon_user7;
    private javax.swing.JLabel issueCustomerContact_label;
    private javax.swing.JLabel issueCustomerEmail_label;
    private javax.swing.JLabel issueCustomerId_label;
    private javax.swing.JLabel issueCustomerName_label;
    private javax.swing.JLabel issueGameId_label;
    private javax.swing.JLabel issueGameName_label;
    private javax.swing.JLabel issueGameQuantity_label;
    private javax.swing.JLabel issueGameType_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_returnCustomerName;
    private javax.swing.JLabel lbl_returnDueDate;
    private javax.swing.JLabel lbl_returnGameName;
    private javax.swing.JLabel lbl_returnIssueDate;
    private javax.swing.JLabel lbl_returnIssueId;
    private javax.swing.JPanel menuButton_panel;
    private javax.swing.JLabel pageTitle_label;
    private javax.swing.JPanel panelPieChart;
    private javax.swing.JLabel pula;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle10;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle11;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle4;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle5;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle6;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle7;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle8;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle9;
    private rojeru_san.complementos.RSTableMetro tbl_customersDetails;
    private rojeru_san.complementos.RSTableMetro tbl_customersDetailsHome;
    private rojeru_san.complementos.RSTableMetro tbl_gamesDetails;
    private rojeru_san.complementos.RSTableMetro tbl_gamesDetailsHome;
    private rojeru_san.complementos.RSTableMetro tbl_recordIssueDetails;
    private app.bolivia.swing.JCTextField txt_customer_contact;
    private app.bolivia.swing.JCTextField txt_customer_email;
    private app.bolivia.swing.JCTextField txt_customer_id;
    private app.bolivia.swing.JCTextField txt_customer_name;
    private app.bolivia.swing.JCTextField txt_game_id;
    private app.bolivia.swing.JCTextField txt_game_name;
    private app.bolivia.swing.JCTextField txt_game_quantity;
    private app.bolivia.swing.JCTextField txt_game_type;
    private app.bolivia.swing.JCTextField txt_issueCustomerId;
    private app.bolivia.swing.JCTextField txt_issueGameId;
    private app.bolivia.swing.JCTextField txt_returnCustomerId;
    private app.bolivia.swing.JCTextField txt_returnGameId;
    // End of variables declaration//GEN-END:variables
}
