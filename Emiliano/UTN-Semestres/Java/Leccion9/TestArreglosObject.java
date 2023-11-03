package Java.Leccion9;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Ariel");
        personas[1] = new Persona("Emiliano");
        System.out.println("Persona 0 "+personas[0]);
        System.out.println("Persona 1 "+personas[1]);

        for(int i = 0; i < personas.length; i++){
            System.out.println("personas "+i+" = "+personas[i]);
        }
        //Trabajamos con arreglos en la sintaxis resumida
        String frutas[] = {"Pera","Banana","Naranja"};
        for(int i = 0; i < frutas.length; i++){
            System.out.println("Fruntas "+i+" = "+frutas[i]);
        }
    }
}
