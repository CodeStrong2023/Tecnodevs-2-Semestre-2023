
package menus;

import clases.Clases;
import impuesto.*;
import java.util.Random;
import java.util.Scanner;
import test.PruebaImpuesto;
import monto_en_cuenta. *;
import pago_impuestos.*;
import matriz.*;

public class menus_generales_servicios {
    Random aleatorio = new Random();
    // Función de menú general
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n---------------------------------------------------------------\n");
        
        int opcion;
        do{
            System.out.println("Menú de servicios");
            System.out.println("1 - ver estado de deuda");
            System.out.println("2 - pagar un servicio");
            System.out.println("3 - agregar nuevo servicio");
            System.out.println("0 - salir");
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion){
                case 1:
                    matriz.MostrarDeuda.mostrar_deuda(); break;
                case 2:
                    menu_servicio();break;
            }
        }while (opcion != 0); 
        System.out.println("\n---------------------------------------------------------------\n");
    }
    
    // Función de menú de servicios
    public static void menu_servicio(){
        System.out.println("\n---------------------------------------------------------------\n");
        Scanner entrada = new Scanner(System.in);
        String[] prestadores_luz = {"Edemsa","Cooperativa Godoy Cruz"};
        String[] prestadores_agua = {"Aysam"};
        String[] prestadores_gas = {"Ecogas Cuyana", "Ecogas"};
        String[] prestadores_internet = {"Claro","Movistar","Fibertel"};
        
        int opcion;
        do{
           System.out.println("¿Que servicio desea pagar?");
           System.out.println("1 - Luz");
           System.out.println("2 - Agua");
           System.out.println("3 - Gas");
           System.out.println("4 - Internet");
           System.out.println("0 - Salir"); 
           opcion = Integer.parseInt(entrada.nextLine());
           int empresa = opcion;
           switch (opcion){
               case 1: menu_empresa_servicio(prestadores_luz, empresa); break;
               case 2: menu_empresa_servicio(prestadores_agua, empresa); break;
               case 3: menu_empresa_servicio(prestadores_gas, empresa); break;
               case 4: menu_empresa_servicio(prestadores_internet, empresa); break;
               default: 
               
           }
        }while (opcion != 0);
        System.out.println("\n---------------------------------------------------------------\n");
    }
    
    // función menú de empresas de servicios
    public static void menu_empresa_servicio(String[] servicios, int opcion2){
        System.out.println("\n---------------------------------------------------------------\n");
        Scanner entrada = new Scanner(System.in);
        int empresa = opcion2;
        System.out.println("Ingrese la prestadora de servicios: ");
            for (int i = 0; i<=servicios.length - 1; i++){
                System.out.println(i+1+" - "+servicios[i]);
            }
            int opcion3 = Integer.parseInt(entrada.nextLine());
            if (empresa == 1){
                pagar_impuestos.pago(monto_en_cuenta.getSaldo(),Clases.getLuz().getDeuda(), Clases.getLuz().isPagado(), 1);
            }else if (empresa == 2){
                pagar_impuestos.pago(monto_en_cuenta.getSaldo(),Clases.getAgua().getDeuda(), Clases.getAgua().isPagado(), 2);
            }else if (empresa == 3){
                pagar_impuestos.pago(monto_en_cuenta.getSaldo(),Clases.getGas().getDeuda(), Clases.getGas().isPagado(), 3);
            }else if (empresa == 4){
                pagar_impuestos.pago(monto_en_cuenta.getSaldo(),Clases.getInternet().getDeuda(), Clases.getInternet().isPagado(), 4);
            }
            
            
            
            
                
            }
        }
//    
//        double deuda_luz = aleatorio.nextDouble()*9999;
//        double deuda_agua = aleatorio.nextDouble()*9999;
//        double deuda_gas = aleatorio.nextDouble()*9999;
//        double deuda_internet = aleatorio.nextDouble()*9999;
//
//    Impuestos Luz = new Impuestos(deuda_luz, false);
//    Impuestos Gas = new Impuestos(deuda_gas, false);
//    Impuestos Agua = new Impuestos(deuda_agua, false);
//    Impuestos Internet = new Impuestos(deuda_internet, false);
    
//    monto_en_cuenta saldo = new monto_en_cuenta();
    
    

