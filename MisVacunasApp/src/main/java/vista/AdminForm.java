/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Enfermero;
import modelo.Vacuna;

public class AdminForm extends javax.swing.JFrame {

    private LoginForm inicio;
    private String admin;
    private Icon icono_exito;

    public AdminForm(LoginForm i, String adm) {
        this.inicio = i;
        this.admin = adm;
        initComponents();
        this.cambias_iconos();
        this.setLocationRelativeTo(null);
        this.lblAdmin.setText(admin);
        icono_exito = new ImageIcon("imagenes/icono_success.png");
    }

    public LoginForm getInicio() {
        return inicio;
    }

    private void cambias_iconos() {
        ImageIcon icono = new ImageIcon("imagenes/Logo.png");
        this.imgLogin.setIcon(icono);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtNomEnf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuEnf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelEnf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDirEnf = new javax.swing.JTextField();
        txtEdadEnf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnBuscarEnf = new javax.swing.JButton();
        btnRegistroEnf = new javax.swing.JButton();
        btnModificarEnf = new javax.swing.JButton();
        txtClaveEnf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtNomVacuna = new javax.swing.JTextField();
        btnRegistroVacuna = new javax.swing.JButton();
        btnBuscarVacuna = new javax.swing.JButton();
        btnModificarVacuna = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtCantVacuna = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDosisVacuna = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrarAdmin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VISTA ADMINISTRADOR");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        imgLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MIS VACUNAS APP");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1090415914 - CARLOS D. MARQUEZ V.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INGENIERÍA DE SISTEMAS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PROGRAMACIÓN ORIENTADA A OBJETOS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtNomEnf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Usuario");

        txtUsuEnf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Teléfono");

        txtTelEnf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Dirección");

