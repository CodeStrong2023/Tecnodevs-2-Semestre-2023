
package servicios;

public class Confirmar {
    public static boolean ConfirmaContinuar() {
        System.out.println("¿Desea continuar?");  // Pregunta si desea continuar
        String[] confirmacion = new String[]{"Sí", "No"};
        Menu menu__confirmacion = new Menu(confirmacion);
        int confirmar = menu__confirmacion.Iniciar();
        switch (confirmar) {
            case 0:
                return true; // Continuar con la acción que se estaba realizando
            case 1:
                return false; // No continuar, salir de la acción
            default:
                return false; // Por defecto, no continuar
        }
    }
}
