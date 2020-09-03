/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicomfacauca.app;

import com.unicomfacauca.app.utilidad.ReproductorMp3;
import java.util.Random;
import javazoom.jl.player.Player;

/**
 *
 * @author aleja
 */
public class MainTest {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("HOLA");
        new ReproductorMp3().play("vegas.mp3");
        System.out.println("HOLA");
        Thread.sleep(5000);
        System.out.println("Mundo");
        new ReproductorMp3().play("vegas.mp3");
    }
    
}
