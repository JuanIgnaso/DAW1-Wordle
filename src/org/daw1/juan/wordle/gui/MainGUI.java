/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.daw1.juan.wordle.gui;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import org.daw1.juan.wordle.motores.*;

/**
 *
 * @author juan navarrete
 */
public class MainGUI extends javax.swing.JFrame {
    
    private IMotor motor;

    private static final java.awt.Color COLOR_VERDE = new java.awt.Color(0,153,0);
    private static final java.awt.Color COLOR_AMARILLO = new java.awt.Color(204,204,0);
    private static final java.awt.Color COLOR_ROJO = new java.awt.Color(255,0,0);
    
    private Set<Character>LETRAS_MAL=new TreeSet<>();
    private Set<Character>LETRAS_CONTIENE=new TreeSet<>();
    private Set<Character>LETRAS_BIEN=new TreeSet<>();
    
    private static int INTENTOS = 0;
    private static final int MAX_INTENTOS = 6;
    private static final int TAMANO_PALABRA = 5;
    
    private final javax.swing.JLabel[][] labels = new javax.swing.JLabel[MAX_INTENTOS][TAMANO_PALABRA];
        
    
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        LETRAS_MAL.add('A');
        LETRAS_MAL.add('B');
         LETRAS_CONTIENE.add('A');
        LETRAS_BIEN.add('D');
        LETRAS_BIEN.add('F');
        motor = new MotorTest();
        initComponents();
         inicializarLabels();
    
    }
    
  
        //AFECTA A TODAS
        public void test(){
        for(int i = 0; i < labels.length; i++){
            JLabel[] label = labels[i];
            for(int j = 0; j < label.length; j++){
                JLabel jLabel = label[j];
                jLabel.setVisible(false);
            }
        }
    }
    
    //AFECTA A FILA PASADA POR PARAMETRO
    public void test(int num){
        JLabel[] label = labels[num];
        for (int j = 0; j < label.length; j++) {
            JLabel jLabel = label[j];
            jLabel.setForeground(COLOR_ROJO);
        }
    }
    
    



    public final void inicializarLabels(){
        for(int i =1; i <= MAX_INTENTOS; i++){
            for(int j = 1; j <= TAMANO_PALABRA; j++){
                try {
                    String nombreLabel = "jLabel" + i + "_" + j;
                    System.out.println(nombreLabel);
                    javax.swing.JLabel aux = (javax.swing.JLabel)this.getClass().getDeclaredField(nombreLabel).get(this);
                    labels[i - 1][j - 1] = aux;
                } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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

        motoresButtonGroup = new javax.swing.ButtonGroup();
        MainjPanel = new javax.swing.JPanel();
        ZonaLetrasjPanel = new javax.swing.JPanel();
        jLabel1_1 = new javax.swing.JLabel();
        jLabel1_2 = new javax.swing.JLabel();
        jLabel1_3 = new javax.swing.JLabel();
        jLabel1_4 = new javax.swing.JLabel();
        jLabel1_5 = new javax.swing.JLabel();
        jLabel2_1 = new javax.swing.JLabel();
        jLabel2_2 = new javax.swing.JLabel();
        jLabel2_3 = new javax.swing.JLabel();
        jLabel2_4 = new javax.swing.JLabel();
        jLabel2_5 = new javax.swing.JLabel();
        jLabel3_1 = new javax.swing.JLabel();
        jLabel3_2 = new javax.swing.JLabel();
        jLabel3_3 = new javax.swing.JLabel();
        jLabel3_4 = new javax.swing.JLabel();
        jLabel3_5 = new javax.swing.JLabel();
        jLabel4_1 = new javax.swing.JLabel();
        jLabel4_2 = new javax.swing.JLabel();
        jLabel4_3 = new javax.swing.JLabel();
        jLabel4_4 = new javax.swing.JLabel();
        jLabel4_5 = new javax.swing.JLabel();
        jLabel5_1 = new javax.swing.JLabel();
        jLabel5_2 = new javax.swing.JLabel();
        jLabel5_3 = new javax.swing.JLabel();
        jLabel5_4 = new javax.swing.JLabel();
        jLabel5_5 = new javax.swing.JLabel();
        jLabel6_1 = new javax.swing.JLabel();
        jLabel6_2 = new javax.swing.JLabel();
        jLabel6_3 = new javax.swing.JLabel();
        jLabel6_4 = new javax.swing.JLabel();
        jLabel6_5 = new javax.swing.JLabel();
        BottomjPanel = new javax.swing.JPanel();
        estadoActualjPanel = new javax.swing.JPanel();
        maljPanel = new javax.swing.JPanel();
        malLabel = new javax.swing.JLabel();
        existenjPanel = new javax.swing.JPanel();
        existenLabel = new javax.swing.JLabel();
        bienjPanel = new javax.swing.JPanel();
        bienjLabel = new javax.swing.JLabel();
        JuegoInputjPanel = new javax.swing.JPanel();
        palabraTextField = new javax.swing.JTextField();
        enviarButton = new javax.swing.JButton();
        ExitojPanel = new javax.swing.JPanel();
        finaljLabel = new javax.swing.JLabel();
        ErrorjPanel = new javax.swing.JPanel();
        errorjLabel = new javax.swing.JLabel();
        menuSuperiorjMenuBar = new javax.swing.JMenuBar();
        archivojMenu1 = new javax.swing.JMenu();
        motoresjMenu2 = new javax.swing.JMenu();
        motorTestjRadioButton = new javax.swing.JRadioButtonMenuItem();
        motorFicherojRadioButton = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DAW1 Wordle Juan");

        MainjPanel.setLayout(new java.awt.BorderLayout());

        ZonaLetrasjPanel.setBackground(new java.awt.Color(255, 255, 255));
        ZonaLetrasjPanel.setLayout(new java.awt.GridLayout(6, 5));

        jLabel1_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_1.setText("A");
        ZonaLetrasjPanel.add(jLabel1_1);

        jLabel1_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_2.setText("A");
        ZonaLetrasjPanel.add(jLabel1_2);

        jLabel1_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_3.setText("A");
        ZonaLetrasjPanel.add(jLabel1_3);

        jLabel1_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_4.setText("A");
        ZonaLetrasjPanel.add(jLabel1_4);

        jLabel1_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_5.setText("A");
        ZonaLetrasjPanel.add(jLabel1_5);

        jLabel2_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_1.setText("A");
        ZonaLetrasjPanel.add(jLabel2_1);

        jLabel2_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_2.setText("A");
        ZonaLetrasjPanel.add(jLabel2_2);

        jLabel2_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_3.setText("A");
        ZonaLetrasjPanel.add(jLabel2_3);

        jLabel2_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_4.setText("A");
        ZonaLetrasjPanel.add(jLabel2_4);

        jLabel2_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_5.setText("A");
        ZonaLetrasjPanel.add(jLabel2_5);

        jLabel3_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_1.setText("A");
        ZonaLetrasjPanel.add(jLabel3_1);

        jLabel3_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_2.setText("A");
        ZonaLetrasjPanel.add(jLabel3_2);

        jLabel3_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_3.setText("A");
        ZonaLetrasjPanel.add(jLabel3_3);

        jLabel3_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_4.setText("A");
        ZonaLetrasjPanel.add(jLabel3_4);

        jLabel3_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_5.setText("A");
        ZonaLetrasjPanel.add(jLabel3_5);

        jLabel4_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_1.setText("A");
        ZonaLetrasjPanel.add(jLabel4_1);

        jLabel4_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_2.setText("A");
        ZonaLetrasjPanel.add(jLabel4_2);

        jLabel4_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_3.setText("A");
        ZonaLetrasjPanel.add(jLabel4_3);

        jLabel4_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_4.setText("A");
        ZonaLetrasjPanel.add(jLabel4_4);

        jLabel4_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_5.setText("A");
        ZonaLetrasjPanel.add(jLabel4_5);

        jLabel5_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_1.setText("A");
        ZonaLetrasjPanel.add(jLabel5_1);

        jLabel5_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_2.setText("A");
        ZonaLetrasjPanel.add(jLabel5_2);

        jLabel5_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_3.setText("A");
        ZonaLetrasjPanel.add(jLabel5_3);

        jLabel5_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_4.setText("A");
        ZonaLetrasjPanel.add(jLabel5_4);

        jLabel5_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_5.setText("A");
        ZonaLetrasjPanel.add(jLabel5_5);

        jLabel6_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_1.setText("A");
        ZonaLetrasjPanel.add(jLabel6_1);

        jLabel6_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_2.setText("A");
        ZonaLetrasjPanel.add(jLabel6_2);

        jLabel6_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_3.setText("A");
        ZonaLetrasjPanel.add(jLabel6_3);

        jLabel6_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_4.setText("A");
        ZonaLetrasjPanel.add(jLabel6_4);

        jLabel6_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_5.setText("A");
        ZonaLetrasjPanel.add(jLabel6_5);

        MainjPanel.add(ZonaLetrasjPanel, java.awt.BorderLayout.CENTER);

        BottomjPanel.setBackground(new java.awt.Color(153, 153, 153));
        BottomjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        BottomjPanel.setPreferredSize(new java.awt.Dimension(200, 150));
        BottomjPanel.setLayout(new java.awt.GridLayout(2, 2));

        estadoActualjPanel.setBackground(new java.awt.Color(153, 153, 153));
        estadoActualjPanel.setLayout(new java.awt.GridLayout(3, 0));

        maljPanel.setBackground(new java.awt.Color(204, 204, 204));
        maljPanel.setLayout(new java.awt.GridLayout(1, 0));

        malLabel.setBackground(new java.awt.Color(204, 204, 204));
        malLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        malLabel.setForeground(new java.awt.Color(255, 0, 0));
        malLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maljPanel.add(malLabel);

        estadoActualjPanel.add(maljPanel);

        existenjPanel.setBackground(new java.awt.Color(204, 204, 204));
        existenjPanel.setLayout(new java.awt.GridLayout(1, 0));

        existenLabel.setBackground(new java.awt.Color(204, 204, 204));
        existenLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        existenLabel.setForeground(new java.awt.Color(204, 204, 0));
        existenjPanel.add(existenLabel);

        estadoActualjPanel.add(existenjPanel);

        bienjPanel.setBackground(new java.awt.Color(204, 204, 204));
        bienjPanel.setLayout(new java.awt.GridLayout(1, 0));

        bienjLabel.setBackground(new java.awt.Color(204, 204, 204));
        bienjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bienjLabel.setForeground(new java.awt.Color(0, 153, 0));
        bienjPanel.add(bienjLabel);

        estadoActualjPanel.add(bienjPanel);

        BottomjPanel.add(estadoActualjPanel);

        JuegoInputjPanel.setBackground(new java.awt.Color(204, 204, 204));

        palabraTextField.setPreferredSize(new java.awt.Dimension(120, 24));
        JuegoInputjPanel.add(palabraTextField);

        enviarButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        enviarButton.setText("Enviar");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });
        JuegoInputjPanel.add(enviarButton);

        BottomjPanel.add(JuegoInputjPanel);

        ExitojPanel.setBackground(new java.awt.Color(204, 204, 204));
        ExitojPanel.setLayout(new java.awt.GridBagLayout());

        finaljLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        finaljLabel.setForeground(new java.awt.Color(0, 102, 51));
        ExitojPanel.add(finaljLabel, new java.awt.GridBagConstraints());

        BottomjPanel.add(ExitojPanel);

        ErrorjPanel.setBackground(new java.awt.Color(204, 204, 204));
        ErrorjPanel.setLayout(new java.awt.GridBagLayout());

        errorjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        errorjLabel.setForeground(new java.awt.Color(255, 0, 0));
        ErrorjPanel.add(errorjLabel, new java.awt.GridBagConstraints());

        BottomjPanel.add(ErrorjPanel);

        MainjPanel.add(BottomjPanel, java.awt.BorderLayout.PAGE_END);

        menuSuperiorjMenuBar.setBackground(new java.awt.Color(204, 204, 204));
        menuSuperiorjMenuBar.setForeground(new java.awt.Color(51, 51, 51));

        archivojMenu1.setBackground(new java.awt.Color(204, 204, 204));
        archivojMenu1.setForeground(new java.awt.Color(51, 51, 51));
        archivojMenu1.setText("Archivo");
        archivojMenu1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        menuSuperiorjMenuBar.add(archivojMenu1);

        motoresjMenu2.setBackground(new java.awt.Color(204, 204, 204));
        motoresjMenu2.setForeground(new java.awt.Color(51, 51, 51));
        motoresjMenu2.setText("Motores");
        motoresjMenu2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        motoresButtonGroup.add(motorTestjRadioButton);
        motorTestjRadioButton.setSelected(true);
        motorTestjRadioButton.setText("Motor Test");
        motorTestjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorTestjRadioButtonActionPerformed(evt);
            }
        });
        motoresjMenu2.add(motorTestjRadioButton);

        motoresButtonGroup.add(motorFicherojRadioButton);
        motorFicherojRadioButton.setText("Motor Esp");
        motorFicherojRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorFicherojRadioButtonActionPerformed(evt);
            }
        });
        motoresjMenu2.add(motorFicherojRadioButton);

        menuSuperiorjMenuBar.add(motoresjMenu2);

        setJMenuBar(menuSuperiorjMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        
    }//GEN-LAST:event_enviarButtonActionPerformed

    private void motorTestjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorTestjRadioButtonActionPerformed
       seleccionarMotor();
    }//GEN-LAST:event_motorTestjRadioButtonActionPerformed

    private void motorFicherojRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorFicherojRadioButtonActionPerformed
       seleccionarMotor();
    }//GEN-LAST:event_motorFicherojRadioButtonActionPerformed

    
    private void seleccionarMotor(){
         if(this.motorTestjRadioButton.isSelected()){
            motor = new MotorTest();
             this.errorjLabel.setText("Se ha seleccionado el motor Test.");
        }else if(this.motorFicherojRadioButton.isSelected()){
           motor = new MotorFichero();
           this.errorjLabel.setText("Se ha seleccionado el motor Español.");
       }
        
    }
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomjPanel;
    private javax.swing.JPanel ErrorjPanel;
    private javax.swing.JPanel ExitojPanel;
    private javax.swing.JPanel JuegoInputjPanel;
    private javax.swing.JPanel MainjPanel;
    private javax.swing.JPanel ZonaLetrasjPanel;
    private javax.swing.JMenu archivojMenu1;
    private javax.swing.JLabel bienjLabel;
    private javax.swing.JPanel bienjPanel;
    private javax.swing.JButton enviarButton;
    private javax.swing.JLabel errorjLabel;
    private javax.swing.JPanel estadoActualjPanel;
    private javax.swing.JLabel existenLabel;
    private javax.swing.JPanel existenjPanel;
    private javax.swing.JLabel finaljLabel;
    private javax.swing.JLabel jLabel1_1;
    private javax.swing.JLabel jLabel1_2;
    private javax.swing.JLabel jLabel1_3;
    private javax.swing.JLabel jLabel1_4;
    private javax.swing.JLabel jLabel1_5;
    private javax.swing.JLabel jLabel2_1;
    private javax.swing.JLabel jLabel2_2;
    private javax.swing.JLabel jLabel2_3;
    private javax.swing.JLabel jLabel2_4;
    private javax.swing.JLabel jLabel2_5;
    private javax.swing.JLabel jLabel3_1;
    private javax.swing.JLabel jLabel3_2;
    private javax.swing.JLabel jLabel3_3;
    private javax.swing.JLabel jLabel3_4;
    private javax.swing.JLabel jLabel3_5;
    private javax.swing.JLabel jLabel4_1;
    private javax.swing.JLabel jLabel4_2;
    private javax.swing.JLabel jLabel4_3;
    private javax.swing.JLabel jLabel4_4;
    private javax.swing.JLabel jLabel4_5;
    private javax.swing.JLabel jLabel5_1;
    private javax.swing.JLabel jLabel5_2;
    private javax.swing.JLabel jLabel5_3;
    private javax.swing.JLabel jLabel5_4;
    private javax.swing.JLabel jLabel5_5;
    private javax.swing.JLabel jLabel6_1;
    private javax.swing.JLabel jLabel6_2;
    private javax.swing.JLabel jLabel6_3;
    private javax.swing.JLabel jLabel6_4;
    private javax.swing.JLabel jLabel6_5;
    private javax.swing.JLabel malLabel;
    private javax.swing.JPanel maljPanel;
    private javax.swing.JMenuBar menuSuperiorjMenuBar;
    private javax.swing.JRadioButtonMenuItem motorFicherojRadioButton;
    private javax.swing.JRadioButtonMenuItem motorTestjRadioButton;
    private javax.swing.ButtonGroup motoresButtonGroup;
    private javax.swing.JMenu motoresjMenu2;
    private javax.swing.JTextField palabraTextField;
    // End of variables declaration//GEN-END:variables
}
