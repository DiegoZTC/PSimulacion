/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psimulacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ZTC
 */
public class JDatos extends javax.swing.JFrame {

    
    
    
    /**
     * Creates new form JDatos
     */
    public JDatos() {
        initComponents();
        pAnalisis.setVisible(false);
        pSimulacion.setEnabledAt(1, false);
        this.btnPrueba.setVisible(true);
        
   
     
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
        pSimulacion = new javax.swing.JTabbedPane();
        pIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbCosto = new javax.swing.JComboBox();
        cmbPrecio = new javax.swing.JComboBox();
        cmbDemanda = new javax.swing.JComboBox();
        btnPrueba = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pAnalisis = new javax.swing.JPanel();
        pTabla = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuevo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        msalir = new javax.swing.JMenuItem();
        mgrafico = new javax.swing.JMenu();
        mest = new javax.swing.JMenuItem();
        mreg = new javax.swing.JMenuItem();
        mGenerador = new javax.swing.JMenu();
        mgen = new javax.swing.JMenuItem();
        mprob = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Costo :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Precio :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Demanda :");

        cmbCosto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Normal", "Triangular", "Uniforme" }));
        cmbCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCostoActionPerformed(evt);
            }
        });

        cmbPrecio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Normal", "Triangular", "Uniforme" }));
        cmbPrecio.setPreferredSize(new java.awt.Dimension(88, 25));
        cmbPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrecioActionPerformed(evt);
            }
        });

        cmbDemanda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Normal", "Triangular", "Uniforme" }));
        cmbDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDemandaActionPerformed(evt);
            }
        });

        btnPrueba.setText("Prueba Sis");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Elija las Distribucion para la simulacion");

        javax.swing.GroupLayout pIngresoLayout = new javax.swing.GroupLayout(pIngreso);
        pIngreso.setLayout(pIngresoLayout);
        pIngresoLayout.setHorizontalGroup(
            pIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIngresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrueba, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIngresoLayout.createSequentialGroup()
                        .addGroup(pIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(pIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbPrecio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCosto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDemanda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIngresoLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(84, 84, 84))
        );
        pIngresoLayout.setVerticalGroup(
            pIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIngresoLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(pIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pIngresoLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3))
                    .addGroup(pIngresoLayout.createSequentialGroup()
                        .addGroup(pIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(cmbDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(btnPrueba)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pSimulacion.addTab("Ingreso", pIngreso);

        pAnalisis.setEnabled(false);

        pTabla.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Costo", "Precio", "Demanda", "", "Ingreso", "Egresos", "Ganancia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.getTableHeader().setReorderingAllowed(false);
        pTabla.setViewportView(tblDatos);
        tblDatos.getColumnModel().getColumn(0).setResizable(false);
        tblDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblDatos.getColumnModel().getColumn(1).setResizable(false);
        tblDatos.getColumnModel().getColumn(2).setResizable(false);
        tblDatos.getColumnModel().getColumn(3).setResizable(false);
        tblDatos.getColumnModel().getColumn(4).setPreferredWidth(20);
        tblDatos.getColumnModel().getColumn(5).setResizable(false);
        tblDatos.getColumnModel().getColumn(6).setResizable(false);

        javax.swing.GroupLayout pAnalisisLayout = new javax.swing.GroupLayout(pAnalisis);
        pAnalisis.setLayout(pAnalisisLayout);
        pAnalisisLayout.setHorizontalGroup(
            pAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAnalisisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );
        pAnalisisLayout.setVerticalGroup(
            pAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAnalisisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        pSimulacion.addTab("Analisis", pAnalisis);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pSimulacion)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pSimulacion)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        mnuevo.setText("Nuevo");
        mnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuevo);
        jMenu1.add(jSeparator1);

        msalir.setText("Salir");
        msalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msalirActionPerformed(evt);
            }
        });
        jMenu1.add(msalir);

        jMenuBar1.add(jMenu1);

        mgrafico.setText("Analisis");

        mest.setText("Estadisticas");
        mest.setEnabled(false);
        mest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mestActionPerformed(evt);
            }
        });
        mest.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                mestHierarchyChanged(evt);
            }
        });
        mgrafico.add(mest);

        mreg.setText("Regresion");
        mreg.setEnabled(false);
        mreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mregActionPerformed(evt);
            }
        });
        mreg.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                mregHierarchyChanged(evt);
            }
        });
        mgrafico.add(mreg);

        jMenuBar1.add(mgrafico);

        mGenerador.setText("Simulacion");

        mgen.setText("Generacion");
        mgen.setToolTipText("Simulacion de #Datos ");
        mgen.setEnabled(false);
        mgen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mgenStateChanged(evt);
            }
        });
        mgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgenActionPerformed(evt);
            }
        });
        mgen.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                mgenHierarchyChanged(evt);
            }
        });
        mGenerador.add(mgen);

        mprob.setText("Probabilidad");
        mprob.setEnabled(false);
        mprob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mprobActionPerformed(evt);
            }
        });
        mprob.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                mprobHierarchyChanged(evt);
            }
        });
        mGenerador.add(mprob);

        jMenuBar1.add(mGenerador);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mestActionPerformed
   CTabla tabla=new CTabla();
   System.out.println("++++"+tblDatos.getModel().getColumnCount()); 
   JEstadisticas je= new JEstadisticas(tabla.getInfColumn(tblDatos,7),this);
        this.setEnabled(false);
        je.setVisible(true);
    }//GEN-LAST:event_mestActionPerformed

    private void mgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgenActionPerformed
 cmbPrecio.setEnabled(false);
      cmbDemanda.setEnabled(false);
      cmbCosto.setEnabled(false);

    pSimulacion.setSelectedIndex(1);  
    pSimulacion.setEnabledAt(0, false); 
    pSimulacion.setEnabledAt(1, true);
    boolean opcion=true;      
        JProgress pb=new JProgress(this,false);
          pb.setVisible(true);
           this.setEnabled(false); 
        
    
        
  
   
    System.out.println(tblDatos.getModel().getColumnCount());
