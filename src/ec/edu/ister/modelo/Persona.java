package ec.edu.ister.modelo;
public class Persona {
    private String nombre;
    private String primerApellido;
    private Integer edad;
    public double cantidad;

    public Persona() {
        System.out.println("Hola");
    }

    public void  setPersona(String nom) {
        nombre = nom; 
    }

    public String getPersona() {
        return  nombre;    
    } 
    public void  setprimerApellido(String apellido) {
        primerApellido = apellido; 
    }

    public String getprimerApellido() {
        return  primerApellido;    
    } 
    
    public double obtenerCantidad(){
        return cantidad;    
    }    
}