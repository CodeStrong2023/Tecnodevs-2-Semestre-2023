
package Clase8AreaYPerimetroDeUnTriangulo;

import java.util.Scanner;

public class Clase8AreaYPerimetroDeUnTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo");
        var base = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese la altura del triángulo");
        var altura = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese la longitud del lado izquierdo");
        var lado1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese la longitud del lado derecho");
        var lado2 = Float.parseFloat(entrada.nextLine());
        var area = (base * altura) / 2;
        var perimetro = base + lado1 + lado2;
        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("El área del triángulo es: " + area);   
    }
}
