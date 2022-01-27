
package com.kruwell.program;

import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Supiannor
 */
public class Mahasiswa extends javax.swing.JFrame {
    
    private void kosongkan_form(){
        txtnim.setEditable(true);
        txtnim.setText(null);
        txtnama.setText(null);
        cbjurusan.setSelectedItem(this);
        txtalamat.setText(null);
        txtemail.setText(null);
        txttelp.setText(null);
    }
    
    private void tampilkan_data(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("NIM");
        model.addColumn("Nama Mahasiswa");
        model.addColumn("Jurusan");
        model.addColumn("Alamat");
        model.addColumn("Email");
        model.addColumn("No. Telpon");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM mahasiswa";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)}); 
            }
            tabelMahasiswa.setModel(model);            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    /**
     * Creates new form Mahasiswa
     */
    public Mahasiswa() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        cbjurusan = new javax.swing.JComboBox<>();
        txtemail = new javax.swing.JTextField();
        txttelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();
        tbTambah = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbBatal = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Data Mahasiswa Politeknik Hasnur");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA MAHASISWA POLITEKNIK HASNUR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 26, -1, -1));

        jLabel2.setText("NIM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 96, -1, -1));

        jLabel3.setText("Nama Mahasiswa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 127, -1, -1));

        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 158, -1, -1));

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 186, -1, -1));

        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 217, -1, -1));

        jLabel7.setText("No. Telpon");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 251, -1, -1));
        getContentPane().add(txtnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 93, 144, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 124, 232, -1));
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 186, 324, -1));

        cbjurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Teknik Otomotif", "Budidaya Tanaman Pertumbuhan" }));
        cbjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                cbjurusanActionPerformed(evt);
            }
        });
        getContentPane().add(cbjurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 155, 185, -1));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 217, 237, -1));
        getContentPane().add(txttelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 248, 157, -1));

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMahasiswa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 351, 588, 136));

        tbTambah.setText("Tambah Data");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });
        getContentPane().add(tbTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 296, -1, -1));

        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tbSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 296, -1, -1));

        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });
        getContentPane().add(tbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 296, -1, -1));

        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });
        getContentPane().add(tbHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 296, -1, -1));

        tbBatal.setText("Batal");
        tbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBatalActionPerformed(evt);
            }
        });
        getContentPane().add(tbBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 296, -1, -1));

        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 296, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbTambahActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO mahasiswa VALUES ('"+txtnim.getText()+"','"+txtnama.getText()+"','"+cbjurusan.getSelectedItem()+"','"+txtalamat.getText()+"','"+txtemail.getText()+"','"+txttelp.getText()+"')";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil..");
            tampilkan_data();
            kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswanMouseClicked
        // TODO add your handling code here:
        int baris = tabelMahasiswa.rowAtPoint(evt.getPoint());
        String nim = tabelMahasiswa.getValueAt(baris, 1).toString();
        txtnim.setText(nim);
        
        String nama = tabelMahasiswa.getValueAt(baris, 2).toString();
        txtnama.setText(nama);
        
        String jab = tabelMahasiswa.getValueAt(baris, 3).toString();
        cbjurusan.setSelectedItem(jab);
        
        String alamat = tabelMahasiswa.getValueAt(baris, 4).toString();
        txtalamat.setText(alamat);
        
        String email = tabelMahasiswa.getValueAt(baris, 5).toString();
        txtemail.setText(email);
        
        String telp = tabelMahasiswa.getValueAt(baris, 6).toString();
        txttelp.setText(telp);
        
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE mahasiswa SET nim='"+txtnim.getText()+"',nama='"+txtnama.getText()+"',jurusan='"+cbjurusan.getSelectedItem()+"',alamat='"+txtalamat.getText()+"',email='"+txtemail.getText()+"',no_telp='"+txttelp.getText()+"' WHERE nim = '"+txtnim.getText()+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil...");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM mahasiswa WHERE nim='"+txtnim.getText()+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil...");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();        
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbBatalActionPerformed

    private void cbjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjurusanActionPerformed

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
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbjurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JButton tbBatal;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbTambah;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables
}
