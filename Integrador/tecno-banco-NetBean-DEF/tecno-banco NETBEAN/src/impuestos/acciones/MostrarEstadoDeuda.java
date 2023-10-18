
package impuestos.acciones;  // Paquete para ordenar las acciones relacionadas con los impuestos

import servicios.Confirmar;
import datos.Impuestos;
import java.text.DecimalFormat;

// Clase para crear matriz de las deudas
public class MostrarEstadoDeuda {
    Impuestos monto = new Impuestos();  //creo objeto para la funcion TraerDeuda de la clase Impuestos
    DecimalFormat formato = new DecimalFormat("0.00");
    
    String[][] Servicio__Deuda = new String[2][4];{  // Lleno la matriz de forma manual
    Servicio__Deuda[0][0] = "Luz";
    Servicio__Deuda[0][1] = "Gas";
    Servicio__Deuda[0][2] = "Agua";
    Servicio__Deuda[0][3] = "Internet";
    
    Servicio__Deuda[1][0] = formato.format(monto.TraerDeuda(0));
    Servicio__Deuda[1][1] = formato.format(monto.TraerDeuda(1));
    Servicio__Deuda[1][2] = formato.format(monto.TraerDeuda(2));
    Servicio__Deuda[1][3] = formato.format(monto.TraerDeuda(3));
}
    
    public MostrarEstadoDeuda(){  // constructor vacío (no era necesario ponerlo) para crear objeto y poder llamar la funcion MostrarMatriz
        
    }
    
        public void MostrarMatriz(float cuenta) {  // Código para imprimir una matriz.
        for (int i = 0; i < Servicio__Deuda.length; i++) {
            for (int j = 0; j < Servicio__Deuda[i].length; j++) {
                System.out.print(Servicio__Deuda[i][j] + "\t\t"); 
            }
            System.out.println(); 
        }
        Confirmar confirmar = new Confirmar(); confirmar.ConfirmaContinuar();
    }

}
