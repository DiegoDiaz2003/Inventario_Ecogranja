/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package introduccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class program5 extends javax.swing.JFrame {
        
      private static final String username = "root";
        private static final String password = "DiegoDiaz12";
        private static final String dataConn = "jdbc:mysql://localhost:3306/connector";
    
        Connection sqlConn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int q, i, id, deleteItem;
        String path2 = null; 
    
    public program5() {
        initComponents();
        cargarDatos();
    }
    
public void upDateDB() {
    try (Connection sqlConn = DriverManager.getConnection(dataConn, username, password);
         PreparedStatement pst = sqlConn.prepareStatement("SELECT * FROM venta");
         ResultSet rs = pst.executeQuery()) {

        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount();

        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        RecordTable.setRowCount(0);

        while (rs.next()) {
            Vector<Object> columnData = new Vector<>();

            for (i = 1; i <= q; i++) {
                columnData.add(rs.getString("ID"));
                columnData.add(rs.getString("IDProducto"));
                columnData.add(rs.getString("Valor"));
            }
            RecordTable.addRow(columnData);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
        Logger.getLogger(program3.class.getName()).log(Level.SEVERE, null, ex);
    }
}



    
    //========================================END FUNCTION========================================================================
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atrasbutton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        atrasbutton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        VALOR = new javax.swing.JTextField();
        ID_PRODUCTO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jbtnAgregar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnPDF = new javax.swing.JButton();

        atrasbutton.setBackground(new java.awt.Color(153, 153, 255));
        atrasbutton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));

        atrasbutton1.setBackground(new java.awt.Color(153, 153, 255));
        atrasbutton1.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Escritorio\\introduccion\\Imagenes\\flecha_atras-removebg-preview.png")); // NOI18N
        atrasbutton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        atrasbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasbutton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("AGREGAR VENTA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ID_PRODUCTO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("VALOR");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "ID_PRODUCTO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

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

        VALOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VALORActionPerformed(evt);
            }
        });

        ID_PRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_PRODUCTOActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ID");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
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

        jbtnLimpiar.setBackground(new java.awt.Color(153, 255, 255));
        jbtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLimpiar.setText("LIMPIAR");
        jbtnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnPDF.setBackground(new java.awt.Color(255, 153, 255));
        jbtnPDF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnPDF.setText("PDF");
        jbtnPDF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrasbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(jLabel2))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(61, 61, 61))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel3)
                                .addGap(137, 137, 137)
                                .addComponent(jLabel4))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(ID_PRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jbtnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(atrasbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_PRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAgregar)
                    .addComponent(jbtnEditar)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnPDF))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
private void cargarDatos() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        String sql = "SELECT * FROM venta"; 
        pst = sqlConn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            Object[] row = {
                rs.getInt("ID"), 
                rs.getString("IDProducto"),
                rs.getString("Valor"),
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

    private void atrasbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasbutton1ActionPerformed
        program2 menu = new program2 ();
        menu.show();
        dispose();
    }//GEN-LAST:event_atrasbutton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
    int SelectedRows = jTable1.getSelectedRow();

    if (SelectedRows != -1) {
        Object id = RecordTable.getValueAt(SelectedRows, 0);
        ID.setText(id != null ? id.toString() : "");

        Object producto = RecordTable.getValueAt(SelectedRows, 1);
        ID_PRODUCTO.setText(producto != null ? producto.toString() : "");

        Object valor = RecordTable.getValueAt(SelectedRows, 2);
        VALOR.setText(valor != null ? valor.toString() : "");
    }


    }//GEN-LAST:event_jTable1MouseClicked

    private void VALORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VALORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VALORActionPerformed

    private void ID_PRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_PRODUCTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_PRODUCTOActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
     
        //========================================= FUNCION AGREGAR =========================================================================
        try{
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into venta (ID,IDProducto,Valor)value(?,?,?)");  
            //valor
            pst.setString(1, ID.getText());
            pst.setString(2, ID_PRODUCTO.getText());
            pst.setString(3, VALOR.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Se ha añadido exitosamente");
            upDateDB();
            
            ID.setText("");
            ID_PRODUCTO.setText("");
            VALOR.setText("");             
                    
        }
        
       catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        
        
        //=========================================END FUNCION AGREGAR=========================================================================

        //=========================================END FUNCION AGREGAR=========================================================================
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
    DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
    int SelectedRows = jTable1.getSelectedRow();

    try {
        id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        pst = sqlConn.prepareStatement("UPDATE venta SET ID=?, IDProducto=?, Valor=? WHERE id=?");

        pst.setString(1, ID.getText());
        pst.setString(2, ID_PRODUCTO.getText());
        pst.setString(3, VALOR.getText());
        pst.setInt(4, id);

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
                pst = sqlConn.prepareStatement("delete from venta where id =?");

                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Información actualizada");
                upDateDB();
                       
                ID.setText("");
                ID.requestFocus();
                ID_PRODUCTO.setText("");
                ID_PRODUCTO.requestFocus();
                VALOR.setText("");
            }
        }

        catch (ClassNotFoundException ex){

            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (SQLException ex){
            System.err.println(ex);
        }
        //============================================END FUNCION ELIMINAR=====================================================================
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        //===============================================LIMPIAR ACTION=========================================================================

        ID.setText("");
        ID_PRODUCTO.setText("");
        VALOR.setText("");

        //===============================================END LIMPIAR ACTION=========================================================================
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    
    
    
        
    private void jbtnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPDFActionPerformed
        
        
        
        
        
        
    }//GEN-LAST:event_jbtnPDFActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField ID_PRODUCTO;
    private javax.swing.JTextField VALOR;
    private javax.swing.JButton atrasbutton;
    private javax.swing.JButton atrasbutton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnPDF;
    // End of variables declaration//GEN-END:variables

}



