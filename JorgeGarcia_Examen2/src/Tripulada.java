
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Tripulada extends Nave{
    /*contiene un lugar de despeje y una lista de astronautas (Estos astronautas
deberán ser seleccionados de astronautas que ya se han creado anteriormente*/
    private String lugar_despeje;
    private ArrayList<Astronauta> tripulacion;

    public Tripulada() {
    }

    public Tripulada(String lugar_despeje, ArrayList<Astronauta> tripulacion) {
        this.lugar_despeje = lugar_despeje;
        this.tripulacion = tripulacion;
    }

    public Tripulada(String lugar_despeje, ArrayList<Astronauta> tripulacion, String numero_serie, Planeta destino, float velocidad) {
        super(numero_serie, destino, velocidad);
        this.lugar_despeje = lugar_despeje;
        this.tripulacion = tripulacion;
    }
    
    

    public String getLugar_despeje() {
        return lugar_despeje;
    }

    public void setLugar_despeje(String lugar_despeje) {
        this.lugar_despeje = lugar_despeje;
    }

    public ArrayList<Astronauta> getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(ArrayList<Astronauta> tripulacion) {
        this.tripulacion = tripulacion;
    }

    /*el tiempo de ida es igual a (distancia / (velocidad*(suma de todos los
pesos al cuadrado / 100))), y la velocidad de regreso será (distancia / (velocidad*(suma de todos los pesos
/ 100)))*/
    @Override
    public double[] calcularTiempo() {
        float peso = 0;
        for (Astronauta astronauta : tripulacion) {
            peso += astronauta.getPeso();
        }
        double[] tiempo = new double[2];
        tiempo[0] = (this.getDestino().getDistancia())/(this.getVelocidad()*((peso*peso)/100));
        tiempo[1] = (this.getDestino().getDistancia())/(this.getVelocidad()*(peso/100));
        return tiempo;
    }
    
    
    
}
