/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicomfacauca.app.vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author aleja
 */
public class Cronometro extends Thread{

    private JLabel jlabel;
    private int decimas=0, segundos=0, minutos=0, horas=0; 
    private boolean correr;
    public Cronometro(JLabel jlabel) {
        this.jlabel = jlabel;
        correr = true;
    }
    
    
    
    @Override
    public void run() {
        while (correr) {
            try {
                jlabel.setText(horas+":"+minutos+":"+segundos+":"+decimas);
                decimas +=10; 
                sleep(100);
                System.out.println("hilo "+jlabel.getText());
                if(decimas >= 99){
                    decimas = 0;
                    ++segundos;
                }
                if(segundos >= 60){
                    segundos = 0;
                    ++minutos;
                }
                if(minutos >= 60){
                    minutos = 0;
                    ++horas;
                }
                if(horas >=24){
                    horas=0;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void detener(){
        this.correr = false;
    }
    
    
    
}
