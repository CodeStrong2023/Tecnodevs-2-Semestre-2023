package transferencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class contactos {
    
    public void main() {
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        while(!salir){
        System.out.println("--------------------------------------------");
        System.out.println("CONTACTOS AGENDADOS");
        System.out.println("--------------------------------------------");
        
            System.out.println("");
            
        System.out.println("1. Gomez Ezequiel");
        System.out.println("2. Peña Matias");
        System.out.println("3. Pedraza Federico");
        System.out.println("4. Vega Hernan");
        System.out.println("5. Grossi Emiliano");
        System.out.println("6. Paidican Nicol");
         System.out.println("7. Salir");
         
            System.out.println("");
            
         try{
        System.out.println("--------------------------------------------");
            System.out.println("Eliga un contacto");
            
         opcion = sn.nextInt();
      
         switch(opcion){
             case 1 -> {System.out.println("Eligio realizar una transferencia a Gomez Ezequiel");
             System.out.println("--------------------------------------------");
             System.out.println("");
             dinero monto = new dinero();
             monto.agendado();}
             case 2 -> {System.out.println("Eligio realizar una transferencia a Peña Matias");
             System.out.println("--------------------------------------------");
             System.out.println("");
              dinero monto = new dinero();
             monto.agendado();}
              case 3 -> {System.out.println("Eligio realizar una transferencia a Pedraza Federico");
             System.out.println("--------------------------------------------");
             System.out.println("");
               dinero monto = new dinero();
             monto.agendado();}
               case 4 -> {System.out.println("Eligio realizar una transferencia a Vega Hernan");
             System.out.println("--------------------------------------------");
             System.out.println("");
                dinero monto = new dinero();
             monto.agendado();}
                case 5 -> {System.out.println("Eligio realizar una transferencia a Grossi Emiliano");
             System.out.println("--------------------------------------------");
             System.out.println("");
                 dinero monto = new dinero();
             monto.agendado();}
                 case 6 -> {System.out.println("Eligio realizar una transferencia a Paidican Nicol ");
             System.out.println("--------------------------------------------");
             System.out.println("");
                  dinero monto = new dinero();
             monto.agendado();}
             case 7 -> salir=true;
             default -> {System.out.println("Solo numeros del 1 al 7");
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
