/*
Ejercicio 10: Pedir 10 números y escribir la suma
total
Hacerlo con la clase Scanner y JoptionPane
 */
package ciclos10;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i<=10; i++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null, "La suma de los números es: "+suma);
    }
}
