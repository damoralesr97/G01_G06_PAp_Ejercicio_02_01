/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author paulo
 */
public class EventoArbol
{

   
public DefaultTreeModel CargaEstructuraDirectorios(DefaultTreeModel arbolD, DefaultMutableTreeNode padre, String ruta) {

		DefaultMutableTreeNode aux = null;
		File archivo = new File(ruta);
	    File[] archivos = archivo.listFiles();
	    if (archivos != null) {
	        for (int i = 0; i < archivos.length; i++) {
	            aux = new DefaultMutableTreeNode(archivos[i].getName());
	            arbolD.insertNodeInto(aux, padre, i);
	        }
            }
	    return arbolD;
	}
	
	public DefaultTreeModel CargaEstructuraDirectorios(DefaultTreeModel arbolD,File f,DefaultMutableTreeNode padre) {


		DefaultMutableTreeNode aux= null;
		File[] archivos=f.listFiles();
		if (archivos != null) {
	        for (int i = 0; i < archivos.length; i++) {
	 
	            aux = new DefaultMutableTreeNode(archivos[i].getName());
	            try {
	            	arbolD.insertNodeInto(aux, padre, i);
					
				} catch (Exception e) {
					
				}
	        }
	    }
		return arbolD;
	}
}
