/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VenantaCrearArchivo;
import Vista.VenantaCrearDirectorio;
import Vista.VentanaEditarArchivo;
import Vista.VentanaEditarDirectorio;
import Vista.VentanaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author paulo
 */
public class EventoVentanaInicial implements ActionListener
{
     private VentanaInicial ventanaInicial;

    public EventoVentanaInicial(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }

    public VentanaInicial getVentanaInicial() {
        return ventanaInicial;
    }

    public void setVentanaInicial(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventanaInicial.getMenuItemList().get(0)))
        {
            VenantaCrearArchivo vCA = new VenantaCrearArchivo(this.ventanaInicial.getgD());
            vCA.setVisible(true);
            this.ventanaInicial.getEscritorio().add(vCA);
        }
        
        if(e.getSource().equals(this.ventanaInicial.getMenuItemList().get(1)))
        {
            VentanaEditarArchivo vEA = new VentanaEditarArchivo(this.ventanaInicial.getgD());
            vEA.setVisible(true);
            this.ventanaInicial.getEscritorio().add(vEA);
        }
        
        if(e.getSource().equals(this.ventanaInicial.getMenuItemList().get(2)))
        {
            VenantaCrearDirectorio vCD = new VenantaCrearDirectorio(this.ventanaInicial.getgD());
            vCD.setVisible(true);
            this.ventanaInicial.getEscritorio().add(vCD);
        }
        
        if(e.getSource().equals(this.ventanaInicial.getMenuItemList().get(3)))
        {
            VentanaEditarDirectorio vED = new  VentanaEditarDirectorio(this.ventanaInicial.getgD());
            vED.setVisible(true);
            this.ventanaInicial.getEscritorio().add(vED);
        }
    }
}
