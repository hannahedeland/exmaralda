/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exmaralda.webservices.swing;

import java.util.HashMap;

/**
 *
 * @author Thomas_Schmidt
 */
public class MAUSFineAlignmentParameterDialog extends javax.swing.JDialog {

    public boolean approved;

    /**
     * Creates new form MausFineAlignmentParameterDialog
     */
    public MAUSFineAlignmentParameterDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        minLabel = new javax.swing.JLabel();
        minSpinner = new javax.swing.JSpinner();
        minSlider = new javax.swing.JSlider();
        maxSlider = new javax.swing.JSlider();
        maxSpinner = new javax.swing.JSpinner();
        maxLabel = new javax.swing.JLabel();
        okCancelPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setLayout(new java.awt.BorderLayout());

        minLabel.setText("Minimum Interval Length (s)");
        jPanel1.add(minLabel);

        minSpinner.setModel(new javax.swing.SpinnerNumberModel(5.0d, 0.0d, 10.0d, 0.2d));
        jPanel1.add(minSpinner);

        minSlider.setMajorTickSpacing(1);
        minSlider.setMaximum(10);
        minSlider.setPaintTicks(true);
        minSlider.setValue(5);
        jPanel1.add(minSlider);

        maxSlider.setMajorTickSpacing(2);
        maxSlider.setMaximum(25);
        maxSlider.setMinimum(5);
        maxSlider.setPaintTicks(true);
        maxSlider.setValue(10);
        jPanel1.add(maxSlider);

        maxSpinner.setModel(new javax.swing.SpinnerNumberModel(10.0d, 5.0d, 25.0d, 0.5d));
        jPanel1.add(maxSpinner);

        maxLabel.setText("Maximum Interval Length (s)");
        jPanel1.add(maxLabel);

        mainPanel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        okButton.setText("OK");
        okCancelPanel.add(okButton);

        cancelButton.setText("Cancel");
        okCancelPanel.add(cancelButton);

        getContentPane().add(okCancelPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MAUSFineAlignmentParameterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAUSFineAlignmentParameterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAUSFineAlignmentParameterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAUSFineAlignmentParameterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MAUSFineAlignmentParameterDialog dialog = new MAUSFineAlignmentParameterDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public HashMap<String, Object> getMAUSFineAlignmentParameters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JSlider maxSlider;
    private javax.swing.JSpinner maxSpinner;
    private javax.swing.JLabel minLabel;
    private javax.swing.JSlider minSlider;
    private javax.swing.JSpinner minSpinner;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel okCancelPanel;
    // End of variables declaration//GEN-END:variables
}
