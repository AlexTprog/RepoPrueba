/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobbdd;

/**
 *
 * @author alext
 */
public class ProyectoBBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MySingleton a = MySingleton.getMySingleton("a");
        MySingleton b = MySingleton.getMySingleton("b");
        
        System.out.println(a.getX());
        System.out.println(b.getX());
    }
    
}
