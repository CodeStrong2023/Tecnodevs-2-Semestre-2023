
package pago_impuestos;
import java.util.Random;
import impuesto. *;
import java.util.Scanner;
import monto_en_cuenta. *;
import menus. *;
import clases.*;

public class pagar_impuestos {
    Random aleatorio = new Random(9999);
    
    
    public pagar_impuestos(){
    
    }
    
    
    public static void pago(double saldo, double deuda, boolean pagado, int opcion2){
        int empresa = opcion2;
        System.out.println("empresa = " + empresa);
        if (deuda == 0){//if (pagado == true){
            System.out.println("Usted no tiene deuda en el servicio seleccionado");
        }else{
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("El saldo en su cuenta es de " + monto_en_cuenta.getSaldo() + "\n");
            System.out.println("Usted tiene una deuda de $" + deuda);
            System.out.println("¿Desea pagar la deuda completa?");
            System.out.println("\n 1 - Sí \n 2 - No");
            int confirmacion = Integer.parseInt(entrada.nextLine());
            
            if (confirmacion == 1){
            System.out.println("Ha pagado satisfactoriamente el servicio");
            
            saldo = monto_en_cuenta.getSaldo();
            saldo -= deuda;
            deuda = 0;
            if (opcion2 == 1){
                Clases.Luz.setDeuda(0);
                //Clases.Luz.setPagado(true);
            }else if (opcion2 == 2){
                Clases.Agua.setDeuda(0);
                //Clases.Agua.setPagado(true);
            }else if (opcion2 == 3){
                Clases.Gas.setDeuda(0);
                //Clases.Gas.setPagado(true);
            }else if (opcion2 == 4){
                Clases.Internet.setDeuda(0);
                //Clases.Internet.setPagado(true);
            }
            monto_en_cuenta.setSaldo(saldo);
            
            System.out.println("Su monto en cuenta es de: $"+monto_en_cuenta.getSaldo()+"\n"); 
        
        //}else{
            
        } 
        }
        
        
    }
}