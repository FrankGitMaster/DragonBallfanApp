/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon.ball.fanapp;

/**
 *
 * @author frank
 */
public class Personaje extends Planeta {
    
    String nombrePersonaje;
    String sagaAparicion;
    
    public Personaje(String nombrePersonaje, String nombreRaza, String nombrePlaneta, String gobernante, String sagaAparicion){
        super(nombreRaza, nombrePlaneta, gobernante);
        this.nombrePersonaje = nombrePersonaje;
        this.sagaAparicion = sagaAparicion;
    }
    
    public String getnombrePersonaje(){
        return nombrePersonaje;
    }
    
    public void setnombrePersonaje(String nombrePersonaje){
        this.nombrePersonaje = nombrePersonaje;
    }
    
    public String getsagaAparicion(){
        return sagaAparicion;
    }
    
    public void setsagaAparicion(String sagaAparicion){
        this.sagaAparicion = sagaAparicion;
    }
    
    public void descripcionPersonaje(){
        System.out.println("DESCRIPCIÓN DEL PERSONAJE:" + "\nNombre: " + getnombrePersonaje() + "\nRaza: " + getnombreRaza() + "\nPlaneta: " + getnombrePlaneta() + "\nSaga en la que aparece: " + getsagaAparicion());
    }
    
}
