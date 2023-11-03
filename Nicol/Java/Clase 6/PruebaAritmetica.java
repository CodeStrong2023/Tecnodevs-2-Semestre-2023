
package Operaciones;

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
        Persona persona = new Persona("Nicol","Paidican");
        System.out.println("persona: "+persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.app);
    }

    public static void miMetodo(){
        int a = 10;// Una variable esta limitada

    }
}
// Nueva clase
class Persona{
    String nombre;
    String app;
    
    Persona(String nombre, String app){
        super();//Lamada al construnctor de la clase padre
        this.nombre = nombre;
        this.app = app;
        System.out.println("Objeto persona usando this: "+this);
    }

}

class Imprimir{
    public Imprimir(){
        super(); //el contructor de la clase padre, para reservar memoria
    }

    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: "+persona);
        System.out.println("Impresion del objeto actual (this)"+this);
    }
}