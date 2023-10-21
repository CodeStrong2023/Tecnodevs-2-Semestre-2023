
package impuestos.acciones;
import datos.Usuarios;
import datos.Impuestos;
import secciones.MenuImpuestos;

public class PagarDeuda {
   
    public PagarDeuda(int opcion, float balance){
        
    }
    
    public static void Pago(int opcion, float balance){  // Recibe la opcion del switch (para elegir el impuesto y el prestador) y el balance
        if (Impuestos.TraerDeuda(opcion) == 0){  // De haber pagado ya la cuenta
            System.out.println("No tiene deuda en este servicio");
        } else if (balance < Impuestos.TraerDeuda(opcion)){  // En caso de no tener saldo suficiente para pagar
            System.out.println("No tiene suficiente dinero en la cuenta");
        } else {  // De otra forma se paga
            balance -= Impuestos.TraerDeuda(opcion);  // Resto de la cuenta
        System.out.println("El balance de su cuenta es de $"+balance);  
        System.out.println("No tiene deuda");  
        Impuestos.CancelarDeuda(opcion);  // Llevo la deuda a 0
        }
        MenuImpuestos volver = new MenuImpuestos(); // Creo un objeto para volver al menú de impuestos
        volver.MenuImpuestos__Impuestos(balance);  //  Utilizo el objeto para llamar la función
    }
}
