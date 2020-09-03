/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicomfacauca.app.utilidad;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
/**
 *
 * @author aleja
 */
public class ReproductorMp3 {
    
    public void play(String nombreArchivoMP3){
                
        try {
            FileInputStream fis;
            Player player;
            System.out.println("PAth File");
            System.out.println(getClass().getResource("/audios/"+nombreArchivoMP3).getPath());
            fis = new FileInputStream(getClass().getResource("/audios/"+nombreArchivoMP3).getPath());
            BufferedInputStream bis = new BufferedInputStream(fis);

            player = new Player(bis); // Llamada a constructor de la clase Player
            player.play();          // Llamada al método play
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}
