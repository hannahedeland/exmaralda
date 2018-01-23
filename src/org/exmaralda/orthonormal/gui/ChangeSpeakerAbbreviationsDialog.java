/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exmaralda.orthonormal.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.xpath.XPath;

/**
 *
 * @author Thomas_Schmidt
 */
public class ChangeSpeakerAbbreviationsDialog extends javax.swing.JDialog {

    public boolean changed = false;
    
    ArrayList<String[]> mappings = new ArrayList<String[]>();
    
    
    /**
     * Creates new form ChangeSpeakerAbbreviationsDialog
     * @param parent
     * @param modal
     * @param transcription
     */
    public ChangeSpeakerAbbreviationsDialog(java.awt.Frame parent, boolean modal, Document transcription) {
        super(parent, modal);
        try {
            List l = XPath.selectNodes(transcription, "//speaker");
            for (Object o : l){
                String abb = ((Element)o).getAttributeValue("speaker-id");
                String[] pair = {abb,abb};
                mappings.add(pair);                
            }
            Collections.sort(mappings, new Comparator<String[]>(){
                @Override
                public int compare(String[] o1, String[] o2) {
                    return o1[0].compareTo(o2[0]);
                }
                
            });
        } catch (JDOMException ex) {
            Logger.getLogger(ChangeSpeakerAbbreviationsDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        mappingsTable.getColumnModel().getColumn(1).setCellRenderer(new MappingsTableCellRenderer());
    }
    
    public ArrayList<String[]> getMappings(){
        return mappings;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okCancelPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mappingsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sprecherkürzel ändern");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okCancelPanel.add(okButton);

        cancelButton.setText("Abbrechen");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        okCancelPanel.add(cancelButton);

        getContentPane().add(okCancelPanel, java.awt.BorderLayout.SOUTH);

        mappingsTable.setModel(new MappingModel(mappings));
        mappingsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(mappingsTable);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        changed = true;
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeSpeakerAbbreviationsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeSpeakerAbbreviationsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeSpeakerAbbreviationsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeSpeakerAbbreviationsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeSpeakerAbbreviationsDialog dialog = new ChangeSpeakerAbbreviationsDialog(new javax.swing.JFrame(), true, null);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mappingsTable;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel okCancelPanel;
    // End of variables declaration//GEN-END:variables

    private static class MappingModel implements TableModel {

        ArrayList<String[]>  mappings;
        
        public MappingModel(ArrayList<String[]>  mappings) {
            this.mappings = mappings;
        }

        @Override
        public int getRowCount() {
            return mappings.size();
        }

        @Override
        public int getColumnCount() {
            return 2;
        }

        @Override
        public String getColumnName(int columnIndex) {
            switch(columnIndex){
                case 0 : return "Vorhandenes Kürzel";
                case 1 : return "Neues Kürzel";
                default : return "";
            }
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return String.class;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return (columnIndex==1);
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            String[] pair = mappings.get(rowIndex);
            return pair[columnIndex];
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            String[] pair = mappings.get(rowIndex);
            pair[columnIndex] = (String) aValue;
        }

        @Override
        public void addTableModelListener(TableModelListener l) {
            // do nothing
        }

        @Override
        public void removeTableModelListener(TableModelListener l) {
            // do nothing
        }
    }

    private class MappingsTableCellRenderer extends DefaultTableCellRenderer {

        public MappingsTableCellRenderer() {
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel)(super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column));
            label.setFont(label.getFont().deriveFont(Font.BOLD));
            if (column==1){
                if (!(table.getValueAt(row, 0).equals(table.getValueAt(row, 1)))){
                    label.setForeground(Color.RED);
                } else {
                    label.setForeground(Color.BLACK);
                }
            }
            return label;
        }
    }
}
