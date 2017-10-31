package ec.edu.ister.vista;
import ec.edu.ister.modelo.*;
import javax.swing.JOptionPane;
public class Aplicacion {
    public static void main(String[] args) {
         Persona persona = new Persona(); 
         persona.cantidad=10;
         persona.setPersona("Wilmer");
         persona.setprimerApellido("Belenzaca");
         System.out.println(persona.cantidad);
         System.out.println(persona.getPersona()+" "+persona.getprimerApellido());
         String id1=JOptionPane.showInputDialog(null,"ingrese id");
         Cuenta cuenta1= new Cuenta("abc");
         //String id2=JOptionPane.showInputDialog(null,"ingrese id");
         Cuenta cuenta2= new Cuenta("abc001");
         String depositar=JOptionPane.showInputDialog(null,"ingrese cantidad");
         Cuenta cuenta3= new Cuenta("abc002");
         JOptionPane.showMessageDialog(null,"Saldo Actual de Cuenta:\nID: "+id1+"\nValor de Deposito: $"+depositar);    
    }   
}