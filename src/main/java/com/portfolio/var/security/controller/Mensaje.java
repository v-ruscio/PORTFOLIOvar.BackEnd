/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.var.security.controller;


public class Mensaje {
    private String mensaje;
    
    //Constructor
    
    public Mensaje(){
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    //Getters and Setters

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
