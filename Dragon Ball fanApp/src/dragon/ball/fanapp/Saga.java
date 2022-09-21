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
public class Saga {
    
    int idSaga;
    String resumen;
    String nombreSaga;
    int anoLanzamiento;
    int cantidadCapitulos;
    
    public Saga(int idSaga, String resumen, String nombreSaga, int anoLanzamiento, int cantidadCapitulos){
        this.idSaga = idSaga;
        this.resumen = resumen;
        this.nombreSaga = nombreSaga;
        this.anoLanzamiento = anoLanzamiento;
        this.cantidadCapitulos = cantidadCapitulos;
    }
    
    public int getidSaga(){
        return idSaga;
    }
    
    public void setidSaga(int idSaga){
        this.idSaga = idSaga;
    }
    
    public String getresumen(){
        return resumen;
    }
    
    public void setresumen(String resumen){
        this.resumen = resumen;
    }
    
    public String getnombreSaga(){
        return nombreSaga;
    }
    
    public void setnombreSaga(String nombreSaga){
        this.nombreSaga = nombreSaga;
    }
    
    public int getanoLanzamiento(){
        return anoLanzamiento;
    }
    
    public void setanoLanzamiento(int anoLanzamiento){
        this.anoLanzamiento = anoLanzamiento;
    }
    
    public int getcantidadCapitulos(){
        return cantidadCapitulos;
    }
    
    public void setcantidadCapitulos(int cantidadCapitulos){
        this.cantidadCapitulos = cantidadCapitulos;
    }
    
    public void verResumen(){
        System.out.println("\nRESUMEN DE " + nombreSaga.toUpperCase() + ":\n" + getresumen());
    }
    
    public void verInformacionSaga(){
        System.out.println("\nINFORMACIÓN DE " + nombreSaga.toUpperCase() + ":\nNombre: " +  getnombreSaga() + "\nAño de lanzamiento: " + getanoLanzamiento() + "\nCantidad de capítulos: " + getcantidadCapitulos());
    }
    
}
