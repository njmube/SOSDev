/*Paquete*/
package vis;

/*Importaciones*/
import java.awt.GraphicsEnvironment;
import ptovta.Star;
import ptovta.Login;
import static ptovta.Princip.bIdle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/*Clase para controlar el visor de la tabla*/
public class VisCots1 extends javax.swing.JFrame 
{
    /*Contador para modificar tabla*/
    private int     iContCellEd;
    
    /*Declara variables originales*/
    private String  sCodOri;
    private String  sSerOri;
    private String  sCodEmpOri;    
    private String  sObservOri;
    private String  sSubTotOri;
    private String  sImpueOri;
    private String  sTotOri;
    private String  sTotDescOri;
    private String  sDescripOri;
    private String  sFCreaOri;
    private String  sFModOri;
    private String  sFVencOri;
    private String  sFEntOri;
    private String  sFDocOri;
    private String  sSucOri;
    private String  sCajOri;
    private String  sEstacOri;
    private String  sNomEstacOri;
    private String  sEstadOri;
    private String  sMotivOri;
    private String  sVtaOri;
    private String  sFolOri;
    private String  sSerFacOri;
    
    
    
    
    /*Constructor sin argumentos*/
    public VisCots1() 
    {                
        /*Inicaliza los componentes gráficos*/
        initComponents();
        
        /*Para que la tabla tengan scroll horisontal*/
        jTab.setAutoResizeMode(0);
        
        /*Centra la ventana*/
        this.setLocationRelativeTo(null);

        /*La ventana se mostrará maximizada*/
        setExtendedState(getExtendedState() | VisCots1.MAXIMIZED_BOTH);                        
        
        /*Establece el título de la ventana con la estación, la fecha y hora*/                
        this.setTitle("Visor Tabla, Usuario: <" + Login.sUsrG + "> " + Login.sFLog);        
        
        /*Cambia el icono de la forma, ya sea el personalizado por el usuario o el de default del sistema*/
        if(new File(new java.io.File("").getAbsolutePath() + "\\Logo.jpg").exists())
        {
            setIconImage(Toolkit.getDefaultToolkit().getImage(new java.io.File("").getAbsolutePath() + "\\Logo.jpg"));
        }
        else
            setIconImage(new ImageIcon(getClass().getResource(Star.sIconDef)).getImage());
        
        /*Para que la tabla este ordenada al mostrarce y al dar clic en el nombre de la columna*/
        TableRowSorter trs = new TableRowSorter<>((DefaultTableModel)jTab.getModel());
        jTab.setRowSorter(trs);
        trs.setSortsOnUpdates(true);
        
        /*Pon el foco del teclado en la tabla*/
        jTab.grabFocus();
        
        /*Establece el tamaño de las columnas de la tabla*/        
        jTab.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTab.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTab.getColumnModel().getColumn(3).setPreferredWidth(140);
        jTab.getColumnModel().getColumn(4).setPreferredWidth(500);
        jTab.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTab.getColumnModel().getColumn(6).setPreferredWidth(140);
        jTab.getColumnModel().getColumn(7).setPreferredWidth(140);
        jTab.getColumnModel().getColumn(8).setPreferredWidth(140);
        jTab.getColumnModel().getColumn(9).setPreferredWidth(140);
        jTab.getColumnModel().getColumn(10).setPreferredWidth(200);
        jTab.getColumnModel().getColumn(11).setPreferredWidth(140);
        jTab.getColumnModel().getColumn(12).setPreferredWidth(140);
        jTab.getColumnModel().getColumn(13).setPreferredWidth(140);
        jTab.getColumnModel().getColumn(14).setPreferredWidth(140);
        jTab.getColumnModel().getColumn(17).setPreferredWidth(180);
        jTab.getColumnModel().getColumn(18).setPreferredWidth(150);
        
        /*Activa en la tabla que se usen normamente las teclas de tabulador*/
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);                

        /*Incializa el contador del cell editor*/
        iContCellEd = 1;
        
