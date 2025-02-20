/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona_taller3;

/**
 *
 * @author Gercray
 */
public class Persona {
    private String nombre;
    int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Datos_Persona(){
         System.out.println("Nombre: " + nombre);
         System.out.println("Edad: " + edad);
    }
}
