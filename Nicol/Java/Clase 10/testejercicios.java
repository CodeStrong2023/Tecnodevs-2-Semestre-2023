
package test;

import ejercicios.ejercicios;

public class testejercicios {
    public static void main(String[] args) {
        var resultado = ejercicios.sumar(7, 9);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = ejercicios.sumar(5, 19.09);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = ejercicios.sumar(8, 6L);
        System.out.println("resultado3 = " + resultado3);
    }
}