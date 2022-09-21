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

    int idPlaneta;
    String descripcion;
    String nombrePlaneta;
    String nombreRaza;
    String gobernante;

    public Planeta(int idPlaneta, String descripcion, String nombrePlaneta, String nombreRaza, String gobernante) {
        this.idPlaneta = idPlaneta;
        this.descripcion = descripcion;
        this.nombrePlaneta = nombrePlaneta;
        this.nombreRaza = nombreRaza;
        this.gobernante = gobernante;
    }

    public int getidPlaneta(){
        return idPlaneta;
    }
    
    public void setidPlaneta(int idPlaneta){
        this.idPlaneta = idPlaneta;
    }
    
    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getnombrePlaneta() {
        return nombrePlaneta;
    }

    public void setnombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public String getnombreRaza() {
        return nombreRaza;
    }

    public void setnombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public String getgobernante() {
        return gobernante;
    }

    public void setgobernante(String gobernante) {
        this.gobernante = gobernante;
    }

    public void verDescripcionPlaneta() {
        System.out.println("\nDESCRIPCIÓN DEL PLANETA " + nombrePlaneta.toUpperCase() + ":\n" + getdescripcion());
    }

    public void verInformacionPlaneta() {
        System.out.println("\nINFORMACIÓN DEL PLANETA " + nombrePlaneta.toUpperCase() + ":\n" + "Nombre: " + getnombrePlaneta() + "\nRaza: " + getnombreRaza() + "\nGobernante: " + getgobernante());
    }

}
