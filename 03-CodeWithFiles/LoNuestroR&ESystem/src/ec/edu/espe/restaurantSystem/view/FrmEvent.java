/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.view;

import ec.edu.espe.restaurantSystem.model.Account;
import javax.swing.ImageIcon;

/**
 *
 * @author Jerico Ruiz
 */
public class FrmEvent extends javax.swing.JFrame {
    private Account user;
    /**
     * Creates new form frmEvents
     */
    public FrmEvent() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("\tLo Nuestro Restaurant  | Nuevo Evento");
         setIconImage(new ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSystem/view/img/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        lblCategoryEvent = new javax.swing.JLabel();
        lblPeople = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        spiPeople = new javax.swing.JSpinner();
        dchDate = new com.toedter.calendar.JDateChooser();
        lblMenu = new javax.swing.JLabel();
        rbtFirstDish = new javax.swing.JRadioButton();
        rbtSecondDish = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        rbtThirdDish = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMenuEvent = new javax.swing.JTable();
        btnAddEvent = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        rbtDessert = new javax.swing.JRadioButton();
        rbtDrink = new javax.swing.JRadioButton();
        lblMenu1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel2.setText("Ingreso de Nuevo Evento");

        lblCategoryEvent.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblCategoryEvent.setText("Tipo de Evento");

        lblPeople.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblPeople.setText("Número de personas");

        lblDate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDate.setText("Fecha");

        cmbType.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiesta Infantil", "Fiesta 15 Años", "Boda", "Aniversario", "Fiesta - Baile", "Meeting" }));
        cmbType.setToolTipText("Lista de tipo de evento");

        spiPeople.setModel(new javax.swing.SpinnerNumberModel(0, null, 500, 1));
        spiPeople.setToolTipText("Cantidad de personas");

        dchDate.setToolTipText("Fecha del evento");

        lblMenu.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblMenu.setText("Menú");

        buttonGroup1.add(rbtFirstDish);
        rbtFirstDish.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        rbtFirstDish.setText("Entrada");
        rbtFirstDish.setToolTipText("Plato de entrada");
        rbtFirstDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFirstDishActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtSecondDish);
        rbtSecondDish.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        rbtSecondDish.setText("Plato Fuerte");
        rbtSecondDish.setToolTipText("Plato fuerte");
        rbtSecondDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSecondDishActionPerformed(evt);
            }
        });

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        tblMenu.setToolTipText("Tabla de menu");
        jScrollPane1.setViewportView(tblMenu);

        buttonGroup1.add(rbtThirdDish);
        rbtThirdDish.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        rbtThirdDish.setText("Extras");
        rbtThirdDish.setToolTipText("Platos extras");

        tblMenuEvent.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblMenuEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nombre"
            }
        ));
        tblMenuEvent.setToolTipText("Tabla de eventos");
        jScrollPane2.setViewportView(tblMenuEvent);

        btnAddEvent.setText("Guardar");
        btnAddEvent.setToolTipText("Agregar evento");

        btnExit.setText("Regresar");
        btnExit.setToolTipText("Regresar a menu");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtDessert);
        rbtDessert.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        rbtDessert.setText("Postre");
        rbtDessert.setToolTipText("Platos de postres");
        rbtDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDessertActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtDrink);
        rbtDrink.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        rbtDrink.setText("Bebida");
        rbtDrink.setToolTipText("Bebida");

        lblMenu1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblMenu1.setText("Informacion del Evento");

        btnAdd.setText("Añadir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMenu)
                                .addGap(62, 62, 62)
                                .addComponent(rbtFirstDish)
                                .addGap(18, 18, 18)
                                .addComponent(rbtSecondDish)
                                .addGap(18, 18, 18)
                                .addComponent(rbtThirdDish)
                                .addGap(18, 18, 18)
                                .addComponent(rbtDessert)
                                .addGap(18, 18, 18)
                                .addComponent(rbtDrink))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCategoryEvent)
                                            .addComponent(lblPeople)
                                            .addComponent(lblDate))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(spiPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMenu1)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCategoryEvent)
                                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addComponent(lblPeople))
                            .addComponent(spiPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dchDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenu)
                            .addComponent(rbtSecondDish)
                            .addComponent(rbtFirstDish)
                            .addComponent(rbtThirdDish)
                            .addComponent(rbtDessert)
                            .addComponent(rbtDrink))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblMenu1)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtFirstDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFirstDishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFirstDishActionPerformed

    private void rbtDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDessertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtDessertActionPerformed

    private void rbtThirdDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtThirdDishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtThirdDishActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
         if(this.user.getUserType().equals("Administrador")){
           FrmMenuManager menuAdmin = new FrmMenuManager(this.user);
           menuAdmin.setVisible(true);
           this.setVisible(false); 
        }else{
           FrmMenuEmployee menuEmployee = new FrmMenuEmployee(this.user);
           menuEmployee.setVisible(true);
           this.setVisible(false); 
        }
    
    }//GEN-LAST:event_btnExitActionPerformed

    private void rbtSecondDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSecondDishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtSecondDishActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddEvent;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbType;
    private com.toedter.calendar.JDateChooser dchDate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategoryEvent;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenu1;
    private javax.swing.JLabel lblPeople;
    private javax.swing.JRadioButton rbtDessert;
    private javax.swing.JRadioButton rbtDrink;
    private javax.swing.JRadioButton rbtFirstDish;
    private javax.swing.JRadioButton rbtSecondDish;
    private javax.swing.JRadioButton rbtThirdDish;
    private javax.swing.JSpinner spiPeople;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTable tblMenuEvent;
    // End of variables declaration//GEN-END:variables
    /**
     * @return the user
     */
    public Account getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Account user) {
        this.user = user;
    }
}
