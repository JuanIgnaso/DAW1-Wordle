/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.daw1.juan.wordle.gui;

import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.daw1.juan.wordle.motores.*;

/**
 *
 * @author juan navarrete
 */
public class MainGUI extends javax.swing.JFrame {
    
    private IMotor motor;

    protected static final java.awt.Color COLOR_VERDE = new java.awt.Color(0,153,0);
    protected static final java.awt.Color COLOR_AMARILLO = new java.awt.Color(255,153,51);
    protected static final java.awt.Color COLOR_ROJO = new java.awt.Color(255,0,0);
    protected static final java.awt.Color COLOR_OSCURO = new java.awt.Color(51,51,51);
    protected static final java.awt.Color COLOR_NORMAL = new java.awt.Color(204,204,204);
    protected static final java.awt.Color COLOR_BLANCO = new java.awt.Color(255,255,255);

    
    private Set <String> LETRAS_MAL = new TreeSet<>();
    private Set <String>LETRAS_CONTIENE=new TreeSet<>();
    private Set <String> LETRAS_BIEN = new TreeSet<>();
    
     private  String palabraDia;
    private static int INTENTOS = 0;
    private static final int MAX_INTENTOS = 6;
    private static final int TAMANO_PALABRA = 5;
    
    private final javax.swing.JLabel[][] labels = new javax.swing.JLabel[MAX_INTENTOS][TAMANO_PALABRA];
    

    
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        this.motor = motor;
        initComponents();
        inicializarLabels();
        ocultarLabels();
        this.bienjLabel.setVisible(true);
        this.existenLabel.setVisible(true);
        this.malLabel.setVisible(true);
        this.enviarButton.setEnabled(false);
         this.finaljLabel.setForeground(COLOR_VERDE);
         this.finaljLabel.setText("Escoje un Motor de Palabras.");
         this.ReiniciarjRadioButtonMenuItem1.setEnabled(false);
        this.palabraTextField.setEnabled(false);
       
    }
    
  
        //AFECTA A TODAS
        public void ocultarLabels(){
        for(int i = 0; i < labels.length; i++){
            JLabel[] label = labels[i];
            for(int j = 0; j < label.length; j++){
                JLabel jLabel = label[j];
                jLabel.setText(null);
                jLabel.setVisible(false);
                jLabel.setForeground(COLOR_BLANCO);
            }
        }
    }
        
 
    
    //AFECTA A FILA PASADA POR PARAMETRO
    public void testfila(int num){
        JLabel[] label = labels[num];
        for (int j = 0; j < TAMANO_PALABRA; j++) {
            JLabel jLabel = label[j];
            String actual = palabraDia.charAt(j)+"";
            jLabel.setText((this.palabraTextField.getText().charAt(j)+"").toUpperCase());
            jLabel.setVisible(true);
            if(((this.palabraTextField.getText().charAt(j)+"").toUpperCase()).equals(actual)){
                jLabel.setForeground(COLOR_VERDE);
                this.bienjLabel.setVisible(true);
                LETRAS_BIEN.add(((this.palabraTextField.getText().charAt(j)+"").toUpperCase())); 
                this.bienjLabel.setText(mostrarLetras(LETRAS_BIEN));
                                  
            }
            if(palabraDia.contains((this.palabraTextField.getText().charAt(j)+"").toUpperCase()) && !((this.palabraTextField.getText().charAt(j)+"").toUpperCase()).equals(actual)){
                jLabel.setForeground(COLOR_AMARILLO);
                this.existenLabel.setVisible(true);
                LETRAS_CONTIENE.add(((this.palabraTextField.getText().charAt(j)+"").toUpperCase()));               
                this.existenLabel.setText(mostrarLetras(LETRAS_CONTIENE));
               

            }
            
          if(!palabraDia.contains((this.palabraTextField.getText().charAt(j)+"").toUpperCase())){
                jLabel.setForeground(COLOR_ROJO);
                this.malLabel.setVisible(true);
                LETRAS_MAL.add(((this.palabraTextField.getText().charAt(j)+"").toUpperCase()));
                this.malLabel.setText(mostrarLetras(LETRAS_MAL));
                
            }
          
            
           
        }
    }
    
    private String mostrarLetras(Set<String>set){
        StringBuilder sb = new StringBuilder("");
        if(!set.isEmpty()){                
            for(String s : set){
                sb.append(" "+ s + " ");
            }
        }
           
        return sb.toString();
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
        InterfazbuttonGroup = new javax.swing.ButtonGroup();
        ArchivobuttonGroup = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
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
        ReiniciarjRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        Salir = new javax.swing.JRadioButtonMenuItem();
        motoresjMenu2 = new javax.swing.JMenu();
        motorTestjRadioButton = new javax.swing.JRadioButtonMenuItem();
        motorFicherojRadioButton = new javax.swing.JRadioButtonMenuItem();
        motorBDesjRadioButton = new javax.swing.JRadioButtonMenuItem();
        motorBDgljRadioButton = new javax.swing.JRadioButtonMenuItem();
        configjMenuItem = new javax.swing.JMenuItem();
        backgroundjMenu = new javax.swing.JMenu();
        NormaljRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        OscurojRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DAW1 Wordle Juan");
        setPreferredSize(new java.awt.Dimension(500, 550));

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
        existenLabel.setForeground(new java.awt.Color(255, 153, 51));
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
        archivojMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivojMenu1ActionPerformed(evt);
            }
        });

        ArchivobuttonGroup.add(ReiniciarjRadioButtonMenuItem1);
        ReiniciarjRadioButtonMenuItem1.setText("Nueva Partida");
        ReiniciarjRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarjRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        archivojMenu1.add(ReiniciarjRadioButtonMenuItem1);

        ArchivobuttonGroup.add(Salir);
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        archivojMenu1.add(Salir);

        menuSuperiorjMenuBar.add(archivojMenu1);

        motoresjMenu2.setBackground(new java.awt.Color(204, 204, 204));
        motoresjMenu2.setForeground(new java.awt.Color(51, 51, 51));
        motoresjMenu2.setText("Motores");
        motoresjMenu2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        motoresjMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motoresjMenu2ActionPerformed(evt);
            }
        });

        motoresButtonGroup.add(motorTestjRadioButton);
        motorTestjRadioButton.setText("Motor Test");
        motorTestjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorTestjRadioButtonActionPerformed(evt);
            }
        });
        motoresjMenu2.add(motorTestjRadioButton);

        motoresButtonGroup.add(motorFicherojRadioButton);
        motorFicherojRadioButton.setText("Motor Fichero");
        motorFicherojRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorFicherojRadioButtonActionPerformed(evt);
            }
        });
        motoresjMenu2.add(motorFicherojRadioButton);

        motoresButtonGroup.add(motorBDesjRadioButton);
        motorBDesjRadioButton.setText("Motor Castellano");
        motorBDesjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorBDesjRadioButtonActionPerformed(evt);
            }
        });
        motoresjMenu2.add(motorBDesjRadioButton);

        motoresButtonGroup.add(motorBDgljRadioButton);
        motorBDgljRadioButton.setText("Motor Galego");
        motorBDgljRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorBDgljRadioButtonActionPerformed(evt);
            }
        });
        motoresjMenu2.add(motorBDgljRadioButton);

        configjMenuItem.setText("Configurar Motor");
        configjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configjMenuItemActionPerformed(evt);
            }
        });
        motoresjMenu2.add(configjMenuItem);

        menuSuperiorjMenuBar.add(motoresjMenu2);

        backgroundjMenu.setBackground(new java.awt.Color(204, 204, 204));
        backgroundjMenu.setForeground(new java.awt.Color(0, 0, 0));
        backgroundjMenu.setText("Interfaz");
        backgroundjMenu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        backgroundjMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundjMenuActionPerformed(evt);
            }
        });

        InterfazbuttonGroup.add(NormaljRadioButtonMenuItem);
        NormaljRadioButtonMenuItem.setSelected(true);
        NormaljRadioButtonMenuItem.setText("Default");
        NormaljRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormaljRadioButtonMenuItemActionPerformed(evt);
            }
        });
        backgroundjMenu.add(NormaljRadioButtonMenuItem);

        InterfazbuttonGroup.add(OscurojRadioButtonMenuItem2);
        OscurojRadioButtonMenuItem2.setText("Oscuro");
        OscurojRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OscurojRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        backgroundjMenu.add(OscurojRadioButtonMenuItem2);

        menuSuperiorjMenuBar.add(backgroundjMenu);

        setJMenuBar(menuSuperiorjMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
       try{        
        if(!Pattern.compile("[a-zA-Z]{5}").matcher(this.palabraTextField.getText()).matches()){           
            errorjLabel.setVisible(true);
            errorjLabel.setText("Largo de palabra incorrecto.");
            this.palabraTextField.setText(null);
         }else if(!motor.existePalabra(this.palabraTextField.getText().toUpperCase())){ //SI LA PALABRA INTRODUCIDA NO EXISTE EN EL DICCIONARIO
            errorjLabel.setVisible(true);
            errorjLabel.setText("La palabra no existe.");
            this.palabraTextField.setText(null);
         }else if(INTENTOS == 5 && !(this.palabraTextField.getText().toUpperCase()).equals(palabraDia)){ //SI HA AGOTADO TODOS LOS INTENTOS
            testfila(INTENTOS);
            this.enviarButton.setEnabled(false);
            this.palabraTextField.setEnabled(false);
            this.finaljLabel.setForeground(COLOR_ROJO);           
            this.finaljLabel.setText("Has Perdido, Intentar Otra vez?.");       
         }else if((this.palabraTextField.getText().toUpperCase()).equals(palabraDia) && INTENTOS < MAX_INTENTOS){ //SI EL JUGADOR A GANADO
             this.finaljLabel.setForeground(COLOR_VERDE);
             this.finaljLabel.setText("Has Ganado! Intentos" + (INTENTOS + 1));
             testfila(INTENTOS);
             errorjLabel.setText("");
             this.enviarButton.setEnabled(false);
             this.palabraTextField.setEnabled(false);
             this.palabraTextField.setText(null);
             this.palabraTextField.invalidate();
         }else{ //SI LA PALABRA INTRODUCIDA EXISTE DENTRO DEL MOTOR Y CUMPLE CON EL PARÁMETRO DE 5 LETRAS
             testfila(INTENTOS);
             INTENTOS++;
             this.palabraTextField.setText(null);
              errorjLabel.setText("");
         }
        LETRAS_CONTIENE.removeAll(LETRAS_BIEN);
        this.existenLabel.setText(mostrarLetras(LETRAS_CONTIENE));
       }catch(SQLException | FileNotFoundException  ex){
         JOptionPane.showMessageDialog(this, "Error en el programa" + ex.getMessage());   
     }
       catch(IOException ex){
        JOptionPane.showMessageDialog(this, "Error al leer el archivo" + ex.getMessage());

       }
    }//GEN-LAST:event_enviarButtonActionPerformed

    private void motorTestjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorTestjRadioButtonActionPerformed
       seleccionarMotor();
    }//GEN-LAST:event_motorTestjRadioButtonActionPerformed

    private void motorFicherojRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorFicherojRadioButtonActionPerformed
       seleccionarMotor();
    }//GEN-LAST:event_motorFicherojRadioButtonActionPerformed

    private void archivojMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivojMenu1ActionPerformed
           
    }//GEN-LAST:event_archivojMenu1ActionPerformed

    //METODO PARA REINICIAR EL JUEGO
    private void reiniciarPartida(){
       try{
        INTENTOS = 0;
            ocultarLabels();
            palabraDia = motor.obtenerPalabraAleatoria();
            LETRAS_BIEN.clear();
            LETRAS_CONTIENE.clear();
            LETRAS_MAL.clear(); 
            this.existenLabel.setText("");
            this.malLabel.setText("");
            this.bienjLabel.setText("");
             this.finaljLabel.setText("");
             this.palabraTextField.setText(null);
             errorjLabel.setText("");
             enviarButton.setEnabled(true);
             this.palabraTextField.setEnabled(true);
       }catch(SQLException ex){
         JOptionPane.showMessageDialog(this, "Error en el programa" + ex.getMessage());   
     }
    }
    
    private void ReiniciarjRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarjRadioButtonMenuItem1ActionPerformed
       if(this.isActive()){
            reiniciarPartida();       
       }
    }//GEN-LAST:event_ReiniciarjRadioButtonMenuItem1ActionPerformed

    private void motoresjMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motoresjMenu2ActionPerformed
        seleccionarMotor();
    }//GEN-LAST:event_motoresjMenu2ActionPerformed

    private void motorBDesjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorBDesjRadioButtonActionPerformed
        seleccionarMotor();
    }//GEN-LAST:event_motorBDesjRadioButtonActionPerformed

    private void motorBDgljRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorBDgljRadioButtonActionPerformed
        seleccionarMotor();
    }//GEN-LAST:event_motorBDgljRadioButtonActionPerformed

    private void configjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configjMenuItemActionPerformed
       try{ 
        GestorMotorGUI gestorMotor = new GestorMotorGUI(this,true,this.motor);
        
        gestorMotor.setVisible(true);
        if(motor.hayPalabras()){
        reiniciarPartida(); 
        }
       }catch(SQLException ex){
         JOptionPane.showMessageDialog(this, "Error en el programa" + ex.getMessage());
     
     }
    }//GEN-LAST:event_configjMenuItemActionPerformed

    private void backgroundjMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundjMenuActionPerformed
        cambiarInterfaz();
    }//GEN-LAST:event_backgroundjMenuActionPerformed

    private void NormaljRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormaljRadioButtonMenuItemActionPerformed
       cambiarInterfaz();
    }//GEN-LAST:event_NormaljRadioButtonMenuItemActionPerformed

    private void OscurojRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OscurojRadioButtonMenuItem2ActionPerformed
       cambiarInterfaz();
    }//GEN-LAST:event_OscurojRadioButtonMenuItem2ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        if(this.isActive()){
            System.exit(0);
        }
        
    }//GEN-LAST:event_SalirActionPerformed

    private void cambiarInterfaz(){
        if(this.NormaljRadioButtonMenuItem.isSelected()){
            this.BottomjPanel.setBackground(COLOR_NORMAL);
            this.estadoActualjPanel.setBackground(COLOR_NORMAL);
            this.existenjPanel.setBackground(COLOR_NORMAL);
            this.maljPanel.setBackground(COLOR_NORMAL);
            this.ExitojPanel.setBackground(COLOR_NORMAL);
            this.bienjPanel.setBackground(COLOR_NORMAL);
            this.MainjPanel.setBackground(COLOR_NORMAL);
            this.JuegoInputjPanel.setBackground(COLOR_NORMAL);
            this.ErrorjPanel.setBackground(COLOR_NORMAL);


        }
        if(this.OscurojRadioButtonMenuItem2.isSelected()){
            this.BottomjPanel.setBackground(COLOR_OSCURO);
            this.estadoActualjPanel.setBackground(COLOR_OSCURO);
            this.existenjPanel.setBackground(COLOR_OSCURO);
            this.maljPanel.setBackground(COLOR_OSCURO);
            this.ExitojPanel.setBackground(COLOR_OSCURO);
            this.bienjPanel.setBackground(COLOR_OSCURO);
            this.MainjPanel.setBackground(COLOR_OSCURO);
            this.JuegoInputjPanel.setBackground(COLOR_OSCURO);
            this.ErrorjPanel.setBackground(COLOR_OSCURO);


        }
    }
    
    private void seleccionarMotor(){
       try{
         if(this.motorTestjRadioButton.isSelected()){
            motor = new MotorTest();
            motor.obtenerPalabraAleatoria();
            palabraDia  =  motor.obtenerPalabraAleatoria();
            reiniciarPartida();
             this.errorjLabel.setText("Seleccionado el motor Test.");
        }
         if(this.motorFicherojRadioButton.isSelected()){
           motor = new MotorFichero();
           if(!motor.hayPalabras()){
               this.errorjLabel.setText("El Motor no contiene palabras.");
             this.enviarButton.setEnabled(false);
             this.palabraTextField.setEnabled(false);
           }else{
           motor.obtenerPalabraAleatoria();
           palabraDia  =  motor.obtenerPalabraAleatoria();
           reiniciarPartida();
           this.errorjLabel.setText("Seleccionado el motor Fichero."); 
           }      
       } 
         if(this.motorBDesjRadioButton.isSelected()){
           motor = new MotorBD("es");
           if(!motor.hayPalabras()){
                this.errorjLabel.setText("El Motor no contiene palabras.");
             this.enviarButton.setEnabled(false);
             this.palabraTextField.setEnabled(false);
           }else{
           motor.obtenerPalabraAleatoria();
           palabraDia  =  motor.obtenerPalabraAleatoria();
           reiniciarPartida();
           this.errorjLabel.setText("Seleccionado el motor Español."); 
           }

       }
         if(this.motorBDgljRadioButton.isSelected()){
           motor = new MotorBD("gl");
           if(!motor.hayPalabras()){
             this.errorjLabel.setText("El Motor no contiene palabras.");
             this.enviarButton.setEnabled(false);
             this.palabraTextField.setEnabled(false);  
           }else{
           motor.obtenerPalabraAleatoria();
           palabraDia  =  motor.obtenerPalabraAleatoria();
           reiniciarPartida();
           this.errorjLabel.setText("Seleccionado el motor Galego.");  
           }

       }
        this.ReiniciarjRadioButtonMenuItem1.setEnabled(true);
        this.palabraTextField.setEnabled(true);
       }catch(SQLException ex){
         JOptionPane.showMessageDialog(this, "Error en el programa" + ex.getMessage());
     
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
    private javax.swing.ButtonGroup ArchivobuttonGroup;
    private javax.swing.JPanel BottomjPanel;
    private javax.swing.JPanel ErrorjPanel;
    private javax.swing.JPanel ExitojPanel;
    private javax.swing.ButtonGroup InterfazbuttonGroup;
    private javax.swing.JPanel JuegoInputjPanel;
    private javax.swing.JPanel MainjPanel;
    private javax.swing.JRadioButtonMenuItem NormaljRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem OscurojRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem ReiniciarjRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem Salir;
    private javax.swing.JPanel ZonaLetrasjPanel;
    private javax.swing.JMenu archivojMenu1;
    private javax.swing.JMenu backgroundjMenu;
    private javax.swing.JLabel bienjLabel;
    private javax.swing.JPanel bienjPanel;
    private javax.swing.JMenuItem configjMenuItem;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel malLabel;
    private javax.swing.JPanel maljPanel;
    private javax.swing.JMenuBar menuSuperiorjMenuBar;
    private javax.swing.JRadioButtonMenuItem motorBDesjRadioButton;
    private javax.swing.JRadioButtonMenuItem motorBDgljRadioButton;
    private javax.swing.JRadioButtonMenuItem motorFicherojRadioButton;
    private javax.swing.JRadioButtonMenuItem motorTestjRadioButton;
    private javax.swing.ButtonGroup motoresButtonGroup;
    private javax.swing.JMenu motoresjMenu2;
    private javax.swing.JTextField palabraTextField;
    // End of variables declaration//GEN-END:variables
}
