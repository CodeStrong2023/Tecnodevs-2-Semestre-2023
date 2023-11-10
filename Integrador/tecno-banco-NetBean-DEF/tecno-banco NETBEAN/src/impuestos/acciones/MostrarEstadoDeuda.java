
package impuestos.acciones;  // Paquete para ordenar las acciones relacionadas con los impuestos
// En la clase de hoy me acabo de enterar que poner punto crea carpetas... 
// sin embargo, no afecta el programa. De ser necesario, crearía una nueva clase y copiaría el código

import servicios.Confirmar;
import datos.Impuestos;
import java.text.DecimalFormat;

// Clase para crear matriz de las deudas
public class MostrarEstadoDeuda {
    DecimalFormat formato = new DecimalFormat("0.00");
    
    String[][] Servicio__Deuda = new String[2][4];{  // Lleno la matriz una a una porque, declarándola seguida, no obtenía el orden que buscaba
    Servicio__Deuda[0][0] = "Luz";
    Servicio__Deuda[0][1] = "Gas";
    Servicio__Deuda[0][2] = "Agua";
    Servicio__Deuda[0][3] = "Internet";
    
    Servicio__Deuda[1][0] = formato.format(Impuestos.Luz.TraerDeuda(0));  // Invoco TraerDeuda de esta forma para saber que servicio es cada uno
    Servicio__Deuda[1][1] = formato.format(Impuestos.Gas.TraerDeuda(1));
    Servicio__Deuda[1][2] = formato.format(Impuestos.Agua.TraerDeuda(2));
    Servicio__Deuda[1][3] = formato.format(Impuestos.Internet.TraerDeuda(3));
}
    
        public void MostrarMatriz() {  // Código para imprimir una matriz.
            //System.out.println("\tEl monto en su cuenta es: $"+formato.format(cuenta));
        for (int i = 0; i < Servicio__Deuda.length; i++) {
            for (int j = 0; j < Servicio__Deuda[i].length; j++) {
                System.out.print(Servicio__Deuda[i][j] + "\t\t"); 
            }
            System.out.println(); 
        }
        Confirmar.ConfirmaContinuar();
    }

}
