/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorysystem;

/**
 *
 * @author Group 5
 * 
 * IM/2019/003- Kenneth Hasintha
   IM/2019/005- Thisara Dilshan
   IM/2019/016- Zamith Ahamed
   IM/2019/036- Muditha Samarasinghe
   IM/2019/045- Dinuki Fernando
   IM/2019/064- Navodya Pasindu
   IM/2019/073- Nimesh Heshan
   IM/2019/082- Sathsarani Silva
   IM/2019/090- Nimesha Aththanayaka
   IM/2019/094- Sajani Gandhira

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public class SYSTEM extends javax.swing.JFrame {

     ImageIcon logo1= new ImageIcon("IM.png");
    /**
     * Creates new form SYSTEM
     */
    
    /*private AirConditioner[] airconditioner;
    private Computer[] computer;
    private Chair[] chair;
    private Table[] table;
    ArrayList<Computer> comlist = new ArrayList<Computer>(5);
    ArrayList<Computer> aclist = new ArrayList<Computer>(5);
    ArrayList<Computer> chairlist = new ArrayList<Computer>(5);
    ArrayList<Computer> tablelist = new ArrayList<Computer>(5); */
    
    HashMap<String, Computer> computer = new HashMap<String, Computer>();
    HashMap<String, AirConditioner> airconditioner = new HashMap<String, AirConditioner>();
    HashMap<String, Chair> chair = new HashMap<String, Chair>();
    HashMap<String, Table> table = new HashMap<String, Table>();
    
    DefaultTableModel tmodel1,tmodel2,tmodel3,tmodel4;
    
    private void clearData(){
        computerId.setText("PC");
        computerName.setText("");
        computerValue.setText("");
        computerBrand.setText("");
        computerVoltage.setText("");
        computerProcessor.setText("");
        computerRAM.setText("");
        acId.setText("AC");
        acName.setText("");
        acValue.setText("");
        acBrand.setText("");
        acVoltage.setText("");
        acCapacity.setText("");
        chairId.setText("CR");
        chairName.setText("");
        chairValue.setText("");
        chairMaterial.setText("");
        chairType.setText("");
        tableId.setText("TB");
        tableName.setText("");
        tableValue.setText("");
        tableMaterial.setText("");
        tableDrawer.setText("");
    }
    
    private void fillTables(){
        tmodel1.setRowCount(0);
        tmodel2.setRowCount(0);
        tmodel3.setRowCount(0);
        tmodel4.setRowCount(0);
        
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="select * from computer;";
            PreparedStatement  st = con.prepareStatement(sql);
            ResultSet r=st.executeQuery(sql);
            
                      
            while(r.next()){
                String id=r.getString("ItemID");
                String name=r.getString("Name");
                String price=r.getString("Price");
                String brand=r.getString("brand");
                String voltage=r.getString("voltage");
                String processor=r.getString("processor");
                String ram=r.getString("Ram");
                
                String[] tdata= {id,name,price,brand,voltage,processor, ram};
                
                
                tmodel1.addRow(tdata);
            }
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="select * from airconditioner;";
            PreparedStatement  st = con.prepareStatement(sql);
            ResultSet r=st.executeQuery(sql);
            
                      
            while(r.next()){
                String id=r.getString("ItemID");
                String name=r.getString("Name");
                String price=r.getString("Price");
                String brand=r.getString("brand");
                String voltage=r.getString("voltage");
                String processor=r.getString("capacity");
                
                String[] tdata= {id,name,price,brand,voltage,processor};
                
                
                tmodel2.addRow(tdata);
            }
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="select * from tabledetails;";
            PreparedStatement  st = con.prepareStatement(sql);
            ResultSet r=st.executeQuery(sql);
            
                      
            while(r.next()){
                String id=r.getString("ItemId");
                String name=r.getString("Name");
                String price=r.getString("Value");
                String Material=r.getString("Material");
                String Drawer=r.getString("Drawer");
                
                String[] tdata= {id,name,price,Material,Drawer};
                
                
                tmodel3.addRow(tdata);
            }
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="select * from chair;";
            PreparedStatement  st = con.prepareStatement(sql);
            ResultSet r=st.executeQuery(sql);
            
                      
            while(r.next()){
                String id=r.getString("ItemId");
                String name=r.getString("Name");
                String price=r.getString("Value");
                String Material=r.getString("Material");
                String Type=r.getString("Type");
                
                String[] tdata= {id,name,price,Material,Type};
                
                
                tmodel4.addRow(tdata);
            }
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public SYSTEM() {
        initComponents();
        computerId.setText("PC");
        acId.setText("AC");
        chairId.setText("CR");
        tableId.setText("TB");
        tmodel1 = (DefaultTableModel)computerTable.getModel();
        tmodel2 = (DefaultTableModel)acTable.getModel();
        tmodel3 = (DefaultTableModel)tableTable.getModel();
        tmodel4 = (DefaultTableModel)chairTable.getModel();
        
        fillTables();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Computer = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        computerProcessor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        computerName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        computerValue = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        computerBrand = new javax.swing.JTextField();
        computerVoltage = new javax.swing.JTextField();
        computerFind = new javax.swing.JButton();
        computerAdd = new javax.swing.JButton();
        computerUpdate = new javax.swing.JButton();
        computerDelete = new javax.swing.JButton();
        computerRAM = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        computerId = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        computerTable = new javax.swing.JTable();
        AC = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        acCapacity = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        acName = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        acValue = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        acBrand = new javax.swing.JTextField();
        acVoltage = new javax.swing.JTextField();
        acFind = new javax.swing.JButton();
        acAdd = new javax.swing.JButton();
        acUpdate = new javax.swing.JButton();
        acDelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        acId = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        acTable = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        tableName = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tableValue = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        tableMaterial = new javax.swing.JTextField();
        tableDrawer = new javax.swing.JTextField();
        tableFind = new javax.swing.JButton();
        tableAdd = new javax.swing.JButton();
        tableUpdate = new javax.swing.JButton();
        tableDelete = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        tableId = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        chairName = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        chairValue = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        chairMaterial = new javax.swing.JTextField();
        chairType = new javax.swing.JTextField();
        chairFind = new javax.swing.JButton();
        chairAdd = new javax.swing.JButton();
        chairUpdate = new javax.swing.JButton();
        chairDelete = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        chairId = new javax.swing.JFormattedTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        chairTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();

        jButton21.setText("UPDATE");

        jButton22.setText("DELETE");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("FIND");

        jButton24.setText("ADD");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(794, 690));
        setMinimumSize(new java.awt.Dimension(794, 690));
        setPreferredSize(new java.awt.Dimension(794, 690));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("Inventory System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 10, 390, 79);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Processor");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Item Id ");

        computerValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerValueActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Value");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Name");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Voltage");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Brand");

        computerVoltage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerVoltageActionPerformed(evt);
            }
        });

        computerFind.setText("FIND");
        computerFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerFindActionPerformed(evt);
            }
        });

        computerAdd.setText("ADD");
        computerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerAddActionPerformed(evt);
            }
        });

        computerUpdate.setText("UPDATE");
        computerUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerUpdateActionPerformed(evt);
            }
        });

        computerDelete.setText("DELETE");
        computerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerDeleteActionPerformed(evt);
            }
        });

        computerRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerRAMActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("RAM");

        jLabel3.setText("(Eg: PC123)");

        jLabel4.setText("(Eg: Group 5)");

        jLabel5.setText("(Eg: 20000)");

        jLabel6.setText("(Eg: Asus)");

        jLabel7.setText("(Eg: 230)");

        jLabel8.setText("(Eg: Intel i5)");

        jLabel9.setText("(Eg: 16)");

        try {
            computerId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("PC###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        computerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Value", "Brand", "Voltage", "Processor", "RAM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(computerTable);
        if (computerTable.getColumnModel().getColumnCount() > 0) {
            computerTable.getColumnModel().getColumn(0).setResizable(false);
            computerTable.getColumnModel().getColumn(1).setResizable(false);
            computerTable.getColumnModel().getColumn(2).setResizable(false);
            computerTable.getColumnModel().getColumn(3).setResizable(false);
            computerTable.getColumnModel().getColumn(4).setResizable(false);
            computerTable.getColumnModel().getColumn(5).setResizable(false);
            computerTable.getColumnModel().getColumn(5).setHeaderValue("Processor");
            computerTable.getColumnModel().getColumn(6).setResizable(false);
            computerTable.getColumnModel().getColumn(6).setHeaderValue("RAM");
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(computerAdd)
                        .addGap(18, 18, 18)
                        .addComponent(computerFind)
                        .addGap(18, 18, 18)
                        .addComponent(computerUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(computerDelete))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel19))
                                        .addGap(9, 9, 9))
                                    .addComponent(jLabel18))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(computerId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(computerName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(computerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(computerBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(computerVoltage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel31))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(computerRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(computerProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addContainerGap(245, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3)
                    .addComponent(computerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(computerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(computerValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computerBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computerVoltage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(computerProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(computerRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computerFind)
                    .addComponent(computerUpdate)
                    .addComponent(computerDelete)
                    .addComponent(computerAdd))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ComputerLayout = new javax.swing.GroupLayout(Computer);
        Computer.setLayout(ComputerLayout);
        ComputerLayout.setHorizontalGroup(
            ComputerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ComputerLayout.setVerticalGroup(
            ComputerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("COMPUTER", Computer);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setText("Capacity");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("Item Id ");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Value");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Name");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setText("Voltage");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Brand");

        acFind.setText("FIND");
        acFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acFindActionPerformed(evt);
            }
        });

        acAdd.setText("ADD");
        acAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acAddActionPerformed(evt);
            }
        });

        acUpdate.setText("UPDATE");
        acUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acUpdateActionPerformed(evt);
            }
        });

        acDelete.setText("DELETE");
        acDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acDeleteActionPerformed(evt);
            }
        });

        jLabel14.setText("(Eg: Group 5)");

        jLabel15.setText("(Eg: AC123)");

        jLabel16.setText("(Eg: 20000)");

        jLabel17.setText("(Eg: Samsung)");

        jLabel20.setText("(Eg: 230)");

        jLabel21.setText("(Eg: 1050)");

        try {
            acId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AC###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        acTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Value", "Brand", "Voltage", "Capacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(acTable);
        if (acTable.getColumnModel().getColumnCount() > 0) {
            acTable.getColumnModel().getColumn(0).setResizable(false);
            acTable.getColumnModel().getColumn(1).setResizable(false);
            acTable.getColumnModel().getColumn(2).setResizable(false);
            acTable.getColumnModel().getColumn(3).setResizable(false);
            acTable.getColumnModel().getColumn(4).setResizable(false);
            acTable.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(acAdd)
                        .addGap(18, 18, 18)
                        .addComponent(acFind)
                        .addGap(18, 18, 18)
                        .addComponent(acUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(acDelete))
                    .addComponent(jLabel25)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel30))
                                .addGap(9, 9, 9))
                            .addComponent(jLabel29))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(acBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(acValue, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(acCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))
                                    .addComponent(acVoltage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel17)))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(acId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(155, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel15)
                    .addComponent(acId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(acName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(acValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acVoltage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(acCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(54, 54, 54)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acFind)
                    .addComponent(acUpdate)
                    .addComponent(acDelete)
                    .addComponent(acAdd))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ACLayout = new javax.swing.GroupLayout(AC);
        AC.setLayout(ACLayout);
        ACLayout.setHorizontalGroup(
            ACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ACLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        ACLayout.setVerticalGroup(
            ACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ACLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AIR CONDITIONER", AC);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setText("Item Id ");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("Value");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setText("Name");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel36.setText("Drawer");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel37.setText("Material");

        tableFind.setText("FIND");
        tableFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableFindActionPerformed(evt);
            }
        });

        tableAdd.setText("ADD");
        tableAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableAddActionPerformed(evt);
            }
        });

        tableUpdate.setText("UPDATE");
        tableUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableUpdateActionPerformed(evt);
            }
        });

        tableDelete.setText("DELETE");
        tableDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableDeleteActionPerformed(evt);
            }
        });

        jLabel22.setText("(eg: TB123 )");

        jLabel23.setText("(eg: Grooup5 )");

        jLabel24.setText("(eg: 10000 )");

        jLabel32.setText("(eg: Wood )");

        jLabel38.setText("(eg: 4 )");

        try {
            tableId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("TB###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Value", "Material", "Drawer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableTable);
        if (tableTable.getColumnModel().getColumnCount() > 0) {
            tableTable.getColumnModel().getColumn(0).setResizable(false);
            tableTable.getColumnModel().getColumn(1).setResizable(false);
            tableTable.getColumnModel().getColumn(2).setResizable(false);
            tableTable.getColumnModel().getColumn(3).setResizable(false);
            tableTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(tableAdd)
                        .addGap(18, 18, 18)
                        .addComponent(tableFind)
                        .addGap(18, 18, 18)
                        .addComponent(tableUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(tableDelete))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel37))
                                .addGap(9, 9, 9))
                            .addComponent(jLabel36))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(tableId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel22))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(tableName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(tableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tableMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tableDrawer, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel38))))))
                .addContainerGap(260, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel22)
                    .addComponent(tableId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(tableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tableValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(11, 11, 11)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tableMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tableDrawer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tableFind)
                    .addComponent(tableUpdate)
                    .addComponent(tableDelete)
                    .addComponent(tableAdd))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TABLE", jPanel9);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel39.setText("Item Id ");

        chairValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chairValueActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel40.setText("Value");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel41.setText("Name");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel42.setText("Type");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel43.setText("Material");

        chairFind.setText("FIND");
        chairFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chairFindActionPerformed(evt);
            }
        });

        chairAdd.setText("ADD");
        chairAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chairAddActionPerformed(evt);
            }
        });

        chairUpdate.setText("UPDATE");
        chairUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chairUpdateActionPerformed(evt);
            }
        });

        chairDelete.setText("DELETE");
        chairDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chairDeleteActionPerformed(evt);
            }
        });

        jLabel44.setText("(eg: CR123 )");

        jLabel45.setText("(eg: Grooup5 )");

        jLabel46.setText("(eg: 5000 )");

        jLabel47.setText("(eg: Wood )");

        jLabel48.setText("(eg: Adjustable )");

        try {
            chairId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("CR###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        chairTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Value", "Material", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(chairTable);
        if (chairTable.getColumnModel().getColumnCount() > 0) {
            chairTable.getColumnModel().getColumn(0).setResizable(false);
            chairTable.getColumnModel().getColumn(1).setResizable(false);
            chairTable.getColumnModel().getColumn(2).setResizable(false);
            chairTable.getColumnModel().getColumn(3).setResizable(false);
            chairTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel43))
                                .addGap(9, 9, 9))
                            .addComponent(jLabel42))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(chairMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(chairValue, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chairType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chairName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel45)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(chairId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel44))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(chairAdd)
                        .addGap(18, 18, 18)
                        .addComponent(chairFind)
                        .addGap(18, 18, 18)
                        .addComponent(chairUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(chairDelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel44)
                            .addComponent(chairId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(chairName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(chairValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chairMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)))
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chairType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chairFind)
                    .addComponent(chairUpdate)
                    .addComponent(chairDelete)
                    .addComponent(chairAdd))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CHAIR", jPanel11);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(32, 116, 740, 530);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/IMs.png"))); // NOI18N

        jLabel2.setAutoscrolls(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 0, 120, 460);

        exit.setText("Close");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(690, 90, 63, 25);

        clearbutton.setText("Clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(clearbutton);
        clearbutton.setBounds(600, 90, 63, 25);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void computerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerDeleteActionPerformed
        
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="DELETE FROM computer WHERE ItemId=?";
            PreparedStatement  st = con.prepareStatement(sql);
            st.setString(1,computerId.getText());
            st.executeUpdate();
            con.close();
            
            clearData();
            fillTables();
            JOptionPane.showMessageDialog(null, "Item DELETED", "Deleted", JOptionPane.PLAIN_MESSAGE);
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Record not founded ");
        }
    }//GEN-LAST:event_computerDeleteActionPerformed

    private void computerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerAddActionPerformed
        // TODO add your handling code here:
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="INSERT INTO COMPUTER VALUES (\""+computerId.getText()+"\",\""+computerName.getText()+"\","+Double.parseDouble(computerValue.getText())+",\""+computerBrand.getText()+"\","+Integer.parseInt(computerVoltage.getText())+",\""+computerProcessor.getText()+"\","+Integer.parseInt(computerRAM.getText())+")";
            PreparedStatement  st = con.prepareStatement(sql);            
            st.executeUpdate(sql);
            
            con.close();
            fillTables();
            clearData();
            
            JOptionPane.showMessageDialog(null, "Item added successful.", "Inventory added", JOptionPane.PLAIN_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Required Inforations are not inserted\nor Invalid Data Type");
        }
    }//GEN-LAST:event_computerAddActionPerformed

    private void computerRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerRAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_computerRAMActionPerformed

    private void tableAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableAddActionPerformed
        // TODO add your handling code here:
        
       try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="INSERT INTO tabledetails VALUES (\""+tableId.getText()+"\",\""+tableName.getText()+"\","+Double.parseDouble(tableValue.getText())+",\""+tableMaterial.getText()+"\","+Integer.parseInt(tableDrawer.getText())+")";
            PreparedStatement  st = con.prepareStatement(sql);            
            st.executeUpdate(sql);
            con.close();
            
            fillTables();
            clearData();
            
            JOptionPane.showMessageDialog(null, "Item added successful.", "Inventory added", JOptionPane.PLAIN_MESSAGE);
                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Required Inforations are not inserted\nor Invalid Data Type");
        }        
               
    }//GEN-LAST:event_tableAddActionPerformed

    private void tableDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableDeleteActionPerformed
       
        try{
            
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="DELETE FROM tabledetails WHERE ItemId=?";
            PreparedStatement  st = con.prepareStatement(sql);
            st.setString(1,tableId.getText());
            st.executeUpdate();
            con.close();
            
            clearData();
            fillTables();
            JOptionPane.showMessageDialog(null, "Item DELETED", "Deleted", JOptionPane.PLAIN_MESSAGE);
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Record not founded ");
        }
    }//GEN-LAST:event_tableDeleteActionPerformed

    private void chairAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chairAddActionPerformed
        
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="INSERT INTO chair VALUES (\""+chairId.getText()+"\",\""+chairName.getText()+"\","+Double.parseDouble(chairValue.getText())+",\""+chairMaterial.getText()+"\",\""+chairType.getText()+"\")";
            PreparedStatement  st = con.prepareStatement(sql);            
            st.executeUpdate(sql);
            con.close();
            
            fillTables();
            clearData();
            
            JOptionPane.showMessageDialog(null, "Item added successful.", "Inventory added", JOptionPane.PLAIN_MESSAGE);
                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Required Inforations are not inserted\nor Invalid Data Type");
        }     
           
    }//GEN-LAST:event_chairAddActionPerformed

    private void chairDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chairDeleteActionPerformed
        
        try{
            
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="DELETE FROM chair WHERE ItemId=?";
            PreparedStatement  st = con.prepareStatement(sql);
            st.setString(1,chairId.getText());
            st.executeUpdate();
            con.close();
            
            clearData();
            fillTables();
            JOptionPane.showMessageDialog(null, "Item DELETED", "Deleted", JOptionPane.PLAIN_MESSAGE);
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Record not founded ");
        }
    }//GEN-LAST:event_chairDeleteActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void computerUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerUpdateActionPerformed
        
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="UPDATE computer SET Name = '"+computerName.getText()+"', Price = '"+computerValue.getText()+"', brand = '"+computerBrand.getText()+"', voltage = '"+computerVoltage.getText()+"', processor = '"+computerProcessor.getText()+"', Ram = '"+computerRAM.getText()+"' WHERE (ItemID = '"+computerId.getText()+"');";
            PreparedStatement  st = con.prepareStatement(sql);
            st.executeUpdate();
            
            fillTables();
            clearData();

            JOptionPane.showMessageDialog(null, "Inventory updated", "Updated", JOptionPane.PLAIN_MESSAGE);
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Record not founded ");
        }
        
        
    }//GEN-LAST:event_computerUpdateActionPerformed

    private void computerFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerFindActionPerformed
        // TODO add your handling code here:
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="select * from computer where ItemID = \""+computerId.getText()+"\";";
            PreparedStatement  st = con.prepareStatement(sql);
            ResultSet r=st.executeQuery(sql);
            
           while(r.next()){
                
                
                computerName.setText(r.getString("Name"));
                computerValue.setText(r.getString("Price"));
                computerBrand.setText(r.getString("brand"));
                computerVoltage.setText(r.getString("voltage"));
                computerProcessor.setText(r.getString("processor"));
                computerRAM.setText(r.getString("Ram"));
                
            }
            con.close();
            
        }catch(Exception ex){
            //Error Massage
            JOptionPane.showMessageDialog(null,"Item not founded");
        }
    }//GEN-LAST:event_computerFindActionPerformed

    private void computerValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_computerValueActionPerformed

    private void computerVoltageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerVoltageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_computerVoltageActionPerformed

    private void tableFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableFindActionPerformed
        // TODO add your handling code here:
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="select * from tabledetails where ItemID = \""+tableId.getText()+"\";";
            PreparedStatement  st = con.prepareStatement(sql);
            ResultSet r=st.executeQuery(sql);
            
           while(r.next()){
                
                tableName.setText(r.getString("Name"));
                tableValue.setText(r.getString("Value"));
                tableMaterial.setText(r.getString("Material"));
                tableDrawer.setText(r.getString("Drawer"));
                
            }
            con.close();
            
        }catch(Exception ex){
            //Error Massage
            JOptionPane.showMessageDialog(null,"Item not founded");
        }
    }//GEN-LAST:event_tableFindActionPerformed

    private void chairFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chairFindActionPerformed
        // TODO add your handling code here:
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="select * from chair where ItemID = \""+chairId.getText()+"\";";
            PreparedStatement  st = con.prepareStatement(sql);
            ResultSet r=st.executeQuery(sql);
            
           while(r.next()){
                
                chairName.setText(r.getString("Name"));
                chairValue.setText(r.getString("Value"));
                chairMaterial.setText(r.getString("Material"));
                chairType.setText(r.getString("Type"));
                
            }
            con.close();
            
        }catch(Exception ex){
            //Error Massage
            JOptionPane.showMessageDialog(null,"Item not founded");
        }
    }//GEN-LAST:event_chairFindActionPerformed

    private void tableUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableUpdateActionPerformed
        
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="UPDATE tabledetails SET Name = '"+tableName.getText()+"', value = '"+tableValue.getText()+"', material = '"+tableMaterial.getText()+"', Drawer = '"+tableDrawer.getText()+"' WHERE (ItemID = '"+tableId.getText()+"');";
            PreparedStatement  st = con.prepareStatement(sql);
            st.executeUpdate();
            con.close();
            
            fillTables();
            clearData();

            JOptionPane.showMessageDialog(null, "Inventory updated", "Updated", JOptionPane.PLAIN_MESSAGE);
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Record not founded ");
        }
        
    }//GEN-LAST:event_tableUpdateActionPerformed

    private void chairUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chairUpdateActionPerformed
        // TODO add your handling code here:
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="UPDATE chair SET Name = '"+chairName.getText()+"', value = '"+chairValue.getText()+"', material = '"+chairMaterial.getText()+"', Type = '"+chairType.getText()+"' WHERE (ItemID = '"+chairId.getText()+"');";
            PreparedStatement  st = con.prepareStatement(sql);
            st.executeUpdate();
            con.close();
            
            fillTables();
            clearData();

            JOptionPane.showMessageDialog(null, "Inventory updated", "Updated", JOptionPane.PLAIN_MESSAGE);
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Record not founded ");
        }
    }//GEN-LAST:event_chairUpdateActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        // TODO add your handling code here:
        clearData();
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void acDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acDeleteActionPerformed
        
        try{
            
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="DELETE FROM airconditioner WHERE ItemId=?";
            PreparedStatement  st = con.prepareStatement(sql);
            st.setString(1,acId.getText());
            st.executeUpdate();
            con.close();
            
            clearData();
            fillTables();
            JOptionPane.showMessageDialog(null, "Item DELETED", "Deleted", JOptionPane.PLAIN_MESSAGE);
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Record not founded ");
        }
    }//GEN-LAST:event_acDeleteActionPerformed

    private void acUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acUpdateActionPerformed
        
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="UPDATE airconditioner SET Name = '"+acName.getText()+"', Price = '"+acValue.getText()+"', brand = '"+acBrand.getText()+"', voltage = '"+acVoltage.getText()+"', capacity = '"+acCapacity.getText()+"' WHERE (ItemID = '"+acId.getText()+"');";
            PreparedStatement  st = con.prepareStatement(sql);
            st.executeUpdate();
            
            fillTables();
            clearData();

            JOptionPane.showMessageDialog(null, "Inventory updated", "Updated", JOptionPane.PLAIN_MESSAGE);
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Record not founded ");
        }
        
    }//GEN-LAST:event_acUpdateActionPerformed

    private void acAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acAddActionPerformed
        // TODO add your handling code here:
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="INSERT INTO airconditioner VALUES (\""+acId.getText()+"\",\""+acName.getText()+"\","+Double.parseDouble(acValue.getText())+",\""+acBrand.getText()+"\","+Integer.parseInt(acVoltage.getText())+","+Double.parseDouble(acCapacity.getText())+")";
            PreparedStatement  st = con.prepareStatement(sql);            
            st.executeUpdate(sql);
            con.close();
            
            fillTables();
            clearData();
            
            JOptionPane.showMessageDialog(null, "Item added successful.", "Inventory added", JOptionPane.PLAIN_MESSAGE);
                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Required Inforations are not inserted\nor Invalid Data Type");
        }
        
    }//GEN-LAST:event_acAddActionPerformed

    private void acFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acFindActionPerformed
        // TODO add your handling code here:
       
        try{
            String database="jdbc:mysql://localhost:3306/inventorysystem";
            Connection con=DriverManager.getConnection(database,"newuser","password");
            String sql="select * from airconditioner where ItemID = \""+acId.getText()+"\";";
            PreparedStatement  st = con.prepareStatement(sql);
            ResultSet r=st.executeQuery(sql);
            
           while(r.next()){
                
                acName.setText(r.getString("Name"));
                acValue.setText(r.getString("Price"));
                acBrand.setText(r.getString("brand"));
                acVoltage.setText(r.getString("voltage"));
                acCapacity.setText(r.getString("capacity"));
                
            }
            con.close();
            
        }catch(Exception ex){
            //Error Massage
            JOptionPane.showMessageDialog(null,"Item not founded");
        }
        
    }//GEN-LAST:event_acFindActionPerformed

    private void chairValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chairValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chairValueActionPerformed

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
            java.util.logging.Logger.getLogger(SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SYSTEM().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AC;
    private javax.swing.JPanel Computer;
    private javax.swing.JButton acAdd;
    private javax.swing.JTextField acBrand;
    private javax.swing.JTextField acCapacity;
    private javax.swing.JButton acDelete;
    private javax.swing.JButton acFind;
    private javax.swing.JFormattedTextField acId;
    private javax.swing.JTextField acName;
    private javax.swing.JTable acTable;
    private javax.swing.JButton acUpdate;
    private javax.swing.JTextField acValue;
    private javax.swing.JTextField acVoltage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chairAdd;
    private javax.swing.JButton chairDelete;
    private javax.swing.JButton chairFind;
    private javax.swing.JFormattedTextField chairId;
    private javax.swing.JTextField chairMaterial;
    private javax.swing.JTextField chairName;
    private javax.swing.JTable chairTable;
    private javax.swing.JTextField chairType;
    private javax.swing.JButton chairUpdate;
    private javax.swing.JTextField chairValue;
    private javax.swing.JButton clearbutton;
    private javax.swing.JButton computerAdd;
    private javax.swing.JTextField computerBrand;
    private javax.swing.JButton computerDelete;
    private javax.swing.JButton computerFind;
    private javax.swing.JFormattedTextField computerId;
    private javax.swing.JTextField computerName;
    private javax.swing.JTextField computerProcessor;
    private javax.swing.JTextField computerRAM;
    private javax.swing.JTable computerTable;
    private javax.swing.JButton computerUpdate;
    private javax.swing.JTextField computerValue;
    private javax.swing.JTextField computerVoltage;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton tableAdd;
    private javax.swing.JButton tableDelete;
    private javax.swing.JTextField tableDrawer;
    private javax.swing.JButton tableFind;
    private javax.swing.JFormattedTextField tableId;
    private javax.swing.JTextField tableMaterial;
    private javax.swing.JTextField tableName;
    private javax.swing.JTable tableTable;
    private javax.swing.JButton tableUpdate;
    private javax.swing.JTextField tableValue;
    // End of variables declaration//GEN-END:variables


}
