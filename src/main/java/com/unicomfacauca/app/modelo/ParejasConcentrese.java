/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicomfacauca.app.modelo;

/**
 *
 * @author aleja
 */
public class ParejasConcentrese {
    
    private int id;    
    private int codigo;    
    private String nombreImagen;

    public ParejasConcentrese(int id, int codigo, String nombreImagen) {
        this.id = id;
        this.codigo = codigo;
        this.nombreImagen = nombreImagen;
    }
    
   
    public int getId() {
        return id;
    }
        
    public String getNombreImagen() {
        return nombreImagen;
    }

    public int getCodigo() {
        return codigo;
    }
            
}
