
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Float dGuillermo,dLuis,dJuan,sumaDinero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dinero de Guillermo $");
        dGuillermo = Float.parseFloat(entrada.nextLine());
        dLuis = dGuillermo / 2;
        dJuan = (dGuillermo + dLuis) / 2;
        sumaDinero = dGuillermo + dJuan + dLuis;
        System.out.println("Entre los tres tienen $" + sumaDinero + " teniendo "
                + " Guillermo " + dGuillermo + " Luis $" + dLuis + " y, finalmente,"
                        + " Juan $" + dJuan);
                
    }
    
}