Double vpre=0.0,vcost=0.0,vdem=0.0;
         CTabla t =new CTabla();
       // System.out.println(vpre+" "+vcost+" "+vdem);
        ArrayList <Double> list = new ArrayList <Double> ();
        int op=0;int corr=0,ct=0;
        boolean b=true;
   
       
       while(b)
       {
           try{
       JOptionPane jop=new JOptionPane();
       String alfa=JOptionPane.showInputDialog(null, "Cuantos numeros desea generar?");
        
           op=Integer.parseInt(alfa);
        
           
       if(op>15000)
          JOptionPane.showMessageDialog(rootPane, "Cantidad Excesiva");
       else
        if(op<50)
          JOptionPane.showMessageDialog(rootPane, "Cantidad No Permitida,Minimo 50");
       if(alfa.isEmpty())
           b=false;
        else              
           b=false; 
       
          
       }
        catch(Exception ex)
        {
  JOptionPane.showMessageDialog(rootPane, "Ingreso Incorrecto");
        
        
        
        }
       }
       
      
      
           
           for(int i=1;i<=op;i++)
    {
       
            list.clear();
    vdem=ddem.getValueDist(ddem);
        vpre=dpre.getValueDist(dpre);
        vcost=dcost.getValueDist(dcost);
    list.add(vcost);
    list.add(vpre);
    list.add(vdem);
    list.add(0.0);
    list.add(vpre*vdem);
    list.add(vcost*vdem);
    list.add((vpre*vdem)-(vcost*vdem));
    //t.printList(list);
    System.out.println(list.size());
    t.addDatos(tblDatos, list,i);
                
    
   if(i==op)
   { pb.modal=true;
       pb.jLabel1.setText("Carga Completa Datos......");
       pb.btnAceptar.setEnabled(true);}
    }

       
    }//GEN-LAST:event_mgenActionPerformed

    private void cmbCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCostoActionPerformed
   op=cmbCosto.getSelectedIndex();
   if(op!=0)
   {
   this.setEnabled(false);
    
   if(op==1)
    {
    SNormal obj=new SNormal(this,true);
    obj.setVisible(true);
    dcost.vn1=obj.v1;
    dcost.vn2=obj.v2;            
    dcost.dist=3;
    }
   
   if(op==2)
    {
    STriangular obj=new STriangular(this,true);
    obj.setVisible(true);
    dcost.vt1=obj.v1;
    dcost.vt2=obj.v2; 
    dcost.vt3=obj.v3;
    dcost.dist=2;
    }
   
   if(op==3)
    {
    SUniforme obj=new SUniforme(this,true);
    obj.setVisible(true);
    dcost.vu1=obj.v1;
    dcost.vu2=obj.v2;            
    dcost.dist=1;
    }
     }
    }//GEN-LAST:event_cmbCostoActionPerformed

    private void cmbPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrecioActionPerformed
   op=cmbPrecio.getSelectedIndex();
   
   if(op!=0)
   {
   this.setEnabled(false);
  
    if(op==1)
    {
    SNormal obj=new SNormal(this,true);
    obj.setVisible(true);
    dpre.vn1=obj.v1;
    dpre.vn2=obj.v2;            
    dpre.dist=3;
    }
   
   if(op==2)
    {
    STriangular obj=new STriangular(this,true);
    obj.setVisible(true);
    dpre.vt1=obj.v1;
    dpre.vt2=obj.v2; 
    dpre.vt3=obj.v3;
    dpre.dist=2;
    }
   
   if(op==3)
    {
    SUniforme obj=new SUniforme(this,true);
    obj.setVisible(true);
    dpre.vu1=obj.v1;
    dpre.vu2=obj.v2;            
    dpre.dist=1;
    }
    }
    }//GEN-LAST:event_cmbPrecioActionPerformed

    private void cmbDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDemandaActionPerformed
    
   op=cmbDemanda.getSelectedIndex();
    
   if(op!=0)
   {
   this.setEnabled(false);
   
       if(op==1)
    {
    SNormal obj=new SNormal(this,true);
    obj.setVisible(true);
    ddem.vn1=obj.v1;
    ddem.vn2=obj.v2;            
    ddem.dist=3;
    }
   
   if(op==2)
    {
    STriangular obj=new STriangular(this,true);
    obj.setVisible(true);
    ddem.vt1=obj.v1;
    ddem.vt2=obj.v2; 
    ddem.vt3=obj.v3;
    ddem.dist=2;
    }
   
   if(op==3)
    {
    SUniforme obj=new SUniforme(this,true);
    obj.setVisible(true);
    ddem.vu1=obj.v1;
    ddem.vu2=obj.v2;  
    ddem.dist=1; 
    }
   }
    }//GEN-LAST:event_cmbDemandaActionPerformed
 private void borrarFilas(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        for (int i =modelo.getRowCount()-1;i>-1; i--) {
            modelo.removeRow(i);
        }
        
    }
    private void mnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuevoActionPerformed

       pSimulacion.setSelectedIndex(0); 
       pSimulacion.setEnabledAt(0, true);
       pSimulacion.setEnabledAt(1, false);
      cmbPrecio.setSelectedIndex(0);
      cmbDemanda.setSelectedIndex(0);
      cmbCosto.setSelectedIndex(0);
      
      cmbPrecio.setEnabled(true);
      cmbDemanda.setEnabled(true);
      cmbCosto.setEnabled(true);
      
      this.mest.setEnabled(false);
 
      this.mgen.setEnabled(false);        
      this.mprob.setEnabled(false);
  
      pIngreso.requestFocus();
      pIngreso.setEnabled(true);
      pAnalisis.setVisible(false);
      pAnalisis.setEnabled(false);
      
      borrarFilas(tblDatos);
    
      ddem=new Distribucion();
      dpre=new Distribucion();
      dcost=new Distribucion();
    }//GEN-LAST:event_mnuevoActionPerformed

    private void mgenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mgenStateChanged
   
    }//GEN-LAST:event_mgenStateChanged

    private void mgenHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_mgenHierarchyChanged
