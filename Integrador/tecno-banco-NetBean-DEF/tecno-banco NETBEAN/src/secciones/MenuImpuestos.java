
package secciones;
import java.text.DecimalFormat;
import servicios.*;
import datos.Impuestos;
import impuestos.acciones.MostrarEstadoDeuda;
import impuestos.acciones.PagarDeuda;
import servicios.Confirmar;

public class MenuImpuestos {

    public MenuImpuestos() {
        this.Iniciar();
    }
    
    public void Iniciar() {
        String[] seleccion = new String[]{  // Array de opciones
            "Ver estado de deuda",
            "Pagar un servicio/impuesto",
            "Volver"
        };

        Menu menu = new Menu(seleccion, "Servicios");  // Creo un objeto del elemento menú para poder llamar la función que da formato

        int opcion = menu.Iniciar();  // A la vez de ejecutarlo, se guarda el índice del array como entero para ser usado en un switch

        MostrarEstadoDeuda matriz = new MostrarEstadoDeuda();  // Creo el objeto de la clase MostraEstadoDeuda para llamar la función MostrarMatriz

        switch(opcion) {
                case 0:
                    matriz.MostrarMatriz();
                    Iniciar();
                    break;
                case 1:
                    MenuImpuestos__Impuestos();
                    break;
                default:
        }

        MenuPrincipal.instancia.Iniciar();
    }
    
    
    public void MenuImpuestos__Impuestos(){  // dejo el balance para cuando sea usado
        
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
                PagoImpuestoParticular(opcion);  // Funcion para pagar
                break;
            case 1: 
                PagoImpuestoParticular(opcion);
                break;
            case 2: 
                PagoImpuestoParticular(opcion);
                break;
            case 3: 
                PagoImpuestoParticular(opcion);
                break;
            default:
                Iniciar();
        }
    }
    public void PagoImpuestoParticular(int opcion) {
        DecimalFormat dosDecimales = new DecimalFormat("0.00");  //Creo objeto para que solo se muestren dos decimales
        String[] prestadores = new String[]{  // String para ser usado en el menú de Federico
        "Edemsa",
        "Ecogas",
        "Aysam",
        "Claro",
        };

        System.out.println("Su empresa prestadora de servicio es "+prestadores[opcion]);
        System.out.println("Usted tiene deuda de $"+dosDecimales.format(Impuestos.TraerDeuda(opcion)));
        System.out.println("El saldo en su cuenta es de $"+dosDecimales.format(Sistema.getCuenta().getBalance()));

        boolean confirma = Confirmar.ConfirmaContinuar();
        if (confirma){
            PagarDeuda.Pago(opcion);  // Función de pago
            Impuestos.CancelarDeuda(opcion);  // Función complementaria que pone la deuda en cero directo (Para evitar errores)
        } else {
            Iniciar();  // Vuelve al menú de impuestos
        }
    }
}
