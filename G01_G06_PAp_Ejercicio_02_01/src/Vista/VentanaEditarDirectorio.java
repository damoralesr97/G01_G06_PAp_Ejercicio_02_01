/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author paulo
 */
public class VentanaEditarDirectorio extends JInternalFrame
{
     private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton;
    private JButton boton2;
    private JPanel panelPrincipal;
    private JScrollPane scroll;
    private GestionDato gD;
    
    public VentanaEditarDirectorio(GestionDato gD) {
        super("Editar Directorio",true,true,true,true);
        this.gD=gD;
        this.iniciaComponentes();
        this.setSize(500, 500);
    }
     public void iniciaComponentes()
     {
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Origen"));
        this.etiList.add(new JLabel("Nuevo Nombre"));
        
        this.txtList= new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        
        this.boton = new JButton("Modificar");
        
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioSup = new GridLayout(6,2);
        JPanel panelSup = new JPanel(disenioSup);
        
        for(int i=0;i<2;i++)
        {
            panelSup.add(this.etiList.get(i));
            panelSup.add(this.txtList.get(i));
        }
        
        panelSup.add(this.boton);
        this.panelPrincipal.add(panelSup,BorderLayout.NORTH);

        this.add(this.panelPrincipal);
        
     }

}
