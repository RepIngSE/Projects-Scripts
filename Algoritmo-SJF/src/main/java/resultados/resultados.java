package resultados;
import javax.swing.table.DefaultTableModel;

public class resultados extends javax.swing.JFrame {

    static String [][]tablas;
    private static DefaultTableModel dtm;
    
    public resultados(String[][]tabl,int total,int espera) {
        
        initComponents();
        tablas=tabl;
        dtm = (DefaultTableModel)tabla.getModel();
        info(total);
        setTitle("tiempo de espera "+espera);
    }
    public static void info(int total){
        
        String [] registros = new String [2];
        int x=0;
        while(x<total){
                
            registros[0]=tablas[x][0];    
            registros[1]=tablas[x][1];
            dtm.addRow(registros);
            x++;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "tiempo", "proceso"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
