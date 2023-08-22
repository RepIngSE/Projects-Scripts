package Programa;
import algoritmo.algoritmos;

public class datosPrograma extends javax.swing.JFrame {
    
    private int numero;

    public datosPrograma(int pro, int numero) {
        
        initComponents();
        setNumero(numero);
        if(getNumero()==3){
            TFTiempoI.setText(String.valueOf(0));
            TFTiempoI.setVisible(false);

        }
        setVisible(true);
        setTitle("programa "+String.valueOf(pro));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        TFTiempoI = new javax.swing.JTextField();
        TFTiempoE = new javax.swing.JTextField();
        BTNAceptar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("descripcion del programa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        TFNombre.setBackground(new java.awt.Color(204, 255, 255));
        TFNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(TFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 190, 50));

        TFTiempoI.setBackground(new java.awt.Color(204, 255, 255));
        TFTiempoI.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "tiempo de inicio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(TFTiempoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 190, 50));

        TFTiempoE.setBackground(new java.awt.Color(204, 255, 255));
        TFTiempoE.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "tiempo de ejecucion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(TFTiempoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 190, 50));

        BTNAceptar.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("aceptar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BTNAceptarLayout = new javax.swing.GroupLayout(BTNAceptar);
        BTNAceptar.setLayout(BTNAceptarLayout);
        BTNAceptarLayout.setHorizontalGroup(
            BTNAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BTNAceptarLayout.setVerticalGroup(
            BTNAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(BTNAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        
        BTNAceptar.setBackground(new java.awt.Color(0,204,204));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        
        BTNAceptar.setBackground(new java.awt.Color(0,204,255));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        algoritmos.datos(TFNombre.getText(), Integer.parseInt(TFTiempoI.getText()), Integer.parseInt(TFTiempoE.getText()));
        dispose();
        algoritmos.siguiente();        
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BTNAceptar;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFTiempoE;
    private javax.swing.JTextField TFTiempoI;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setNumero(int numero) {
        
        this.numero=numero;
    }
    
    private int getNumero(){
        
        return numero;
    }
}
