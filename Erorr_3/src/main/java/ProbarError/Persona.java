/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProbarError;

/**
 *
 * @author Gercray
 */
 class Persona {

    public void Hablar(){
        System.out.println("Hola a todos");
    }
}

 class Niño extends Persona{
    @Override //Override se usa para indicar a el copilador o hasta para a ti mismo a entender mejor
    public void Hablar(){
        System.out.println("Mamá, Papá");
    }
    
}
