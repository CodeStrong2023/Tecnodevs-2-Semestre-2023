package Java.Leccion7;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(7, 9);
        System.out.println("Resultado =" + resultado);

        var resultado2 = Operaciones.sumar(5.0, 7);
        System.out.println("Resultado2 =" + resultado2);

        var resultado3 = Operaciones.sumar(8, 6L);
        System.out.println("Resultado3 =" + resultado3);
    }
}
