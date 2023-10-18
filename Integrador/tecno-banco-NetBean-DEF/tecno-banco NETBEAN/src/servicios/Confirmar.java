
package servicios;
// Esta clase es sólamente para confirmar operaciones
public class Confirmar {
    public void ConfirmaContinuar(){
        System.out.println("¿Desea continuar?");
                String[] confirmacion = new String[]{"Sí","No"};
                Menu menu__confirmacion = new Menu(confirmacion);
                int confirmar = menu__confirmacion.Iniciar();
                switch (confirmar){
                    case 0: break;// Función para pagar
                    case 1: break;
                }
    }
}
