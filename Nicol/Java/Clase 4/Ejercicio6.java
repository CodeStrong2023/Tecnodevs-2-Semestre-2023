/*Ejercicio 6: Pedir numeros hasta que se teclee un cero,
mostrar la suma de todos los numeros introducidos.
*/

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numeros,suma = 0;
        do{
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma+= numeros;
        }while(numeros != 0);
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros ingresados es "+suma);
    }
}
