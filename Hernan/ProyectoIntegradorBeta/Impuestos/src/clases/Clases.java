
package clases;

import impuesto.Impuesto;
import java.util.Random;
import monto_en_cuenta.monto_en_cuenta;
import pago_impuestos.pagar_impuestos;

public class Clases {
    public static Random aleatorio1 = new Random();  /* Compartiendo el mismo 
objeto, por alguna razón todos comparten el mismo valor, y se modifican todos
al modificar uno solo, por lo que creé un objeto para cada uno*/
    public static Random aleatorio2 = new Random();
    public static Random aleatorio3 = new Random();
    public static Random aleatorio4 = new Random();
   

    public static Impuesto Luz = new Impuesto(aleatorio1.nextDouble()*10999,false);
    
    public static Impuesto Gas = new Impuesto(aleatorio2.nextDouble()*7999,false);
    
    public static Impuesto Agua = new Impuesto(aleatorio3.nextDouble()*3999,false);
    
    public static Impuesto Internet = new Impuesto(aleatorio4.nextDouble()*7999,false);

    public static Impuesto getLuz() {
        return Luz;
    }

    public static void setLuz(Impuesto aLuz) {
        Luz = aLuz;
    }

    public static Impuesto getInternet() {
        return Internet;
    }

    public static void setInternet(Impuesto aInternet) {
        Internet = aInternet;
    }
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
    
    
    
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
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
