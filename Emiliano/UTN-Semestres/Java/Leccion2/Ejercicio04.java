// Ejercicio 4: Pedir numeros hasta que se tecree uno negativo, y
//              mostrar cuántos numeros se han introducido.

import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque un número: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es POSITIVO");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque otro número: "));
        }
        JOptionPane.showMessageDialog(null, "A ingresado "+conteo+" números que no son negativos");
    }   
}