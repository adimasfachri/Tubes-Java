/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teater;

import java.sql.ResultSet;
import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adima
 */
public class Studio1_siang extends javax.swing.JFrame {
    
    koneksiDB x;

    /**
     * Creates new form Studio1_siang
     */
    public Studio1_siang() {
        try {
            initComponents();
            x = new koneksiDB();
            x.koneksi(); //panggil koneksi
            String q ="SELECT * FROM studio1_siang";
            x.pst=x.conn.prepareStatement(q);
            x.rs=x.pst.executeQuery();
            
            while(x.rs.next()){
                if(Studio1_siang_Kursi_A1.getText().equals(x.rs.getString(1))){
                    Studio1_siang_Kursi_A1.setEnabled(false);
                    System.out.println("Ini jalan");
                }
                if(Studio1_siang_Kursi_B2.getText().equals(x.rs.getString(1)))
                {
                    Studio1_siang_Kursi_B2.setEnabled(false);
                }
            }       } catch (SQLException ex) {
            Logger.getLogger(Studio1_siang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Studio1_siang_Screen = new javax.swing.JLabel();
        Studio1_siang_Book_Button = new javax.swing.JButton();
        Studio1_siang_Back_Button = new javax.swing.JButton();
        Studio1_siang_Kursi_A1 = new javax.swing.JCheckBox();
        Studio1_siang_Kursi_B2 = new javax.swing.JCheckBox();
        label_siang_TotalHarga = new javax.swing.JLabel();
        Studio1_siang_Screen_Film = new javax.swing.JLabel();
        Studio1_siang_NamaStudio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Studio1_siang_Screen.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Studio1_siang_Screen.setText("SCREEN");

        Studio1_siang_Book_Button.setText("Book");
        Studio1_siang_Book_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Studio1_siang_Book_ButtonActionPerformed(evt);
            }
        });

        Studio1_siang_Back_Button.setText("Back");
        Studio1_siang_Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Studio1_siang_Back_ButtonActionPerformed(evt);
            }
        });

        Studio1_siang_Kursi_A1.setText("A1");
        Studio1_siang_Kursi_A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Studio1_siang_Kursi_A1ActionPerformed(evt);
            }
        });

        Studio1_siang_Kursi_B2.setText("B2");
        Studio1_siang_Kursi_B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Studio1_siang_Kursi_B2ActionPerformed(evt);
            }
        });

        label_siang_TotalHarga.setText("Total harga : ");

        Studio1_siang_Screen_Film.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Studio1_siang_Screen_Film.setText("Film : Frozen");

        Studio1_siang_NamaStudio.setText("Studio 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(Studio1_siang_Screen)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Studio1_siang_Kursi_B2)
                    .addComponent(Studio1_siang_Kursi_A1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_siang_TotalHarga)
                            .addComponent(Studio1_siang_Back_Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Studio1_siang_Book_Button)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Studio1_siang_Screen_Film)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Studio1_siang_NamaStudio)
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Studio1_siang_Screen)
                .addGap(43, 43, 43)
                .addComponent(Studio1_siang_Kursi_A1)
                .addGap(18, 18, 18)
                .addComponent(Studio1_siang_Kursi_B2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Studio1_siang_Screen_Film)
                    .addComponent(Studio1_siang_NamaStudio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_siang_TotalHarga)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Studio1_siang_Book_Button)
                    .addComponent(Studio1_siang_Back_Button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Studio1_siang_Book_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Studio1_siang_Book_ButtonActionPerformed
        // TODO add your handling code here:

        String film_siang, studio_siang, kodeKursi_siang="", sql1, sql2;
        film_siang = (String) Studio1_siang_Screen_Film.getText();
        studio_siang = (String) Studio1_siang_NamaStudio.getText();
        if(Studio1_siang_Kursi_A1.isSelected())
        {
            kodeKursi_siang=Studio1_siang_Kursi_A1.getText();
            sql1 = "INSERT INTO studio1_siang VALUES ('"+kodeKursi_siang+"', '"+film_siang+"', '"+studio_siang+"')";

            try
            {
                x.st = x.conn.createStatement();
                x.st.execute(sql1);

            }
            catch (SQLException e){
                System.out.print(e);
                JOptionPane.showMessageDialog(null, "sudah dibooking sebelumnya");
                return;
            }

        }

        if(Studio1_siang_Kursi_B2.isSelected())
        {
            kodeKursi_siang=Studio1_siang_Kursi_B2.getText();
            sql1 = "INSERT INTO studio1_siang VALUES ('"+kodeKursi_siang+"', '"+film_siang+"', '"+studio_siang+"')";

            try
            {
                x.st = x.conn.createStatement();
                x.st.execute(sql1);

            }
            catch (SQLException e){
                System.out.print(e);
                JOptionPane.showMessageDialog(null, "sudah dibooking sebelumnya");
                return;
            }

        }

        JOptionPane.showMessageDialog(null, "Berhasil di pesan, Terima kasih :)");
        sql2 = "delete from inputan where kodeKursi1_siang='"+kodeKursi_siang+"'";
        try
        {
            x.st = x.conn.createStatement();
            x.st.execute(sql2);
        }
        catch (SQLException e){
        }
        new menuUtam().setVisible(true);
        dispose();

    }//GEN-LAST:event_Studio1_siang_Book_ButtonActionPerformed

    private void Studio1_siang_Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Studio1_siang_Back_ButtonActionPerformed
        // TODO add your handling code here:
        new holywood_movie().setVisible(true);
        dispose();
    }//GEN-LAST:event_Studio1_siang_Back_ButtonActionPerformed
int harga=0;
    private void Studio1_siang_Kursi_A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Studio1_siang_Kursi_A1ActionPerformed

        // TODO add your handling code here:

        if(Studio1_siang_Kursi_A1.isSelected())
        {
            harga = harga+20000;
        }
        else {
            harga=harga-20000;
        }
        label_siang_TotalHarga.setText("total harga : Rp."+String.valueOf(harga));
    }//GEN-LAST:event_Studio1_siang_Kursi_A1ActionPerformed

    private void Studio1_siang_Kursi_B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Studio1_siang_Kursi_B2ActionPerformed
        // TODO add your handling code here:
        if(Studio1_siang_Kursi_B2.isSelected())
        {
            harga = harga+20000;
        }
        else {
            harga= harga-20000;
        }
        label_siang_TotalHarga.setText("total harga : Rp."+String.valueOf(harga));
    }//GEN-LAST:event_Studio1_siang_Kursi_B2ActionPerformed

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
            java.util.logging.Logger.getLogger(Studio1_siang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studio1_siang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studio1_siang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studio1_siang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studio1_siang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Studio1_siang_Back_Button;
    private javax.swing.JButton Studio1_siang_Book_Button;
    private javax.swing.JCheckBox Studio1_siang_Kursi_A1;
    private javax.swing.JCheckBox Studio1_siang_Kursi_B2;
    private javax.swing.JLabel Studio1_siang_NamaStudio;
    private javax.swing.JLabel Studio1_siang_Screen;
    private javax.swing.JLabel Studio1_siang_Screen_Film;
    private javax.swing.JLabel label_siang_TotalHarga;
    // End of variables declaration//GEN-END:variables
}
