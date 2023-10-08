package test;
import impuestos.*;
import java.util.Scanner;


public class PruebaImpuesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo_en_cuenta = 10000;
        
        
        String[] servicios_luz = {"1 - Edemsa","2 - Coop. Electrica Godoy Cruz"};
        String[] servicios_agua = {"1 - AYSAM"};
        String[] servicios_gas = {"1 - Ecogas","2 - Gas Cuyana"};
        String[] servicios_internet = {"1 - Claro", "2 - Fibertel", "3 - Movistar"};
        
        Impuestos Luz = new Impuestos(false, servicios_luz);
        Impuestos Agua = new Impuestos(false, servicios_agua);
        Impuestos Gas = new Impuestos(false, servicios_gas);
        Impuestos Internet = new Impuestos(false, servicios_internet);
        int opcion = 123; 
        
        
        while (opcion != 0){
            System.out.println("Ingrese el servicio que desea pagar");
            System.out.println(" 1 - Luz \n 2 - Agua \n 3 - Gas \n 4 - Internet \n 0 - Salir");
            opcion = Integer.parseInt(entrada.nextLine());
            
            switch (opcion){
                case 1: System.out.println("\n"+Luz.menu_servicio(servicios_luz)+"\n"); break;
                case 2: System.out.println("\n"+Luz.menu_servicio(servicios_agua)+"\n"); break;
                case 3: System.out.println("\n"+Luz.menu_servicio(servicios_gas)+"\n"); break;
                case 4: System.out.println("\n"+Luz.menu_servicio(servicios_internet)+"\n"); break;
                default: System.out.println("\nLa opción ingresada no es válida\n");
            }
        }
        
    }
}
