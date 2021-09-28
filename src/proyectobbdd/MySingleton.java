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
public class MySingleton {

    private String x;
    private static MySingleton mysingleton;

    private MySingleton(String x) {
        this.x = x;
    }

    public static MySingleton getMySingleton(String x) {
        if (mysingleton == null) {
            mysingleton = new MySingleton(x);
        }
        return mysingleton;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
    
}
