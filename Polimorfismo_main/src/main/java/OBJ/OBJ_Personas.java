/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJ;

/**
 *
 * @author Gercray
 */
 class Personas {
    private String nombre;
    private int edad;
    
    public Personas(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        
    }


    
    public void Presentarse(){
        System.out.println("Hola soy una persona y mi nombre es "+nombre + " y tengo "+edad + " años");
    }
}
class Estudiante extends Personas {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }
    
    public void presentarse() {
        System.out.println("Hola soy " + super.nombre() + " tengo " + super.getNombre()+ " años y estudio " + carrera);
    }
}
class Profesor extends Personas {
    private String universidad;

    public Profesor(String nombre, int edad, String universidad) {
        super(nombre, edad);
        this.universidad = universidad;
    }
    
    public void presentarse() {
        System.out.println("Hola soy " + super.getNombre() + " tengo " + super.getEdad() + " años y soy profesor en la universidad: " + universidad);
    }
}

