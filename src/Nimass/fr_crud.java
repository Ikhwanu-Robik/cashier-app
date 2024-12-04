package Nimass;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fr_crud extends javax.swing.JFrame {

    public fr_crud() {
        initComponents();
        setTitle("Nimas's Manage Admins");
        //center the window
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_transactions = new javax.swing.JLabel();
        btn_accounts = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_signout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_accounts = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_simpan = new javax.swing.JButton();
        cmb_id = new javax.swing.JComboBox<>();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 199, 53));

        btn_transactions.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_transactions.setForeground(new java.awt.Color(255, 255, 255));
        btn_transactions.setText("Transactions");
        btn_transactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_transactionsMouseClicked(evt);
            }
        });

        btn_accounts.setBackground(new java.awt.Color(238, 53, 57));
        btn_accounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_accountsMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Accounts");

        javax.swing.GroupLayout btn_accountsLayout = new javax.swing.GroupLayout(btn_accounts);
        btn_accounts.setLayout(btn_accountsLayout);
        btn_accountsLayout.setHorizontalGroup(
            btn_accountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_accountsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );
        btn_accountsLayout.setVerticalGroup(
            btn_accountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_accountsLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ayu Nias");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mbak_indomart.png"))); // NOI18N

        btn_signout.setBackground(new java.awt.Color(255, 0, 51));
        btn_signout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_signout.setForeground(new java.awt.Color(255, 255, 255));
        btn_signout.setText("Sign Out");
        btn_signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_accounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 105, Short.MAX_VALUE))
                            .addComponent(btn_transactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btn_signout)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btn_transactions)
                .addGap(36, 36, 36)
                .addComponent(btn_accounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_signout)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(209, 165, 53));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nimas's_logo_small.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 124, 191));
        jLabel6.setText("Admin List");

        table_accounts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table_accounts.setForeground(new java.awt.Color(38, 124, 191));
        table_accounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_accounts.setRowHeight(45);
        table_accounts.setRowMargin(5);
        jScrollPane1.setViewportView(table_accounts);
        if (table_accounts.getColumnModel().getColumnCount() > 0) {
            table_accounts.getColumnModel().getColumn(0).setPreferredWidth(40);
            table_accounts.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(847, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(38, 124, 191));

        txt_firstname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_firstname.setForeground(new java.awt.Color(38, 124, 191));
        txt_firstname.setText("Ayu");
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        txt_lastname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_lastname.setForeground(new java.awt.Color(38, 124, 191));
        txt_lastname.setText("Nias");
        txt_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastnameActionPerformed(evt);
            }
        });

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_email.setForeground(new java.awt.Color(38, 124, 191));
        txt_email.setText("ayunias@gmail");
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_password.setForeground(new java.awt.Color(38, 124, 191));
        txt_password.setText("jPasswordField1");

        btn_simpan.setBackground(new java.awt.Color(255, 204, 0));
        btn_simpan.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        cmb_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id" }));

        btn_delete.setBackground(new java.awt.Color(204, 0, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cmb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(654, 654, 654)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(cmb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(837, 837, 837))
        );

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastnameActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_accountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accountsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_accountsMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String id = null;
        DefaultTableModel dm = (DefaultTableModel) table_accounts.getModel();
        int[] table_ids = new int[dm.getRowCount()];

        if (cmb_id.getSelectedItem().toString() == "id" || cmb_id.getSelectedItem().toString() == "1") {
            id = "1";
        } else {
            id = cmb_id.getSelectedItem().toString();
        }

        String firstname = txt_firstname.getText();
        String lastname = txt_lastname.getText();
        String email = txt_email.getText();

        Boolean id_exist = false;
        for (int i = 0; i < dm.getRowCount(); i++) {
            if (id.equals(dm.getValueAt(i, 0).toString())) {
                id_exist = true;
            }
        }

        if (id_exist) {
            dm.setValueAt(id, Integer.parseInt(id) - 1, 0);
            dm.setValueAt(firstname + lastname, Integer.parseInt(id) - 1, 1);
            dm.setValueAt(email, Integer.parseInt(id) - 1, 2);
        } else {
            dm.addRow(new Object[]{
                id,
                firstname + " " + lastname,
                email
            });
        }

        String[] cmb_id_model = new String[dm.getRowCount() + 1];
        int idx = 0;
        for (int i = 0; i < dm.getRowCount(); i++) {
            cmb_id_model[i] = Integer.toString(i+1);
            idx = i;
        }
        //add the extra
        cmb_id_model[idx + 1] = Integer.toString(idx + 2);
        cmb_id.setModel(new javax.swing.DefaultComboBoxModel<>(cmb_id_model));
        txt_firstname.setText("");
        txt_lastname.setText("");
        txt_email.setText("");
        txt_password.setText("");
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int id;
        if (!cmb_id.getSelectedItem().toString().equals("id")) {
            id = Integer.parseInt(cmb_id.getSelectedItem().toString());
        } else {
            id = 0;
        }
        int isCertain = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete data no " + id, "DELETE", JOptionPane.YES_NO_OPTION);
        if (isCertain == 0) {
            DefaultTableModel model = (DefaultTableModel) table_accounts.getModel();

            for (int i = 0; i < table_accounts.getRowCount(); i++) {
                int table_id = Integer.parseInt(table_accounts.getValueAt(i, 0).toString());

                if (id == table_id) {
                    model.removeRow(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_transactionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transactionsMouseClicked
        this.dispose();
        new fr_transaksi().setVisible(true);
    }//GEN-LAST:event_btn_transactionsMouseClicked

    private void btn_signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signoutActionPerformed
        this.dispose();
        new fr_login().setVisible(true);
    }//GEN-LAST:event_btn_signoutActionPerformed

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
            java.util.logging.Logger.getLogger(fr_crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_accounts;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_signout;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel btn_transactions;
    private javax.swing.JComboBox<String> cmb_id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_accounts;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
