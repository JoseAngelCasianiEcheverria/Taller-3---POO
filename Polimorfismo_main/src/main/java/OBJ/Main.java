/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJ;

/**
 *
 * @author Gercray
 */
public class Main {
    public static void main(String arg[]){
        Personas persona1 = new Personas("Jose", 18);
        Estudiante estudiante1 = new Estudiante("Carlos", 17, "Ingieneria de sistema");
        Profesor profesor1 = new Profesor("Gustavo", 40, "Unicolombo");
        
        persona1.Presentarse();
        estudiante1.Presentarse();
        profesor1.Presentarse();
    }
}