        /*Crea el listener para cuando se cambia de selección en la tabla*/
        PropertyChangeListener pro = new PropertyChangeListener() 
        {
            @Override
            public void propertyChange(PropertyChangeEvent event) 
            {
                /*Obtén la propiedad que a sucedio en el control*/
                String pr = event.getPropertyName();                                
                                
                /*SI no hay selecciòn entonces regresa*/
                if(jTab.getSelectedRow()==-1)
                    return;
                
                /*Si el evento fue por entrar en una celda de la tabla*/
                if("tableCellEditor".equals(pr)) 
                {
                    /*Si el contador de cell editor está en 1 entonces que lea el valor original que estaba ya*/
                    if(iContCellEd==1)
                    {
                        /*Obtiene todos los datos originales*/
                        sCodOri         = jTab.getValueAt(jTab.getSelectedRow(), 1).toString();
                        sSerOri         = jTab.getValueAt(jTab.getSelectedRow(), 2).toString();
                        sCodEmpOri      = jTab.getValueAt(jTab.getSelectedRow(), 3).toString();                        
                        sObservOri      = jTab.getValueAt(jTab.getSelectedRow(), 4).toString();
                        sSubTotOri      = jTab.getValueAt(jTab.getSelectedRow(), 5).toString();
                        sImpueOri       = jTab.getValueAt(jTab.getSelectedRow(), 6).toString();
                        sTotOri         = jTab.getValueAt(jTab.getSelectedRow(), 7).toString();
                        sTotDescOri     = jTab.getValueAt(jTab.getSelectedRow(), 8).toString();
                        sDescripOri     = jTab.getValueAt(jTab.getSelectedRow(), 9).toString();                        
                        sFCreaOri       = jTab.getValueAt(jTab.getSelectedRow(), 10).toString();
                        sFModOri        = jTab.getValueAt(jTab.getSelectedRow(), 11).toString();
                        sFVencOri       = jTab.getValueAt(jTab.getSelectedRow(), 12).toString();
                        sFEntOri        = jTab.getValueAt(jTab.getSelectedRow(), 13).toString();
                        sFDocOri        = jTab.getValueAt(jTab.getSelectedRow(), 14).toString();
                        sSucOri         = jTab.getValueAt(jTab.getSelectedRow(), 15).toString();
                        sCajOri         = jTab.getValueAt(jTab.getSelectedRow(), 16).toString();
                        sEstacOri       = jTab.getValueAt(jTab.getSelectedRow(), 17).toString();
                        sNomEstacOri    = jTab.getValueAt(jTab.getSelectedRow(), 18).toString();
                        sEstadOri       = jTab.getValueAt(jTab.getSelectedRow(), 19).toString();
                        sMotivOri       = jTab.getValueAt(jTab.getSelectedRow(), 20).toString();
                        sVtaOri         = jTab.getValueAt(jTab.getSelectedRow(), 21).toString();
                        sFolOri         = jTab.getValueAt(jTab.getSelectedRow(), 22).toString();
                        sSerFacOri      = jTab.getValueAt(jTab.getSelectedRow(), 23).toString();
                        
                        /*Aumenta el contador para saber que va de salida*/
                        ++iContCellEd;
                    }
                    /*Else, el contador de cell editor es 2, osea que va de salida*/
                    else
                    {
                        /*Coloca los valores originales que tenian*/
                        jTab.setValueAt(sCodOri,        jTab.getSelectedRow(), 1);                        
                        jTab.setValueAt(sSerOri,        jTab.getSelectedRow(), 2);                        
                        jTab.setValueAt(sCodEmpOri,     jTab.getSelectedRow(), 3);                                                
                        jTab.setValueAt(sObservOri,     jTab.getSelectedRow(), 4);                        
                        jTab.setValueAt(sSubTotOri,     jTab.getSelectedRow(), 5);
                        jTab.setValueAt(sImpueOri,      jTab.getSelectedRow(), 6);
                        jTab.setValueAt(sTotOri,        jTab.getSelectedRow(), 7);
                        jTab.setValueAt(sTotDescOri,    jTab.getSelectedRow(), 8);
                        jTab.setValueAt(sDescripOri,    jTab.getSelectedRow(), 9);
                        jTab.setValueAt(sFCreaOri,      jTab.getSelectedRow(), 10);
                        jTab.setValueAt(sFModOri,       jTab.getSelectedRow(), 11);
                        jTab.setValueAt(sFVencOri,      jTab.getSelectedRow(), 12);
                        jTab.setValueAt(sFEntOri,       jTab.getSelectedRow(), 13);
                        jTab.setValueAt(sFDocOri,       jTab.getSelectedRow(), 14);
                        jTab.setValueAt(sSucOri,        jTab.getSelectedRow(), 15);
                        jTab.setValueAt(sCajOri,        jTab.getSelectedRow(), 16);
                        jTab.setValueAt(sEstacOri,      jTab.getSelectedRow(), 17);
                        jTab.setValueAt(sNomEstacOri,   jTab.getSelectedRow(), 18);
                        jTab.setValueAt(sEstadOri,      jTab.getSelectedRow(), 19);
                        jTab.setValueAt(sMotivOri,      jTab.getSelectedRow(), 20);
                        jTab.setValueAt(sVtaOri,        jTab.getSelectedRow(), 21);
                        jTab.setValueAt(sFolOri,        jTab.getSelectedRow(), 22);
                        jTab.setValueAt(sSerFacOri,     jTab.getSelectedRow(), 23);
                        
                        /*Resetea el celleditor*/
                        iContCellEd = 1;
                    }                                            
                                            
                }/*Fin de if("tableCellEditor".equals(property)) */
                
            }/*Fin de public void propertyChange(PropertyChangeEvent event) */            
        };        
        
