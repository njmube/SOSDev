/*Paquete*/
package vis;

/*Importaciones*/
import ptovta.Star;
import java.awt.GraphicsEnvironment;
import ptovta.Login;
import java.sql.*;
import static ptovta.Princip.bIdle;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/*Para ver las partidas de una compra*/
public class VisComps2 extends javax.swing.JFrame 
{
    /*Contador para modificar tabla*/
    private int     iContCellEd;
    
    /*Declara variables originales*/
    private String  sVtaOri;
    private String  sCantOri;    
    private String  sProdOri;
    private String  sDescripOri;
    private String  sDevsOri;
    private String  sKitOri;
    private String  sUnidOri;
    private String  sMonOri;
    private String  sPreOri;
    private String  sDescOri;
    private String  sImpoOri;
    private String  sImpueOri;
    private String  sFechOri;
    private String  sTallOri;
    private String  sColOri;
    private String  sLotOri;
    private String  sPedimenOri;
    private String  sCaduOri;
    private String  sBackOri;    
    private String  sSerOri;
    private String  sComenOri;
    
    
    
    
    /*Constructor sin argumentos*/
    public VisComps2(String sComp) 
    {                
        /*Inicaliza los componentes gráficos*/
        initComponents();
        
        /*Para que la tabla tengan scroll horisontal*/
        jTab.setAutoResizeMode(0);
        
        /*Establece el tamaño de las columnas de la tabla*/        
        jTab.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTab.getColumnModel().getColumn(3).setPreferredWidth(170);
        jTab.getColumnModel().getColumn(4).setPreferredWidth(400);
        jTab.getColumnModel().getColumn(13).setPreferredWidth(170);
        jTab.getColumnModel().getColumn(19).setPreferredWidth(170);
        jTab.getColumnModel().getColumn(20).setPreferredWidth(170);
        jTab.getColumnModel().getColumn(21).setPreferredWidth(170);
        
        /*Centra la ventana*/
        this.setLocationRelativeTo(null);

        /*La ventana se mostrará maximizada*/
        setExtendedState(getExtendedState() | VisEmps.MAXIMIZED_BOTH);                        
        
        /*Establece el título de la ventana con la estación, la fecha y hora*/                
        this.setTitle("Visor de compras, Usuario: <" + Login.sUsrG + "> " + Login.sFLog);        
        
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
                /*Si no hay selecciòn entonces regresa*/
                if(jTab.getSelectedRow()==-1)
                    return;
                
                /*Obtén la propiedad que a sucedio en el control*/
                String pr = event.getPropertyName();                                                                                
                
                /*Si el evento fue por entrar en una celda de la tabla*/
                if("tableCellEditor".equals(pr)) 
                {
                    /*Si el contador de cell editor está en 1 entonces que lea el valor original que estaba ya*/
                    if(iContCellEd==1)
                    {
                        /*Obtiene todos los datos originales*/
                        sVtaOri         = jTab.getValueAt(jTab.getSelectedRow(), 1).toString();
                        sCantOri        = jTab.getValueAt(jTab.getSelectedRow(), 2).toString();                        
                        sProdOri        = jTab.getValueAt(jTab.getSelectedRow(), 3).toString();
                        sDescripOri     = jTab.getValueAt(jTab.getSelectedRow(), 4).toString();
                        sDevsOri        = jTab.getValueAt(jTab.getSelectedRow(), 5).toString();
                        sKitOri         = jTab.getValueAt(jTab.getSelectedRow(), 6).toString();
                        sUnidOri        = jTab.getValueAt(jTab.getSelectedRow(), 7).toString();
                        sMonOri         = jTab.getValueAt(jTab.getSelectedRow(), 8).toString();
                        sPreOri         = jTab.getValueAt(jTab.getSelectedRow(), 9).toString();
                        sDescOri        = jTab.getValueAt(jTab.getSelectedRow(), 10).toString();
                        sImpoOri        = jTab.getValueAt(jTab.getSelectedRow(), 11).toString();
                        sImpueOri       = jTab.getValueAt(jTab.getSelectedRow(), 12).toString();
                        sFechOri        = jTab.getValueAt(jTab.getSelectedRow(), 13).toString();
                        sTallOri        = jTab.getValueAt(jTab.getSelectedRow(), 14).toString();                        
                        sColOri         = jTab.getValueAt(jTab.getSelectedRow(), 15).toString();                        
                        sLotOri         = jTab.getValueAt(jTab.getSelectedRow(), 16).toString();                        
                        sPedimenOri     = jTab.getValueAt(jTab.getSelectedRow(), 17).toString();                        
                        sCaduOri        = jTab.getValueAt(jTab.getSelectedRow(), 18).toString();                        
                        sBackOri        = jTab.getValueAt(jTab.getSelectedRow(), 19).toString();                                                
                        sSerOri         = jTab.getValueAt(jTab.getSelectedRow(), 20).toString();
                        sComenOri       = jTab.getValueAt(jTab.getSelectedRow(), 21).toString();
                                                
                        /*Aumenta el contador para saber que va de salida*/
                        ++iContCellEd;
                    }
                    /*Else, el contador de cell editor es 2, osea que va de salida*/
                    else
                    {
                        /*Coloca los valores originales que tenian*/
                        jTab.setValueAt(sVtaOri,        jTab.getSelectedRow(), 1);                        
                        jTab.setValueAt(sCantOri,       jTab.getSelectedRow(), 2);                        
                        jTab.setValueAt(sProdOri,       jTab.getSelectedRow(), 3);                        
                        jTab.setValueAt(sDescripOri,    jTab.getSelectedRow(), 4);                        
                        jTab.setValueAt(sDevsOri,       jTab.getSelectedRow(), 5);                        
                        jTab.setValueAt(sKitOri,        jTab.getSelectedRow(), 6);                        
                        jTab.setValueAt(sUnidOri,       jTab.getSelectedRow(), 7);                        
                        jTab.setValueAt(sMonOri,        jTab.getSelectedRow(), 8);                        
                        jTab.setValueAt(sPreOri,        jTab.getSelectedRow(), 9);                        
                        jTab.setValueAt(sDescOri,       jTab.getSelectedRow(), 10);                        
                        jTab.setValueAt(sImpoOri,       jTab.getSelectedRow(), 11);                        
                        jTab.setValueAt(sImpueOri,      jTab.getSelectedRow(), 12);                        
                        jTab.setValueAt(sFechOri,       jTab.getSelectedRow(), 13);                        
                        jTab.setValueAt(sTallOri,       jTab.getSelectedRow(), 14);                        
                        jTab.setValueAt(sColOri,        jTab.getSelectedRow(), 15);                        
                        jTab.setValueAt(sLotOri,        jTab.getSelectedRow(), 16);                        
                        jTab.setValueAt(sPedimenOri,    jTab.getSelectedRow(), 17);                        
                        jTab.setValueAt(sCaduOri,       jTab.getSelectedRow(), 18);                        
                        jTab.setValueAt(sBackOri,       jTab.getSelectedRow(), 19);                                                                        
                        jTab.setValueAt(sSerOri,        jTab.getSelectedRow(), 20);
                        jTab.setValueAt(sComenOri,      jTab.getSelectedRow(), 21);
                       
                        /*Resetea el celleditor*/
                        iContCellEd = 1;
                    }                                            
                                            
                }/*Fin de if("tableCellEditor".equals(property)) */
                
            }/*Fin de public void propertyChange(PropertyChangeEvent event) */            
        };        
        
        /*Establece el listener para la tabla*/
        jTab.addPropertyChangeListener(pro);

        /*Si la compra no es nula entonces carga todos los datos de esa compra en la tabla*/
        if(sComp!=null)
            vCargP(sComp);            
        
    }/*Fin de public VisEmps() */
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visor Tabla de Empresas");
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
                "No.", "Compra", "Qty", "Producto", "Descripción", "Devueltos", "Kit", "Unidad", "Moneda", "Precio", "Descuento", "Importe", "Impuesto", "Fecha", "Talla", "Color", "Lote", "Pedimento", "Caducidad", "Backorder", "Serie Producto", "Comentario Serie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setRequestFocusEnabled(false);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTab);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*Carga las partidas de esa compra en la tabla*/
    private void vCargP(String sComp)
    {
        /*Abre la base de datos*/        
        Connection  con;  
        try 
        {
            con = DriverManager.getConnection("jdbc:mysql://" + Star.sInstancia + ":" + Star.sPort + "/" + Star.sBD + "?user=" + Star.sUsuario + "&password=" + Star.sContrasenia );                       
        } 
        catch(SQLException | java.awt.HeadlessException e) 
        {    
            /*Agrega en el log*/
            Login.vLog(e.getMessage());
            
	    /*Mensajea y regresa*/    
            JOptionPane.showMessageDialog(null, this.getClass().getName() + " Error por " + e.getMessage(), "Error BD", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconEr))); 
            return;
        }
        
        /*Contador de fila*/
        int iContFi = 1;
        
        /*Declara variables de la base de datos*/
        Statement   st;
        ResultSet   rs;        
        String      sQ              = ""; 
        
        /*Obtiene todas las partidas de la compra*/
        try
        {
            sQ = "SELECT fent, cost, impo, cant, prod, descrip, devs, eskit, unid, comprs.MON, descu, partcomprs.IMPUE, partcomprs.FALT, tall, colo, lot, pedimen, flotvenc, fent, serprod, comenser FROM partcomprs LEFT OUTER JOIN comprs ON comprs.CODCOMP = partcomprs.CODCOM WHERE codcomp = '" + sComp + "'";	
            st = con.createStatement();
            rs = st.executeQuery(sQ);
            /*Si hay datos entonces*/
            if(rs.next())          
            {
                /*Obtiene los totales*/
                String sPre     = rs.getString("cost");
                String sImpo    = rs.getString("impo");                
                
                /*Dale formato de moneda a los totales*/                
                NumberFormat n  = NumberFormat.getCurrencyInstance(new Locale("es","MX"));
                double dCant    = Double.parseDouble(sPre);                
                sPre            = n.format(dCant);
                dCant           = Double.parseDouble(sImpo);                
                sImpo           = n.format(dCant);
                
                /*Agrega el registro en la tabla*/
                DefaultTableModel te    = (DefaultTableModel)jTab.getModel();
                Object nu[]             = {iContFi, sComp, rs.getString("cant"), rs.getString("prod"), rs.getString("descrip"), rs.getString("devs"), rs.getString("eskit"), rs.getString("unid"), rs.getString("mon"), sPre, rs.getString("descu"), sImpo, rs.getString("impue"), rs.getString("falt"), rs.getString("tall"), rs.getString("colo"), rs.getString("lot"), rs.getString("pedimen"), rs.getString("flotvenc"), rs.getString("fent"), rs.getString("serprod"), rs.getString("comenser")};
                te.addRow(nu);                      
                
                /*Aumenta el contador de fila en uno*/
                ++iContFi;                
            }                
        }
        catch(SQLException e)
        {
            //Cierra la base de datos
            if(Star.iCierrBas(con)==-1)
                return;
                        
            //Agrega en el log
            Login.vLog(e.getMessage());            	    
            
            //Mensajea y regresa
            JOptionPane.showMessageDialog(null, this.getClass().getName() + " Error en " + sQ + " por " + e.getMessage(), "Error BD", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource(Star.sRutIconEr)));         
            return;
        }
    
        //Cierra la base de datos
        Star.iCierrBas(con);                   

    }/*Fin de private void vCargP(String sVta)*/            
    
    
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

    
    /*Cuando el estado de la ventana cambia*/
    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        
        /*Que este máximizado siempre*/
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | VisComps2.MAXIMIZED_BOTH);
        
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
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
