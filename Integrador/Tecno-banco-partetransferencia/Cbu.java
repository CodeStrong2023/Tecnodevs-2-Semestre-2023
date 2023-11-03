
package transferencia;
import java.util.Scanner;

public class Cbu {
    public void transf() {
        
       Scanner sn = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("INGRESE EL CBU DEL DESTINATARIO");
        System.out.println("--------------------------------------------");
           int cbu;
        cbu = sn.nextInt();
           
        System.out.println("--------------------------------------------");
        System.out.println("INGRESE EL MONTO A TRANSFERIR");
        System.out.println("--------------------------------------------");
           int dinero;
           System.out.print("$");
           dinero = sn.nextInt();
           
           System.out.println("");
                   System.out.println("--------------------------------------------");
        System.out.println("Se ha realizado una transferencia de $"+dinero+" al CBU nº"+cbu);
                System.out.println("--------------------------------------------");
    }
}