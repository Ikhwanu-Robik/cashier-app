package Nimass;

import javax.swing.JOptionPane;

public class fr_signup extends javax.swing.JFrame {
    public static String email;
    public static String password;

    public fr_signup() {
        initComponents();
        
        //add underline to login button
        String login_link = "<html>or <u>Log In</u></html>";
        btn_login.setText(login_link);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_yellow = new javax.swing.JPanel();
        container_blue = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_emailReg = new javax.swing.JTextField();
        txt_passwordReg = new javax.swing.JPasswordField();
        btn_signup = new javax.swing.JButton();
        btn_login = new javax.swing.JLabel();
        container_white = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_yellow.setBackground(new java.awt.Color(249, 199, 53));

        container_blue.setBackground(new java.awt.Color(38, 124, 191));

        title.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Create Account");

        txt_lastname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_lastname.setText("Lastname");
        txt_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastnameActionPerformed(evt);
            }
        });

        txt_firstname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_firstname.setText("Firstname");
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        txt_emailReg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_emailReg.setText("Email");
        txt_emailReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailRegActionPerformed(evt);
            }
        });

        txt_passwordReg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_passwordReg.setText("jPasswordField1");

        btn_signup.setBackground(new java.awt.Color(238, 53, 57));
        btn_signup.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_signup.setText("Create Account");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Log In");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout container_blueLayout = new javax.swing.GroupLayout(container_blue);
        container_blue.setLayout(container_blueLayout);
        container_blueLayout.setHorizontalGroup(
            container_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_blueLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(container_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(container_blueLayout.createSequentialGroup()
                        .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_emailReg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_passwordReg))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_blueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_blueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_blueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login)
                .addGap(117, 117, 117))
        );
        container_blueLayout.setVerticalGroup(
            container_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_blueLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(title)
                .addGap(72, 72, 72)
                .addGroup(container_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(txt_emailReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txt_passwordReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_login)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        container_white.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nimas's_logo.png"))); // NOI18N

        javax.swing.GroupLayout container_whiteLayout = new javax.swing.GroupLayout(container_white);
        container_white.setLayout(container_whiteLayout);
        container_whiteLayout.setHorizontalGroup(
            container_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_whiteLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(30, 30, 30))
        );
        container_whiteLayout.setVerticalGroup(
            container_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_whiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(213, 213, 213))
        );

        javax.swing.GroupLayout bg_yellowLayout = new javax.swing.GroupLayout(bg_yellow);
        bg_yellow.setLayout(bg_yellowLayout);
        bg_yellowLayout.setHorizontalGroup(
            bg_yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_yellowLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(container_white, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container_blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(546, Short.MAX_VALUE))
        );
        bg_yellowLayout.setVerticalGroup(
            bg_yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_yellowLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(bg_yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(container_blue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(container_white, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(313, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg_yellow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_yellow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastnameActionPerformed
        //
    }//GEN-LAST:event_txt_lastnameActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        //
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_emailRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailRegActionPerformed
        // 
    }//GEN-LAST:event_txt_emailRegActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        //validates the form inputs
        if (txt_firstname.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It is imperative to fill out the Firstname field");
        }
        else if (txt_lastname.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "IT is imperative to fill out the Lastname field");
        }
        else if (txt_emailReg.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It is imperative to fill out the email field");
        } else if (txt_passwordReg.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It is also imperative to fill out the password field");
        } else if (txt_firstname.getText().contains("nigga")) {
            JOptionPane.showMessageDialog(null, "Sign Up failed, your firstname must not contain racial slurs");
        } 
        else {
           email = txt_emailReg.getText();
           password = txt_passwordReg.getText();
           
           //close this window and open login window
           JOptionPane.showMessageDialog(null, "Account Created. You may now log in");
           this.dispose();
           new fr_login().setVisible(true);
        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        //close this window and open login window
        this.dispose();
        new fr_login().setVisible(true);
    }//GEN-LAST:event_btn_loginMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_yellow;
    private javax.swing.JLabel btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JPanel container_blue;
    private javax.swing.JPanel container_white;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt_emailReg;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JPasswordField txt_passwordReg;
    // End of variables declaration//GEN-END:variables
}
