package transferencia;

import java.util.Scanner;


public class alias {
   public void alia() {
        
       Scanner sn = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("INGRESE EL ALIAS DEL DESTINATARIO");
        System.out.println("--------------------------------------------");
        String alia = sn.nextLine();
           
        System.out.println("--------------------------------------------");
        System.out.println("INGRESE EL MONTO A TRANSFERIR");
        System.out.println("--------------------------------------------");
           int dinero;
           System.out.print("$");
           dinero = sn.nextInt();
           
           System.out.println("");
                   System.out.println("--------------------------------------------");
        System.out.println("Se ha realizado una transferencia de $"+dinero+" al alias "+alia);
                System.out.println("--------------------------------------------");
    }
}