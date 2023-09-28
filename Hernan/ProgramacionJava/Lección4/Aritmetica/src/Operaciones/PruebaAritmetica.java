
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
        
        Persona persona = new Persona("Ariel","Betancud");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);
    }
    //null y System.gc() [garbage collector] sirven para limpiar. No es necesario ni recomendable usarlo
    //Modularidad, creamos un nuevo método
    public static void miMetodo(){
        //a = 10;// Una variable está limitada. Hay que inicializar una nueva
        System.out.println("Aquí hay otro método");
    }
}
/*
Sólo puede haber 1 clase pública (modificador de acceso).
Al no poner el modificador de acceso conocido como DEFAULT O
PACKAGE. Es un modificador de acceso que se agrega automáticamente y no debe
escribirse.
*/
class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){ //Constructor
        //Imprimir imprimir = new Imprimir();
        new Imprimir().Imprimir(this);
        //super(); //Esta es la clase padre. Es una clase oculta que, si quiere ponerse
        //debe estar en la primera línea. Es la llama al constructor de la clase Padre object
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this " +this);
    }
} 
class Imprimir {
    public Imprimir(){
        super();
    }
    public void Imprimir(Persona persona){
            System.out.println("persona desde la clase imprimir "+persona );
            System.out.println("Inpresión del objeto actual this: ");
    }
}
