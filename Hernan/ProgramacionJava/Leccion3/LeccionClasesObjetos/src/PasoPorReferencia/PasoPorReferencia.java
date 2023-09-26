//Paso por referencia
package PasoPorReferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Esther";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        //Persona persona2 = null;//Objeto vacío, entra dentro del if de más adelante
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor de persona2 es "+persona2.nombre);
    }
    public static void cambiarValor(Persona persona){//Paso por referencia
        persona.nombre = "María";
        return ;//El compilador lo crea pero no es necesario
    }
    public static Persona cambiarElValor(Persona persona){//Método de tipo object
        if (persona == null){
            System.out.println("El valor de persona es inválido: Null");
            return null;
        }
        else {
            persona.nombre = "Mónica";
        return persona;
        }
        
    }
}
