
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    //El constructor es un método especial
    
    
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
        //return a + b;
        return sumarConRetorno();
        //Un método llamando a otro método
    }
}
