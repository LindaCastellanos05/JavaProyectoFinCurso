/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Linda
 */
public class PerfilBodeguero extends javax.swing.JFrame {

    /**
     * Creates new form PerfilBodeguero
     */
    public PerfilBodeguero() {
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

        pnlopcionesBodega = new javax.swing.JPanel();
        pnltitulonuevaventa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVerProductVend = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnVerProductVend1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlopcionesBodega.setBackground(new java.awt.Color(255, 255, 255));

        pnltitulonuevaventa.setBackground(new java.awt.Color(0, 93, 139));

        jLabel1.setBackground(new java.awt.Color(0, 93, 139));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BODEGUERO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N

        javax.swing.GroupLayout pnltitulonuevaventaLayout = new javax.swing.GroupLayout(pnltitulonuevaventa);
        pnltitulonuevaventa.setLayout(pnltitulonuevaventaLayout);
        pnltitulonuevaventaLayout.setHorizontalGroup(
            pnltitulonuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltitulonuevaventaLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        pnltitulonuevaventaLayout.setVerticalGroup(
            pnltitulonuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltitulonuevaventaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnltitulonuevaventaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(17, 17, 17))
        );

        btnVerProductVend.setBackground(new java.awt.Color(0, 93, 139));
        btnVerProductVend.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnVerProductVend.setForeground(new java.awt.Color(255, 255, 255));
        btnVerProductVend.setText("Actualizar Estado");
        btnVerProductVend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        jLabel3.setAutoscrolls(true);

        btnVerProductVend1.setBackground(new java.awt.Color(0, 93, 139));
        btnVerProductVend1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnVerProductVend1.setForeground(new java.awt.Color(255, 255, 255));
        btnVerProductVend1.setText("Ver Producto");
        btnVerProductVend1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-pagina.png"))); // NOI18N

        javax.swing.GroupLayout pnlopcionesBodegaLayout = new javax.swing.GroupLayout(pnlopcionesBodega);
        pnlopcionesBodega.setLayout(pnlopcionesBodegaLayout);
        pnlopcionesBodegaLayout.setHorizontalGroup(
            pnlopcionesBodegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnltitulonuevaventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlopcionesBodegaLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel3)
                .addGap(247, 247, 247)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlopcionesBodegaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerProductVend, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
            .addGroup(pnlopcionesBodegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlopcionesBodegaLayout.createSequentialGroup()
                    .addGap(207, 207, 207)
                    .addComponent(btnVerProductVend1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(623, Short.MAX_VALUE)))
        );
        pnlopcionesBodegaLayout.setVerticalGroup(
            pnlopcionesBodegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlopcionesBodegaLayout.createSequentialGroup()
                .addComponent(pnltitulonuevaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(pnlopcionesBodegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addComponent(btnVerProductVend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(pnlopcionesBodegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlopcionesBodegaLayout.createSequentialGroup()
                    .addContainerGap(301, Short.MAX_VALUE)
                    .addComponent(btnVerProductVend1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(281, 281, 281)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlopcionesBodega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlopcionesBodega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(PerfilBodeguero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilBodeguero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilBodeguero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilBodeguero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilBodeguero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerProductVend;
    private javax.swing.JButton btnVerProductVend1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlopcionesBodega;
    private javax.swing.JPanel pnltitulonuevaventa;
    // End of variables declaration//GEN-END:variables
}