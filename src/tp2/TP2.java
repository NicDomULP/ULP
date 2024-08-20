
package tp2;

import java.time.LocalDateTime;
public class TP2 {

   
    public static void main(String[] args) {
      Reloj r1 = new Reloj (LocalDateTime.now(),"Rolex", 22345);
      RelojFit r1f= new RelojFit (LocalDateTime.now(),"Casio", 9890, 0);
      Persona p1 = new Persona ("Pepe", "Flores", 20, 190, r1) ; 
      Persona p2 = new Persona ("Florencia", "Pepona", 30, 120, r1f) ;
      p2.mostrarInfo();
      r1f.cuentaPasos(1780, 2345);
      r1f.frecuenciaAleatoria();
      p1.mostrarInfo();
      r1f.cuentaPasos(10, 20);
      r1f.frecuenciaAleatoria();
     
    }
    
}
