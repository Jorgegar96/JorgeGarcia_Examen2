
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
public class Astronauta implements Serializable{
    /* nombre, nacionalidad, sueldo,
experiencia, sexo y peso*/
    private String name;
    private String nacionalidad;
    private float sueldo;
    private String sexo;
    private float peso;
    private static final long SerialVersionUID = 777L;

    public Astronauta() {
    }

    public Astronauta(String name, String nacionalidad, float sueldo, String sexo, float peso) {
        this.name = name;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
