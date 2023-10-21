
package secciones;
import java.text.DecimalFormat;
import servicios.*;
import datos.Impuestos;
import impuestos.acciones.MostrarEstadoDeuda;
import impuestos.acciones.PagarDeuda;
import servicios.Confirmar;

public class MenuImpuestos {
    
    public void MenuImpuestos__Inicial(float balance){
        String[] seleccion = new String[]{  // Array de opciones
            "Ver estado de deuda",
            "Pagar un servicio/impuesto",
            "Volver"
        };
        Menu menu = new Menu(seleccion);  // Creo un objeto del elemento menú para poder llamar la función que da formato
            int opcion = menu.Iniciar();  // A la vez de ejecutarlo, se guarda el índice del array como entero para ser usado en un switch
            MostrarEstadoDeuda matriz = new MostrarEstadoDeuda();  // Creo el objeto de la clase MostraEstadoDeuda para llamar la función MostrarMatriz
                switch(opcion){  // Según el índice del String[]
                    case 0: {System.out.println("Su estado de cuenta es:"); 
                            matriz.MostrarMatriz(balance);
                            MenuImpuestos__Inicial(balance); break;}  // Uso recursividad para volver al menú inicial
                    case 1: {System.out.println("Ha elegido pagar un impuesto/servicio");
                            MenuImpuestos__Impuestos(balance); break;}

                    case 2:  ; break;  // Con esta opción se sale del programa completamente
                }
    }
    
    
    public void MenuImpuestos__Impuestos(float balance){  // dejo el balance para cuando sea usado
        
        String[] impuestos = new String[]{  // String para ser usado en el menú de Federico
            "Luz",
            "Gas",
            "Agua",
            "Internet",
            "Volver"
        };
        
        Menu menu = new Menu(impuestos);  // Creo el objeto de Menu para acceder a sus funciones
        int opcion = menu.Iniciar();  // Guardo en una variable el número del índice del String
        
        switch(opcion){
            case 0: 
                PagoImpuestoParticular(opcion, balance);  // Funcion para pagar
                break;
            case 1: 
                PagoImpuestoParticular(opcion, balance);
                break;
            case 2: 
                PagoImpuestoParticular(opcion, balance);
                break;
            case 3: 
                PagoImpuestoParticular(opcion, balance);
                break;
            case 4: MenuImpuestos__Inicial(balance);
                    break;
            default: break;
        }
    }
    public void PagoImpuestoParticular(int opcion, float balance){
                DecimalFormat dosDecimales = new DecimalFormat("0.00");  //Creo objeto para que solo se muestren dos decimales
                String[] prestadores = new String[]{  // String para ser usado en el menú de Federico
                "Edemsa",
                "Ecogas",
                "Aysam",
                "Claro",
            };
            System.out.println("Su empresa prestadora de gas es "+prestadores[opcion]);
                    System.out.println("Usted tiene deuda de $"+dosDecimales.format(Impuestos.TraerDeuda(opcion)));
                    System.out.println("El saldo en su cuenta es de $"+dosDecimales.format(balance));
                    boolean confirma = Confirmar.ConfirmaContinuar();
                    if (confirma == true){
                        PagarDeuda.Pago(opcion, balance);  // Función de pago
                        Impuestos.CancelarDeuda(opcion);  // Función complementaria que pone la deuda en cero directo (Para evitar errores)   
                    } else {
                        MenuImpuestos__Inicial(balance);  // Vuelve al menú de impuestos
                    }
                    
            }
}
