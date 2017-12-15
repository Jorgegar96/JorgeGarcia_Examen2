
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class adminPlanetas {
    
    private ArrayList<Planeta> planetas = new ArrayList();
    private File archivo = null;

    public adminPlanetas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Astronauta> astronautas) {
        this.planetas = planetas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    public void setPlaneta(Planeta p){
        this.planetas.add(p);
    }
    
    public void cargarArchivo(){
        try {
            planetas = new ArrayList();
            Planeta temporal;
            if (archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temporal = (Planeta) objeto.readObject())!= null){
                        planetas.add(temporal);
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
            for (Planeta p : planetas){
                bw.writeObject(p);
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
}
