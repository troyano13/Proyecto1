/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicomfacauca.app.vista;

import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author aleja
 */
public class PanelChild extends JPanel{
    
    public final JDesktopPane desktopPane;
    public PanelChild panelChildSiguiente;
    public final JInternalFrame jifPanelPrincipal;
    //public final JInternalFrame jifPanelVisualiza1;
    //public final JInternalFrame jifPanelVisualiza2;
    
    private PanelChild panelPadre;

    public PanelChild(JDesktopPane desktopPane, PanelChild panelChildSiguiente, JInternalFrame jifPanelPrincipal) {      
        this.desktopPane = desktopPane;
        this.panelChildSiguiente = panelChildSiguiente;
        this.jifPanelPrincipal = jifPanelPrincipal;        
        //this.jifPanelVisualiza1 = jifPanelVisualiza1;
        //this.jifPanelVisualiza2 = jifPanelVisualiza2;        
    }

    public void setPanelPadre(PanelChild panelPadre) {
        this.panelPadre = panelPadre;
    }
        
}
