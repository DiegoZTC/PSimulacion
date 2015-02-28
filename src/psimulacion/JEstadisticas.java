/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psimulacion;

/**
 *
 * @author ZTC
 */
import estadisticas.Clase;
import estadisticas.Frecuencia;
import estadisticas.dlgGraf;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
public class JEstadisticas extends javax.swing.JFrame {

    /**
     * Creates new form JEstadisticas
     */
    public JFrame parent;
     private Frecuencia frec;
    public JEstadisticas(Double[] datos,Frame parent) {
        initComponents();
         setLocationRelativeTo(null);		
             this.parent=(JFrame) parent;
         frec = new Frecuencia(datos);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        btnGraficos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnGraficos.setText("Mostrar Graficos");
        btnGraficos.setEnabled(false);
        btnGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficosActionPerformed(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "[ X - X >", "f", "fa", "fr", "fa", "fr%", "fra%"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTabla);

        txtDatos.setEditable(false);
        txtDatos.setColumns(20);
        txtDatos.setLineWrap(true);
        txtDatos.setRows(5);
        jScrollPane1.setViewportView(txtDatos);

        jLabel1.setText("Estadisticas");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(23, 23, 23)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 543, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(btnCalcular)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnGraficos))
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 543, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(248, 248, 248)
                        .add(jLabel1)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnCalcular)
                    .add(btnGraficos))
                .add(29, 29, 29)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Clase[] clases = frec.getClases();
        DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();

        int n = frec.getK();
        int[] abs = frec.getFrecAbs();
        int[] absAc = frec.getFrecAbsAc();
        Double [] rel = frec.getFrecRel();
        Double [] relAc = frec.getFrecRelAc();
        txtDatos.append("Valores de Calculo : ");
        txtDatos.append("\n\tN = " + frec.getValor().length);
        txtDatos.append("\t\tR = " + frec.getRango());
        txtDatos.append("\t\tK = " + frec.getK());
        txtDatos.append("\t\tA = " + frec.getA());
        txtDatos.append("\n\t------------------------------------");
        txtDatos.append("\n\tV.Max = " + redondear(frec.getMax(),4));
        txtDatos.append("\t\tV.Min = " + redondear(frec.getMin(),4));
        txtDatos.append("\n\tMedia = " + redondear(frec.getMedia(),4));
        txtDatos.append("       \tDesviacion Est. = " + redondear(frec.getDev(),4));
        
        borrarFilas();
        for (int i = 0; i < n; i++) {
            // Primero colocamos las marcas de clase
            String str = "[ " + Math.round(clases[i].getLimInf()) + "," + Math.round(clases[i].getLimSup()) + " >";
            modelo.addRow(new String[]{str, abs[i] + "", absAc[i] + ""});
            modelo.setValueAt(redondear(rel[i], 4), i, 3);
            modelo.setValueAt(redondear(relAc[i], 4), i, 4);
            modelo.setValueAt(redondear(rel[i], 4)*100, i, 5);
            modelo.setValueAt(redondear(relAc[i], 4)*100, i, 6);
        }
        btnGraficos.setEnabled(true);
        btnCalcular.setEnabled(false);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficosActionPerformed
        dlgGraf graf=new dlgGraf(frec, this, true);
        graf.setLocationRelativeTo(this);
        graf.setVisible(true);
    }//GEN-LAST:event_btnGraficosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(JEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JEstadisticas().setVisible(true);
            }
        });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalcular;
    public javax.swing.JButton btnGraficos;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tblTabla;
    public javax.swing.JTextArea txtDatos;
    // End of variables declaration//GEN-END:variables

 private void borrarFilas() {
        DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(0);
        }
    }

    private Double redondear(Double d, int i) {
        Double valor =0.0;
        int factor=10*(i+1);
        valor = d;
        valor = valor * factor;
        valor = new Double(Math.round(valor));
        valor = valor / factor;

        return valor;
    }



}