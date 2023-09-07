
/*Si bien, en los videos, aparece en el mismo proyecto lo de la clase 1 y 2
me parese más ordenado dividirlas en dos proyectos distintos
*/
public class Variables1 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo desde Java");
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 15;
        System.out.println(miVariable);
        //Tipo String, es una clase. No es tipo primitivo
        String miVariableCadena = "Bievenidos";
        System.out.println(miVariableCadena);
        /*El String, si bien es una clase, no se inicializa como clase
        sino como si fuera una variable primitiva
        */
        miVariableCadena = "Sigamos creciendo en Programación";
        System.out.println(miVariableCadena);
    }
}
