/*
 Uso de la palabra Final
 Esta palabra tiene diferentes significados dependiendo donde se aplique:
        variables: Evita cambiar el valor que almacena la variable.
        metodos: Evita que se modifique la definicion o el comportamiento
                de un metodo desde una subclase(hija).

        clases: Evita que se creen clases hijas.
Otra caracteristica es que normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estatico para convertir una variable
en una constante, es decir que no se puede modificar su valor, el ejemplo
de esto es la clase Math en la cual todos sus atributos son de tipo static 
y final, es por esto que la variable pi* se conoce como una constante.
 */

package Java.Leccion8;

public class PalabraFinal {
    public static void main(String[] args) {
        final int miDni = 12345678;
        System.out.println("Mi DNI: " + miDni);
        // miDni = 20312321; No se puede modificar
        // Persona.CONSTANTE_AQUI = 9; //No se modifica
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);

        final Persona persona1 = new Persona();
        persona1.setNombre("Ariel");
        System.out.println("Persona1 = " + persona1.getNombre());
        persona1.setNombre("Nicolas");
        System.out.println("Persona1 = " + persona1.getNombre());
    }


}
