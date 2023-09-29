

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();// Llamamos al constructor
        persona1.nombre = "Emiliano";
        persona1.apellido = "Grossi";
        persona1.obtenerInformacion();

        Persona persona2 = new Persona();
        System.out.println("Persona2 = "+ persona2);
        System.out.println("Persona1 = "+ persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Ariel";
        persona2.apellido = "Betancud";
        persona2.obtenerInformacion();
    }
}
