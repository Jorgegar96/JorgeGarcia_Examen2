
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class EFrame extends JFrame{
    private JProgressBar pb_ida;
    private JProgressBar pb_vuelta;
    private JLabel jl_nave;
    private JLabel jl_destino;
    private JLabel jl_tiempo;
    private JLabel generico1;
    private JLabel generico2;
    private JLabel generico3;

    public EFrame() {
        jl_nave = new javax.swing.JLabel();
        pb_ida = new javax.swing.JProgressBar();
        pb_vuelta = new javax.swing.JProgressBar();
        generico2 = new javax.swing.JLabel();
        generico3 = new javax.swing.JLabel();
        jl_destino = new javax.swing.JLabel();
        generico1 = new javax.swing.JLabel();
        jl_tiempo = new javax.swing.JLabel();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_nave.setText("Nave");

        generico2.setText("Proceso Ida");

        generico3.setText("Proceso Vuelta");

        jl_destino.setText("Destino");

        generico1.setText("Tiempo Transcurrido");

        jl_tiempo.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(generico2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(generico3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pb_ida, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(pb_vuelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jl_nave)
                .addGap(50, 50, 50)
                .addComponent(jl_destino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(generico1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_tiempo)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nave)
                            .addComponent(jl_destino)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generico1)
                            .addComponent(jl_tiempo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generico2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pb_ida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generico3)
                .addGap(3, 3, 3)
                .addComponent(pb_vuelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }

    public JProgressBar getPb_ida() {
        return pb_ida;
    }

    public void setPb_ida(JProgressBar pb_ida) {
        this.pb_ida = pb_ida;
    }

    public JProgressBar getPb_vuelta() {
        return pb_vuelta;
    }

    public void setPb_vuelta(JProgressBar pb_vuelta) {
        this.pb_vuelta = pb_vuelta;
    }

    public JLabel getJl_nave() {
        return jl_nave;
    }

    public void setJl_nave(JLabel jl_nave) {
        this.jl_nave = jl_nave;
    }

    public JLabel getJl_destino() {
        return jl_destino;
    }

    public void setJl_destino(JLabel jl_destino) {
        this.jl_destino = jl_destino;
    }

    public JLabel getJl_tiempo() {
        return jl_tiempo;
    }

    public void setJl_tiempo(JLabel jl_tiempo) {
        this.jl_tiempo = jl_tiempo;
    }

    public JLabel getGenerico1() {
        return generico1;
    }

    public void setGenerico1(JLabel generico1) {
        this.generico1 = generico1;
    }

    public JLabel getGenerico2() {
        return generico2;
    }

    public void setGenerico2(JLabel generico2) {
        this.generico2 = generico2;
    }

    public JLabel getGenerico3() {
        return generico3;
    }

    public void setGenerico3(JLabel generico3) {
        this.generico3 = generico3;
    }
    
    
    
    
}
