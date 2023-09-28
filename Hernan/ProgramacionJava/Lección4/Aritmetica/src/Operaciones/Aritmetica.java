
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //El constructor es un método especial
    public Aritmetica(){//Constructor vacío
        //Se crea automáticamente, no es necesario ponerlo
        System.out.println("Se esta ejercutando el constructor número 1");
    }
    public Aritmetica(int a, int b){
        //Esto es sobrecarga de constructores
        this.a = a; //Al usar variables con nombre igual a un atributo es
        //necesario poner this.
        this.b = b;
        System.out.println("Se esta ejecutando el constructor número 2");
    }
    
    //Método
    public void sumarNumeros() {
    //Cuerpo de la clase y variables locales
    int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b;
    }
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; //this, hace referencia al espacio de memoria
        //El argumento arg1 se asigna al atributa this.a
        this.b = arg2; //this, se crea automáticamente, no es necesario ponerlo
        //Una vez sale de clase se elimina
        //Suele usarse para que el código sea más legible. Buena práctica.
        //Pueden tener el mismo nombre. Se diferencia atributo de argumento.
        
        //return a + b;
        return sumarConRetorno();
        //Un método llamando a otro método
    }
}
