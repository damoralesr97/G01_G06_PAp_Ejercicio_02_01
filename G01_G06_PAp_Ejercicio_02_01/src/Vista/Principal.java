/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.EventoArbol;
import controlador.GestionDato;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DefaultMutableTreeNode padre=new DefaultMutableTreeNode();
        DefaultTreeModel arbolD=new DefaultTreeModel(padre);
        GestionDato gD = new GestionDato();
        EventoArbol p = new EventoArbol();
        String ruta="C://";
        arbolD=p.CargaEstructuraDirectorios(arbolD, padre, ruta);
        VentanaInicial vI = new VentanaInicial(gD, "Examen Parcial 01",arbolD);
        vI.setVisible(true);
    }
    
}