        txtDirEnf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtEdadEnf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Edad");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Clave");

        btnBuscarEnf.setText("BUSCAR");
        btnBuscarEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEnfActionPerformed(evt);
            }
        });

        btnRegistroEnf.setText("REGISTRAR");
        btnRegistroEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEnfActionPerformed(evt);
            }
        });

        btnModificarEnf.setText("MODIFICAR");
        btnModificarEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEnfActionPerformed(evt);
            }
        });

        txtClaveEnf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuEnf, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(txtNomEnf)
                    .addComponent(txtTelEnf)
                    .addComponent(txtDirEnf)
                    .addComponent(txtEdadEnf)
                    .addComponent(txtClaveEnf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistroEnf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEnf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarEnf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsuEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(btnBuscarEnf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDirEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdadEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtClaveEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 120, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("GESTIÓN ENFERMEROS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Nombre");

        txtNomVacuna.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnRegistroVacuna.setText("REGISTRAR");
        btnRegistroVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroVacunaActionPerformed(evt);
            }
        });

        btnBuscarVacuna.setText("BUSCAR");
        btnBuscarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVacunaActionPerformed(evt);
            }
        });

        btnModificarVacuna.setText("MODIFICAR");
        btnModificarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVacunaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Cantidad");

        txtCantVacuna.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Dósis");

        txtDosisVacuna.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomVacuna)
                    .addComponent(txtCantVacuna)
                    .addComponent(txtDosisVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistroVacuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVacuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarVacuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNomVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addComponent(btnBuscarVacuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDosisVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(142, 142, 142))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("GESTIÓN DE VACUNAS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMINISTRADOR");

        btnCerrarAdmin.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrarAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCerrarAdmin.setText("CERRAR SESIÓN");
        btnCerrarAdmin.setToolTipText("Cerrar Sesión");
        btnCerrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarAdminActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Usuario:");

        lblAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAdmin.setText("jLabel7");

        jLabel8.setText("Todos los derechos reservados.");

        jLabel9.setText("© 2021.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnCerrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(64, 64, 64))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblAdmin))
                .addGap(18, 18, 18)
                .addComponent(btnCerrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAdminActionPerformed
        this.getInicio().getControlador().desconectar_BD();
        this.dispose();
        this.inicio.setVisible(true);
        this.inicio.getTxtUsuarioLogin().setText("");
        this.inicio.getTxtClaveLogin().setText("");
        this.inicio.getCmbTipoLogin().setSelectedIndex(0);
    }//GEN-LAST:event_btnCerrarAdminActionPerformed

    private void btnModificarEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEnfActionPerformed
        String usuario = this.txtUsuEnf.getText();
        String nombre = this.txtNomEnf.getText();
        String telefono = this.txtTelEnf.getText();
        String direccion = this.txtDirEnf.getText();
        String edad = this.txtEdadEnf.getText();
        String clave = this.txtClaveEnf.getText();

        if (usuario.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || edad.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Para modificar la información no pueden haber campos vacíos...", "FALTA INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Enfermero enf = new Enfermero(usuario, nombre, telefono, direccion, clave, Integer.parseInt(edad));
            boolean modificar = this.inicio.getControlador().modificarEnfermero(enf);
            if (modificar) {
                this.borrarCampos();
                JOptionPane.showMessageDialog(this, "Se ha modificado la información del enfermero exitosamente", "ENFERMERO MODIFICADO", JOptionPane.PLAIN_MESSAGE, this.icono_exito);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo modificar la información del enfermero...", "ENFERMERO NO MODIFICADO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarEnfActionPerformed

    private void btnRegistroEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEnfActionPerformed
        String usuario = this.txtUsuEnf.getText();
        String nombre = this.txtNomEnf.getText();
        String telefono = this.txtTelEnf.getText();
        String direccion = this.txtDirEnf.getText();
        String edad = this.txtEdadEnf.getText();
        String clave = this.txtClaveEnf.getText();

        if (usuario.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || edad.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos...", "FALTA INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean registro = this.inicio.getControlador().registrarEnfermero(usuario, nombre, telefono, direccion, Integer.parseInt(edad), clave);
            if (registro) {
                this.borrarCampos();
                JOptionPane.showMessageDialog(this, "Se ha registrado el enfermero exitosamente", "ENFERMERO REGISTRADO", JOptionPane.PLAIN_MESSAGE, this.icono_exito);
            } else {
                JOptionPane.showMessageDialog(this, "El usuario ya se encuentra registrado...", "ENFERMERO NO REGISTRADO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRegistroEnfActionPerformed

    private void borrarCampos() {
        this.txtUsuEnf.setText("");
        this.txtNomEnf.setText("");
        this.txtTelEnf.setText("");
        this.txtDirEnf.setText("");
        this.txtEdadEnf.setText("");
        this.txtClaveEnf.setText("");
        this.txtNomVacuna.setText("");
        this.txtDosisVacuna.setText("");
        this.txtCantVacuna.setText("");
    }
    private void btnRegistroVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroVacunaActionPerformed
        String nombre = this.txtNomVacuna.getText();
        String dosis = this.txtDosisVacuna.getText();
        String cant = this.txtCantVacuna.getText();

        if (nombre.isEmpty() || dosis.isEmpty() || cant.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos...", "FALTA INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean registro = this.inicio.getControlador().registrarVacuna(nombre, Integer.parseInt(cant), dosis);
            if (registro) {
                this.borrarCampos();
                JOptionPane.showMessageDialog(this, "Se ha registrado la vacuna exitosamente", "VACUNA REGISTRADA", JOptionPane.PLAIN_MESSAGE, this.icono_exito);
            } else {
                JOptionPane.showMessageDialog(this, "El nombre de la vacuna ya se encuentra registrado...", "VACUNA NO REGISTRADA", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRegistroVacunaActionPerformed

    private void btnModificarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVacunaActionPerformed
        String nombre = this.txtNomVacuna.getText();
        String dosis = this.txtDosisVacuna.getText();
        String cant = this.txtCantVacuna.getText();

        if (nombre.isEmpty() || dosis.isEmpty() || cant.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Para modificar la información no pueden haber campos vacíos...", "FALTA INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Vacuna vac = new Vacuna(nombre, dosis, Integer.parseInt(cant));
            boolean modificar = this.inicio.getControlador().modificarVacuna(vac);
            if (modificar) {
                this.borrarCampos();
                JOptionPane.showMessageDialog(this, "Se ha modificado la información de la vacuna exitosamente", "VACUNA MODIFICADA", JOptionPane.PLAIN_MESSAGE, this.icono_exito);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo modificar la información de la vacuna...", "VACUNA NO MODIFICADA", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarVacunaActionPerformed

    private void btnBuscarEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEnfActionPerformed
        String usuario = this.txtUsuEnf.getText();
        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el usuario para buscar al enfermero...", "FALTA INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Enfermero enf = this.inicio.getControlador().buscarEnfermero(usuario);
            if (enf != null) {
                this.txtNomEnf.setText(enf.getNombre());
                this.txtTelEnf.setText(enf.getTelefono());
                this.txtDirEnf.setText(enf.getDireccion());
                this.txtEdadEnf.setText(""+enf.getEdad());
                this.txtClaveEnf.setText(enf.getClave());
            } else {
                JOptionPane.showMessageDialog(this, "No existe ningún enfermero con ese usuario...", "ENFERMERO NO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnBuscarEnfActionPerformed

    private void btnBuscarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVacunaActionPerformed
        String nombre = this.txtNomVacuna.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre para buscar la vacuna...", "FALTA INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Vacuna vac = this.inicio.getControlador().buscarVacuna(nombre);
            if (vac != null) {
                this.txtNomVacuna.setText(vac.getNombre());
                this.txtDosisVacuna.setText(vac.getDosis());
                this.txtCantVacuna.setText(""+vac.getCantidad());
            } else {
                JOptionPane.showMessageDialog(this, "No existe ninguna vacuna con ese nombre...", "VACUNA NO ENCONTRADA", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnBuscarVacunaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEnf;
    private javax.swing.JButton btnBuscarVacuna;
    private javax.swing.JButton btnCerrarAdmin;
    private javax.swing.JButton btnModificarEnf;
    private javax.swing.JButton btnModificarVacuna;
    private javax.swing.JButton btnRegistroEnf;
    private javax.swing.JButton btnRegistroVacuna;
    private javax.swing.JLabel imgLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JTextField txtCantVacuna;
    private javax.swing.JTextField txtClaveEnf;
    private javax.swing.JTextField txtDirEnf;
    private javax.swing.JTextField txtDosisVacuna;
    private javax.swing.JTextField txtEdadEnf;
    private javax.swing.JTextField txtNomEnf;
    private javax.swing.JTextField txtNomVacuna;
    private javax.swing.JTextField txtTelEnf;
    private javax.swing.JTextField txtUsuEnf;
    // End of variables declaration//GEN-END:variables
}
