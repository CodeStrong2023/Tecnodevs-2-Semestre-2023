
package impuestos.acciones;
import datos.Usuarios;
import datos.Impuestos;

public class PagarDeuda {
//    public PagarDeuda(Usuarios usuario,Impuestos impuesto){
//        this.usuario = usuario;
//        this.impuesto = impuesto;
//    }
    Usuarios usuario = new Usuarios();  // Instancia de prueba de la lógica
    Impuestos impuesto = new Impuestos();  // Al crear nuevos objetos se reinician los valores
   
    public PagarDeuda(int opcion, float balance){
        
    }
    
    public void Pago(int opcion, float balance){
        if (impuesto.TraerDeuda(opcion) == 0){
            System.out.println("No tiene deuda en este servicio");
        } else {
            float cuentaPagada = balance - impuesto.TraerDeuda(opcion);
        balance = cuentaPagada;
        System.out.println("El balance de su cuenta es de $"+balance);
        impuesto.CancelarDeuda(opcion);
        System.out.println("No tiene deuda");
        }
        
    }
}
