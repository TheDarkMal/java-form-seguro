/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguro_de_vida;

import javax.swing.JOptionPane;

/**
 *
 * @author CBN
 */
public class segurodevida extends javax.swing.JFrame {

    /**
     * Creates new form segurodevida
     */
     Seguro_de_vida calcularseguro = new Seguro_de_vida();
    boolean sifumador=false, sialcoholico=false, sidrogadicto=false,sicardiaco=false;
    long valorbase=0;
    
    public segurodevida() {
        initComponents();
        txtvalor.setText("");
        lbresultado.setText("");
    }

   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgfumadores = new javax.swing.ButtonGroup();
        bgalcoholicos = new javax.swing.ButtonGroup();
        bgdrogadictos = new javax.swing.ButtonGroup();
        bgcardiacos = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        rbfumadorsi = new javax.swing.JRadioButton();
        rbfumadorno = new javax.swing.JRadioButton();
        rbalcoholicosi = new javax.swing.JRadioButton();
        rbalcoholicono = new javax.swing.JRadioButton();
        rbdrogadictosi = new javax.swing.JRadioButton();
        rbdrogadictono = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbcardiacosi = new javax.swing.JRadioButton();
        rbcardiacono = new javax.swing.JRadioButton();
        btncalucular = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        lbresultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("¿es usted fumador activo?");

        jLabel2.setText("¿es usted alcoholico ?");

        jLabel3.setText("¿consume susutancias alucinogenas?");

        jLabel4.setText("Ingrese el valor base");

        bgfumadores.add(rbfumadorsi);
        rbfumadorsi.setText("si");

        bgfumadores.add(rbfumadorno);
        rbfumadorno.setText("no");

        bgalcoholicos.add(rbalcoholicosi);
        rbalcoholicosi.setText("si");

        bgalcoholicos.add(rbalcoholicono);
        rbalcoholicono.setText("no");

        bgdrogadictos.add(rbdrogadictosi);
        rbdrogadictosi.setText("si");

        bgdrogadictos.add(rbdrogadictono);
        rbdrogadictono.setText("no");

        jLabel5.setText("¿tiene antesedentes cardiacos?");

        bgcardiacos.add(rbcardiacosi);
        rbcardiacosi.setText("si");

        bgcardiacos.add(rbcardiacono);
        rbcardiacono.setText("no");

        btncalucular.setText("calcular");
        btncalucular.setEnabled(false);
        btncalucular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalucularActionPerformed(evt);
            }
        });

        jCheckBox1.setText("¿acepta los terminos y condiciones?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbfumadorno)
                                    .addComponent(rbfumadorsi))))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(rbalcoholicono)
                            .addComponent(rbalcoholicosi))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbdrogadictono)
                                    .addComponent(rbdrogadictosi)))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbcardiacono)
                            .addComponent(rbcardiacosi)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncalucular)
                                .addGap(48, 48, 48)
                                .addComponent(lbresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbfumadorsi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbfumadorno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbdrogadictosi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbdrogadictono))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbalcoholicosi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbalcoholicono)))))
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(rbcardiacosi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbcardiacono)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncalucular)
                            .addComponent(lbresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jCheckBox1)
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalucularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalucularActionPerformed
        try {
          calcularseguro();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btncalucularActionPerformed
    private  void calcularseguro(){
    valorbase=Long.parseLong(txtvalor.getText());
    if(rbfumadorsi.isSelected()){
    sifumador=true;
    }else{
    sifumador=false;
    }
    if(rbalcoholicosi.isSelected()){
    sialcoholico=true;
    }else{
    sialcoholico=false;
    }
    if(rbdrogadictosi.isSelected()){
    sidrogadicto=true;
    }else{
    sidrogadicto=false;
    }
    if(rbcardiacosi.isSelected()){
    sicardiaco=true;
    }else{
    sicardiaco=false;
    }
    
    lbresultado.setText(Long.toString(calcularseguro.calcular(valorbase, sifumador, sialcoholico, sidrogadicto, sicardiaco)));
    }
    
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
           if(jCheckBox1.isSelected()){
           btncalucular.setEnabled(true);
           }else{
           btncalucular.setEnabled(false);
           }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(segurodevida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(segurodevida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(segurodevida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(segurodevida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new segurodevida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgalcoholicos;
    private javax.swing.ButtonGroup bgcardiacos;
    private javax.swing.ButtonGroup bgdrogadictos;
    private javax.swing.ButtonGroup bgfumadores;
    private javax.swing.JButton btncalucular;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbresultado;
    private javax.swing.JRadioButton rbalcoholicono;
    private javax.swing.JRadioButton rbalcoholicosi;
    private javax.swing.JRadioButton rbcardiacono;
    private javax.swing.JRadioButton rbcardiacosi;
    private javax.swing.JRadioButton rbdrogadictono;
    private javax.swing.JRadioButton rbdrogadictosi;
    private javax.swing.JRadioButton rbfumadorno;
    private javax.swing.JRadioButton rbfumadorsi;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
