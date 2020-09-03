/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicomfacauca.app.vista.estudiante;

import com.unicomfacauca.app.modelo.ParejasConcentrese;
import com.unicomfacauca.app.vista.Cronometro;
import com.unicomfacauca.app.vista.Mensajes;
import com.unicomfacauca.app.vista.PanelChild;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author aleja
 */
public class PanelJuegoConcentrese extends PanelChild {
    
    private boolean []mostrarCampos;
    private List<ParejasConcentrese> listaParejas;
    private ParejasConcentrese parejaSeleccionada;
    private Random randomGenerator;
    private boolean hayAlgunoSeleccionado;
    private Icon iconDefault;
    private int totalIntentos = 0;
    private int totalAciertos = 0;
    private int posicionSeleccionada = 0;
    private int totalErrores = 0;
    private javax.swing.JButton botonSeleccionado;
    private Cronometro cronometro;
    
    public PanelJuegoConcentrese(JInternalFrame jifPanelPrincipal) {
        
        super(null, null,null);
        initComponents();
        System.out.println("Panel Juego Concentrese === ");
        System.out.println("HOLA MUNDO ========================= CONCNETRESE");
        iconDefault = imagenDefault();
        btnConcentrese_1.setIcon(iconDefault);
        btnConcentrese_2.setIcon(iconDefault);
        btnConcentrese_3.setIcon(iconDefault);
        btnConcentrese_4.setIcon(iconDefault);
        btnConcentrese_5.setIcon(iconDefault);
        btnConcentrese_6.setIcon(iconDefault);
        btnConcentrese_7.setIcon(iconDefault);
        btnConcentrese_8.setIcon(iconDefault);
        btnConcentrese_9.setIcon(iconDefault);
        btnConcentrese_10.setIcon(iconDefault);
        btnConcentrese_11.setIcon(iconDefault);
        btnConcentrese_12.setIcon(iconDefault);
        
       
        mostrarCampos = new boolean[12];        
        randomGenerator = new Random();
        generateJuegoAleatorio();
        this.setVisible(true);
        this.repaint();        
    }
    
