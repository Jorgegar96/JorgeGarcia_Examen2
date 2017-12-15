/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public abstract class Nave {
    /* número de serie, un planeta destino (este
destino deberá ser elegido de planetas creados anteriormente), y una velocidad*/
    private String numero_serie;
    private Planeta destino;
    private float velocidad;

    public Nave() {
    }

    public Nave(String numero_serie, Planeta destino, float velocidad) {
        this.numero_serie = numero_serie;
        this.destino = destino;
        this.velocidad = velocidad;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public Planeta getDestino() {
        return destino;
    }

    public void setDestino(Planeta destino) {
        this.destino = destino;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return numero_serie;
    }
    
    public abstract double[] calcularTiempo();
}
