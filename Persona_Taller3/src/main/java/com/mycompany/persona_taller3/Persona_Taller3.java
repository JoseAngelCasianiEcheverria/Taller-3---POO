/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona_taller3;

/**
 *
 * @author Gercray
 */
public class Persona_Taller3 {

    public static void main(String[] args) {
        Persona persona = new Persona("Jose", 18);

        System.out.println("Nombre: " + persona.getNombre());

        persona.setNombre("Karen");
        System.out.println("Nombre modificado: " + persona.getNombre());

        System.out.println("Edad: " + persona.edad);

        persona.edad = 20;
        System.out.println("Edad modificada: " + persona.edad);

        persona.Datos_Persona();
    }
}
