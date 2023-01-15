
package InfoWisata.data;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FrameWisata extends javax.swing.JFrame {

    public FrameWisata() {
        initComponents();
        
    }
 



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableWisata = new javax.swing.JTable();
        LabelCari = new javax.swing.JLabel();
        EditCari = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        LabelId = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        LabelKota = new javax.swing.JLabel();
        LabelHarga = new javax.swing.JLabel();
        LabelBuka = new javax.swing.JLabel();
        LabelKet = new javax.swing.JLabel();
        EditId = new javax.swing.JTextField();
        EditNama = new javax.swing.JTextField();
        EditKota = new javax.swing.JTextField();
        EditHarga = new javax.swing.JTextField();
        EditJadwal = new javax.swing.JTextField();
        EditKet = new javax.swing.JTextField();
        ButtonSimpan = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();
        ButtonBatal = new javax.swing.JButton();
        ButtonCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("FrameWisata"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA OBJEK WISATA INDONESIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel1)
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 40));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        TableWisata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TableWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TableWisata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        TableWisata.setGridColor(new java.awt.Color(255, 51, 51));
        TableWisata.setName("readData"); // NOI18N
        TableWisata.setShowVerticalLines(false);
        TableWisata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableWisataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableWisata);
        if (TableWisata.getColumnModel().getColumnCount() > 0) {
            TableWisata.getColumnModel().getColumn(5).setHeaderValue("Title 6");
        }

        LabelCari.setForeground(new java.awt.Color(255, 255, 255));
        LabelCari.setText("CARI");

        EditCari.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditCari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EditCari.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EditCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EditCariKeyPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        LabelId.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LabelId.setText("ID WISATA");
        LabelId.setOpaque(true);

        LabelNama.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LabelNama.setText("NAMA WISATA");
        LabelNama.setOpaque(true);

        LabelKota.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LabelKota.setText("KOTA");
        LabelKota.setOpaque(true);

        LabelHarga.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LabelHarga.setText("HARGA TIKET");
        LabelHarga.setOpaque(true);

        LabelBuka.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LabelBuka.setText("TANGGAL");
        LabelBuka.setOpaque(true);

        LabelKet.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LabelKet.setText("KETERANGAN");
        LabelKet.setOpaque(true);

        EditId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EditId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EditNama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EditNama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EditKota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EditKota.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditKota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EditHarga.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EditHarga.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EditJadwal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EditJadwal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditJadwal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EditKet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EditKet.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EditKet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ButtonSimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonSimpan.setText("SIMPAN");
        ButtonSimpan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanActionPerformed(evt);
            }
        });

        ButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonUpdate.setText("UPDATE");
        ButtonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });

        ButtonHapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonHapus.setText("HAPUS");
        ButtonHapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        ButtonBatal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonBatal.setText("BATAL");
        ButtonBatal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelKota)
                                        .addComponent(LabelId))
                                    .addGap(43, 43, 43))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(LabelNama)
                                    .addGap(31, 31, 31)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(LabelKet)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditHarga)
                            .addComponent(EditJadwal)
                            .addComponent(EditKet)
                            .addComponent(EditNama)
                            .addComponent(EditKota)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(ButtonBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(EditId)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelBuka)
                            .addComponent(LabelHarga))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditNama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditKota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelKota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBuka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditKet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelKet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonUpdate)
                    .addComponent(ButtonHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSimpan)
                    .addComponent(ButtonBatal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonCetak.setText("CETAK");
        ButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(LabelCari)
                        .addGap(18, 18, 18)
                        .addComponent(EditCari, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCetak)
                        .addGap(66, 66, 66))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCari)
                    .addComponent(EditCari, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 920, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String koneksi="jdbc:mysql://localhost/info_wisata";
    String user ="root";
    String pass="";
    Connection connection;
    Statement statement;
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try 
        {
            
        Class.forName("com.mysql.jdbc.Driver");
        koneksi="jdbc:mysql://localhost/info_wisata";
        connection=(Connection) DriverManager.getConnection(koneksi,user,pass);
        statement=(Statement) connection.createStatement();
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
       }
        catch (Exception DBException)
        {
            JOptionPane.showMessageDialog(this,"Koneksi gagal","Error",JOptionPane.ERROR_MESSAGE);
            System.err.println("Error" +DBException);
        }
        bersih();
        ButtonUpdate.setEnabled(false);
        ButtonHapus.setEnabled(false);
        EditNama.requestFocus();
        
    }//GEN-LAST:event_formWindowOpened

    private void ButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanActionPerformed
        try {
            String sql;
            {
                sql= "insert into objek_wisata values('";
                sql+= EditId.getText()+"','";
                sql+= EditNama.getText()+"','";
                sql+= EditKota.getText()+"','";
                sql+= EditHarga.getText()+"','";
                sql+= EditJadwal.getText()+"','";
                sql+= EditKet.getText()+"')";
                
            }
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Berhasil meyimpan data","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception DBException) {
            JOptionPane.showMessageDialog(this,"Gagal meyimpan data","Error",JOptionPane.ERROR_MESSAGE);
            System.err.println("Error:" +DBException);
        }
        bersih();
        EditId.requestFocus();
    }//GEN-LAST:event_ButtonSimpanActionPerformed

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
        try {
            String sql;
            {
            sql="update objek_wisata set nama_wisata='";
            sql+= EditNama.getText()+"',kota='";
            sql+= EditKota.getText()+"',harga_tiket='";
            sql+= EditHarga.getText()+"',tanggal='";
            sql+= EditJadwal.getText()+"',keterangan='";
            sql+= EditKet.getText()+"'";
            sql+= "where id_wisata='" + EditId.getText()+"'";
            
        }
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(this,"Data berhasil di ubah","Informasi",JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception DBException){
            JOptionPane.showMessageDialog(this, "Gagal mengubah data","Error",JOptionPane.ERROR_MESSAGE);
            System.err.println("Error:" +DBException);
        }
        bersih();
        EditId.setEditable(true);
        EditNama.requestFocus();
        ButtonSimpan.setEnabled(false);
        ButtonUpdate.setEnabled(false);
        ButtonHapus.setEnabled(false);
        
        
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void TableWisataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableWisataMouseClicked
        EditId.setText(TableWisata.getValueAt(TableWisata.getSelectedRow(), 0).toString());
        EditNama.setText(TableWisata.getValueAt(TableWisata.getSelectedRow(), 1).toString());
        EditKota.setText(TableWisata.getValueAt(TableWisata.getSelectedRow(), 2).toString());
        EditHarga.setText(TableWisata.getValueAt(TableWisata.getSelectedRow(), 3).toString());
        EditJadwal.setText(TableWisata.getValueAt(TableWisata.getSelectedRow(), 4).toString());
        EditKet.setText(TableWisata.getValueAt(TableWisata.getSelectedRow(), 5).toString());
        ButtonUpdate.setEnabled(true);
        ButtonHapus.setEnabled(true);
        EditId.setEditable(false);
        ButtonSimpan.setEnabled(false);
        
    }//GEN-LAST:event_TableWisataMouseClicked

    private void EditCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EditCariKeyPressed
        DefaultTableModel tabel = new DefaultTableModel();
               tabel.addColumn("Id Wisata");
               tabel.addColumn("Nama Wisata");
               tabel.addColumn("Kota");
               tabel.addColumn("Harga Tiket");
               tabel.addColumn("Tanggal");
               tabel.addColumn("Keterangan");
               
        try {
            String sql = "select * from objek_wisata where id_wisata like '%" + EditCari.getText() + "%'" + "or nama_wisata like '%" + EditCari.getText() + "%'";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
            tabel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6)
                                   });
        } 
        TableWisata.setModel(tabel);
        }
    catch (Exception DBException) 
    {
        System.err.println("Error =" +DBException);
    }
    }//GEN-LAST:event_EditCariKeyPressed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        try {
            int reply = JOptionPane.showConfirmDialog(this,
                    "Apakah anda yakin ingin menghapus data ini?",
                    "Konfirmasi",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply==JOptionPane.YES_OPTION){
                String sql="DELETE FROM objek_wisata WHERE id_wisata='" + EditId.getText()+"'";
                statement.executeUpdate(sql);
                
            }
        }catch(Exception DBException){
            JOptionPane.showMessageDialog(this,"Gagal menghapus data","Error",JOptionPane.ERROR_MESSAGE);
            System.err.println("Error:" +DBException);
        }
        bersih();
        ButtonUpdate.setEnabled(false);
        ButtonHapus.setEnabled(false);
        ButtonSimpan.setEnabled(true);
        EditId.setEditable(true);
        EditId.requestFocus();
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void ButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBatalActionPerformed
        dispose();
    }//GEN-LAST:event_ButtonBatalActionPerformed

    private void ButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCetakActionPerformed
        String jdbc_driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/info_wisata";
        String user = "root";
        String pass = "";
        File reportFile = new File(".");
        String dirr = "";
        
        try {
            Class.forName(jdbc_driver);
            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
            Statement stt = conn.createStatement();
            String sql = "SELECT * FROM objek_wisata";
            dirr = reportFile.getCanonicalPath() + "/src/InfoWisata/data/";
            JasperDesign design = JRXmlLoader.load(dirr + "reportObjekWisata.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(design);
            ResultSet rs = stt.executeQuery(sql);
            JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap(), rsDataSource);
            JasperViewer.viewReport(jp);
        } catch (ClassNotFoundException | SQLException | IOException | JRException ex) {
            JOptionPane.showMessageDialog(this,"Gagal mencetak data","Error",JOptionPane.ERROR_MESSAGE);
           
        } 
        
    }//GEN-LAST:event_ButtonCetakActionPerformed

    
    private void bersih(){
        EditId.setText("");
        EditNama.setText("");
        EditKota.setText("");
        EditHarga.setText("");
        EditJadwal.setText("");
        EditKet.setText("");
        
        try{
            String sql="SELECT * FROM objek_wisata ORDER BY id_wisata ASC";
            ResultSet rs=statement.executeQuery(sql);
            final String[] header={"Id Wisata","Nama Wisata","Kota","Harga Tiket","Tanggal","Keterangan"};
            rs.last();
            int n=rs.getRow();
            Object[][] data=new Object[n][6];
            int p=0;
            rs.beforeFirst();
            while (rs.next()){
            data [p][0]=rs.getString(1);
            data [p][1]=rs.getString(2);
            data [p][2]=rs.getString(3);
            data [p][3]=rs.getString(4);
            data [p][4]=rs.getString(5);
            data [p][5]=rs.getString(6);

                p++;
                
            }
            TableWisata.setModel(new javax.swing.table.DefaultTableModel(data,header));
            TableWisata.setAlignmentX(CENTER_ALIGNMENT);
           
            }catch (Exception DBException) {
                System.err.println("Error=" +DBException);
            }
            
        
        
    }
    
    
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
            java.util.logging.Logger.getLogger(FrameWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameWisata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBatal;
    private javax.swing.JButton ButtonCetak;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JTextField EditCari;
    private javax.swing.JTextField EditHarga;
    private javax.swing.JTextField EditId;
    private javax.swing.JTextField EditJadwal;
    private javax.swing.JTextField EditKet;
    private javax.swing.JTextField EditKota;
    private javax.swing.JTextField EditNama;
    private javax.swing.JLabel LabelBuka;
    private javax.swing.JLabel LabelCari;
    private javax.swing.JLabel LabelHarga;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelKet;
    private javax.swing.JLabel LabelKota;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JTable TableWisata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
