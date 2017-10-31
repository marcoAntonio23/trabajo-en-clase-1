package ec.edu.ister.modelo;
import java.math.BigDecimal;
public class Cuenta {
    private  String id;
    private Double saldo;

    public void depositar(double monto) {
        saldo =monto + saldo;
    }
    
    public Cuenta(String id) {
        this.id=id;
    }
    
    public Double getSaldo() {
        return saldo;
    }
}