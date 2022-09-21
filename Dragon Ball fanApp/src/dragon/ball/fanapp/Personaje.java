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

    int idPersonaje;
    String nombrePersonaje;
    String origen;
    String poder1;
    String poder2;
    String poder3;
    String fase1;
    String fase2;
    String fase3;
    String fase4;

    public Personaje(int idPlaneta, int idPersonaje, String descripcion, String nombrePersonaje, String nombrePlaneta, String nombreRaza, String gobernante, String origen, String poder1, String poder2, String poder3, String fase1, String fase2, String fase3, String fase4) {
        super(idPlaneta, descripcion, nombrePlaneta, nombreRaza, gobernante);
        this.idPersonaje = idPersonaje;
        this.nombrePersonaje = nombrePersonaje;
        this.origen = origen;
        this.poder1 = poder1;
        this.poder2 = poder2;
        this.poder3 = poder3;
        this.fase1 = fase1;
        this.fase2 = fase2;
        this.fase3 = fase3;
        this.fase4 = fase4;
    }

    public int getidPersonaje() {
        return idPersonaje;
    }

    public void setidPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getnombrePersonaje() {
        return nombrePersonaje;
    }

    public void setnombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getorigen() {
        return origen;
    }

    public void setorigen(String origen) {
        this.origen = origen;
    }

    public String getpoder1() {
        return poder1;
    }

    public void setpoder1(String poder1) {
        this.poder1 = poder1;
    }

    public String getpoder2() {
        return poder2;
    }

    public void setpoder2(String poder2) {
        this.poder2 = poder2;
    }

    public String getpoder3() {
        return poder3;
    }

    public void setpoder3(String poder3) {
        this.poder3 = poder3;
    }

    public String getfase1() {
        return fase1;
    }

    public void setfase1(String fase1) {
        this.fase1 = fase1;
    }

    public String getfase2() {
        return fase2;
    }

    public void setfase2(String fase2) {
        this.fase2 = fase2;
    }

    public String getfase3() {
        return fase3;
    }

    public void setfase3(String fase3) {
        this.fase3 = fase3;
    }

    public String getfase4() {
        return fase4;
    }

    public void setfase4(String fase4) {
        this.fase4 = fase4;
    }

    public void verDescripcionPersonaje() {
        System.out.println("\nDESCRIPCIÓN DE " + nombrePersonaje.toUpperCase() + ":\n" + getdescripcion());
    }
    
    public void verInformacionPersonaje() {
        System.out.println("\nINFORMACIÓN DE " + nombrePersonaje.toUpperCase() + ":\n" + "Nombre: " + getnombrePersonaje() + "\nPlaneta: " + getnombrePlaneta() + "\nRaza: " + getnombreRaza() + "\nOrigen: " + getorigen());
    }

    public void verPoderes() {
        System.out.println("\nPODERES DE " + nombrePersonaje.toUpperCase() + ":\n" + getpoder1() + "\n" + getpoder2() + "\n" + getpoder3());
    }

    public void verFases() {
        System.out.println("\nFASES DE " + nombrePersonaje.toUpperCase() + ":\n" + getfase1() + "\n" + getfase2() + "\n" + getfase3() + "\n" + getfase4());
    }

}
