
package Matriz_Ejercicio_3;
/*
Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
*/
import java.util.Scanner;

public class Matriz_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        
        // Rellenar matriz
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Ingrese un número para la posición "+i+"-"+j);
                matriz[i][j] = entrada.nextInt();
            }
            
        }
        System.out.println("Matriz Original");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j]+" "); // Hay que borrar el ln del sout para que aparezcan seguidos
            }
            System.out.println("");
        }
        System.out.println();
        
        
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
