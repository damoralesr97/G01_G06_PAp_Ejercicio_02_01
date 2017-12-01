/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.EventoArbol;
import controlador.EventoVentanaInicial;
import controlador.GestionDato;
//import controlador.GestionDato;
import java.awt.HeadlessException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;



public class VentanaInicial extends javax.swing.JFrame {
    private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private JMenu menu;
    private JMenu menu2;
    private List<JMenuItem> menuItemList;
    private GestionDato gD;
     private DefaultTreeModel arbolD=null;
  

    public VentanaInicial( GestionDato gD, String title,DefaultTreeModel arbolD)  {
        super(title);
        this.gD = gD;
         this.arbolD= arbolD;
        this.setSize(800, 600);
        this.setDefaultCloseOperation(3);
        this.iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        this.escritorio = new JDesktopPane();
        this.barraMenu = new JMenuBar();
        this.menu = new JMenu("Archivo ");
        this.menu2 = new JMenu("Dirccion ");
        this.menuItemList = new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Crear"));
        this.menuItemList.add(new JMenuItem("Editar"));
        this.menuItemList.add(new JMenuItem("Crear"));
        this.menuItemList.add(new JMenuItem("Editar"));
        
        
        this.menuItemList.get(0).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(2).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(3).addActionListener(new EventoVentanaInicial(this));
      
        
        this.setContentPane(escritorio);
        this.setJMenuBar(barraMenu);
        this.barraMenu.add(this.menu);
        this.barraMenu.add(this.menu2);
        
        this.menu.add(this.menuItemList.get(0));
        this.menu.add(this.menuItemList.get(1));
        this.menu2.add(this.menuItemList.get(2));
        this.menu2.add(this.menuItemList.get(3));
        
      
		
		
    }
    
    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public JMenu getMenu() {
        return menu;
    }

    public void setMenu(JMenu menu) {
        this.menu = menu;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public JMenu getMenu2() {
        return menu2;
    }

    public void setMenu2(JMenu menu2) {
        this.menu2 = menu2;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    public DefaultTreeModel getArbolD() {
        return arbolD;
    }

    public void setArbolD(DefaultTreeModel arbolD) {
        this.arbolD = arbolD;
    }

    
    
}
