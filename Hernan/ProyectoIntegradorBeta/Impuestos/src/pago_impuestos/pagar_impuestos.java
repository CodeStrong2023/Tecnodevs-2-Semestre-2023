
package pago_impuestos;
import java.util.Random;
import impuestos. *;
import java.util.Scanner;
import monto_en_cuenta. *;
import menus. *;
import clases.*;

public class pagar_impuestos {
    Random aleatorio = new Random(9999);
    
    
    public pagar_impuestos(){
    
    }
    
    
    public static void pago(double saldo, double deuda){
        Scanner entrada = new Scanner(System.in);
        System.out.println("El saldo en su cuenta es de " + monto_en_cuenta.getSaldo() + "\n");
        System.out.println("Usted tiene una deuda de $");
        System.out.println("¿Desea pagar la deuda completa?");
        System.out.println("\n 1 - Sí \n 2 - No");
        int opcion = Integer.parseInt(entrada.nextLine());
        if (opcion == 1){
           System.out.println("Ha pagado satisfactoriamente el servicio");
           saldo = monto_en_cuenta.getSaldo();
           saldo -= deuda;
           monto_en_cuenta.setSaldo(saldo);
        System.out.println("Su monto en cuenta es de: $"+monto_en_cuenta.getSaldo()+"\n"); 
        
        }else{
            
        }
        
    }
}