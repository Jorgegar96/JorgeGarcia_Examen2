/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminAstro {
    private ArrayList<Astronauta> astronautas = new ArrayList();
    private File archivo = null;

    public adminAstro(String path) {
        archivo = new File(path);
    }

    public ArrayList<Astronauta> getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(ArrayList<Astronauta> astronautas) {
        this.astronautas = astronautas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setAstro(Astronauta a){
        this.astronautas.add(a);
    }
    
    public void cargarArchivo(){
        try {
            astronautas = new ArrayList();
            Astronauta temporal;
            if (archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temporal = (Astronauta) objeto.readObject())!= null){
                        astronautas.add(temporal);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void escribirArchivo() throws IOException{
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Astronauta a: astronautas){
                bw.writeObject(a);
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
}
