package dragon.ball.fanapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frank
 */
public class Planeta {
    
    String nombrePlaneta;
    String nombreRaza;
    String gobernante;
    
    public Planeta(String nombrePlaneta, String nombreRaza, String gobernante){
        this.nombrePlaneta = nombrePlaneta;
        this.nombreRaza = nombreRaza;
        this.gobernante = gobernante;
    }
    
    public String getnombrePlaneta(){
        return nombrePlaneta;
    }
    
    public void setnombrePlaneta(String nombrePlaneta){
        this.nombrePlaneta = nombrePlaneta;
    }
    
    public String getnombreRaza(){
        return nombreRaza;
    }
    
    public void setnombreRaza(String nombreRaza){
        this.nombreRaza = nombreRaza;
    }
    
    public String getgobernante(){
        return gobernante;
    }
    
    public void setgobernante(String gobernante){
        this.gobernante = gobernante;
    }
    
    public void descripcionPlaneta(){
        System.out.println("DESCRIPCIÓN DEL PLANETA:" + "\nNombre: " + getnombrePlaneta() + "\nRaza: " + getnombreRaza() + "\nGobernante: " + getgobernante());
    }
    
}