        /*Establece el listener para la tabla*/
        jTab.addPropertyChangeListener(pro);
        
    }/*Fin de public VisEmps() */
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Cotización", "Serie", "Cod.Empresa", "Nombre Cliente", "Observaciones", "SubTotal", "Impuesto", "Total", "Total Descuento", "Descripción", "Fecha Creación", "Fecha Modificación", "Fecha Vencimiento", "Fecha entrega", "Sucursal", "No. Caja", "Usuario", "Nombre Usuario", "Estado", "Venta", "Folio", "Serie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTab);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*Cuando se presiona una tecla en el formulario*/
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        //Llama a la función escalable
        vKeyPreEsc(evt);
        
    }//GEN-LAST:event_formKeyPressed
   
                    
    /*Cuando se mueve la rueda del ratón en la forma*/
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        /*Pon la bandera para saber que ya hubó un evento y no se desloguie*/
        bIdle   = true;
        
    }//GEN-LAST:event_formMouseWheelMoved

    
    /*Cuando se arrastra el mouse en la forma*/
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        /*Pon la bandera para saber que ya hubó un evento y no se desloguie*/
        bIdle   = true;
        
    }//GEN-LAST:event_formMouseDragged

    
    /*Cuando se mueve el mouse en la forma*/
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        /*Pon la bandera para saber que ya hubó un evento y no se desloguie*/
        bIdle   = true;
        
    }//GEN-LAST:event_formMouseMoved

    
    /*Cuando se presiona una tecla en la tabla*/
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed

        //Llama a la función escalable
        vKeyPreEsc(evt);

    }//GEN-LAST:event_jTabKeyPressed

    
    /*Cuando el estado e la ventana cambia*/
    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        
        /*Que este máximizado siempre*/
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        
    }//GEN-LAST:event_formWindowStateChanged
 
    
    /*Función escalable para cuando se presiona una tecla en el módulo*/
    void vKeyPreEsc(java.awt.event.KeyEvent evt)
    {
        /*Pon la bandera para saber que ya hubó un evento y no se desloguie*/
        bIdle   = true;
        
        /*Si se presiona la tecla de escape entonces sal de la forma*/
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) 
            dispose();        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
