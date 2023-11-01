package transferencia;

import java.util.Scanner;

public class dinero {
    public void agendado() {
        
    Scanner sn = new Scanner(System.in);
    
     System.out.println("--------------------------------------------");
        System.out.println("INGRESE EL MONTO A TRANSFERIR");
        System.out.println("--------------------------------------------");
           int dinero;
           System.out.print("$");
           dinero = sn.nextInt();
           
           System.out.println("");
                   System.out.println("--------------------------------------------");
        System.out.println("Se ha realizado una transferencia de $"+dinero+" al contato agendado");
                System.out.println("--------------------------------------------");
    
}
}