
import java.util.Scanner;

public class Variables2 {

    public static void main(String[] args) {
        
        //var <- java infiere el tipo de dato
        var miVariableEntera = 10;
        var miVariableCadena = "Seguimos estudiando";
        System.out.println("miVariableCadena = " + miVariableCadena);/*soutv + 
tap*/
        System.out.println("miVariableEntera = " + miVariableEntera);
        var usuario = "Osvaldo";
        var titular = "Ingeniero";
        var union = titular + " " + usuario;
        System.out.println("union = " + union);
//Para ordenar: click derecho y buscar "format"
        var a = 8;//No es recomendable variables tan cortas porque documentan
        var b = 4;
        System.out.println(a + b);/*Si Java encuentra que las variables son
        numéricas, procederá a sumarlas o utilizar el operador aritmético
         */
        System.out.println(usuario + a + b);/*Si la primera variable resulta ser
        cadena, entonces toma todo como cadena, por lo que no sumará los 
        elementos. Esto es un CONTEXTO DE CADENA
         */
        System.out.println(usuario + (a + b));/*Los paréntesis cambian la
        prioridad, por lo que los elementos dentro del paréntesis será lo
        primero que se resuelva
         */
        //Ejercicio: Caracteres especiales en Java
        var nombre = "Natalia";
        System.out.println("\nNueva línea \n" + nombre);//Salto de página
        System.out.println("Tabulador: \t" + nombre);/*Crea un espacio tipo
        tabulador
         */
        System.out.println("\t\t MENÚ");//Pueden sumarse
        System.out.println("Retroceso: \b\b\b" + nombre);/*Cada retroceso \b quita
        un lugar hacia atras, de retroceder y encontrarse un caracter, lo
        sobreescribe
         */
        System.out.println("Comillas simples \'" + nombre + "\'");/*Sirve para
        poner comillas dentro de un texto
         */
        System.out.println("Comillas dobles \"" + nombre + "\"");/*Así se ponen
        comillas dobles
         */

        //Clase Scanner en Java. Código duro es darle valor nosotros a las var
        /*Como parece que he hecho muchos comentarios, cuando intento comentar
        todo el algoritmo solamente me comenta una parte, dejandome partes
        activas, por ello en esta parte voy a utilizar variables diferentes
        para que no entren en conflicto con las que quedan activas al comentar
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        var usuario2 = entrada.nextLine();//Lee una línea de la consola
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el título");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2Herná);
    }

}
