
package Clases;
 //Cuando creamos una variable dentro de main es una variable local
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); // Definimos dentro de una clase
        /*
        Llamamos al constructor. se llama cada
        vez que creamos un objeto. El valor
        hexadecimal, normalmente, comienza con 0x
        */
        persona1.nombre = "Hernán";
        persona1.apellido = "Vega";
        persona1.obtenerInformacion();
        /* 
        Si no se utiliza una clase, en main
        se destruye la variable después de usarla.
        Puede ponerse clase y constructor en una
        sola línea.
        */
        Persona persona2 = new Persona();
        System.out.println("persona2 = "+persona2); //Muestra dirección de memoria
        System.out.println("persona1 = "+persona1);
        persona2.obtenerInformacion(); //Accedemos al método
        /*
        Al no haber ingresado información, el valor es null. Los objetos
        comparten los atributos, pero no la información
        */
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformacion();
        //Los objetos son las INSTANCIAS de las clases
        
        
        
    }
}
