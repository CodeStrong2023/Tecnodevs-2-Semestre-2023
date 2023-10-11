
package matriz;
import Clases.*;
import clases.Clases;
import java.text.DecimalFormat;


public class MostrarDeuda {
    

    public static void mostrar_deuda() {
        System.out.println("\n---------------------------------------------------------------\n");
        int filas = 2;
        int columnas = 4;
        Object[][] estado_servicios = new Object[filas][columnas];
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        
        estado_servicios[0][0] = "Luz  ";
        estado_servicios[0][1] = "Agua ";
        estado_servicios[0][2] = "Gas  ";
        estado_servicios[0][3] = "Internet";

        estado_servicios[1][0] = decimalFormat.format(Clases.Luz.getDeuda());
        estado_servicios[1][1] = decimalFormat.format(Clases.Agua.getDeuda());
        estado_servicios[1][2] = decimalFormat.format(Clases.Gas.getDeuda());
        estado_servicios[1][3] = decimalFormat.format(Clases.Internet.getDeuda());

        

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(estado_servicios[i][j] + "\t \t");
            }
            System.out.println();
        }
        System.out.println("\n---------------------------------------------------------------\n");
    }
}
