/*
Proyecto Caja:
Ejercicio 1: Crear un poyecto según las especificaciones
mostradas a continuación.
La fórmula es: volumen = ancho * alto * profundidad
Mostrado con dos tipos de constructores
- uno vacío
- otro que reciba argumentos como parámetros
 */
package caja;
// Creamos la clase "caja"
public class Caja {
    float ancho; //Otorgamos atributos
    float alto;
    float profundo;
    
    //Creamos los constructores y el método con la formula del volumen
    public Caja(){
        //constructor vacío
    }
    public Caja(float alto,float ancho,float profundo){
        // constructor que recibe parámetros
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    public float volumenCaja (){
        return ancho * alto * profundo;
    }
}
