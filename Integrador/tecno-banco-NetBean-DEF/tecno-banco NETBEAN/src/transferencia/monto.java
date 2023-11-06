package transferencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class monto {
    
    //public static void main(String[] args) {
    public static void OpcionesTransferencia(){
            
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        while(!salir){
        System.out.println("--------------------------------------------");
        System.out.println("OPCIONES DE TRANSFERENCIA");
        System.out.println("--------------------------------------------");
        
            System.out.println("");
            
        System.out.println("1. Nueva transferencia");
        System.out.println("2. Contactos agendados");
        System.out.println("3. Salir ");
        
         System.out.println("");
         try{
        System.out.println("--------------------------------------------");
            System.out.println("Eliga una opciÃ³n");
            
         opcion = sn.nextInt();
      
         switch(opcion){
             case 1 -> {System.out.println("Eligio realizar una nueva transferencia");
             System.out.println("--------------------------------------------");
             System.out.println("");
             Nuevat plata = new Nuevat();
             plata.metodo();}
             case 2 -> {System.out.println("Eligio realizar una transferencia a un contacto agendado");
             System.out.println("--------------------------------------------");
             System.out.println("");
              contactos monto = new contactos();
             monto.main();}
             case 3 -> salir=true;
             default -> {System.out.println("Solo opciÃ³n 1, 2 o 3");
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

