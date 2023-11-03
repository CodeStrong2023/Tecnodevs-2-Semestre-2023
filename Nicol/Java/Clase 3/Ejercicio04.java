// Ejercicio 4: Pedir numeros hasta que se tecree uno negativo, y
//mostrar cuantos numeros se han introducido.

import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque un numero: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es POSITIVO");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "A ingresado "+conteo+" numero que no son negativos");
    }   
}