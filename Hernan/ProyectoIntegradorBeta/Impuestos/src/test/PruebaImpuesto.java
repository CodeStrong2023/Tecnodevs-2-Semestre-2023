package test;
import impuestos.*;
import java.util.Scanner;


public class PruebaImpuesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        
        String[] servicios_luz = {"1 - Edemsa","2 - Coop. Electrica Godoy Cruz"};
        String[] servicios_agua = {"1 - AYSAM"};
        String[] servicios_gas = {"1 - Ecogas","2 - Gas Cuyana"};
        String[] servicios_internet = {"1 - Claro", "2 - Fibertel", "3 - Movistar"};
        
        Impuestos Luz = new Impuestos(false, servicios_luz);
        double monto_luz = Luz.getMonto_a_pagar();
        
        Impuestos Agua = new Impuestos(false, servicios_agua);
        double monto_agua = Agua.getMonto_a_pagar();
        
        Impuestos Gas = new Impuestos(false, servicios_gas);
        double monto_gas = Gas.getMonto_a_pagar();
        
        Impuestos Internet = new Impuestos(false, servicios_internet);
        double monto_internet = Internet.getMonto_a_pagar();
        int opcion = 123; 
        
        
        while (opcion != 0){
            System.out.println("Ingrese el servicio que desea pagar");
            System.out.println(" 1 - Luz \n 2 - Agua \n 3 - Gas \n 4 - Internet \n 0 - Salir");
            opcion = Integer.parseInt(entrada.nextLine());
            
            switch (opcion){
                case 1: 
                    if (Impuestos.isPagado() == false){
                       System.out.println("\n"+Luz.menu_servicio(servicios_luz,monto_luz)+"\n"); break; 
                    }else{
                        System.out.println("\nEste servicio ya ha sido pagado\n"); break;
                    }
                    
                case 2: 
                    if (Impuestos.isPagado() == false){
                       System.out.println("\n"+Agua.menu_servicio(servicios_agua,monto_agua)+"\n"); break; 
                    }else{
                        System.out.println("\nEste servicio ya ha sido pagado\n"); break;
                    }
                    
                case 3: 
                    if (Impuestos.isPagado() == false){
                       System.out.println("\n"+Gas.menu_servicio(servicios_gas,monto_gas)+"\n"); break; 
                    }else{
                        System.out.println("\nEste servicio ya ha sido pagado\n"); break;
                    }
                    
                case 4:
                    if (Impuestos.isPagado() == false){
                       System.out.println("\n"+Internet.menu_servicio(servicios_internet,monto_internet)+"\n"); break;
                    }else{
                        System.out.println("\nEste servicio ya ha sido pagado\n"); break;
                    }
                    
                default: System.out.println("\nLa opción ingresada no es válida\n");
            }
        }
        
    }
}
