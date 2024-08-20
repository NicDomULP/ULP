
package tp2;

import java.time.LocalDateTime;

public class Reloj {

private LocalDateTime tiempo;
private String modelo;
private double numSerie;


public Reloj(LocalDateTime tiempo, String modelo, double numSerie) {
this.tiempo = tiempo;
this.modelo = modelo;
this.numSerie = numSerie;
}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

public LocalDateTime getTiempo() {
return tiempo;
}

public void actualizarTiempo() {
this.tiempo = LocalDateTime.now();
}

public void mostrarHora() {
System.out.println("Hora actual: " + tiempo.toLocalTime());
}

public void mostrarFecha() {
System.out.println("Fecha actual: " + tiempo.toLocalDate());
}

public void incrementarHora(int cantidad) {
        this.tiempo = this.tiempo.plusHours(cantidad);
    }
public void incrementarDia(int cantidad){
        this.tiempo = this.tiempo.plusDays(cantidad);
    }
}

