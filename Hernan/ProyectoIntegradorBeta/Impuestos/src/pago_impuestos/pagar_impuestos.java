
package pago_impuestos;
import java.util.Random;
import impuestos. *;

public class pagar_impuestos {
    Random aleatorio = new Random(9999);
    
    Impuestos Luz = new Impuestos(aleatorio.nextDouble()*9999, false);
    Impuestos Gas = new Impuestos(aleatorio.nextDouble()*9999, false);
    Impuestos Agua = new Impuestos(aleatorio.nextDouble()*9999, false);
    Impuestos Internet = new Impuestos(aleatorio.nextDouble()*9999, false);
        
    public void pago(double monto_en_cuenta, double deuda){
        monto_en_cuenta -= deuda;
        System.out.println("Ha pagado satisfactoriamente el servicio");
        System.out.println("Su monto en cuenta es de: $"+monto_en_cuenta);
    }
}
