/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package introduccion;

import com.mysql.cj.jdbc.Blob;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


    public class program3 extends javax.swing.JFrame {

        private static final String username = "root";
        private static final String password = "12345";
        private static final String dataConn = "jdbc:mysql://localhost:3306/connector";
    
        Connection sqlConn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int q, i, id, deleteItem;
        String path2 = null; 
    
    public program3() {
        initComponents();
    }

    //==========================================FUNCTION========================================================================
    
    public void upDateDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("select * from agregar");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for (i = 1;i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("IDAnimal"));
                    columnData.add(rs.getString("NOMBRE"));
                    columnData.add(rs.getString("PESO"));
                    columnData.add(rs.getString("COLOR"));
                    columnData.add(rs.getString("CARACTERISTICA"));
                    columnData.add(rs.getString("VIV"));
                    columnData.add(rs.getString("IDPicture"));
                }
                RecordTable.addRow(columnData);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    //========================================END FUNCTION========================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtIDAnimal = new javax.swing.JTextField();
        jtxtNOMBRE = new javax.swing.JTextField();
        jtxtPESO = new javax.swing.JTextField();
        jtxtCOLOR = new javax.swing.JTextField();
        jtxtCARACTERISTICA = new javax.swing.JTextField();
        jbtnAgregar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jbtnSubir = new javax.swing.JButton();
        lbl_photo = new javax.swing.JLabel();
        jtxtVIV = new javax.swing.JTextField();
        jbtnLimpiar = new javax.swing.JButton();
        atrasbutton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("AGREGAR PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PRODUCTO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("PESO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("COLOR");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("GRUPO / TIPO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("IMAGEN");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("VALOR");

        jtxtNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNOMBREActionPerformed(evt);
            }
        });

        jbtnAgregar.setBackground(new java.awt.Color(204, 255, 204));
        jbtnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAgregar.setText("AGREGAR");
        jbtnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jbtnEditar.setBackground(new java.awt.Color(255, 255, 153));
        jbtnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEditar.setText("EDITAR");
        jbtnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "IDAnimal", "ANIMAL", "PESO", "COLOR", "GRUPO / TIPO", "V / IV", "IDPicture"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnSubir.setBackground(new java.awt.Color(153, 255, 204));
        jbtnSubir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnSubir.setText("SUBIR");
        jbtnSubir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubirActionPerformed(evt);
            }
        });

        lbl_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtxtVIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtVIVActionPerformed(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(153, 255, 255));
        jbtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLimpiar.setText("LIMPIAR");
        jbtnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        atrasbutton1.setBackground(new java.awt.Color(153, 153, 255));
        atrasbutton1.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Escritorio\\introduccion\\Imagenes\\flecha_atras-removebg-preview.png")); // NOI18N
        atrasbutton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        atrasbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atrasbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtVIV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtxtCARACTERISTICA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(98, 98, 98)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addComponent(jLabel7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(73, 73, 73)
                                            .addComponent(jbtnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(77, 77, 77)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtIDAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtPESO, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrasbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtxtIDAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtxtPESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtxtCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtxtCARACTERISTICA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtxtVIV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnSubir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAgregar)
                    .addComponent(jbtnEditar)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        try{
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows,0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("UPDATE agregar SET IDAnimal=?, NOMBRE=?, PESO=?, COLOR=?, CARACTERISTICA=?, VIV=?, IDPicture=? WHERE id=?");
            
            pst.setString(1, jtxtIDAnimal.getText());
            pst.setString(2, jtxtNOMBRE.getText());
            pst.setString(3, jtxtPESO.getText());
            pst.setString(4, jtxtCOLOR.getText());
            pst.setString(5, jtxtCARACTERISTICA.getText());
            pst.setString(6, jtxtVIV.getText());
            String imagePath = null;
            pst.setString(7, imagePath);
            pst.setInt(8, id);

            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Se ha actualizado correctamente");
            upDateDB();
        }
        
        catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }finally{
            try{
                if(pst != null){
                    pst.close();    
                }
                if(sqlConn != null){
                    sqlConn.close();
                }
            }catch(SQLException ex){              
            }
        } 
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
//========================================= FUNCION AGREGAR =========================================================================

        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into agregar(IDAnimal,NOMBRE,PESO,COLOR,CARACTERISTICA,VIV,IDPicture)value(?,?,?,?,?,?,?)");  
            
            pst.setString(1, jtxtIDAnimal.getText());
            pst.setString(2, jtxtNOMBRE.getText());
            pst.setString(3, jtxtPESO.getText());
            pst.setString(4, jtxtCOLOR.getText());
            pst.setString(5, jtxtCARACTERISTICA.getText());
            pst.setString(6, jtxtVIV.getText());
            pst.setString(7, lbl_photo.getIcon().toString());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Se ha añadido exitosamente");
            upDateDB();
            
            jtxtIDAnimal.setText("");
            jtxtNOMBRE.setText("");
            jtxtPESO.setText("");        
            jtxtCOLOR.setText("");        
            jtxtCARACTERISTICA.setText("");        
            jtxtVIV.setText("");        
            lbl_photo.setIcon(null);        
                    
        }
        
        catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        } 
        
 //=========================================END FUNCION AGREGAR=========================================================================
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        jtxtIDAnimal.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        jtxtNOMBRE.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        jtxtPESO.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        jtxtCOLOR.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        jtxtCARACTERISTICA.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        jtxtVIV.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        
        String imagePath = RecordTable.getValueAt(SelectedRows, 7).toString();
        if (imagePath != null && !imagePath.isEmpty()) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        lbl_photo.setIcon(imageIcon);
        } else {
        lbl_photo.setIcon(null);
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
 //========================================= FUNCION ELIMINAR =========================================================================
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int selectedRows = jTable1.getSelectedRow();
        
        try{
              id = Integer.parseInt(RecordTable.getValueAt(selectedRows,0).toString());
            
              deleteItem = JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar este elemento?","Warning",JOptionPane.YES_NO_OPTION);
          if (deleteItem == JOptionPane.YES_OPTION){
              
          Class.forName("com.mysql.jdbc.Driver");
              sqlConn = DriverManager.getConnection(dataConn,username,password);
                pst = sqlConn.prepareStatement("delete from agregar where id =?");
                
                pst.setInt(1, id);
                pst.executeUpdate();
              JOptionPane.showMessageDialog(this,"Información actualizada");
              upDateDB();
              
            jtxtIDAnimal.setText("");
            jtxtIDAnimal.requestFocus();
            jtxtNOMBRE.setText("");
            jtxtPESO.setText("");
            jtxtCOLOR.setText("");
            jtxtCARACTERISTICA.setText("");
            jtxtVIV.setText("");
          
          }
        }
        
        catch (ClassNotFoundException ex){
        
        java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (SQLException ex){
            System.err.println(ex);
        }
 //============================================END FUNCION ELIMINAR=====================================================================
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
//=============================================FUNCION IMG=====================================================================

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(214, 134, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
        lbl_photo.setIcon(icon);
        path2 = path;
        } catch (IOException ex) {
            Logger.getLogger(program3.class.getName()).log(Level.SEVERE, null, ex);
        }
  

//=============================================END FUNCION IMG===================================================================
    }//GEN-LAST:event_jbtnSubirActionPerformed

    private void jtxtVIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtVIVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtVIVActionPerformed

    private void jtxtNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNOMBREActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
//===============================================LIMPIAR ACTION=========================================================================

    jtxtIDAnimal.setText("");
    jtxtNOMBRE.setText("");
    jtxtPESO.setText("");
    jtxtCOLOR.setText("");
    jtxtCARACTERISTICA.setText("");
    jtxtVIV.setText("");

//===============================================END LIMPIAR ACTION=========================================================================
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void atrasbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasbutton1ActionPerformed

        program2 menu = new program2 ();
        menu.show();
        dispose();
    }//GEN-LAST:event_atrasbutton1ActionPerformed

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
            java.util.logging.Logger.getLogger(program3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(program3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(program3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(program3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new program3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasbutton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnSubir;
    private javax.swing.JTextField jtxtCARACTERISTICA;
    private javax.swing.JTextField jtxtCOLOR;
    private javax.swing.JTextField jtxtIDAnimal;
    private javax.swing.JTextField jtxtNOMBRE;
    private javax.swing.JTextField jtxtPESO;
    private javax.swing.JTextField jtxtVIV;
    private javax.swing.JLabel lbl_photo;
    // End of variables declaration//GEN-END:variables
}
