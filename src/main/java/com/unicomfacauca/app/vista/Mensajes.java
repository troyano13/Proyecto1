/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicomfacauca.app.vista;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Mensajes {
    
    
     public final static void mensajeInformacion(String mensaje){
        JOptionPane optionPane = new JOptionPane(mensaje, JOptionPane.INFORMATION_MESSAGE);    
        JDialog dialog = optionPane.createDialog("Información");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }
    
    public final static void mensajeAdvertencia(String mensaje){
        JOptionPane optionPane = new JOptionPane(mensaje, JOptionPane.WARNING_MESSAGE);    
        JDialog dialog = optionPane.createDialog("Advertencia");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }
    
    public final static void mensajeError(String mensaje){
        JOptionPane optionPane = new JOptionPane(mensaje, JOptionPane.ERROR);    
        JDialog dialog = optionPane.createDialog("Error!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }
    
}