/*System.out.println(ddem.vn1);    
System.out.println(ddem.vn2);    

System.out.println(dcost.vn1);    
System.out.println(dcost.vn2);    

System.out.println(dpre.vn1);    
System.out.println(dpre.vn2);    

*/
  if(cmbCosto.getSelectedIndex()>0&&
          (
           cmbPrecio.getSelectedIndex()>0&&
          cmbDemanda.getSelectedIndex()>0
          ))
  {   if((ddem.valueOK()&&
             dpre.valueOK())&&
                dcost.valueOK())
     {mgen.setEnabled(true);
     }
     
   else
       mgen.setEnabled(false);
  }
   
  else
       mgen.setEnabled(false);
    }//GEN-LAST:event_mgenHierarchyChanged

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
    /* int a=jTable1.getModel().getColumnCount();
     System.out.println(a);
     
     CTabla t =new CTabla();
     CAnalisis c=new CAnalisis();
    ArrayList <Double> list = new ArrayList <Double> ();

    
    Double a1=c.genUniforme(12.0,19.0);
    Double b1=c.genNormal(6.0,4.0);
    System.out.println(a1);
    System.out.println(b1);
   
        
    list.add(a1);
    list.add(b1);
    
    t.printList(list);
    */
   //op=Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese Numero a Generarse"));
    
       /* 
    op=100;
    for(int i=1;i<=op;i++)
    {
    list.clear();
    
    list.add(c.genUniforme(dcost.vu1,dcost.vu2));
    list.add(c.genNormal(dpre.vn1,dcost.vn2));
     
    //t.printList(list);
    
    t.addDatos(jTable1, list,i);
    }*/
      
    ddem.dist=2;
    ddem.vt1=15;
    ddem.vt2=30;
    ddem.vt3=20;
    
    dcost.dist=1;
    dcost.vu1=9;
    dcost.vu2=13;
 dpre.dist=3;
    dpre.vn1=13;
    dpre.vn2=3;
           
   
    pSimulacion.setSelectedIndex(1);  
    pSimulacion.setEnabledAt(0, false); 
    pSimulacion.setEnabledAt(1, true);
    boolean opcion=true;      
        JProgress pb=new JProgress(this,false);
          pb.setVisible(true);
           this.setEnabled(false); 
        
    
        
  
   
    System.out.println(tblDatos.getModel().getColumnCount());
