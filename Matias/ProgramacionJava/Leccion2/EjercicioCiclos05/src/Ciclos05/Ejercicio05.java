/*
Realizar un juego para adivinar un número,
para ello generar un número aleatorio del 1-100
y luego ir pidiendo números respondiendo si es mayor
o menor que el número N.
 */
package Ciclos05;

import javax.swing.JOptionPane;


public class Ejercicio05 {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100);   // Esto genera un número aleatorio (de 100)
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            if (numero < aleatorio) {
                JOptionPane.showMessageDialog(null, "Digite un número MAYOR");
            }
            else if (numero > aleatorio) {
                JOptionPane.showMessageDialog(null, "Digite un número MENOR");
            }
            else {
                JOptionPane.showMessageDialog(null, "Felicidades! Has encontrado el número");
            }
            conteo++;
        }while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Lo has logrado en \"" + conteo + "\" intentos");
    }
}
