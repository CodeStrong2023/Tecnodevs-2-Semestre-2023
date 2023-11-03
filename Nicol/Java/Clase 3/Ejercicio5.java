/* Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y 
luego ir pidiendo numeros indicando "es mayor" o
"es menos" segun sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos
el numero de intentos hechos.
*/

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); // Esto genera un numero aleatorio
        do{

            numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque un numero: "));
            if(numero < aleatorio){
                JOptionPane.showMessageDialog(null,"Es un numero mayor ");
            }
            else if(numero > aleatorio){
               JOptionPane.showMessageDialog(null,"Es un numero menor ");
            }
            else{
              JOptionPane.showMessageDialog(null,"¡¡FELICIDADES!! Has adivinado el numero ");
               JOptionPane.showMessageDialog(null,"");
            }
            conteo++;
        }while(numero != aleatorio);
        JOptionPane.showMessageDialog(null,"Adivinaste el numero en "+conteo+" intentos");
       JOptionPane.showMessageDialog(null,"");
    }
}
