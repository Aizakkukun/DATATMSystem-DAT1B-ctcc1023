
import javax.swing.JOptionPane;

public class CardWindow extends javax.swing.JFrame {

    public CardWindow() {
        initComponents();
        
        CreditCard firstCard = new CreditCard(100,"1111222233334444", "123");
        CreditCard secCard = new CreditCard(300,"5555666677778888", "567");
        CreditCard thirdCard = new CreditCard(1000,"1111000022229999", "890");
        CreditCard fourthCard = new CreditCard(2000,"5555666677774444", "098");

        CreditCard[] cards = {firstCard,secCard,thirdCard,fourthCard};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cardnum = new javax.swing.JTextField();
        cardcode = new javax.swing.JTextField();
        button1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Credit Card System");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("    Enter Credit Card Number:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 190, 35));

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("    Enter Card Secret Code:");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 190, 35));

        cardnum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(cardnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 222, 40));

        cardcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(cardcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 222, 40));

        button1.setBackground(new java.awt.Color(204, 204, 255));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.setText("Submit");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 86, 43));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallet.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-880, 0, 1560, 426));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        
        if (cardnum.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Please enter your card number!");
       }
       else if(cardcode.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Please enter your card's secret code!");
       }
       else if(cardnum.getText().equals("1111222233334444") && cardcode.getText().equals("123")) {
           JOptionPane.showMessageDialog(null, "Credit Card Detected!");
       }
       else{
           JOptionPane.showMessageDialog(null,"Wrong card number or secret code!","Message",JOptionPane.ERROR_MESSAGE);
       }
        
       TransactWindow win2 = new TransactWindow();
       win2.show();
        
       dispose();
        
    }//GEN-LAST:event_button1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JTextField cardcode;
    private javax.swing.JTextField cardnum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
