import java.util.Scanner;

public class Administrar_Tarjeta{  // subproceso administrarTarjeta(balance, limiteActual)
    public static void main(String[] args) {
        Scanner tarjeta = new Scanner(System.in);
        int opcion,balance = 20000,limiteActual = 0;
        System.out.println("Administrar Tarjeta de Crédito");
        System.out.println("");
        System.out.println("¿Qué tarjeta desea administrar?");
        System.out.println(" 1 - Visa");
        System.out.println(" 2 - Mastercard");
        System.out.println(" 3 - American Express");
        System.out.println(" 0 - Regresar al menú principal");
        System.out.println("");
        System.out.println("Digite la opción: ");
        opcion = Integer.parseInt(tarjeta.nextLine());
        switch(opcion){
            case 0:
                System.out.println("mostrar Menu Principal");// subproceso  mostrarMenuPrincipal(balance, limiteActual);
                break;
            case 1:
                System.out.println("administrar Tarjeta Especifica");// subproceso administrarTarjetaEspecifica(balance, "Visa", limiteActual);
                break;
            case 2: 
                System.out.println("administrar Tarjeta Especifica");// subproceso administrarTarjetaEspecifica(balance, "Mastercard", limiteActual);
                break;
            case 3: 
                System.out.println("administrar Tarjeta Especifica");// subproceso  administrarTarjetaEspecifica(balance, "American Express", limiteActual);
                break;
            default:
                opcion = -1;
                System.out.println("opción no válida, vuelva a interntarlo");
        }

        if(opcion == -1){
            System.out.println("consultar Saldo Tarjetaaaaa");// subproceso administrarTarjeta(balance, limiteActual);
        }

    }
}       
