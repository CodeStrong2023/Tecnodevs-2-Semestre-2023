
package clases;

import impuesto.Impuesto;
import java.util.Random;
import monto_en_cuenta.monto_en_cuenta;
import pago_impuestos.pagar_impuestos;

public class Clases {
    public static Random aleatorio = new Random();
   

    public static Impuesto Luz = new Impuesto(aleatorio.nextDouble()*9999,false);
    
    public static Impuesto Gas = new Impuesto(aleatorio.nextDouble()*9999,false);
    
    public static Impuesto Agua = new Impuesto(aleatorio.nextDouble()*9999,false);
    
    public static Impuesto Internet = new Impuesto(aleatorio.nextDouble()*9999,false);

    public static Impuesto getGas() {
        return Gas;
    }

    public static void setGas(Impuesto Gas) {
        Clases.Gas = Gas;
    }

    public static Impuesto getAgua() {
        return Agua;
    }

    public static void setAgua(Impuesto Agua) {
        Clases.Agua = Agua;
    }

    

    
    
    

    monto_en_cuenta saldo = new monto_en_cuenta(50000);
    
    pagar_impuestos pagar = new pagar_impuestos();

    public pagar_impuestos getPagar() {
        return pagar;
    }

    public void setPagar(pagar_impuestos pagar) {
        this.pagar = pagar;
    }
    
    
}
