/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X455LA
 */
public class TabelPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private DefaultTableModel model;
    public TabelPelanggan() {
        initComponents();
       //TPelanggan.setModel(model);
    }
    public void InitTable(){
        model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("No.Telp");
        model.addColumn("Kota Asal");
        TPelanggan.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PDasar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TPelanggan = new javax.swing.JTable();
        PHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFNama = new javax.swing.JTextField();
        TFNotelp = new javax.swing.JTextField();
        CBKotaAsal = new javax.swing.JComboBox<>();
        PGrid = new javax.swing.JPanel();
        BTambah = new javax.swing.JButton();
        BSimpan = new javax.swing.JButton();
        BUpdate = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.9F);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PDasar.setBackground(new java.awt.Color(204, 204, 204));

        TPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "No.Telp", "Kota Asal"
            }
        ));
        TPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TPelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TPelanggan);

        PHeader.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Tabel Pelanggan");

        javax.swing.GroupLayout PHeaderLayout = new javax.swing.GroupLayout(PHeader);
        PHeader.setLayout(PHeaderLayout);
        PHeaderLayout.setHorizontalGroup(
            PHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PHeaderLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PHeaderLayout.setVerticalGroup(
            PHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setText("Nama");

        jLabel3.setText("No. Telepon");

        jLabel4.setText("Kota Asal");

        TFNama.setText("jTextField1");
        TFNama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFNamaCaretUpdate(evt);
            }
        });
        TFNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaActionPerformed(evt);
            }
        });
        TFNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNamaKeyTyped(evt);
            }
        });

        TFNotelp.setText("jTextField2");
        TFNotelp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFNotelpCaretUpdate(evt);
            }
        });
        TFNotelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNotelpKeyTyped(evt);
            }
        });

        CBKotaAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih kota-", "Samarinda", "BalikPapan", "Bontang", "Berau", "Tarakan", " " }));
        CBKotaAsal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBKotaAsalItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBKotaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFNotelp))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFNotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBKotaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PGrid.setBackground(new java.awt.Color(51, 51, 51));
        PGrid.setLayout(new java.awt.GridLayout(1, 0));

        BTambah.setText("+Tambah");
        BTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTambahMouseClicked(evt);
            }
        });
        PGrid.add(BTambah);

        BSimpan.setText("Simpan");
        BSimpan.setEnabled(false);
        BSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BSimpanMouseClicked(evt);
            }
        });
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });
        PGrid.add(BSimpan);

        BUpdate.setText("Update");
        BUpdate.setEnabled(false);
        BUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUpdateActionPerformed(evt);
            }
        });
        PGrid.add(BUpdate);

        BHapus.setText("Hapus");
        BHapus.setEnabled(false);
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });
        PGrid.add(BHapus);

        javax.swing.GroupLayout PDasarLayout = new javax.swing.GroupLayout(PDasar);
        PDasar.setLayout(PDasarLayout);
        PDasarLayout.setHorizontalGroup(
            PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PDasarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(PDasarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PDasarLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PDasarLayout.setVerticalGroup(
            PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDasarLayout.createSequentialGroup()
                .addComponent(PHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(PGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        BKeluar.setText("X");
        BKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BKeluarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BKeluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BKeluarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PDasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BKeluar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BKeluar)
                .addGap(4, 4, 4)
                .addComponent(PDasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        // TODO add your handling code here:
        Object[] data = new Object[3];
        data[0] = TFNama.getText();
        data[1] = TFNotelp.getText();
        data[2] = CBKotaAsal.getSelectedItem().toString();
        model.addRow(data);
        TFNama.setText("");
        TFNotelp.setText("");
        CBKotaAsal.setSelectedIndex(0);
      
    }//GEN-LAST:event_BSimpanActionPerformed
    
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
    }//GEN-LAST:event_formComponentShown

    private void TPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPelangganMouseClicked
        // TODO add your handling code here:
        int baris = TPelanggan.getSelectedRow();
        
        String nama_edit = TPelanggan.getValueAt(baris, 0).toString();
        String notelp_edit = TPelanggan.getValueAt(baris, 1).toString();
        String kotaasal_edit = TPelanggan.getValueAt(baris, 2).toString();
        
        
        TFNama.setText(nama_edit);
        TFNotelp.setText(notelp_edit);
        CBKotaAsal.setSelectedItem(kotaasal_edit);
        
        BUpdate.setEnabled(true);
        BHapus.setEnabled(true);
    }//GEN-LAST:event_TPelangganMouseClicked

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        // TODO add your handling code here:     
        int pilihan = JOptionPane.showConfirmDialog(this,"Apa anda yakin ingin Menghapus Data "+TFNama.getText(),"Keluar???",JOptionPane.YES_NO_OPTION);
        if (pilihan==0) {
            int baris = TPelanggan.getSelectedRow();
        model.removeRow(baris);
        TFNama.setText("");
        TFNotelp.setText("");
        CBKotaAsal.setSelectedIndex(0);
        }
    }//GEN-LAST:event_BHapusActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        TFNama.setText("");
        TFNotelp.setText("");
        CBKotaAsal.setSelectedIndex(0);
        TFNama.setEditable(false);
        TFNotelp.setEditable(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void BUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUpdateActionPerformed
        // TODO add your handling code here:
        int baris = TPelanggan.getSelectedRow();
        TPelanggan.setValueAt(TFNama.getText(), baris, 0);
        TPelanggan.setValueAt(TFNotelp.getText(), baris, 1);
        TPelanggan.setValueAt(CBKotaAsal.getSelectedItem(), baris, 2);
        TFNama.setText("");
        TFNotelp.setText("");
        CBKotaAsal.setSelectedIndex(0);
    }//GEN-LAST:event_BUpdateActionPerformed

    private void BKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKeluarMouseClicked
        // TODO add your handling code here:
        int pilihan = JOptionPane.showConfirmDialog(this,"Apa anda yakin ingin Keluar","Keluar???",JOptionPane.YES_NO_OPTION);
        if (pilihan==0) {
            System.exit(0);
        }
    
    }//GEN-LAST:event_BKeluarMouseClicked

    private void TFNamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFNamaCaretUpdate
        if (TFNama.getText().equals(" ")) {
            BSimpan.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Nama Tidak Boleh Kosong");
            TFNama.requestFocus();
        }
    }//GEN-LAST:event_TFNamaCaretUpdate

    private void BKeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKeluarMouseEntered
        // TODO add your handling code here:
        BKeluar.setBackground(Color.red);
        BKeluar.setForeground(Color.white);
        
    }//GEN-LAST:event_BKeluarMouseEntered

    private void BKeluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKeluarMouseExited
        // TODO add your handling code here:
        BKeluar.setBackground(Color.white);
        BKeluar.setForeground(Color.red);
    }//GEN-LAST:event_BKeluarMouseExited

    private void BTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTambahMouseClicked
        // TODO add your handling code here:
        TFNama.setText("");
        TFNotelp.setText("");
        CBKotaAsal.setSelectedIndex(0);
        TFNama.setEditable(true);
        TFNotelp.setEditable(true);
        TFNama.requestFocus();
        //BSimpan.setEnabled(true);
    }//GEN-LAST:event_BTambahMouseClicked

    private void BSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BSimpanMouseClicked
        // TODO add your handling code here:
        /*TFNama.setText("");
        TFNotelp.setText("");*/
    }//GEN-LAST:event_BSimpanMouseClicked

    private void CBKotaAsalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBKotaAsalItemStateChanged
        // TODO add your handling code here:
        if (CBKotaAsal.getSelectedIndex() == ItemEvent.SELECTED) {
            BSimpan.setEnabled(true);
        }
        /*
        else if (CBKotaAsal.getSelectedIndex() == ItemEvent.DESELECTED){
             BSimpan.setEnabled(false);
        }*/
        
    }//GEN-LAST:event_CBKotaAsalItemStateChanged

    private void TFNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNamaKeyTyped
        // TODO add your handling code here:
        
        if (TFNama.getText().matches("[0-9]")) {
            JOptionPane.showMessageDialog(this, "Masukkan Inputan Berupa Huruf");
            TFNama.setText("");
        }
    }//GEN-LAST:event_TFNamaKeyTyped

    private void TFNotelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNotelpKeyTyped
        // TODO add your handling code here:
        if (TFNotelp.getText().matches("[a-z]")) {
            JOptionPane.showMessageDialog(this, "Masukkan Inputan Berupa Angka");
            TFNotelp.setText("");
        }
    }//GEN-LAST:event_TFNotelpKeyTyped

    private void TFNotelpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFNotelpCaretUpdate
        // TODO add your handling code here:
        if (TFNotelp.getText().equals(" ")) {
            JOptionPane.showMessageDialog(this, "isi no telepon");
            TFNotelp.setText("");
            TFNotelp.requestFocus();
        }
    }//GEN-LAST:event_TFNotelpCaretUpdate

    private void TFNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaActionPerformed

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
            java.util.logging.Logger.getLogger(TabelPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BKeluar;
    private javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    private javax.swing.JButton BUpdate;
    private javax.swing.JComboBox<String> CBKotaAsal;
    private javax.swing.JPanel PDasar;
    private javax.swing.JPanel PGrid;
    private javax.swing.JPanel PHeader;
    private javax.swing.JTextField TFNama;
    private javax.swing.JTextField TFNotelp;
    private javax.swing.JTable TPelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
