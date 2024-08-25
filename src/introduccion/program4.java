
package introduccion;

//
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

    public class program4 extends javax.swing.JFrame {

        private static final String username = "root";
        private static final String password = "12345";
        private static final String dataConn = "jdbc:mysql://localhost:3306/connector";
        
        Connection sqlConn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int q, i, id, deleteItem;
        
        public program4() {
            initComponents();
    }
        
//============================FUNCTION============================================================
        
    public void upDateDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("select * from aleatorio");
            
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
                    columnData.add(rs.getString("ANIMAL"));
                    columnData.add(rs.getString("PESO"));
                    columnData.add(rs.getString("COLOR"));
                    columnData.add(rs.getString("CARACTERISTICA"));
                    columnData.add(rs.getString("VIV"));
                    columnData.add(rs.getString("xviv"));
                    columnData.add(rs.getString("GRUPO"));
                    columnData.add(rs.getString("xgr"));
                    columnData.add(rs.getString("IDPicture"));
                    columnData.add(rs.getString("xpe"));
                }
                RecordTable.addRow(columnData);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
//==============================END FUNCTION============================================================        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jtxtGRUPO = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_photo = new javax.swing.JLabel();
        jtxtIDAnimal = new javax.swing.JTextField();
        jtxtANIMAL = new javax.swing.JTextField();
        jtxtPESO = new javax.swing.JTextField();
        jtxtCOLOR = new javax.swing.JTextField();
        jtxtCARACTERISTICA = new javax.swing.JTextField();
        jbtnAleatorio = new javax.swing.JButton();
        atrasbutton = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtxtCARACTERISTICA1 = new javax.swing.JTextField();
        jbtnSubir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("VALOR");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("EMPRESA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("NIT");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("AGREGAR PROOVEDOR");

        lbl_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtxtIDAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIDAnimalActionPerformed(evt);
            }
        });

        jtxtANIMAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtANIMALActionPerformed(evt);
            }
        });

        jbtnAleatorio.setBackground(new java.awt.Color(255, 255, 153));
        jbtnAleatorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAleatorio.setText("ALEATORIO");
        jbtnAleatorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAleatorioActionPerformed(evt);
            }
        });

        atrasbutton.setBackground(new java.awt.Color(153, 153, 255));
        atrasbutton.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Escritorio\\introduccion\\Imagenes\\flecha_atras-removebg-preview.png")); // NOI18N
        atrasbutton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        atrasbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasbuttonActionPerformed(evt);
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

        jbtnLimpiar.setBackground(new java.awt.Color(153, 255, 255));
        jbtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLimpiar.setText("LIMPIAR");
        jbtnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "IDAnimal", "ANIMAL", "PESO", "%", "COLOR", "CARACTERISTICAS", "V / IV", "%", "GRUPO / TIPO", "%", "IDPicture"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, true, false, true, false
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

        jbtnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("PRODUCTO");

        jbtnSubir.setBackground(new java.awt.Color(153, 255, 204));
        jbtnSubir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnSubir.setText("SUBIR");
        jbtnSubir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrasbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtIDAnimal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtPESO, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCOLOR, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCARACTERISTICA, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtANIMAL, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jtxtCARACTERISTICA1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(atrasbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtxtANIMAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtxtPESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtxtCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(lbl_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jtxtCARACTERISTICA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtnSubir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtIDAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jtxtCARACTERISTICA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAleatorio)
                    .addComponent(jbtnAgregar)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                pst = sqlConn.prepareStatement("delete from aleatorio where id =?");

                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Información actualizada");
                upDateDB();

                jtxtIDAnimal.setText("");
                jtxtANIMAL.setText("");
                jtxtPESO.setText("");
                jTextFieldPorcentajePeso.setText("");
                jtxtCOLOR.setText("");
                jtxtCARACTERISTICA.setText("");
                jtxtVIV.setText("");
                jtxtGRUPO1.setText("");
                lbl_photo.setIcon(null);
                jTextFieldPorcentaje.setText("");
                jTextFieldPorcentajeVoVI.setText("");

            }
        }

        catch (ClassNotFoundException ex){

            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (SQLException ex){
            System.err.println(ex);
        }
        //============================================END FUNCION ELIMINAR=====================================================================
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        jtxtIDAnimal.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        jtxtANIMAL.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        jtxtPESO.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        jTextFieldPorcentajePeso.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        jtxtCOLOR.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        jtxtCARACTERISTICA.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        jtxtVIV.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
        jTextFieldPorcentajeVoVI.setText(RecordTable.getValueAt(SelectedRows, 8).toString());
        jtxtGRUPO1.setText(RecordTable.getValueAt(SelectedRows, 9).toString());
        jTextFieldPorcentaje.setText(RecordTable.getValueAt(SelectedRows, 10).toString());

        String imagePath = RecordTable.getValueAt(SelectedRows, 11).toString();
        if (imagePath != null && !imagePath.isEmpty()) {
            ImageIcon imageIcon = new ImageIcon(imagePath);
            lbl_photo.setIcon(imageIcon);
        } else {
            lbl_photo.setIcon(null);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // Limpiar la información en los campos del formulario
        jtxtIDAnimal.setText("");
        jtxtANIMAL.setText("");
        jtxtPESO.setText("");
        jTextFieldPorcentajePeso.setText("");
        jtxtCOLOR.setText("");
        jtxtCARACTERISTICA.setText("");
        jtxtVIV.setText("");
        jtxtGRUPO1.setText("");
        jTextFieldPorcentaje.setText("");
        jTextFieldPorcentajeVoVI.setText("");
        lbl_photo.setIcon(null);
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into aleatorio(IDAnimal,ANIMAL,PESO,COLOR,CARACTERISTICA,VIV,xviv,GRUPO,xgr,IDPicture,xpe)value(?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, jtxtIDAnimal.getText());
            pst.setString(2, jtxtANIMAL.getText());
            pst.setString(3, jtxtPESO.getText());
            pst.setString(4, jTextFieldPorcentajePeso.getText());
            pst.setString(5, jtxtCOLOR.getText());
            pst.setString(6, jtxtCARACTERISTICA.getText());
            pst.setString(7, jtxtVIV.getText());
            pst.setString(8, jTextFieldPorcentajeVoVI.getText());
            pst.setString(9, jtxtGRUPO1.getText());
            pst.setString(10, jTextFieldPorcentaje.getText());
            pst.setString(11, lbl_photo.getIcon().toString());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Se ha añadido exitosamente");
            upDateDB();

            jtxtIDAnimal.setText("");
            jtxtANIMAL.setText("");
            jtxtPESO.setText("");
            jTextFieldPorcentajePeso.setText("");
            jtxtCOLOR.setText("");
            jtxtCARACTERISTICA.setText("");
            jtxtVIV.setText("");
            jTextFieldPorcentajeVoVI.setText("");
            jtxtGRUPO1.setText("");
            jTextFieldPorcentaje.setText("");
            lbl_photo.setIcon(null);
        }

        catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void atrasbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasbuttonActionPerformed

        program2 menu = new program2 ();
        menu.show();
        dispose();
    }//GEN-LAST:event_atrasbuttonActionPerformed

    private void jbtnAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAleatorioActionPerformed
        // Ruta del archivo CSV
        String rutaArchivo = "C:\\Users\\aleja\\OneDrive\\Documentos\\Universidad\\5to Semestre\\Universidad UNAB\\Paradigmas de la programación\\Tarea 2\\Actividad\\introduccion\\animales_completo.csv";

        List<String[]> datos = new ArrayList<>();

        try {
            File archivo = new File(rutaArchivo);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();

                // Comprobar si la línea contiene al menos 3 comas
                if (linea.chars().filter(ch -> ch == ',').count() >= 3) {
                    String[] fila = linea.split(",");
                    datos.add(fila);
                } else {
                    System.out.println("Línea con formato incorrecto: " + linea);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }

        // Obtener una fila aleatoria
        Random random = new Random();
        String[] filaAleatoria = datos.get(random.nextInt(datos.size()));

        // Obtener el nombre, la URL de la imagen, el ID y el grupo del animal
        String idAnimal = filaAleatoria[0];
        String nombreImagen = filaAleatoria[1];
        String grupoAnimal = filaAleatoria[2];
        String VoIV = filaAleatoria[3];
        String pesoAnimal = filaAleatoria[4];
        String urlImagen = filaAleatoria[5];

        // Contar animales en el grupo seleccionado y calcular el porcentaje
        int totalAnimales = datos.size();
        int totalAnimalesVoIV = datos.size();
        int totalPeso = datos.size();
        int animalesEnGrupo = 0;
        int animalesConVoIV = 0;
        int porcentajePeso=0;

        for (String[] fila : datos) {
            if (fila[2].equals(grupoAnimal)) {
                animalesEnGrupo++;
            }
            if (fila[3].equals(VoIV)) {
                animalesConVoIV++;
            }if (fila[4].equals(pesoAnimal)) {
                porcentajePeso++;
            }

        }

        double porcentajeGrupo = (double) animalesEnGrupo / totalAnimales * 100;
        double porcentajeVoIV = (double) animalesConVoIV / totalAnimalesVoIV * 100;
        double porcentaPesoanimal = (double) porcentajePeso / totalPeso * 100;

        // Descargar la imagen desde la URL
        BufferedImage imagen = null;

        try {
            URL url = new URL(urlImagen);
            imagen = ImageIO.read(url);
        } catch (IOException e) {
            System.out.println("Error al descargar la imagen");
        }

        // Mostrar el nombre en el JTextField
        jtxtANIMAL.setText(nombreImagen);

        //Vertebrado VoIV
        jtxtVIV.setText(VoIV);

        //Porcentaje VoIV
        jTextFieldPorcentajeVoVI.setText(String.format("%.2f%%", porcentajeVoIV));

        // Mostrar el ID del animal en el jTextFieldID
        jtxtIDAnimal.setText(idAnimal);

        // Mostrar el grupo y porcentaje en los JTextFields correspondientes
        jtxtGRUPO1.setText(grupoAnimal);
        jTextFieldPorcentaje.setText(String.format("%.2f%%", porcentajeGrupo));

        //Mostrar Peso
        jtxtPESO.setText(pesoAnimal);
        jTextFieldPorcentajePeso.setText(String.format("%.2f%%", porcentaPesoanimal));
        // Mostrar la imagen en el JLabel
        if (imagen != null) {
            int ancho = lbl_photo.getWidth();
            int alto = lbl_photo.getHeight();
            Image imagenEscalada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            ImageIcon icono = new ImageIcon(imagenEscalada);
            lbl_photo.setIcon(icono);
        }
        //jTextFieldPorcentajePeso
    }//GEN-LAST:event_jbtnAleatorioActionPerformed

    private void jtxtANIMALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtANIMALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtANIMALActionPerformed

    private void jtxtIDAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIDAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIDAnimalActionPerformed

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
            java.util.logging.Logger.getLogger(program4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(program4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(program4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(program4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new program4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnAleatorio;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnSubir;
    private javax.swing.JTextField jtxtANIMAL;
    private javax.swing.JTextField jtxtCARACTERISTICA;
    private javax.swing.JTextField jtxtCARACTERISTICA1;
    private javax.swing.JTextField jtxtCOLOR;
    private javax.swing.JTextField jtxtGRUPO;
    private javax.swing.JTextField jtxtIDAnimal;
    private javax.swing.JTextField jtxtPESO;
    private javax.swing.JLabel lbl_photo;
    // End of variables declaration//GEN-END:variables
}
