
package pago_impuestos;
import impuesto. *;
import java.util.Scanner;
import monto_en_cuenta. *;
import menus. *;
import clases.*;
import java.text.DecimalFormat;
/*
Clase destinada ha hacer los cálculos, modificar variables y atributos según las
acciones que se deseen realizar.
*/
public class pagar_impuestos {


    public static void pago(double saldo, double deuda, boolean pagado, int opcion2){
        /* Traigo todos los atributos y variables que necesito para realizar las operaciones.
        Los valores son traidos desde menus_generales_servicios, Clases y monto_en_cuenta.
        */
        System.out.println("\n---------------------------------------------------------------\n");
        DecimalFormat decimalFormat = new DecimalFormat("0.00");  /* Este objeto evita que los
        números double tengan tantos decimales. Importante es que se encuentre en este lugar
        porque fuera de un contexto estático no puede llamarse.
        */
        int empresa = opcion2;
        System.out.println("empresa = " + empresa);
        if (deuda == 0){  // Evita que el servicio sea pagado dos veces
            System.out.println("Usted no tiene deuda en el servicio seleccionado");
            System.out.println("\n---------------------------------------------------------------\n");
        }else if (saldo < deuda){  /* En caso de que no
            se posea saldo suficiente para pagar
            */
            System.out.println("Monto insuficiente para realizar la operación");  
            System.out.println("\n---------------------------------------------------------------\n");
        }
        else{
            Scanner entrada = new Scanner(System.in);
            /* Me resulta mejor crear el objeto entrada antes de ser usada, para evitar errores de contexto estático.
            Hago uso del objeto "format" para pasar el monto a String y hacer que se muestren sólo dos decimales
            */
            System.out.println("El saldo en su cuenta es de " + decimalFormat.format(monto_en_cuenta.getSaldo()) + "\n");
            System.out.println("Usted tiene una deuda de $" + decimalFormat.format(deuda));
            System.out.println("¿Desea pagar la deuda completa?");
            System.out.println("\n 1 - Sí \n 2 - No");  /* Decidí que, a diferencia del Integrador
            realizado en pseInt, no tenía sentido un pago parcial asique solamente dejé la posibilidad de
            realizar un pago completo.
            */
            int confirmacion = Integer.parseInt(entrada.nextLine());
            
                if (confirmacion == 1){
                System.out.println("Ha pagado satisfactoriamente el servicio");
                System.out.println("\n---------------------------------------------------------------\n");
                saldo = monto_en_cuenta.getSaldo();  /* Le doy el valor de monto_en_cuenta.getSaldo() a saldo
                porque, al ser un atributo privado, sólo sé modificarlo mediente setSaldo.
                */
                saldo -= deuda;  // Realizo la operación de restar la deuda del saldo
                deuda = 0;  // Una vez restado, me aseguro que la deuda quede en cero
                if (opcion2 == 1){ // Según la opción de servicio, cambio el valor del atributo del objeto con set
                    // NetBeans me recomienda usar switch en este apartado. Yo opino que funciona bien como está.
                    Clases.Luz.setDeuda(0);
                    //Clases.Luz.setPagado(true);  /* En un primer momento pensé en hacer esto con un booleano
                    // pero me dí cuenta debbugeando que no era necesario*/
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
                monto_en_cuenta.setSaldo(saldo);  // Inserto el saldo con deuda restada en el atributo global de monto_en_cuenta

                System.out.println("Su monto en cuenta es de: $"+decimalFormat.format(monto_en_cuenta.getSaldo())+"\n"); 
                // Imprimo el nuevo monto del atributo saldo
            }
        }
        
        
    }
}