
package test;

import dominio.Persona;  // Importar una sola clase
// import dominio *;  // Importa todas las clases. Se cargan sólo si se usan
// no es mal uso de memoria. no se cargan todas las clases, sólo las que se usan

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000.00, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1, su nombre es: "+persona1.getNombre());
        // Modificar a través de los métodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; //Ya no puede utilizarse (Private)
        //System.out.println("Nombre es: "+persona1.nombre); // Error
        System.out.println("persona1, su nombre modificado es: "+persona1.getNombre());
        System.out.println("Su sueldo es: "+persona1.getSueldo());
        System.out.println("persona1 para el booleano: "+persona1.isEliminado());
        /*
        Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        e imprimir, luego modificar sus valores y volver a imprimir
        */
        Persona personaTarea = new Persona("Hernán",57000.00,false);
        System.out.println("El nombre es: "+personaTarea.getNombre()+"\n"
                + "su sueldo es de: $"+personaTarea.getSueldo()+"\n"
                        + "su boolean es: "+personaTarea.isEliminado());
        personaTarea.setNombre("Pablo");
        personaTarea.setSueldo(60000.00);
        personaTarea.setEliminado(true);
        System.out.println("Tarea: \n"
                + "Nombre: "+personaTarea.getNombre()+"\n"
                        + "Sueldo: "+personaTarea.getSueldo()+"\n"
                                + "su booleano es: "+personaTarea.isEliminado());
        System.out.println("persona1 = " + persona1);
        
        
    }
}
