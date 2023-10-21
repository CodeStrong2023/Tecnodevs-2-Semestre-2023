/*
Uso de palabra Final
Esta palabra tiene diferentes significados dependiendo donde
se aplique:
        variables: Evita cambiar el valor que almacena la variable
        metodos: Evita que se modifique la definición o el comportamiento 
                 de un método desde una subclase (hija)
        Clases: Evita que se creen clases hijas
Otra característica es que normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estático para convertir una
variable ejempli de esto es la clase Math en la cuál todos sus atributos
son de tipo static y final, es por esto que la variable pi* se conoce
como una constante.
 */
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 243222665;
        System.out.println("miDni = " + miDni);
        //miDni = 20564784; No puede modificarse
        //Persona.CONSTANTE_AQUI = 9; // No se modifica
        System.out.println("Mi atributo constante es "+Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();  // No se puede asignar una nueva referencia
        persona1.setNombre("Ariel Betancud");
        System.out.println("persona1 nombre "+persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("persona1 nombre "+persona1.getNombre());

    }
}
