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
public class Productor {
    
    int idProductor;
    String nombreProductor;
    String edadProductor;
    String paisProductor;
    String cargo;
    
    public Productor(int idProductor, String nombreProductor, String edadProductor, String paisProductor, String cargo){
        this.idProductor = idProductor;
        this.nombreProductor = nombreProductor;
        this.edadProductor = edadProductor;
        this.paisProductor = paisProductor;
        this.cargo = cargo;
    }
    
    public int getidProductor(){
        return idProductor;
    }
    
    public void setidProductor(int idProductor){
        this.idProductor = idProductor;
    }
    
    public String getnombreProductor(){
        return nombreProductor;
    }
    
    public void setnombreProductor(String nombreProductor){
        this.nombreProductor = nombreProductor;
    }
    
    public String getedadProductor(){
        return edadProductor;
    }
    
    public void setedadProductor(String edadProductor){
        this.edadProductor = edadProductor;
    }
    
    public String getpaisProductor(){
        return paisProductor;
    }
    
    public void setpaisProductor(String paisProductor){
        this.paisProductor = paisProductor;
    }
    
    public String getcargo(){
        return cargo;
    }
    
    public void setcargo(String cargo){
        this.cargo = cargo;
    }
    
    public void verInformacionProductor(){
        System.out.println("\nINFORMACIÓN DE " + nombreProductor.toUpperCase() + ":\nNombre: " +  getnombreProductor() + "\nEdad: " + getedadProductor() + "\nPaís de nacimiento: " + getpaisProductor() + "\nCargo: " + getcargo());
    }
    
}
