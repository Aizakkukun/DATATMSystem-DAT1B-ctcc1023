
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TransactWindow extends javax.swing.JFrame {
    
    private int balance1 = 100;
    private int balance2 = 300;
    private int balance3 = 1000;
    private int balance4 = 2000;

    public TransactWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        cardnum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cardcode = new javax.swing.JTextField();
        bal = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        depos = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Credit Card Number:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, 40));

        cardnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnumActionPerformed(evt);
            }
        });
        getContentPane().add(cardnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 200, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Card Secret Code:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        getContentPane().add(cardcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, 40));

        bal.setText("Check Bal");
        bal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balActionPerformed(evt);
            }
        });
        getContentPane().add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 110, 40));

        withdraw.setText("Withdraw");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 110, 40));

        depos.setText("Deposit");
        depos.setToolTipText("");
        depos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposActionPerformed(evt);
            }
        });
        getContentPane().add(depos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 110, 40));

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 110, 40));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Credit Card System");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallet.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-530, -10, 1260, 426));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnumActionPerformed
        
        
        
    }//GEN-LAST:event_cardnumActionPerformed

    private void balActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balActionPerformed
        
       if (cardnum.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your card number!");
        } else if (cardcode.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your card's secret code!");
        } else if (cardnum.getText().equals("1111222233334444") && cardcode.getText().equals("123")) {
            JOptionPane.showMessageDialog(null, "Balance is: " + balance1);
        } else if (cardnum.getText().equals("5555666677778888") && cardcode.getText().equals("567")) {
            JOptionPane.showMessageDialog(null, "Balance is: " + balance2);
        } else if (cardnum.getText().equals("1111000022229999") && cardcode.getText().equals("890")) {
            JOptionPane.showMessageDialog(null, "Balance is: " + balance3);
        } else if (cardnum.getText().equals("5555666677774444") && cardcode.getText().equals("098")) {
            JOptionPane.showMessageDialog(null, "Balance is: " + balance4);
        } else {
            JOptionPane.showMessageDialog(null, "Wrong card number or secret code!", "Message", JOptionPane.ERROR_MESSAGE);
        }    
         
       
    }//GEN-LAST:event_balActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed

        String withdraw = JOptionPane.showInputDialog("Please enter the amount you would like to withdraw: ");

        int wit = Integer.parseInt(withdraw);   

        
        if (cardnum.getText().equals("") && cardcode.getText().contains("")) {
            JOptionPane.showMessageDialog(null, "Please input account number & secret code", "Message",JOptionPane.ERROR_MESSAGE);
        }  
        if (cardnum.getText().equals("1111222233334444") && cardcode.getText().contains("123")) {
                if (wit <= balance1) {
                    balance1 -= wit;
                    JOptionPane.showMessageDialog(null, "Thank you for withdrawing, your new balance is: " + balance1);
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient balance!", "Message", JOptionPane.ERROR_MESSAGE);
                }
       } else if (cardnum.getText().equals("5555666677778888") && cardcode.getText().contains("567")) {
                if (wit <= balance2) {
                    balance2 -= wit;
                    JOptionPane.showMessageDialog(null, "Thank you for withdrawing, your new balance is: " + balance2);
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient balance!", "Message", JOptionPane.ERROR_MESSAGE);
                }      
       } else if (cardnum.getText().equals("1111000022229999") && cardcode.getText().contains("890")) {
                if (wit <= balance3) {
                    balance3 -= wit;
                    JOptionPane.showMessageDialog(null, "Thank you for withdrawing, your new balance is: " + balance3);
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient balance!", "Message", JOptionPane.ERROR_MESSAGE);
                }       
       } else if (cardnum.getText().equals("5555666677774444") && cardcode.getText().contains("098")) {
                if (wit <= balance4) {
                    balance4 -= wit;
                    JOptionPane.showMessageDialog(null, "Thank you for withdrawing, your new balance is: " + balance4);
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient balance!", "Message", JOptionPane.ERROR_MESSAGE);
                }        
       }else{
           JOptionPane.showMessageDialog(null, "Error, please Input amount","Message",JOptionPane.ERROR_MESSAGE );
       }
        
    }//GEN-LAST:event_withdrawActionPerformed

    private void deposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposActionPerformed
                
        String deposit = JOptionPane.showInputDialog("Please enter the amount you would like to deposit: ");

        int dep = Integer.parseInt(deposit);   

       if (cardnum.getText().equals("1111222233334444") && cardcode.getText().contains("123")) {
                balance1 += dep;
                JOptionPane.showMessageDialog(null, "Thank you for depositing, your new balance is: " + balance1);
            } else if (cardnum.getText().equals("5555666677778888") && cardcode.getText().contains("567")) {
                balance2 += dep;
                JOptionPane.showMessageDialog(null, "Thank you for depositing, your new balance is: " + balance2);
            } else if (cardnum.getText().equals("1111000022229999") && cardcode.getText().contains("890")) {
                balance3 += dep;
                JOptionPane.showMessageDialog(null, "Thank you for depositing, your new balance is: " + balance3);
            } else if (cardnum.getText().equals("5555666677774444") && cardcode.getText().contains("098")) {
                balance4 += dep;
                JOptionPane.showMessageDialog(null, "Thank you for depositing, your new balance is: " + balance4);
            } else {
                JOptionPane.showMessageDialog(null, "Error, please Input amount", "Message", JOptionPane.ERROR_MESSAGE);
            }

    
        
    }//GEN-LAST:event_deposActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bal;
    private javax.swing.JTextField cardcode;
    private javax.swing.JTextField cardnum;
    private javax.swing.JButton depos;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables

    private Object withdraw() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
