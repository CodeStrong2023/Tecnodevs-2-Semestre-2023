
package menus;

import clases.Clases;
import impuesto.*;
import java.util.Random;
import java.util.Scanner;
import test.PruebaImpuesto;
import monto_en_cuenta. *;
import pago_impuestos.*;
import matriz.*;
/*
En este paquete/clase puse todos los menús previos al pago. Los separé porque
se hacía un amontonamiento incómodo de código, tanto para entenderlo como
para modificarlo.
*/
public class menus_generales_servicios {
    Random aleatorio = new Random();  // Esto es para el monto de los impuestos
    // Función de menú general
    public static void menu(){  /* Los menus derivan en diferentes funciones,
        métodos y clases para cumplir los objetivos. Me pareció mejor que
        ponerlos todos en el mismo lugar. */
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n---------------------------------------------------------------\n");
        
        int opcion;
        do{
            System.out.println("Menú de servicios");
            System.out.println("1 - ver estado de deuda");  
            System.out.println("2 - pagar un servicio");
            System.out.println("0 - salir");
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion){
                case 1:
                    matriz.MostrarDeuda.mostrar_deuda(); break;  // Muestra una matriz con los valores de los impuestos
                case 2:
                    menu_servicio();break;  // Inicia las funciones para pagar impuestos
            }
        }while (opcion != 0); 
        System.out.println("\n---------------------------------------------------------------\n");
    }
    
    // Función de menú de servicios
    public static void menu_servicio(){
        
        System.out.println("\n---------------------------------------------------------------\n");
        Scanner entrada = new Scanner(System.in);  /* Los prestadores de servicios están hechos
        con arreglos para que su utilización sea más sencilla y corta que escribirlos por
        separado
        */
        String[] prestadores_luz = {"Edemsa","Cooperativa Godoy Cruz"};
        String[] prestadores_agua = {"Aysam"};
        String[] prestadores_gas = {"Ecogas Cuyana", "Ecogas"};
        String[] prestadores_internet = {"Claro","Movistar","Fibertel"};
        
        int opcion;
        do{  // Uso do while para pasar al menos una vez siempre por este menú
           System.out.println("¿Que servicio desea pagar?");
           System.out.println("1 - Luz");
           System.out.println("2 - Agua");
           System.out.println("3 - Gas");
           System.out.println("4 - Internet");
           
           System.out.println("0 - Volver"); 
           opcion = Integer.parseInt(entrada.nextLine());
           int empresa = opcion;
           switch (opcion){  /* En vez de crear una función para cada menú, hice una sola
               función y lo que cambio es el envío de los arreglos creados arriba
               */
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
        /* Este menu recibe el arreglo elegido y mantiene la opción elegida para ser usada más adelante.
        Teniendo en cuenta que "opción" es una variable local, pensé que la forma de pasarlo entre 2 o
        más funciones es irla pasando a otra variable entre funciones pasandola a la proxima.
        */
        System.out.println("\n---------------------------------------------------------------\n");
        Scanner entrada = new Scanner(System.in);
        int empresa = opcion2;  
        System.out.println("Ingrese la prestadora de servicios: ");
            for (int i = 0; i<=servicios.length - 1; i++){  // Ciclo para imprimir el arreglo
                System.out.println(i+1+" - "+servicios[i]);
            }
            int opcion3 = Integer.parseInt(entrada.nextLine());
            if (empresa == 1){  // Opción2 elegida en el segundo menu, rebautizada como "empresa", es el que deriva en pagar impuestos
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
    
    

