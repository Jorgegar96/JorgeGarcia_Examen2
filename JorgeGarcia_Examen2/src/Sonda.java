/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Sonda extends Nave{
    // tiene un material y un peso en kg
    private String material;
    private float peso;

    public Sonda() {
    }

    public Sonda(String material, float peso) {
        this.material = material;
        this.peso = peso;
    }

    public Sonda(String material, float peso, String numero_serie, Planeta destino, float velocidad) {
        super(numero_serie, destino, velocidad);
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    /*se calculara con la división de la (distancia / velocidad de la sonda), el tiempo de regreso se
calculara por la formula (9.8*Velocidad de ida)*/
    @Override
    public double[] calcularTiempo() {
        double[] tiempo = new double[2];
        tiempo[0] = (this.getDestino().getDistancia())/this.getVelocidad() ;
        tiempo[1] = 9.8*this.getVelocidad() ;
        return tiempo;
    }
    
    
}
