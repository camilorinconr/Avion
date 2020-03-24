package vista;

import javax.swing.JOptionPane;
import modelo.Avion;

import modelo.Clase;

import modelo.Pasajero;
import modelo.Silla;
import modelo.Ubicacion;
import vista.datosPasajero;

/**
 *
 * @author CAMILO
 */
public class RegistrarPasajero extends javax.swing.JFrame {

    Silla silla = new Silla();

    /*
     * Creates new form RegistrarPasajero
     */
    public RegistrarPasajero() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jSlider1 = new javax.swing.JSlider();
        panaledatos = new javax.swing.JPanel();
        lnombe = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lcedula = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        lclase = new javax.swing.JLabel();
        boxclase = new javax.swing.JComboBox();
        boxubicacion = new javax.swing.JComboBox();
        lubicacion = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panaledatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Pasajero"));
        panaledatos.setToolTipText("");

        lnombe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lnombe.setText("Nombre");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        lcedula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lcedula.setText("Cedula");

        lclase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lclase.setText("Clase");

        boxclase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ECONOMICA", "EJECUTIVA" }));
        boxclase.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        boxclase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxclaseActionPerformed(evt);
            }
        });

        boxubicacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VENTANA", "CENTRAL", "PASILLO" }));
        boxubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxubicacionActionPerformed(evt);
            }
        });

        lubicacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lubicacion.setText("Ubucacion");

        btnregistrar.setText("Registar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panaledatosLayout = new javax.swing.GroupLayout(panaledatos);
        panaledatos.setLayout(panaledatosLayout);
        panaledatosLayout.setHorizontalGroup(
            panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panaledatosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnombe)
                    .addComponent(lcedula))
                .addGap(37, 37, 37)
                .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtnombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panaledatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panaledatosLayout.createSequentialGroup()
                        .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panaledatosLayout.createSequentialGroup()
                        .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lubicacion)
                            .addComponent(lclase))
                        .addGap(35, 35, 35)
                        .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxclase, 0, 117, Short.MAX_VALUE)
                            .addComponent(boxubicacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        panaledatosLayout.setVerticalGroup(
            panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panaledatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnombe)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcedula)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lclase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lubicacion)
                    .addComponent(boxubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panaledatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(panaledatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panaledatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panaledatos.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed

    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        Clase clase = null;
        Ubicacion ubicacion = null;
        Pasajero pasajero;
        Avion avion = null;
        datosPasajero datos;
        Vista vista;

        String nombre = txtnombre.getText();
        String cedula = txtcedula.getText();
        // String comclase = boxclase.getSelectedItem().toString();
        //String comubicacion = boxubicacion.getSelectedItem().toString();
        //txtnombre.setText("");
        //txtcedula.setText("");

        if (nombre == null || nombre.equals(" ")) {
            JOptionPane.showMessageDialog(this, "El nombre es requerida", " Registro", JOptionPane.ERROR_MESSAGE);

        } else {
            if (cedula == null || cedula.equals(" ")) {
                JOptionPane.showMessageDialog(this, "La cedula es requerida", " Registro", JOptionPane.ERROR_MESSAGE);
            } else {
                // crea al pasajero
                pasajero = new Pasajero(nombre, cedula);

                //verifica que no este ya el pasajero registrado
                Silla silla = avion.buscarPasajero(pasajero);

                if (silla != null) {
                    JOptionPane.showMessageDialog(this, "El pasajero ya tiene una silla asignada", "Registro", JOptionPane.ERROR_MESSAGE);
                } else {
                    //registra el pasajero
                    String comclase = boxclase.getSelectedItem().toString();
                    // String sclase = (String) boxclase.getSelectedItem();
                    if (comclase.equals(clase.EJERCUTIVA)) {
                        datosPasajero.gclase.setText(comclase);
                    } else {
                        datosPasajero.gclase.setText(comclase);
                    }
                    String comubicacion = boxubicacion.getSelectedItem().toString();
                    //String subucacion = (String) boxubicacion.getSelectedItem();
                    if (comubicacion.equals(ubicacion.VENTANA)) {
                        datosPasajero.gubicacion.setText(comubicacion);
                    } else if (comubicacion.equals(ubicacion.PASILLO)) {
                        datosPasajero.gubicacion.setText(comubicacion);
                    } else {
                        datosPasajero.gubicacion.setText(comubicacion);
                    }

                    silla = avion.asiganarSilla(clase, ubicacion, pasajero);
                    if (silla == null) {
                        JOptionPane.showMessageDialog(this, "No hay sillas disponibles con dichas características", "Registro", JOptionPane.ERROR_MESSAGE);
                    } else {

                    }

                }
            }
        }
        /*
         datosPasajero.gnombre.setText(nombre);
         datosPasajero.gcedula.setText(cedula);
         datosPasajero.gclase.setText(comclase);
         datosPasajero.gubicacion.setText(comubicacion);
         */

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void boxclaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxclaseActionPerformed

    }//GEN-LAST:event_boxclaseActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed


    }//GEN-LAST:event_btncancelarActionPerformed

    private void boxubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxubicacionActionPerformed
      
    }//GEN-LAST:event_boxubicacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox boxclase;
    public static javax.swing.JComboBox boxubicacion;
    public static javax.swing.JButton btncancelar;
    public javax.swing.JButton btnregistrar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JSlider jSlider1;
    public javax.swing.JLabel lcedula;
    public javax.swing.JLabel lclase;
    public javax.swing.JLabel lnombe;
    private javax.swing.JLabel lubicacion;
    public javax.swing.JPanel panaledatos;
    public javax.swing.JTextField txtcedula;
    public javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
