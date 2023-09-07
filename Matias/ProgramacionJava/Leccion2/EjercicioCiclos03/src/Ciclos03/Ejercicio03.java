/*
Leer números hasta que se introduzca un cero.
Para cada uno indicar si es par o impar.
Primero lo haremos con clase scanner y luego con JOptionPane
 */
package Ciclos03;

import javax.swing.JOptionPane;

public class Ejercicio03 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par");
            } else {
                System.out.println("el número " + numero + " es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        System.out.println("El numero ingresado \"" + numero + "\" termina el programa");
    }
}
