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
public class VenantaCrearArchivo extends JInternalFrame
{
     private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton;
    private JButton boton2;
    private JPanel panelPrincipal;
    private JScrollPane scroll;
    private GestionDato gD;
    
     public VenantaCrearArchivo(GestionDato gD) {
        super("Crear Archivo",true,true,true,true);
        this.gD=gD;
        this.iniciaComponentes();
        this.setSize(500, 500);
    }
      public void iniciaComponentes()
     {
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("C:/"));
        
        this.txtList= new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        
        this.boton = new JButton("Crear");
        this.boton2 = new JButton("Eliminar");
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioSup = new GridLayout(3,2);
        JPanel panelSup = new JPanel(disenioSup);
        
        for(int i=0;i<1;i++)
        {
            panelSup.add(this.etiList.get(i));
            panelSup.add(this.txtList.get(i));
        }
        
         panelSup.add(this.boton);
         panelSup.add(this.boton2);
        this.panelPrincipal.add(panelSup,BorderLayout.NORTH);

        this.add(this.panelPrincipal);
        
     }

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JButton getBoton2() {
        return boton2;
    }

    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
      
    
}
