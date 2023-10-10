package test;
import java.util.Random;
import java.util.Scanner;
import impuestos. *;
import menus.menus_generales_servicios;
import monto_en_cuenta. *;

public class PruebaImpuesto {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        
        // Objetos
        
           
        menus_generales_servicios.menu();
    }
//    // Función de menú general
//    static void menu(){
//        Scanner entrada = new Scanner(System.in);
//        int opcion = 10;
//        do{
//            System.out.println("Menú de servicios");
//            System.out.println("1 - ver estado de deuda");
//            System.out.println("2 - pagar un servicio");
//            System.out.println("3 - agregar nuevo servicio");
//            System.out.println("0 - salir");
//            opcion = Integer.parseInt(entrada.nextLine());
//            switch (opcion){
//                case 1:
//                    
//                case 2:
//                    menu_servicio();break;
//            }
//        }while (opcion != 0); 
//    }
//    
//    // Función de menú de servicios
//    static void menu_servicio(){
//        Scanner entrada = new Scanner(System.in);
//        String[] prestadores_luz = {"Edemsa","Cooperativa Godoy Cruz"};
//        String[] prestadores_agua = {"Aysam"};
//        String[] prestadores_gas = {"Ecogas Cuyana", "Ecogas"};
//        String[] prestadores_internet = {"Claro","Movistar","Fibertel"};
//        
//        int opcion2 = 11;
//        do{
//           System.out.println("¿Que servicio desea pagar?");
//           System.out.println("1 - Luz");
//           System.out.println("2 - Agua");
//           System.out.println("3 - Gas");
//           System.out.println("4 - Internet");
//           System.out.println("0 - Salir"); 
//           opcion2 = Integer.parseInt(entrada.nextLine());
//           switch (opcion2){
//               case 1: menu_empresa_servicio(prestadores_luz); break;
//               case 2: menu_empresa_servicio(prestadores_agua); break;
//               case 3: menu_empresa_servicio(prestadores_gas); break;
//               case 4: menu_empresa_servicio(prestadores_internet); break;
//               default: 
//               
//           }
//        }while (opcion2 != 0);
//        
//    }
//    
//    // función menú de empresas de servicios
//    static void menu_empresa_servicio(String[] servicios){
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese la prestadora de servicios: ");
//            for (int i = 0; i<=servicios.length - 1; i++){
//                System.out.println(servicios[i]);
//            }
//            int opcion3 = Integer.parseInt(entrada.nextLine());
//            pagar_impuesto();
//        }
//    
//    static void pagar_impuesto(){
//        
//    }
}
