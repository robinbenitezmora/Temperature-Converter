import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;

public class Temperature_Converter extends javax.swing.JFrame {

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton btnConvert;
 private javax.swing.JButton btnReset;
 private javax.swing.JLabel lblCelsius;
 private javax.swing.JLabel lblFahrenheit;
 private javax.swing.JLabel lblTitle;
 private javax.swing.JTextField txtCelsius;
 private javax.swing.JTextField txtFahrenheit;
 // End of variables declaration//GEN-END:variables

 public Temperature_Converter() {
  initComponents();
 }

 private void initComponents() {

     JCheckBox jCheckBox2 = new javax.swing.JCheckBox();
     JSpinner jSpinner1 = new javax.swing.JSpinner();
     JPanel jPanel2 = new javax.swing.JPanel();
     JLabel jLabel1 = new javax.swing.JLabel();
     JComboBox jComboxBox1 = new javax.swing.JComboBox<>();
     JComboBox jComboBox2 = new javax.swing.JComboBox<>();
     JTextField jTextField1 = new javax.swing.JTextField();
     JTextField jTextField2 = new javax.swing.JTextField();
     JButton jButton1 = new javax.swing.JButton();
     JButton jButton2 = new javax.swing.JButton();
     JButton jButton3 = new javax.swing.JButton();

     jCheckBox2.setText("jCheckBox2");

     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     setTitle("Temperature Converter");

     jPanel2.setBackground(new java.awt.Color(51, 51, 51));

     jLabel1.setBackground(new java.awt.Color(255, 255, 255));
     jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
     jLabel1.setForeground(new java.awt.Color(255, 255, 255));
     jLabel1.setText("Temperature Converter");

     javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
     jPanel2.setLayout(jPanel2Layout);
     jPanel2Layout.setHorizontalGroup(
          jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
               .addGap(142, 142, 142)
               .addComponent(jLabel1)
               .addContainerGap(161, Short.MAX_VALUE))
     );
     jComboxBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit" }));

     Component jComboxBox2;
     jComboxBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit" }));

     jTextField2.setEditable(false);

     jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
     jButton1.setText("Convert");
     jButton1.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
               actionPerformed(evt);
          }
     });

     jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
     jButton2.setText("Clear");
     jButton2.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
               actionPerformed(evt);
          }
     });

     jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
     jButton3.setText("Exit");
     jButton3.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
               actionPerformed(evt);
          }
     });

     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGap(50, 50, 50)
       .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
         .addComponent(jComboxBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jComboxBox1, 0, 116, Short.MAX_VALUE))
        .addGap(133, 133, 133)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jButton1)
         .addGroup(layout.createSequentialGroup()
          .addComponent(jButton2)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(jButton3)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     );
     layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(layout.createSequentialGroup()
        .addGap(46, 46, 46)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
         .addComponent(jComboxBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jButton1))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
         .addComponent(jComboxBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jButton2)
         .addComponent(jButton3))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     );
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
           .addGroup(layout.createSequentialGroup()
            .addComponent(jButton1)
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jButton3)
             .addComponent(jButton2))
            .addGap(29, 29, 29))
           .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
     layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
          .addGap(46, 46, 46)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jComboxBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(3, 3, 3)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1)
          .addComponent(jButton2))
          .addGap(18, 18, 18)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jComboxBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
          .addComponent(jButton3)
          .addGap(37, 37, 37))
     );
     pack();
    }

 private ParallelGroup addGroup(Alignment trailing, SequentialGroup addGap) {
  return null;
 }
}