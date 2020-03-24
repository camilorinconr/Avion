/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import modelo.Avion;
import modelo.Pasajero;
import modelo.Silla;

/**
 *
 * @author CAMILO
 */
public class Vista extends javax.swing.JFrame {

    RegistrarPasajero r = new RegistrarPasajero();
    private Silla pSilla;

    public Vista() {
        initComponents();
         datosPasajero abrir = new datosPasajero();
         abrir.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        btnporcentaje = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnopcion1 = new javax.swing.JButton();
        btnopcion2 = new javax.swing.JButton();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        s8 = new javax.swing.JLabel();
        s10 = new javax.swing.JLabel();
        s11 = new javax.swing.JLabel();
        s15 = new javax.swing.JLabel();
        s16 = new javax.swing.JLabel();
        s17 = new javax.swing.JLabel();
        s27 = new javax.swing.JLabel();
        s23 = new javax.swing.JLabel();
        s22 = new javax.swing.JLabel();
        s21 = new javax.swing.JLabel();
        s29 = new javax.swing.JLabel();
        s28 = new javax.swing.JLabel();
        s33 = new javax.swing.JLabel();
        s34 = new javax.swing.JLabel();
        s35 = new javax.swing.JLabel();
        s39 = new javax.swing.JLabel();
        s40 = new javax.swing.JLabel();
        s41 = new javax.swing.JLabel();
        s36 = new javax.swing.JLabel();
        s37 = new javax.swing.JLabel();
        s38 = new javax.swing.JLabel();
        s42 = new javax.swing.JLabel();
        s43 = new javax.swing.JLabel();
        s44 = new javax.swing.JLabel();
        s12 = new javax.swing.JLabel();
        s13 = new javax.swing.JLabel();
        s14 = new javax.swing.JLabel();
        s18 = new javax.swing.JLabel();
        s19 = new javax.swing.JLabel();
        s20 = new javax.swing.JLabel();
        s30 = new javax.swing.JLabel();
        s26 = new javax.swing.JLabel();
        s25 = new javax.swing.JLabel();
        s24 = new javax.swing.JLabel();
        s32 = new javax.swing.JLabel();
        s31 = new javax.swing.JLabel();
        s45 = new javax.swing.JLabel();
        s46 = new javax.swing.JLabel();
        s47 = new javax.swing.JLabel();
        s48 = new javax.swing.JLabel();
        s49 = new javax.swing.JLabel();
        s50 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        s9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(690, 593));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/titulo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 133);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/derecha.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 140, 200, 360);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/izquierda.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 139, 210, 360);

        btnregistrar.setText("Registrar Pasajero");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar);
        btnregistrar.setBounds(20, 510, 179, 23);

        btnporcentaje.setText("Porcentaje Ocupacion");
        btnporcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporcentajeActionPerformed(evt);
            }
        });
        getContentPane().add(btnporcentaje);
        btnporcentaje.setBounds(20, 540, 179, 23);

        btneliminar.setText("Eliminar Pasajero");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(250, 510, 201, 23);

        btnopcion1.setText("Opcion 1");
        getContentPane().add(btnopcion1);
        btnopcion1.setBounds(250, 540, 201, 23);

        btnbuscar.setText("Buscar Pasajero");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(500, 510, 170, 23);

        btnopcion2.setText("Opcion 2");
        getContentPane().add(btnopcion2);
        btnopcion2.setBounds(500, 540, 170, 23);

        s1.setBackground(new java.awt.Color(255, 255, 51));
        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s1.setText("1");
        s1.setToolTipText("");
        s1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s1.setOpaque(true);
        getContentPane().add(s1);
        s1.setBounds(241, 159, 25, 27);

        s2.setBackground(new java.awt.Color(255, 255, 51));
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setText("2");
        s2.setToolTipText("");
        s2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s2.setOpaque(true);
        getContentPane().add(s2);
        s2.setBounds(303, 159, 25, 27);

        s5.setBackground(new java.awt.Color(255, 255, 51));
        s5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s5.setText("5");
        s5.setToolTipText("");
        s5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s5.setOpaque(true);
        getContentPane().add(s5);
        s5.setBounds(241, 193, 25, 27);

        s6.setBackground(new java.awt.Color(255, 255, 51));
        s6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s6.setText("6");
        s6.setToolTipText("");
        s6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s6.setOpaque(true);
        getContentPane().add(s6);
        s6.setBounds(303, 193, 25, 27);

        s3.setBackground(new java.awt.Color(255, 255, 51));
        s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s3.setText("3");
        s3.setToolTipText("");
        s3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s3.setOpaque(true);
        getContentPane().add(s3);
        s3.setBounds(390, 160, 25, 27);

        s4.setBackground(new java.awt.Color(255, 255, 51));
        s4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s4.setText("4");
        s4.setToolTipText("");
        s4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s4.setOpaque(true);
        getContentPane().add(s4);
        s4.setBounds(450, 160, 25, 27);

        s7.setBackground(new java.awt.Color(255, 255, 51));
        s7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s7.setText("7");
        s7.setToolTipText("");
        s7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s7.setOpaque(true);
        getContentPane().add(s7);
        s7.setBounds(390, 190, 25, 27);

        s8.setBackground(new java.awt.Color(255, 255, 51));
        s8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s8.setText("8");
        s8.setToolTipText("");
        s8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s8.setOpaque(true);
        getContentPane().add(s8);
        s8.setBounds(450, 190, 25, 27);

        s10.setBackground(new java.awt.Color(51, 102, 255));
        s10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s10.setText("10");
        s10.setToolTipText("");
        s10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s10.setOpaque(true);
        getContentPane().add(s10);
        s10.setBounds(270, 240, 25, 27);

        s11.setBackground(new java.awt.Color(51, 102, 255));
        s11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s11.setText("11");
        s11.setToolTipText("");
        s11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s11.setOpaque(true);
        getContentPane().add(s11);
        s11.setBounds(300, 240, 25, 27);

        s15.setBackground(new java.awt.Color(51, 102, 255));
        s15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s15.setText("15");
        s15.setToolTipText("");
        s15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s15.setOpaque(true);
        getContentPane().add(s15);
        s15.setBounds(240, 270, 25, 27);

        s16.setBackground(new java.awt.Color(51, 102, 255));
        s16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s16.setText("16");
        s16.setToolTipText("");
        s16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s16.setOpaque(true);
        getContentPane().add(s16);
        s16.setBounds(270, 270, 25, 27);

        s17.setBackground(new java.awt.Color(51, 102, 255));
        s17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s17.setText("17");
        s17.setToolTipText("");
        s17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s17.setOpaque(true);
        getContentPane().add(s17);
        s17.setBounds(300, 270, 25, 27);

        s27.setBackground(new java.awt.Color(51, 102, 255));
        s27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s27.setText("27");
        s27.setToolTipText("");
        s27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s27.setOpaque(true);
        getContentPane().add(s27);
        s27.setBounds(240, 330, 25, 27);

        s23.setBackground(new java.awt.Color(51, 102, 255));
        s23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s23.setText("23");
        s23.setToolTipText("");
        s23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s23.setOpaque(true);
        getContentPane().add(s23);
        s23.setBounds(300, 300, 25, 27);

        s22.setBackground(new java.awt.Color(51, 102, 255));
        s22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s22.setText("22");
        s22.setToolTipText("");
        s22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s22.setOpaque(true);
        getContentPane().add(s22);
        s22.setBounds(270, 300, 25, 27);

        s21.setBackground(new java.awt.Color(51, 102, 255));
        s21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s21.setText("21");
        s21.setToolTipText("");
        s21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s21.setOpaque(true);
        getContentPane().add(s21);
        s21.setBounds(240, 300, 25, 27);

        s29.setBackground(new java.awt.Color(51, 102, 255));
        s29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s29.setText("29");
        s29.setToolTipText("");
        s29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s29.setOpaque(true);
        getContentPane().add(s29);
        s29.setBounds(300, 330, 25, 27);

        s28.setBackground(new java.awt.Color(51, 102, 255));
        s28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s28.setText("28");
        s28.setToolTipText("");
        s28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s28.setOpaque(true);
        getContentPane().add(s28);
        s28.setBounds(270, 330, 25, 27);

        s33.setBackground(new java.awt.Color(51, 102, 255));
        s33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s33.setText("33");
        s33.setToolTipText("");
        s33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s33.setOpaque(true);
        getContentPane().add(s33);
        s33.setBounds(240, 360, 25, 27);

        s34.setBackground(new java.awt.Color(51, 102, 255));
        s34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s34.setText("34");
        s34.setToolTipText("");
        s34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s34.setOpaque(true);
        getContentPane().add(s34);
        s34.setBounds(270, 360, 25, 27);

        s35.setBackground(new java.awt.Color(51, 102, 255));
        s35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s35.setText("35");
        s35.setToolTipText("");
        s35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s35.setOpaque(true);
        getContentPane().add(s35);
        s35.setBounds(300, 360, 25, 27);

        s39.setBackground(new java.awt.Color(51, 102, 255));
        s39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s39.setText("39");
        s39.setToolTipText("");
        s39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s39.setOpaque(true);
        getContentPane().add(s39);
        s39.setBounds(240, 390, 25, 27);

        s40.setBackground(new java.awt.Color(51, 102, 255));
        s40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s40.setText("40");
        s40.setToolTipText("");
        s40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s40.setOpaque(true);
        getContentPane().add(s40);
        s40.setBounds(270, 390, 25, 27);

        s41.setBackground(new java.awt.Color(51, 102, 255));
        s41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s41.setText("41");
        s41.setToolTipText("");
        s41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s41.setOpaque(true);
        getContentPane().add(s41);
        s41.setBounds(300, 390, 25, 27);

        s36.setBackground(new java.awt.Color(51, 102, 255));
        s36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s36.setText("36");
        s36.setToolTipText("");
        s36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s36.setOpaque(true);
        getContentPane().add(s36);
        s36.setBounds(390, 360, 25, 27);

        s37.setBackground(new java.awt.Color(51, 102, 255));
        s37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s37.setText("37");
        s37.setToolTipText("");
        s37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s37.setOpaque(true);
        getContentPane().add(s37);
        s37.setBounds(420, 360, 25, 27);

        s38.setBackground(new java.awt.Color(51, 102, 255));
        s38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s38.setText("38");
        s38.setToolTipText("");
        s38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s38.setOpaque(true);
        getContentPane().add(s38);
        s38.setBounds(450, 360, 25, 27);

        s42.setBackground(new java.awt.Color(51, 102, 255));
        s42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s42.setText("42");
        s42.setToolTipText("");
        s42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s42.setOpaque(true);
        getContentPane().add(s42);
        s42.setBounds(390, 390, 25, 27);

        s43.setBackground(new java.awt.Color(51, 102, 255));
        s43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s43.setText("43");
        s43.setToolTipText("");
        s43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s43.setOpaque(true);
        getContentPane().add(s43);
        s43.setBounds(420, 390, 25, 27);

        s44.setBackground(new java.awt.Color(51, 102, 255));
        s44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s44.setText("44");
        s44.setToolTipText("");
        s44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s44.setOpaque(true);
        getContentPane().add(s44);
        s44.setBounds(450, 390, 25, 27);

        s12.setBackground(new java.awt.Color(51, 102, 255));
        s12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s12.setText("12");
        s12.setToolTipText("");
        s12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s12.setOpaque(true);
        getContentPane().add(s12);
        s12.setBounds(390, 240, 25, 27);

        s13.setBackground(new java.awt.Color(51, 102, 255));
        s13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s13.setText("13");
        s13.setToolTipText("");
        s13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s13.setOpaque(true);
        getContentPane().add(s13);
        s13.setBounds(420, 240, 25, 27);

        s14.setBackground(new java.awt.Color(51, 102, 255));
        s14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s14.setText("14");
        s14.setToolTipText("");
        s14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s14.setOpaque(true);
        getContentPane().add(s14);
        s14.setBounds(450, 240, 25, 27);

        s18.setBackground(new java.awt.Color(51, 102, 255));
        s18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s18.setText("18");
        s18.setToolTipText("");
        s18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s18.setOpaque(true);
        getContentPane().add(s18);
        s18.setBounds(390, 270, 25, 27);

        s19.setBackground(new java.awt.Color(51, 102, 255));
        s19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s19.setText("19");
        s19.setToolTipText("");
        s19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s19.setOpaque(true);
        getContentPane().add(s19);
        s19.setBounds(420, 270, 25, 27);

        s20.setBackground(new java.awt.Color(51, 102, 255));
        s20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s20.setText("20");
        s20.setToolTipText("");
        s20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s20.setOpaque(true);
        getContentPane().add(s20);
        s20.setBounds(450, 270, 25, 27);

        s30.setBackground(new java.awt.Color(51, 102, 255));
        s30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s30.setText("30");
        s30.setToolTipText("");
        s30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s30.setOpaque(true);
        getContentPane().add(s30);
        s30.setBounds(390, 330, 25, 27);

        s26.setBackground(new java.awt.Color(51, 102, 255));
        s26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s26.setText("26");
        s26.setToolTipText("");
        s26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s26.setOpaque(true);
        getContentPane().add(s26);
        s26.setBounds(450, 300, 25, 27);

        s25.setBackground(new java.awt.Color(51, 102, 255));
        s25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s25.setText("25");
        s25.setToolTipText("");
        s25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s25.setOpaque(true);
        getContentPane().add(s25);
        s25.setBounds(420, 300, 25, 27);

        s24.setBackground(new java.awt.Color(51, 102, 255));
        s24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s24.setText("24");
        s24.setToolTipText("");
        s24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s24.setOpaque(true);
        getContentPane().add(s24);
        s24.setBounds(390, 300, 25, 27);

        s32.setBackground(new java.awt.Color(51, 102, 255));
        s32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s32.setText("32");
        s32.setToolTipText("");
        s32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s32.setOpaque(true);
        getContentPane().add(s32);
        s32.setBounds(450, 330, 25, 27);

        s31.setBackground(new java.awt.Color(51, 102, 255));
        s31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s31.setText("31");
        s31.setToolTipText("");
        s31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s31.setOpaque(true);
        getContentPane().add(s31);
        s31.setBounds(420, 330, 25, 27);

        s45.setBackground(new java.awt.Color(51, 102, 255));
        s45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s45.setText("45");
        s45.setToolTipText("");
        s45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s45.setOpaque(true);
        getContentPane().add(s45);
        s45.setBounds(240, 420, 25, 27);

        s46.setBackground(new java.awt.Color(51, 102, 255));
        s46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s46.setText("46");
        s46.setToolTipText("");
        s46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s46.setOpaque(true);
        getContentPane().add(s46);
        s46.setBounds(270, 420, 25, 27);

        s47.setBackground(new java.awt.Color(51, 102, 255));
        s47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s47.setText("47");
        s47.setToolTipText("");
        s47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s47.setOpaque(true);
        getContentPane().add(s47);
        s47.setBounds(300, 420, 25, 27);

        s48.setBackground(new java.awt.Color(51, 102, 255));
        s48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s48.setText("48");
        s48.setToolTipText("");
        s48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s48.setOpaque(true);
        getContentPane().add(s48);
        s48.setBounds(390, 420, 25, 27);

        s49.setBackground(new java.awt.Color(51, 102, 255));
        s49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s49.setText("49");
        s49.setToolTipText("");
        s49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s49.setOpaque(true);
        getContentPane().add(s49);
        s49.setBounds(420, 420, 25, 27);

        s50.setBackground(new java.awt.Color(51, 102, 255));
        s50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s50.setText("50");
        s50.setToolTipText("");
        s50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s50.setOpaque(true);
        getContentPane().add(s50);
        s50.setBounds(450, 420, 25, 27);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 34, 14);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 34, 14);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 34, 14);

        s9.setBackground(new java.awt.Color(51, 102, 255));
        s9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s9.setText("9");
        s9.setToolTipText("");
        s9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        s9.setOpaque(true);
        getContentPane().add(s9);
        s9.setBounds(240, 240, 25, 27);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 34, 14);

        jLabel10.setBackground(new java.awt.Color(255, 255, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/centro.png"))); // NOI18N
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 140, 280, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
   
                r.setVisible(true);
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed


    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnporcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporcentajeActionPerformed
        Avion avion = new Avion();
        double porcentaje;
        porcentaje = avion.calcularPorcentajeOcupacion();
        DecimalFormat df = (DecimalFormat) NumberFormat.getInstance();
        df.applyPattern("###.##");
        JOptionPane.showMessageDialog(this, "El porcentaje de ocupación es " + df.format(porcentaje) + "%", "Ocupación del avión", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_btnporcentajeActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        String cedula = JOptionPane.showInputDialog(this, "Ingrese el número de cédula", "Buscar pasajero", JOptionPane.QUESTION_MESSAGE);
        if (cedula != null && !cedula.isEmpty()) {

            //datosPasajero = new datosPasajero();
            Pasajero pasajero = new Pasajero(cedula, " no importa");
            Silla silla = new Silla();
            Avion avion = new Avion();

            silla = avion.buscarPasajero(pasajero);
            datosPasajero s = new datosPasajero();
            s.setVisible(true);

            if (silla != null) {

                RegistrarPasajero registrar = new RegistrarPasajero();
                registrar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "El pasajero no se encuentra registrado", "Buscar pasajero", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton btnbuscar = new javax.swing.JButton();
    public javax.swing.JButton btneliminar;
    public javax.swing.JButton btnopcion1;
    public javax.swing.JButton btnopcion2;
    public javax.swing.JButton btnporcentaje;
    public javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel s1;
    public static javax.swing.JLabel s10;
    public static javax.swing.JLabel s11;
    public static javax.swing.JLabel s12;
    public static javax.swing.JLabel s13;
    public static javax.swing.JLabel s14;
    public static javax.swing.JLabel s15;
    public static javax.swing.JLabel s16;
    public static javax.swing.JLabel s17;
    public static javax.swing.JLabel s18;
    public static javax.swing.JLabel s19;
    public static javax.swing.JLabel s2;
    public static javax.swing.JLabel s20;
    public static javax.swing.JLabel s21;
    private javax.swing.JLabel s22;
    public static javax.swing.JLabel s23;
    public static javax.swing.JLabel s24;
    public static javax.swing.JLabel s25;
    public static javax.swing.JLabel s26;
    public static javax.swing.JLabel s27;
    public static javax.swing.JLabel s28;
    public static javax.swing.JLabel s29;
    public static javax.swing.JLabel s3;
    public static javax.swing.JLabel s30;
    public static javax.swing.JLabel s31;
    public static javax.swing.JLabel s32;
    public static javax.swing.JLabel s33;
    public static javax.swing.JLabel s34;
    public static javax.swing.JLabel s35;
    public static javax.swing.JLabel s36;
    public static javax.swing.JLabel s37;
    public static javax.swing.JLabel s38;
    public static javax.swing.JLabel s39;
    public static javax.swing.JLabel s4;
    public static javax.swing.JLabel s40;
    public static javax.swing.JLabel s41;
    public static javax.swing.JLabel s42;
    public static javax.swing.JLabel s43;
    public static javax.swing.JLabel s44;
    public static javax.swing.JLabel s45;
    public static javax.swing.JLabel s46;
    public static javax.swing.JLabel s47;
    public static javax.swing.JLabel s48;
    public static javax.swing.JLabel s49;
    public static javax.swing.JLabel s5;
    public static javax.swing.JLabel s50;
    public static javax.swing.JLabel s6;
    public static javax.swing.JLabel s7;
    public static javax.swing.JLabel s8;
    public static javax.swing.JLabel s9;
    // End of variables declaration//GEN-END:variables

    private void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
