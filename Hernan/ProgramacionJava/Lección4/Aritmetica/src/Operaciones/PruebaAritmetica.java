
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10; //Variables locales
        int b = 7; //Memoria Stack
        
        miMetodo();//Llamamos al segundo método
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3; //Atributos y objetos están en Memoria Heap
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
                System.out.println("Resultado: " + resultado);
                //Usando argumentos correspondientes a arg1 y arg2
        System.out.println("aritmetica1 a = "+aritmetica1.a);
        System.out.println("aritmetica2 b = "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 a = " + aritmetica2.a);
        System.out.println("aritmetica2 b = " + aritmetica2.b);
    }
    //null y System.gc() [garbage collector] sirven para limpiar. No es necesario ni recomendable usarlo
    public static void miMetodo(){
        //a = 10;// Una variable está limitada. Hay que inicializar una nueva
        System.out.println("Aquí hay otro método");
    }
}
