
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Planeta implements Serializable{
    //nombre, temperatura media, se
//necesita saber si tiene anillos o no, tipo de superficie y distancia de la Tierra
    private String name;
    private float temperatura;
    private boolean anillos;
    private String superficie;
    private int distancia;
    private static final long SerialVersionUID = 555L;

    public Planeta() {
    }

    public Planeta(String name, float temperatura, boolean anillos, String superficie, int distancia) {
        this.name = name;
        this.temperatura = temperatura;
        this.anillos = anillos;
        this.superficie = superficie;
        this.distancia = distancia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
