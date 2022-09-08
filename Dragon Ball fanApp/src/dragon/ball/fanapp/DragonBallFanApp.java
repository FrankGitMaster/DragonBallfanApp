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
public class DragonBallFanApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Planeta Tierra = new Planeta("Tierra", "Humana", "Ninguno");
        Tierra.descripcionPlaneta();
        Personaje Goku = new Personaje("Goku", "Sayayin", "Vegeta", "", "Dragon Ball");
        Goku.descripcionPersonaje();
    }
    
}