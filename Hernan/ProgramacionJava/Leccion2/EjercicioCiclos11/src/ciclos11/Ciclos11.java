/*
Ejercicio 11: Diseñar un progrma que muestre el producto
de los 10 primeros números impares
Hacerlo con JOptionPane
 */
package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {
    public static void main(String[] args) {
        long num = 1; // Como el número puede ser muy grande se utiliza long
        
        for (int i=1;i<=20;i+=2){ //20 tiene los 10 primeros números impares
            num *= i; //Se van multiplicando los números impares
        }
        
        JOptionPane.showMessageDialog(null, "El producto de los primeros 10 números impares es: "+ num);
    }
}
