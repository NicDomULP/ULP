
package tp2;

import java.time.LocalDateTime;
import java.util.Random;


public class RelojFit extends Reloj {
    private int pasos;

    public RelojFit(LocalDateTime tiempo, String modelo, double numSerie,int pasos) {
        super (tiempo, modelo, numSerie);
        this.pasos = 0;
    }

    public void cuentaPasos(int x, int y) {
        this.pasos += Math.abs(x) + Math.abs(y);
        System.out.println("Pasos actuales: " + pasos);
    }

    public int frecuenciaAleatoria() {
        Random random = new Random();
        int frecuencia = random.nextInt(120);  
        System.out.println("Frecuencia cardíaca aleatoria: " + frecuencia + " bpm");
        return frecuencia;
    }
}
