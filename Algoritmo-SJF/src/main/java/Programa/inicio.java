package Programa;

public class inicio extends javax.swing.JFrame {

    public inicio() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BCancelar = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JLabel();
        BInicio = new javax.swing.JPanel();
        btnInicio = new javax.swing.JLabel();
        BTNRobin = new javax.swing.JPanel();
        btnInicio2 = new javax.swing.JLabel();
        BTNSjf = new javax.swing.JPanel();
        btnSJF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Titulo.setText("Simulacion algoritmos");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 40));

        BCancelar.setBackground(new java.awt.Color(51, 51, 255));

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BCancelarLayout = new javax.swing.GroupLayout(BCancelar);
        BCancelar.setLayout(BCancelarLayout);
        BCancelarLayout.setHorizontalGroup(
            BCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        BCancelarLayout.setVerticalGroup(
            BCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BCancelarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 200, 40));

        BInicio.setBackground(new java.awt.Color(51, 51, 255));

        btnInicio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInicio.setText("SJF EXPROPIATIVO");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BInicioLayout = new javax.swing.GroupLayout(BInicio);
        BInicio.setLayout(BInicioLayout);
        BInicioLayout.setHorizontalGroup(
            BInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BInicioLayout.createSequentialGroup()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BInicioLayout.setVerticalGroup(
            BInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 190, 40));

        BTNRobin.setBackground(new java.awt.Color(51, 51, 255));

        btnInicio2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnInicio2.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInicio2.setText("ROUND ROBIN");
        btnInicio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicio2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicio2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicio2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BTNRobinLayout = new javax.swing.GroupLayout(BTNRobin);
        BTNRobin.setLayout(BTNRobinLayout);
        BTNRobinLayout.setHorizontalGroup(
            BTNRobinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTNRobinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BTNRobinLayout.setVerticalGroup(
            BTNRobinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTNRobinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BTNRobin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 190, 40));

        BTNSjf.setBackground(new java.awt.Color(51, 51, 255));

        btnSJF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSJF.setForeground(new java.awt.Color(255, 255, 255));
        btnSJF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSJF.setText("SJF");
        btnSJF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSJF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSJFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSJFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSJFMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BTNSjfLayout = new javax.swing.GroupLayout(BTNSjf);
        BTNSjf.setLayout(BTNSjfLayout);
        BTNSjfLayout.setHorizontalGroup(
            BTNSjfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTNSjfLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSJF, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BTNSjfLayout.setVerticalGroup(
            BTNSjfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTNSjfLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSJF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BTNSjf, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        
        dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
    
        BCancelar.setBackground(new java.awt.Color(51,85,255));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
    
        BCancelar.setBackground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
     
        BInicio.setBackground(new java.awt.Color(51,85,255));
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
    
        BInicio.setBackground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
    
        iniciar(1);
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnSJFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSJFMouseClicked
        
        iniciar(2);
    }//GEN-LAST:event_btnSJFMouseClicked

    private void btnSJFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSJFMouseEntered
        
        BTNSjf.setBackground(new java.awt.Color(51,82,255));
    }//GEN-LAST:event_btnSJFMouseEntered

    private void btnSJFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSJFMouseExited
        
        BTNSjf.setBackground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_btnSJFMouseExited

    private void btnInicio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicio2MouseClicked
        
        iniciar(3);
    }//GEN-LAST:event_btnInicio2MouseClicked

    private void btnInicio2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicio2MouseEntered
        
        BTNRobin.setBackground(new java.awt.Color(51,82,255));
    }//GEN-LAST:event_btnInicio2MouseEntered

    private void btnInicio2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicio2MouseExited
        
        BTNRobin.setBackground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_btnInicio2MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BCancelar;
    private javax.swing.JPanel BInicio;
    private javax.swing.JPanel BTNRobin;
    private javax.swing.JPanel BTNSjf;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JLabel btnInicio2;
    private javax.swing.JLabel btnSJF;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void iniciar(int numero){

        java.awt.EventQueue.invokeLater(() -> {
            
            new cantidad(numero).setVisible(true);
        });
        dispose();
    }
}
