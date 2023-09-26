package Java.Leccion4;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 4;
        aritmetica1.b = 6;
        aritmetica1.sumaNumeros();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado: "+resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = "+ resultado);
    }
}
