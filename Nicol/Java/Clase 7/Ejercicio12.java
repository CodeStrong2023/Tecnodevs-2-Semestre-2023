//Ejercicio 12: pedir un numero y calcular su factorial

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        long factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero: "));
        for( int i=1; i<=numero;i++){
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es:"+factorial);
    }   
}
