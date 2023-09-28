/*
Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package ciclos12;

// import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioCiclos12 {
    public static void main(String[] args) {
        long factorial = 1;
        int numero = 0;
        
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());*/
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        for (int i = 1; i <= numero; i += 1){
            factorial *= i;
        }
        
        //System.out.println("El factorial del número "+numero+" es "+factorial);
        
        JOptionPane.showMessageDialog(null, "El factorial del número "+numero+" es "+factorial);
    }
}