Double vpre=0.0,vcost=0.0,vdem=0.0;
         CTabla t =new CTabla();
       // System.out.println(vpre+" "+vcost+" "+vdem);
        ArrayList <Double> list = new ArrayList <Double> ();
        int op=0;int corr=0,ct=0;
        boolean b=true;
   
       
       while(b)
       {try{
       op=Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros desea generar?"));
        
       if(op>15000)
          JOptionPane.showMessageDialog(rootPane, "Cantidad Excesiva");
       else
        if(op<50)
          JOptionPane.showMessageDialog(rootPane, "Cantidad No Permitida,Minimo 50");
       else              
           b=false; 
          }
        catch(Exception ex)
        {
  JOptionPane.showMessageDialog(rootPane, "Ingreso Incorrecto");
        }
       }
       
       b=true;
       
     
      
           
           for(int i=1;i<=op;i++)
    {
       
            list.clear();
    vdem=ddem.getValueDist(ddem);
        vpre=dpre.getValueDist(dpre);
        vcost=dcost.getValueDist(dcost);
    list.add(vcost);
    list.add(vpre);
    list.add(vdem);
    list.add(0.0);
    list.add(vpre*vdem);
    list.add(vcost*vdem);
    list.add((vpre*vdem)-(vcost*vdem));
    //t.printList(list);
    System.out.println(list.size());
    t.addDatos(tblDatos, list,i);
                
    
   if(i==op)
   { pb.modal=true;
       pb.jLabel1.setText("Carga Completa Datos......");
       pb.btnAceptar.setEnabled(true);}
    }

       
       
    }//GEN-LAST:event_btnPruebaActionPerformed

    private void mestHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_mestHierarchyChanged
       
        if(pSimulacion.isEnabledAt(1))
        mest.setEnabled(true);
    else
        mest.setEnabled(false);
    }//GEN-LAST:event_mestHierarchyChanged

    private void msalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msalirActionPerformed
       
        this.setVisible(false);
        JOptionPane.showMessageDialog(rootPane,"\tSistemas 2013\n---------------"
                + "\nAutores:\n\tDiego Leon"
                + "\n\tFernando Sanchez"
                + "\n\tByron Cayo");
        System.exit(0);
    }//GEN-LAST:event_msalirActionPerformed
 private Double redondear(Double d, int i) {
        Double valor =0.0;
        int factor=10*(i+1);
        valor = d;
        valor = valor * factor;
        valor = new Double(Math.round(valor));
        valor = valor / factor;

        return valor;
    }
    private void mprobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mprobActionPerformed
     
       CTabla tabla=new CTabla();
       
       Double a=0.0,b=0.0;
       a=tabla.getProb(tabla.getInfColumn(tblDatos,7),"+");
       b=tabla.getProb(tabla.getInfColumn(tblDatos,7),"-");
   a=redondear(a,4);
   b=redondear(b,4);
   SProbabilidad pro=new SProbabilidad(this,true,b+"%",a+"%");
       
       this.setEnabled(false);
       pro.setVisible(true);
    }//GEN-LAST:event_mprobActionPerformed

    private void mprobHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_mprobHierarchyChanged
       if(pSimulacion.isEnabledAt(1))
        mprob.setEnabled(true);
    else
        mprob.setEnabled(false);
    }//GEN-LAST:event_mprobHierarchyChanged

    private void mregHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_mregHierarchyChanged
        if(pSimulacion.isEnabledAt(1))
        mreg.setEnabled(true);
        else
        mreg.setEnabled(false);
    }//GEN-LAST:event_mregHierarchyChanged

    private void mregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mregActionPerformed
       JRegresion reg= new JRegresion(this,tblDatos);
       this.rootPane.setEnabled(false);
       reg.setVisible(true);
       reg.setEnabled(true);
    }//GEN-LAST:event_mregActionPerformed

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
            java.util.logging.Logger.getLogger(JDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JDatos main=new JDatos();
              
               main.setLocationRelativeTo(null);		
             
               main.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrueba;
    private javax.swing.JComboBox cmbCosto;
    private javax.swing.JComboBox cmbDemanda;
    private javax.swing.JComboBox cmbPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mGenerador;
    private javax.swing.JMenuItem mest;
    private javax.swing.JMenuItem mgen;
    private javax.swing.JMenu mgrafico;
    private javax.swing.JMenuItem mnuevo;
    private javax.swing.JMenuItem mprob;
    private javax.swing.JMenuItem mreg;
    private javax.swing.JMenuItem msalir;
    private javax.swing.JPanel pAnalisis;
    private javax.swing.JPanel pIngreso;
    private javax.swing.JTabbedPane pSimulacion;
    private javax.swing.JScrollPane pTabla;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
                      int op;
Distribucion ddem = new Distribucion();
Distribucion dcost = new Distribucion();
Distribucion dpre = new Distribucion();
boolean opcion=true;

    
}
class Distribucion
{
double vn1=-1;
double vn2=-1;  

double vt1=-1;
double vt2=-1; 
double vt3=-1;

double vu1=-1;
double vu2=-1; 

int dist=-1;
public Distribucion ()
{}

public boolean valueOK()
{int c=0;
   
    if(vn1>-1 && vn2>-1)
      c++;

    if((vt1>-1 && vt2>-1)&&(vt3>-1))
    c++;
    if(vu1>-1 && vu2>-1)
        c++;
    if(c>0)
      return true;
   else
    return false;

}

public Double getValueDist(Distribucion dist)
{CAnalisis can = new CAnalisis();
switch (dist.dist)
{
    case 1: 
         return can.genUniforme(dist.vu1, dist.vu2);
    case 2: 
         return can.genTriangular(dist.vt1, dist.vt2, dist.vt3);
    case 3: 
         return can.genNormal(dist.vn1, dist.vn2);
        
    default : return 0.0;     
}    

}
}
/*
class HiloCorrida implements Runnable
{
Distribucion ddem = new Distribucion();
Distribucion dcost = new Distribucion();
Distribucion dpre = new Distribucion();
boolean opcion=true;    
int op,corr,num;    
JTable tabla;
JFrame parent;

   public HiloCorrida(Frame parent,JTable tabla)
   {
   this.tabla=tabla;
   this.parent=(JFrame) parent;
     num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero a generarse"));
        corr=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de corridas"));
      
        
   }


    
  
   
   
   
   
    
    @Override
    public void run() {
    ddem.dist=2;
    ddem.vt1=15;
    ddem.vt2=30;
    ddem.vt3=20;
    
    dcost.dist=1;
    dcost.vu1=9;
    dcost.vu2=13;
    
    dpre.dist=3;
    dpre.vn1=13;
    dpre.vn2=3;

        
        
    
    System.out.println(tabla.getModel().getColumnCount());
      Double vpre=0.0,vcost=0.0,vdem=0.0;
         CTabla t =new CTabla();
       // System.out.println(vpre+" "+vcost+" "+vdem);
        ArrayList <Double> list = new ArrayList <Double> ();
 
        final JDialog dlg = new JDialog(parent, "Progress Dialog", true);
    JProgressBar dpb = new JProgressBar(0, num*corr);
    dlg.add(BorderLayout.CENTER, dpb);
    dlg.add(BorderLayout.NORTH, new JLabel("Progress..."));
    dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    dlg.setSize(300, 75);
    dlg.setLocationRelativeTo(parent);

    Thread t1 = new Thread(new Runnable() {
      public void run() {
        dlg.setVisible(true);
      }
    });

    t1.start();
   
        
       op=num;
       int k=0;
     for(int j=0;j<corr;j++)  
     { 
       dpb.setValue(k);
      if(dpb.getValue()==op*corr){
        dlg.setVisible(false);
      } 
         if(j<corr-1)
         {   for(int i=1;i<=op;i++)
       { k++;
       vdem=ddem.getValueDist(ddem);
        vpre=dpre.getValueDist(dpre);
        vcost=dcost.getValueDist(dcost);
       }}
     else
         {
          for(int i=1;i<=op;i++)
    {k++;
    list.clear();
    vdem=ddem.getValueDist(ddem);
        vpre=dpre.getValueDist(dpre);
        vcost=dcost.getValueDist(dcost);
   
    list.add(vcost);
    list.add(vpre);
    list.add(vdem);
    list.add(0.0);
    list.add(vpre*vdem);
    list.add(vcost*vdem);
    list.add((vpre*vdem)-(vcost*vdem));
    //t.printList(list);
    System.out.println(list.size());
    t.addDatos(tabla, list,i);
    }}
     
     
     }
     
    System.out.println("Se termino de ejecutar");
    
    
    }



}

*/