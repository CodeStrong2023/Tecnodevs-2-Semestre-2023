package test;
import impuestos.*;
import java.util.Scanner;


public class PruebaImpuesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo_en_cuenta = 10000;
        
        
        String[] servicios_luz = {"Edemsa","Coop. Electrica Godoy Cruz"};
        String[] servicios_agua = {"AYSAM"};
        String[] servicios_gas = {"Ecogas","Gas Cuyana"};
        String[] servicios_internet = {"Claro", "Fibertel", "Movistar"};
        
        Impuestos Luz = new Impuestos(false, servicios_luz);
        Impuestos Agua = new Impuestos(false, servicios_agua);
        Impuestos Gas = new Impuestos(false, servicios_gas);
        Impuestos Internet = new Impuestos(false, servicios_internet);
        int opcion = 123; 
        
        
        while (opcion != 0){
            System.out.println("Ingrese el servicio que desea pagar");
            System.out.println("1 - Luz \n 2 - Agua \n 3 - Gas \n 4 - Internet \n 0 - Salir");
            opcion = Integer.parseInt(entrada.nextLine());
            
            
                Luz.menu_servicio(servicios_luz);
            
            
            
            
        }
        
    }
}
