
package secciones;
import java.text.DecimalFormat;
import servicios.*;
import datos.Impuestos;
import impuestos.acciones.MostrarEstadoDeuda;

public class MenuImpuestos {
    public MenuImpuestos(){
        
    }
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
                    case 0: System.out.println("Su estado de cuenta es:"); 
                            matriz.MostrarMatriz(balance);
                            ; MenuImpuestos__Inicial(balance);  // Uso recursividad para volver al menú inicial
                    case 1: System.out.println("Ha elegido pagar un impuesto/servicio");
                    MenuImpuestos__Impuestos(balance); MenuImpuestos__Inicial(balance);  // Deriva en la función

                    case 2: ;  // Con esta opción se sale del programa completamente
                    default: break;
                }
    }
    public void MenuImpuestos__Impuestos(float balance){  // dejo el balance para cuando sea usado
        String[] impuestos = new String[]{  // String para ser usado en el menú de Federico
            "Luz",
            "Gas",
            "Agua",
            "Internet"
        };
        Menu menu = new Menu(impuestos);  // Creo el objeto de Menu para acceder a sus funciones
        int opcion = menu.Iniciar();  // Guardo en una variable el número del índice del String

        DecimalFormat dosDecimales = new DecimalFormat("0.00");  //Creo objeto para que solo se muestren dos decimales
        
    Confirmar confirmar = new Confirmar();  // Creo objeto para llamar a la confirmación de la acción
    Impuestos pagar = new Impuestos();  // Creo objeto para llamar la Función TraerDeuda que muestra el String[] de deuda de cada servicio
        switch(opcion){
            case 0: 
                System.out.println("Su empresa prestadora de luz es EDEMSA: ");
                System.out.println("Usted tiene deuda de $"+dosDecimales.format(pagar.TraerDeuda(opcion)));
                System.out.println("El saldo en su cuenta es de $"+balance);
                confirmar.ConfirmaContinuar();
                break;
                // Me falta crear Función de pago
            case 1: 
                System.out.println("Su empresa prestadora de gas es ECOGAS CUYANA");
                System.out.println("Usted tiene deuda de $"+dosDecimales.format(pagar.TraerDeuda(opcion)));
                System.out.println("El saldo en su cuenta es de $"+balance);
                confirmar.ConfirmaContinuar();
                break;
            case 2: 
                System.out.println("Su empresa prestadora de agua es AySAM"); 
                System.out.println("Usted tiene deuda de $"+dosDecimales.format(pagar.TraerDeuda(opcion)));
                System.out.println("El saldo en su cuenta es de $"+balance);
                confirmar.ConfirmaContinuar();
                break;
            case 3: 
                System.out.println("Su empresa prestadora de internet es CLARO");
                System.out.println("Usted tiene deuda de $"+dosDecimales.format(pagar.TraerDeuda(opcion)));
                System.out.println("El saldo en su cuenta es de $"+balance);
                confirmar.ConfirmaContinuar();
                break;
            default: break;
        }
    }
}
