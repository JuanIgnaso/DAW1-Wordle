/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.daw1.juan.wordle.motores;

/**
 *
 * @author alumno
 */
public class ConfiguracionGUI extends javax.swing.JFrame {

    /**
     * Creates new form ConfiguracionGUI
     */
    public ConfiguracionGUI() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        mainControlesjPanel = new javax.swing.JPanel();
        TitulojPanel = new javax.swing.JPanel();
        gestionTitulojLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        altaPalabrajPanel = new javax.swing.JPanel();
        anadirPalabrajPanel = new javax.swing.JPanel();
        errorAnadirjPanel = new javax.swing.JPanel();
        borradoPalabrajPanel = new javax.swing.JPanel();
        borrarjPanel = new javax.swing.JPanel();
        errorBorrarjPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainControlesjPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainControlesjPanel.setLayout(new java.awt.BorderLayout());

        TitulojPanel.setBackground(new java.awt.Color(204, 204, 204));
        TitulojPanel.setPreferredSize(new java.awt.Dimension(477, 80));
        TitulojPanel.setLayout(new java.awt.GridBagLayout());

        gestionTitulojLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        gestionTitulojLabel.setForeground(new java.awt.Color(0, 0, 0));
        gestionTitulojLabel.setText("Gestion Motor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 218, 33, 219);
        TitulojPanel.add(gestionTitulojLabel, gridBagConstraints);

        mainControlesjPanel.add(TitulojPanel, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        altaPalabrajPanel.setLayout(new java.awt.GridLayout(2, 1));
        altaPalabrajPanel.add(anadirPalabrajPanel);

        errorAnadirjPanel.setLayout(new java.awt.GridBagLayout());
        altaPalabrajPanel.add(errorAnadirjPanel);

        jPanel1.add(altaPalabrajPanel);

        borradoPalabrajPanel.setLayout(new java.awt.GridLayout(2, 1));
        borradoPalabrajPanel.add(borrarjPanel);

        errorBorrarjPanel.setLayout(new java.awt.GridBagLayout());
        borradoPalabrajPanel.add(errorBorrarjPanel);

        jPanel1.add(borradoPalabrajPanel);

        mainControlesjPanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainControlesjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainControlesjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(ConfiguracionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TitulojPanel;
    private javax.swing.JPanel altaPalabrajPanel;
    private javax.swing.JPanel anadirPalabrajPanel;
    private javax.swing.JPanel borradoPalabrajPanel;
    private javax.swing.JPanel borrarjPanel;
    private javax.swing.JPanel errorAnadirjPanel;
    private javax.swing.JPanel errorBorrarjPanel;
    private javax.swing.JLabel gestionTitulojLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainControlesjPanel;
    // End of variables declaration//GEN-END:variables
}
