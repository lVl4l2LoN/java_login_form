/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jLogIn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

/**
 *
 * @author lVl4rl2LoN
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }

    private boolean validate_login(String username,String password) {
   try{           
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademo?" + "user=root&password=");     
       PreparedStatement pst = conn.prepareStatement("INSERT INTO login (userName, password)" + " VALUES (?, ?)");
       pst.setString(1, username); 
       pst.setString(2, password);
       
       if(pst.executeUpdate()!= 0) //executeUpdate is used to manipulate data. executeQuery is meant for SELECT queries
       {
           conn.close();
           return true;
       }
               
       else{
            conn.close();
            return false;
       }
                       
   }
   catch(Exception e){
       e.printStackTrace();
       return false;
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

        jopPass = new javax.swing.JOptionPane();
        jopLogIn = new javax.swing.JOptionPane();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPass = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtConfirmPass = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblEmptyUserName = new javax.swing.JLabel();
        lblEmptyPass = new javax.swing.JLabel();
        lblEmptyCP = new javax.swing.JLabel();

        jopPass.setForeground(new java.awt.Color(255, 51, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUserName.setText("User Name");

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPassword.setText("Password");

        lblConfirmPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConfirmPass.setText("Confirm Password");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Registration Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        lblEmptyUserName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblEmptyUserName.setForeground(new java.awt.Color(255, 51, 51));

        lblEmptyPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblEmptyPass.setForeground(new java.awt.Color(255, 51, 51));

        lblEmptyCP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblEmptyCP.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserName)
                                    .addComponent(lblPassword))
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblConfirmPass)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmptyPass))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmptyUserName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmptyCP)))))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmptyUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmptyPass)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPassword)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblEmptyCP))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfirmPass)
                            .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
   lblEmptyUserName.setText("");
   lblEmptyPass.setText("");
   lblEmptyCP.setText("");
   if(txtUserName.getText().length()==0 && txtPass.getPassword().length==0
   && txtConfirmPass.getPassword().length == 0)  // Checking for empty fields
   {
       lblEmptyUserName.setText("* Empty User Name field.");
       lblEmptyPass.setText("* Empty Password field");
       lblEmptyCP.setText("* Empty Confirm Password field");
   }
      
   else if(txtUserName.getText().length()==0)
       lblEmptyUserName.setText("* Empty User Name field.");
       //jOpMessage.showMessageDialog(null, "Empty Name field detected ! Please fill up all fields");
   else if(txtPass.getPassword().length==0)
       lblEmptyPass.setText("* Empty Password field");
   else if(txtConfirmPass.getPassword().length==0)
       lblEmptyCP.setText("* Empty Confirm Password field");
   else if(!(Arrays.equals(txtPass.getPassword(), txtConfirmPass.getPassword()))){
       
       jopPass.showMessageDialog(null, "The passwords do not match!");
   }
   else{
       String user = txtUserName.getText();   // Collecting the input
       char[] pass = txtPass.getPassword(); // Collecting the input
       String pwd = String.copyValueOf(pass);  // converting from array to string
       if(validate_login(user,pwd))
       {
           jopLogIn.showMessageDialog(null, "Registration Successful");
           this.dispose();
           new index(user).setVisible(true);
           
       }
                  
       else
          jopLogIn.showMessageDialog(null, "Incorrect Login Credentials");
   } 
   
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JOptionPane jopLogIn;
    private javax.swing.JOptionPane jopPass;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblEmptyCP;
    private javax.swing.JLabel lblEmptyPass;
    private javax.swing.JLabel lblEmptyUserName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
