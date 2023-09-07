
import java.util.Scanner;


public class Clase5VariablesPrimitivas {
    public static void main(String[] args) {
        /*
        var numEntero = 20;//Ponemos "Punto de Ruptura" para detener la ejerción
        //Las literales sin punto son de tipo int automáticamente
        //Inferencia de Tipos. Asignación de tipos. Tipos Default.
        System.out.println("numEntero = " + numEntero);
        //Modo Debug. El punto de ruptura debe ser una línea válida.
        var numFloat = 10.0F;//La "F" fuerza el tipo FLOUT.
        //Automáticamente con el "." se convierte en Double.
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
        
        //Tipo primitivo char
        char miVariable = 'a';
        System.out.println("miVariable = " + miVariable);
        //Lista de caracteres UNICODE es el más usado
        char varCaracter = '\u0024';//Ingreso por UNICODE.
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36;//Valor decimal de unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$';
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        
        var miVariable1 = 'a';
        System.out.println("miVariable1 = " + miVariable1);
        //Lista de caracteres UNICODE es el más usado
        var varCaracter1 = '\u0024';//Ingreso por UNICODE.
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36;//Valor decimal de unicode
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$';
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        //Como en las variables "var" no le asignamos el tipo, entonces
        //java lo toma como valor entero "36". Tipo automático int, salvo
        //que se le ponga (char) al principio, forzando el tipo.
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int catacterChar = 'V';
        System.out.println("catacterChar = " + catacterChar);
        //Cuando usamos una letra como variable tipo int, esta nos devuelve
        //el valor que tiene en el sistema decimal de UNICODE.
        
        
        //Tipos primitivos, Tipos booleanos
        
        boolean varBool = true;
        System.out.println("varBool = " + varBool);
        if(varBool){//El true es automático
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        //Algoritmo es mayor de edad en java
        
        var mayorDeEdad = 18;
        var adulto = 33;
        if(mayorDeEdad <= adulto){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Aún eres menor de edad");
        }
       
        //Conversión de Tipos Primitivos
        //Convertir de tipo CADENA a ENTERO
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad +1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);
        */
        //Convertir tipo ENTERO a CADENA
        var entrada = new Scanner(System.in);
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto + 5);
        var fraseChar = "Programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);
        System.out.println("Digite un caracter");
        fraseChar = entrada.nextLine().charAt(0);a
                
        System.out.println("fraseChar = " + fraseChar);
        
        
        
        
                
    }
}
