
package pago_impuestos;
import java.util.Random;
import impuestos. *;
import java.util.Scanner;
import monto_en_cuenta. *;
import menus. *;

public class pagar_impuestos {
    Random aleatorio = new Random(9999);
    Scanner entrada = new Scanner(System.in);
    
    double deuda_luz = aleatorio.nextDouble()*9999;
    double deuda_agua = aleatorio.nextDouble()*9999;
    double deuda_gas = aleatorio.nextDouble()*9999;
    double deuda_internet = aleatorio.nextDouble()*9999;

    Impuestos Luz = new Impuestos(deuda_luz, false);
    Impuestos Gas = new Impuestos(deuda_gas, false);
    Impuestos Agua = new Impuestos(deuda_agua, false);
    Impuestos Internet = new Impuestos(deuda_internet, false);
    
    monto_en_cuenta saldo = new monto_en_cuenta();
    

        
    public static void pago(double monto_en_cuenta){
        //System.out.println("El saldo en su cuenta es de "+monto_en_cuenta.saldo()"\n");
        System.out.println("Usted tiene una deuda de $");
        System.out.println("¿Desea pagar la deuda completa?");
        System.out.println("\n 1 - Sí \n 2 - No");
        //int opcion = Integer.parseInt(entrada.nextLine());
        //if (opcion == 1){
           System.out.println("Ha pagado satisfactoriamente el servicio");
           //monto_en_cuenta -= deuda;
        //System.out.println("Su monto en cuenta es de: $"+monto_en_cuenta"\n"); 
        //}
        
    }
}