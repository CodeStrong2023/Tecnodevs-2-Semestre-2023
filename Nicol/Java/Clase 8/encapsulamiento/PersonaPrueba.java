package test;
import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("Persona1 es: "+persona1.getNombre());
      
        // Modificar a travez de los metodos
       
        persona1.setNombre("Ariel");
        System.out.println("Persona1 modificado es: "+persona1.getNombre());
        System.out.println("persona1 el resultado de sueldo: "+persona1.getSueldo());
        System.out.println("persona1 el resultado de boolean: "+persona1.isEliminado());
        

        //TAREA: Crear otro objeto de tipo persona, asignar valores de manera inicial
        //y imprimir, luego modificar sus valores y volver a imprimir
       
        Persona persona2 = new Persona("Nicol",90.000, true);
        System.out.println("Persona2 su nombre: "+persona2.getNombre());
        System.out.println("Persona2 su sueldo: "+persona2.getSueldo());
        System.out.println("Persona2 resultado boolean: "+persona2.isEliminado());
        //Modificamos a travez de los metodos
        persona2.getNombre("Melina");
        persona2.getSueldo(95.000);
        persona2.isEliminado(false);
        //Resultado modificado
        System.out.println("Persona2 su nombre: "+persona2.getNombre());
        System.out.println("Persona2 su sueldo: "+persona2.getSueldo());
        System.out.println("Persona2 resultado boolean: "+persona2.isEliminado());
        

        System.out.println("Persona1: "+ persona1);
    }
}
