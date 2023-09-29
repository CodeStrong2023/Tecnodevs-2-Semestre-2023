package Java.Leccion4;

public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10;// Memoria stack (Variables locales)
        int b = 5;
        miMetodo();// Llamamos el metodo nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 4;
        aritmetica1.b = 6;
        aritmetica1.sumaNumeros();
        // Para almacenar un objeto o los atributos se utiliza la memoria heap

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado: "+resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = "+ resultado);   
    }

    public static void miMetodo(){
        int a = 10;// Una variable esta limitada

    }
}
