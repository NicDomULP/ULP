

package tp2;


public class Persona {
   private String nombre;
   private String apellido;
   private int edad;
   private float altura;
   private Reloj relojito;
   
 public Persona() {}
 public Persona (String nombre, String apellido, int edad, float altura, Reloj relojito){
   this.nombre=nombre;
   this.apellido= apellido;
   this.edad= edad;
   this.altura=altura; 
   this.relojito=relojito;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
 
    
   public void comer () {
            System.out.println("Estoy comiendo");
} 
 public void hablar (){
     System.out.println("Hola!");
 }
  
 public void decirHora (){
     relojito.mostrarHora();
 
 }
 
 public void mostrarInfo(){
     System.out.println("Nombre y Apellido: "+ nombre + " " + apellido);
     System.out.println("Yo uso: "+ relojito.getModelo());
     System.out.println("La hora es: "+ relojito.getTiempo());
     System.out.println("Mi edad es:  " + edad);
 }
 
}
