
import interfaces.*;

public class Persona implements Volar, Comer, Criticar{
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void volar(){
        System.out.println(nombre + " volando...");
    }

    @Override
    public void criticar(){
        System.out.println(nombre + " criticando...");
    }

    @Override
    public void comer(){
        System.out.println(nombre + " comiendo...");
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

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

}
