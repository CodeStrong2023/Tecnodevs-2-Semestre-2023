
package test;

import domain.Persona;
public class PersonaPrueba {
    
    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Nicol");
        System.out.println("Persona1= "+ persona1);
        Persona persona2 = new Persona("Melina");
        System.out.println("Persona2= "+ persona2);
        imprimir(persona1);
        imprimir(persona2);
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }

    public void imprimir(Persona persona){
        System.out.println("persona :"+persona);
    }

    public int getContador(){
        imprimir(new Persona("Nicolas"));
        return this.contador;
    }
}
    
