
package transferencia;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Nuevat {
    public void metodo(){
        
         Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        while(!salir){
        System.out.println("--------------------------------------------");
        System.out.println("OPCIONES DE TRANSFERENCIA");
        System.out.println("--------------------------------------------");
        
            System.out.println("");
            
        System.out.println("1. CBU");
        System.out.println("2. Alias");
        System.out.println("3. Salir ");
        
         System.out.println("");
         try{
        System.out.println("--------------------------------------------");
            System.out.println("Eliga una opción");
            
         opcion = sn.nextInt();
         String opcin = sn.nextLine();
      
         switch(opcion){
             case 1 -> {System.out.println("Eligio realizar transferencia por CBU");
             System.out.println("--------------------------------------------");
             System.out.println("");
              Cbu plata = new Cbu();
             plata.transf();}
             case 2 -> {System.out.println("Eligio realizar transferencia por Alias");
             System.out.println("--------------------------------------------");
             System.out.println("");
             alias monto = new alias();
             monto.alia();}
             case 3 -> salir=true;
             default -> {System.out.println("Solo opción 1, 2 o 3");
             System.out.println("--------------------------------------------");
             System.out.println("");}
         }
    }catch (InputMismatchException e){
             System.out.println("OPCION INCORRECTA");
             System.out.println("--------------------------------------------");
             sn.next();
    }
    }
    }
}
