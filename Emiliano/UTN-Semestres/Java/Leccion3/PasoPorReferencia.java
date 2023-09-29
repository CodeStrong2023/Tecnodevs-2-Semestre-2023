
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Emi";
        System.out.println("Nombre persona: "+persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio de nombre es: "+persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
        System.out.println("El valor del nuevo objeto es: "+persona2.nombre);
    }

    public static void cambiarValor(Persona persona){//Paso por referencia
        persona.nombre = "Tomi";
        
    }

    public static Persona cambiarElValor(Persona persona){
        if(persona == null){
            System.out.println("Valor de persona es invalido: Null");
            return null;
        }
        else{
            persona.nombre = "Gabi";
            return persona;
        }
    }
}
    