
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JorgeLuis
 */
public class Expedicion extends Thread {

    private boolean running;
    private Nave nave;
    private Planeta destino;
    private EFrame frame;

    public Expedicion(Nave nave, Planeta destino) {
        this.nave = nave;
        this.destino = destino;
        frame = new EFrame();
        frame.getPb_ida().setMaximum((int)Math.ceil(nave.calcularTiempo()[0]));
        frame.getJl_nave().setText(nave+"");
        frame.getJl_destino().setText(destino+"");
        frame.getPb_vuelta().setMaximum((int)Math.ceil(nave.calcularTiempo()[1]));
    }

    @Override
    public void run() {
        boolean planeta = false;
        frame.setVisible(true);
        while (true) {
            while (running) {
                //try {
                if (Long.parseLong(frame.getJl_tiempo().getText()) < nave.calcularTiempo()[0] + nave.calcularTiempo()[1]) {
                    if (frame.getPb_ida().getValue() < frame.getPb_ida().getMaximum()) {
                        frame.getPb_ida().setValue(frame.getPb_ida().getValue() + 1);
                    } else {
                        if (planeta = false) {
                            JOptionPane.showMessageDialog(null, "La nave ha llegado a su destino");
                            planeta = true;
                        }
                    }
                    if (frame.getPb_vuelta().getValue() < nave.calcularTiempo()[1] && frame.getPb_ida().getMaximum() == frame.getPb_ida().getValue()) {
                        frame.getPb_vuelta().setValue(frame.getPb_vuelta().getValue() + 1);
                    }
                    frame.getJl_tiempo().setText(Long.parseLong(frame.getJl_tiempo().getText()) + 1 + "");
                } else {
                    JOptionPane.showMessageDialog(null, "La nave ha regresado a la Tierra");
                    running = false;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Expedicion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            /*Thread.sleep((Math.round(nave.calcularTiempo()[0] * 1000)));
                    JOptionPane.showMessageDialog(null, "La nave ha llegado a su destino, se iniciara el regreso.");
                    Thread.sleep((Math.round(nave.calcularTiempo()[1] * 1000)));
                    JOptionPane.showMessageDialog(null, "La nave ha regresado a la Tierra");
                    running = false;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Expedicion.class.getName()).log(Level.SEVERE, null, ex);
                }*/
        //}
    }
}

public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public Planeta getDestino() {
        return destino;
    }

    public void setDestino(Planeta destino) {
        this.destino = destino;
    }

    public EFrame getFrame() {
        return frame;
    }

    public void setFrame(EFrame frame) {
        this.frame = frame;
    }

}
