/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Gercray
 */
 class Vehiculo {
    private String tipoVehiculo;
  
    public void Moverse(){
        System.out.println("El vehiculo se esta moviendo a 45km/h");
    }
}

 class Bicicleta extends Vehiculo{
    @Override
    
    public void Moverse(){
        System.out.println("La bicicleta se esta moviendo a 20km/h");
    }
}