    private Icon imagenDefault(){
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/interrogante.png"));        
        final Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(100,50, Image.SCALE_DEFAULT));
        return icon;
    }
    
     private void generateJuegoAleatorio(){
        listaParejas = new ArrayList<>();
        listaParejas.add(new ParejasConcentrese(1, 1, "concentrese_1.jpg"));
        listaParejas.add(new ParejasConcentrese(2, 1, "concentrese_1.jpg"));
        listaParejas.add(new ParejasConcentrese(3, 2, "concentrese_2.jpg"));
        listaParejas.add(new ParejasConcentrese(4, 2, "concentrese_2.jpg"));
        listaParejas.add(new ParejasConcentrese(5, 3, "concentrese_3.jpg"));
        listaParejas.add(new ParejasConcentrese(6, 3, "concentrese_3.jpg"));
        listaParejas.add(new ParejasConcentrese(7, 4, "concentrese_4.jpg"));
        listaParejas.add(new ParejasConcentrese(8, 4, "concentrese_4.jpg"));
        listaParejas.add(new ParejasConcentrese(9, 5, "concentrese_5.jpg"));
        listaParejas.add(new ParejasConcentrese(10, 5, "concentrese_5.jpg"));
        listaParejas.add(new ParejasConcentrese(11, 6, "concentrese_6.jpg"));
        listaParejas.add(new ParejasConcentrese(12, 6, "concentrese_6.jpg"));
        
        int tamanioLista  = listaParejas.size();
        for (int i = 0; i < tamanioLista ; i++) {
            ParejasConcentrese objetoInicial = listaParejas.get(i);
            int posicionAleatorio = generateAleatorio(tamanioLista);            
            ParejasConcentrese objetoAleatorio = listaParejas.get(posicionAleatorio);            
            listaParejas.set(i, objetoAleatorio);
            listaParejas.set(posicionAleatorio, objetoInicial);                        
        }
    }
    
    private int generateAleatorio(int size){
        return randomGenerator.nextInt(size);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConcentrese_1 = new javax.swing.JButton();
        btnConcentrese_2 = new javax.swing.JButton();
        btnConcentrese_3 = new javax.swing.JButton();
        btnConcentrese_4 = new javax.swing.JButton();
        btnConcentrese_5 = new javax.swing.JButton();
        btnConcentrese_6 = new javax.swing.JButton();
        btnConcentrese_7 = new javax.swing.JButton();
        btnConcentrese_8 = new javax.swing.JButton();
        btnConcentrese_9 = new javax.swing.JButton();
        btnConcentrese_10 = new javax.swing.JButton();
        btnConcentrese_11 = new javax.swing.JButton();
        btnConcentrese_12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblNumeroIntentos = new javax.swing.JLabel();
        lblAciertos = new javax.swing.JLabel();
        lblErrores = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(3, 4, 3, 3));

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        btnConcentrese_1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_1);

        btnConcentrese_2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_2.setToolTipText("");
        btnConcentrese_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_2);

        btnConcentrese_3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_3.setToolTipText("");
        btnConcentrese_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_3);

        btnConcentrese_4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_4.setToolTipText("");
        btnConcentrese_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_4);

        btnConcentrese_5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_5.setToolTipText("");
        btnConcentrese_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_5);

        btnConcentrese_6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_6.setToolTipText("");
        btnConcentrese_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_6);

        btnConcentrese_7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_7.setToolTipText("");
        btnConcentrese_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_7);

        btnConcentrese_8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_8.setToolTipText("");
        btnConcentrese_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_8);

        btnConcentrese_9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_9.setToolTipText("");
        btnConcentrese_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_9);

        btnConcentrese_10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_10.setToolTipText("");
        btnConcentrese_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_10ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_10);

        btnConcentrese_11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_11.setToolTipText("");
        btnConcentrese_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_11ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_11);

        btnConcentrese_12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnConcentrese_12.setToolTipText("");
        btnConcentrese_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrese_12ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConcentrese_12);

        add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        lblNumeroIntentos.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jPanel2.add(lblNumeroIntentos);

        lblAciertos.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jPanel2.add(lblAciertos);

        lblErrores.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jPanel2.add(lblErrores);

        lblTime.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jPanel2.add(lblTime);

        add(jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcentrese_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_1ActionPerformed
        int posicion = 0;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_1)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_1ActionPerformed

    private void btnConcentrese_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_2ActionPerformed
        int posicion = 1;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_2)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_2ActionPerformed

    private void btnConcentrese_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_3ActionPerformed
        int posicion = 2;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_3)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_3ActionPerformed

    private void btnConcentrese_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_4ActionPerformed
        int posicion = 3;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_4)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_4ActionPerformed

    private void btnConcentrese_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_5ActionPerformed
       int posicion = 4;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_5)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_5ActionPerformed

    private void btnConcentrese_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_6ActionPerformed
        int posicion = 5;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_6)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_6ActionPerformed

    private void btnConcentrese_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_7ActionPerformed
        int posicion = 6;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_7)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_7ActionPerformed

    private void btnConcentrese_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_8ActionPerformed
        int posicion = 7;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_8)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_8ActionPerformed

    private void btnConcentrese_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_9ActionPerformed
        int posicion = 8;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_9)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_9ActionPerformed

    private void btnConcentrese_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_10ActionPerformed
        int posicion = 9;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_10)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_10ActionPerformed

    private void btnConcentrese_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_11ActionPerformed
        int posicion = 10;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_11)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_11ActionPerformed

    private void btnConcentrese_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrese_12ActionPerformed
        int posicion = 11;//Debe ir un numero menor que el boton OJO!!
        if(evaluarAcierto(posicion, btnConcentrese_12)){
            System.out.println("HA adivinado una pareja =============== ");
        }
    }//GEN-LAST:event_btnConcentrese_12ActionPerformed

    
    public boolean evaluarAcierto(int posicion, javax.swing.JButton button){
        boolean adivino = false;
        if(hayAlgunoSeleccionado==true){                       
            if(parejaSeleccionada.getId() != listaParejas.get(posicion).getId()){
                ++totalIntentos;                
                hayAlgunoSeleccionado=false;
                
                mostrarCarta(listaParejas.get(posicion), button);
                
                if(parejaSeleccionada.getCodigo()== listaParejas.get(posicion).getCodigo()){                                       
                    mostrarCampos[posicion] = true;
                    ++totalAciertos;
                    adivino = true;
                    botonSeleccionado.setEnabled(false);
                    button.setEnabled(false);
                    actualizarLabel();
                    evaluarSiCompleto();                    
                    
                }else{
                    mostrarCampos[posicion] = false;
                    mostrarCampos[posicionSeleccionada] = false;
                    ++totalErrores;
                    Mensajes.mensajeInformacion("Sigue Intentando");
                    botonSeleccionado.setIcon(iconDefault);
                    button.setIcon(iconDefault);
                }
            }
        }else{
            ++totalIntentos;
            if(totalIntentos <=1){
                cronometro = new Cronometro(lblTime);
                cronometro.start();
            }
            hayAlgunoSeleccionado=true;
            posicionSeleccionada = posicion;
            mostrarCampos[posicion] = true;
            botonSeleccionado = button;            
            parejaSeleccionada = listaParejas.get(posicion);            
            mostrarCarta(parejaSeleccionada, button);
            actualizarLabel();
        }
        
        
        return adivino;
    }
    private void mostrarCarta(ParejasConcentrese parejaSeleccionada, javax.swing.JButton button){
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/"+parejaSeleccionada.getNombreImagen()));        
        final Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(260,110, Image.SCALE_DEFAULT));
        button.setIcon(icon);
    }
    
    private void actualizarLabel(){
        lblNumeroIntentos.setText("Número de intentos: "+totalIntentos);
        lblAciertos.setText("Número de aciertos: "+totalAciertos);        
        lblNumeroIntentos.setText("Número de intentos: "+totalIntentos);
        lblErrores.setText("Número de errores: "+totalErrores);
        
        
    }
    private void evaluarSiCompleto(){
        
        if(totalAciertos == 6){
            cronometro.detener();
            Mensajes.mensajeInformacion("Felicitaciones!!!!! Has ganado");            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcentrese_1;
    private javax.swing.JButton btnConcentrese_10;
    private javax.swing.JButton btnConcentrese_11;
    private javax.swing.JButton btnConcentrese_12;
    private javax.swing.JButton btnConcentrese_2;
    private javax.swing.JButton btnConcentrese_3;
    private javax.swing.JButton btnConcentrese_4;
    private javax.swing.JButton btnConcentrese_5;
    private javax.swing.JButton btnConcentrese_6;
    private javax.swing.JButton btnConcentrese_7;
    private javax.swing.JButton btnConcentrese_8;
    private javax.swing.JButton btnConcentrese_9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAciertos;
    private javax.swing.JLabel lblErrores;
    private javax.swing.JLabel lblNumeroIntentos;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}
