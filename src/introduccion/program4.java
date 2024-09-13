
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
        private static final String password = "DiegoDiaz12";
        private static final String dataConn = "jdbc:mysql://localhost:3306/connector";
        
        Connection sqlConn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int q, i, id, deleteItem;
        
        public program4() {
            initComponents();
            cargarDatos();
    }
        
//============================FUNCTION============================================================
        
   public void upDateDB() {
    try (Connection sqlConn = DriverManager.getConnection(dataConn, username, password);
         PreparedStatement pst = sqlConn.prepareStatement("SELECT * FROM proveedor");
         ResultSet rs = pst.executeQuery()) {

        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount();

        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        RecordTable.setRowCount(0);

        while (rs.next()) {
            Vector<Object> columnData = new Vector<>();

            for (i = 1; i <= q; i++) {
                columnData.add(rs.getString("id"));
                columnData.add(rs.getString("Nombre"));
                columnData.add(rs.getString("Valor"));
                columnData.add(rs.getString("Empresa"));
                columnData.add(rs.getString("Nit"));
                columnData.add(rs.getString("Producto"));
                columnData.add(rs.getString("IDPicture"));
            }
            RecordTable.addRow(columnData);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
        Logger.getLogger(program3.class.getName()).log(Level.SEVERE, null, ex);
    }
}
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
        jtxtID = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtValor = new javax.swing.JTextField();
        jtxtEmpresa = new javax.swing.JTextField();
        jtxtNit = new javax.swing.JTextField();
        jbtnEditar = new javax.swing.JButton();
        atrasbutton = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtxtProducto = new javax.swing.JTextField();
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

        jtxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIDActionPerformed(evt);
            }
        });

        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Valor", "Empresa", "Nit", "Producto", "IDPicture"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
                        .addGap(112, 112, 112)
                        .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jtxtID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtValor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jtxtProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrasbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtxtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jtxtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbtnSubir)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jtxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEditar)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnAgregar)
                    .addComponent(jbtnLimpiar))
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

    private void cargarDatos() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        String sql = "SELECT * FROM proveedor"; 
        pst = sqlConn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            Object[] row = {
                rs.getInt("id"), 
                rs.getString("Nombre"),
                rs.getString("Valor"),
                rs.getString("Empresa"),
                rs.getString("Nit"),
                rs.getString("Producto"),
                rs.getString("IDPicture")
    
            };
            model.addRow(row);
        }
    } catch (ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } finally {
        try {
            if (pst != null) {
                pst.close();
            }
            if (sqlConn != null) {
                sqlConn.close();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
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
                pst = sqlConn.prepareStatement("delete from proveedor where id =?");
                
                pst.setInt(1, id);
                pst.executeUpdate();
              JOptionPane.showMessageDialog(this,"Información actualizada");
              upDateDB();
              
            jtxtID.setText("");
            jtxtNombre.requestFocus();
            jtxtValor.setText("");
            jtxtEmpresa.setText("");
            jtxtNit.setText("");
            jtxtProducto.setText("");
            jtxtValor.setText("");
          
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
      DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
    int SelectedRows = jTable1.getSelectedRow();

    Object idProveedor = RecordTable.getValueAt(SelectedRows, 0);
    if (idProveedor != null) {
        jtxtID.setText(idProveedor.toString());
    } else {
        jtxtID.setText("");
    }

    Object nombre = RecordTable.getValueAt(SelectedRows, 1);
    if (nombre != null) {
        jtxtNombre.setText(nombre.toString());
    } else {
        jtxtNombre.setText("");
    }

    Object valorproveedor = RecordTable.getValueAt(SelectedRows, 2);
    if (valorproveedor != null) {
        jtxtValor.setText(valorproveedor.toString());
    } else {
        jtxtValor.setText("");
    }

    Object Empresaproveedor = RecordTable.getValueAt(SelectedRows, 3);
    if (Empresaproveedor != null) {
        jtxtEmpresa.setText(Empresaproveedor.toString());
    } else {
        jtxtEmpresa.setText("");
    }

    Object NitProveedor = RecordTable.getValueAt(SelectedRows, 4);
    if (NitProveedor != null) {
        jtxtNit.setText(NitProveedor.toString());
    } else {
        jtxtNit.setText("");
    }

    Object ProductoProveedor = RecordTable.getValueAt(SelectedRows, 5);
    if (ProductoProveedor != null) {
        jtxtProducto.setText(ProductoProveedor.toString());
    } else {
        jtxtProducto.setText("");
    }

    Object imagePath = RecordTable.getValueAt(SelectedRows, 6);
    if (imagePath != null && !imagePath.toString().isEmpty()) {
        ImageIcon imageIcon = new ImageIcon(imagePath.toString());
        lbl_photo.setIcon(imageIcon);
    } else {
        lbl_photo.setIcon(null);
    }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // Limpiar la información en los campos del formulario
        jtxtID.setText("");
        jtxtNombre.setText("");
        jtxtValor.setText("");
        jtxtEmpresa.setText("");
        jtxtNit.setText("");
        jtxtProducto.setText("");
        lbl_photo.setIcon(null);
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into proveedor (id,Nombre,Valor,Empresa,Nit,Producto,IDPicture)value(?,?,?,?,?,?,?)");  

            pst.setString(1, jtxtID.getText());
            pst.setString(2, jtxtNombre.getText());
            pst.setString(3, jtxtValor.getText());
            pst.setString(4, jtxtEmpresa.getText());
            pst.setString(5, jtxtNit.getText());
            pst.setString(6, jtxtProducto.getText());
            pst.setString(7, lbl_photo.getIcon().toString());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Se ha añadido exitosamente");
            upDateDB();

            jtxtID.setText("");
            jtxtNombre.setText("");
            jtxtValor.setText("");
            jtxtEmpresa.setText("");
            jtxtNit.setText("");
            jtxtProducto.setText("");
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

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
       DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
    int SelectedRows = jTable1.getSelectedRow();

    try {
        id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        // Cambiar 'agregar' por 'producto'
        pst = sqlConn.prepareStatement("UPDATE proveedor SET id=?, Nombre=?, Valor=?, Empresa=?, Nit=?, Producto=?, IDPicture=? WHERE id=?");
        
        pst.setString(1, jtxtID.getText());
        pst.setString(2, jtxtNombre.getText());
        pst.setString(3, jtxtValor.getText());
        pst.setString(4, jtxtEmpresa.getText());
        pst.setString(5, jtxtNit.getText());
        pst.setString(6, jtxtProducto.getText());
        String imagePath = null; 
        pst.setString(7, imagePath);
        pst.setInt(8, id);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Se ha actualizado correctamente");
        upDateDB();
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } finally {
        try {
            if (pst != null) {
                pst.close();    
            }
            if (sqlConn != null) {
                sqlConn.close();
            }
        } catch (SQLException ex) {              
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 

    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIDActionPerformed

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(214, 134, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
        lbl_photo.setIcon(icon);
            String path2 = path;
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
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnSubir;
    private javax.swing.JTextField jtxtEmpresa;
    private javax.swing.JTextField jtxtGRUPO;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtNit;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtProducto;
    private javax.swing.JTextField jtxtValor;
    private javax.swing.JLabel lbl_photo;
    // End of variables declaration//GEN-END:variables
}
