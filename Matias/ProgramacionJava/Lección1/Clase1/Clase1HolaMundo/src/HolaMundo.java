
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
//        System.out.println("¡Hola, Mundo!");

//// Si bien, en los videos, aparece en el mismo proyecto lo de la clase 1 y 2
////me parese más ordenado dividirlas en dos proyectos distintos
//
//        System.out.println("Hola Mundo desde Java");
//        int miVariable = 10;
//        System.out.println(miVariable);
//        miVariable = 15;
//        System.out.println(miVariable);
//        //Tipo String, es una clase. No es tipo primitivo
//        String miVariableCadena = "Bievenidos";
//        System.out.println(miVariableCadena);
//        /*El String, si bien es una clase, no se inicializa como clase
//        sino como si fuera una variable primitiva
//        */
//        miVariableCadena = "Sigamos creciendo en Programación";
//        System.out.println(miVariableCadena);
//        
//        //var <- java infiere el tipo de dato
//        var miVariableEntera = 10;
//        var miVariableCadena = "Seguimos estudiando";
//        System.out.println("miVariableCadena = " + miVariableCadena);/*soutv + 
//tap*/
//        System.out.println("miVariableEntera = " + miVariableEntera);
//        var usuario = "Osvaldo";
//        var titular = "Ingeniero";
//        var union = titular + " " + usuario;
//        System.out.println("union = " + union);
////Para ordenar: click derecho y buscar "format"
//        var a = 8;//No es recomendable variables tan cortas porque documentan
//        var b = 4;
//        System.out.println(a + b);/*Si Java encuentra que las variables son
//        numéricas, procederá a sumarlas o utilizar el operador aritmético
//         */
//        System.out.println(usuario + a + b);/*Si la primera variable resulta ser
//        cadena, entonces toma todo como cadena, por lo que no sumará los 
//        elementos. Esto es un CONTEXTO DE CADENA
//         */
//        System.out.println(usuario + (a + b));/*Los paréntesis cambian la
//        prioridad, por lo que los elementos dentro del paréntesis será lo
//        primero que se resuelva
//         */
//        //Ejercicio: Caracteres especiales en Java
//        var nombre = "Natalia";
//        System.out.println("\nNueva línea \n" + nombre);//Salto de página
//        System.out.println("Tabulador: \t" + nombre);/*Crea un espacio tipo
//        tabulador
//         */
//        System.out.println("\t\t MENÚ");//Pueden sumarse
//        System.out.println("Retroceso: \b\b\b" + nombre);/*Cada retroceso \b quita
//        un lugar hacia atras, de retroceder y encontrarse un caracter, lo
//        sobreescribe
//         */
//        System.out.println("Comillas simples \'" + nombre + "\'");/*Sirve para
//        poner comillas dentro de un texto
//         */
//        System.out.println("Comillas dobles \"" + nombre + "\"");/*Así se ponen
//        comillas dobles
//         */
//
//        //Clase Scanner en Java. Código duro es darle valor nosotros a las var
//        /*Como parece que he hecho muchos comentarios, cuando intento comentar
//        todo el algoritmo solamente me comenta una parte, dejandome partes
//        activas, por ello en esta parte voy a utilizar variables diferentes
//        para que no entren en conflicto con las que quedan activas al comentar
//        */
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese su nombre");
//        var usuario2 = entrada.nextLine();//Lee una línea de la consola
//        System.out.println("usuario2 = " + usuario2);
//        System.out.println("Escriba el título");
//        var titulo2 = entrada.nextLine();
//        System.out.println("Resultado: " + titulo2 + " " + usuario2Herná);
//        
//        //Clases siempre empiezan con MAYÚSCULA.
//        //Tipo Byte
//        byte numEnteroByte = (byte)129;
//        /*Al poner un tipo entre paréntesis antes del valor, estamos
//        forzando a converitir en ese tipo
//        */
//        System.out.println("Valor mínimo del Byte" + Byte.MIN_VALUE);
//        System.out.println("Valor máximo del Byte" + Byte.MAX_VALUE);
//        /*Se realiza una "PÉRDIDA DE PRECISIÓN" al convertir los tipos
//        cuando el valor ingreaasdo supera el valor máximo de la variable.
//        En el caso que sigue, al forzar el formato BYTE, encontramos que
//        ,al superar el valor de los números positivos, utiliza espacios de
//        los números negativos.
//        */
//        System.out.println(numEnteroByte);
//        numEnteroByte = 127;
//        
//        //Tipo Short
//        short numEnteroShort = (short)32768;
//        System.out.println("Valor mínimo del Short" + Short.MIN_VALUE);
//        System.out.println("Valor máximo del SHort" + Short.MAX_VALUE);
//        System.out.println(numEnteroShort);
//        numEnteroShort = 32000;
//        
//        //Tipo Int (Entero)
//        int numEnteroInt = (int)2147483648L;/*no tiene solución forzando clase
//        solamente. Debe añadirse "L" al final de la literal para solucionar este
//        error. La letra "L" corresponde a la clase Long. Se utiliza, por
//        convención y buenas prácticas, la letra "L" en mayúscula, para evitar
//        confundirla con un uno. Sin embargo, la perdida de presición se ocurre
//        de todas formas.
//        
//        */
//        System.out.println("Valor mínimo del Int" + Integer.MIN_VALUE);
//        System.out.println("Valor máximo del Int" + Integer.MAX_VALUE);
//        System.out.println(numEnteroInt);
//        numEnteroShort = 32000;
//        
//        //Tipo Long
//        long numEnteroLong = (long)9223372036854775807L;/*Este es el número
//        máximo para usar como entero. Java toma por defoult el tipo int
//        por lo que es necesario agregar "L" al final. Si necesitamos trabajar
//        con números mayores necesitamos los tipos FLOAT.
//        */
//        System.out.println("Valor mínimo del Long" + Long.MIN_VALUE);
//        System.out.println("Valor máximo del Long" + Long.MAX_VALUE);
//        System.out.println(numEnteroLong);
//        
//        //Tipo Float
//        float numFloat = (float)3.4028235E39D;/*El tipo default es de Double, 
//        por ello debe ponerse (float) o la "F" al final. "E" es de Exponente.
//        */
//        System.out.println("numFloat = " + numFloat);
//        System.out.println("El valor mínimo de Float es" + Float.MIN_VALUE);
//        System.out.println("El valor máximo de Float es" + Float.MAX_VALUE);
//        numFloat = 3.402823E3F;
//        
//        //Tipo Double. El más grande en Java y es el que usa por Defalut.
//        double numDouble = 1.7976931348623157E308;
//        System.out.println("El valor mínimo del Double es" + Double.MIN_VALUE);
//        System.out.println("El valor máximo del Double es" + Double.MAX_VALUE);
//        
//        /*
//        var numEntero = 20;//Ponemos "Punto de Ruptura" para detener la ejerción
//        //Las literales sin punto son de tipo int automáticamente
//        //Inferencia de Tipos. Asignación de tipos. Tipos Default.
//        System.out.println("numEntero = " + numEntero);
//        //Modo Debug. El punto de ruptura debe ser una línea válida.
//        var numFloat = 10.0F;//La "F" fuerza el tipo FLOUT.
//        //Automáticamente con el "." se convierte en Double.
//        System.out.println("numFloat = " + numFloat);
//        var numDouble = 10.0;
//        System.out.println("numDouble = " + numDouble);
//        
//        //Tipo primitivo char
//        char miVariable = 'a';
//        System.out.println("miVariable = " + miVariable);
//        //Lista de caracteres UNICODE es el más usado
//        char varCaracter = '\u0024';//Ingreso por UNICODE.
//        System.out.println("varCaracter = " + varCaracter);
//        char varCaracterDecimal = 36;//Valor decimal de unicode
//        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
//        char varCaracterSimbolo = '$';
//        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
//        
//        var miVariable1 = 'a';
//        System.out.println("miVariable1 = " + miVariable1);
//        //Lista de caracteres UNICODE es el más usado
//        var varCaracter1 = '\u0024';//Ingreso por UNICODE.
//        System.out.println("varCaracter1 = " + varCaracter1);
//        var varCaracterDecimal1 = (char)36;//Valor decimal de unicode
//        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
//        var varCaracterSimbolo1 = '$';
//        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
//        //Como en las variables "var" no le asignamos el tipo, entonces
//        //java lo toma como valor entero "36". Tipo automático int, salvo
//        //que se le ponga (char) al principio, forzando el tipo.
//        int varEnteroChar = '$';
//        System.out.println("varEnteroChar = " + varEnteroChar);
//        int catacterChar = 'V';
//        System.out.println("catacterChar = " + catacterChar);
//        //Cuando usamos una letra como variable tipo int, esta nos devuelve
//        //el valor que tiene en el sistema decimal de UNICODE.
//        
//        
//        //Tipos primitivos, Tipos booleanos
//        
//        boolean varBool = true;
//        System.out.println("varBool = " + varBool);
//        if(varBool){//El true es automático
//            System.out.println("La bandera es verde");
//        }
//        else{
//            System.out.println("La bandera es roja");
//        }
//        //Algoritmo es mayor de edad en java
//        
//        var mayorDeEdad = 18;
//        var adulto = 33;
//        if(mayorDeEdad <= adulto){
//            System.out.println("Eres mayor de edad");
//        }
//        else {
//            System.out.println("Aún eres menor de edad");
//        }
//       
//        //Conversión de Tipos Primitivos
//        //Convertir de tipo CADENA a ENTERO
//        var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad +1));
//        
//        var valorPi = Double.parseDouble("3.1416");
//        System.out.println("valorPi = " + valorPi);
//        
//        //Pedir un valor
//        var entrada = new Scanner(System.in);
//        System.out.println("Digite su edad");
//        edad = Integer.parseInt(entrada.nextLine());
//        System.out.println("edad = " + edad);
//        */
//        //Convertir tipo ENTERO a CADENA
        var entrada = new Scanner(System.in);
//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto + 5);
//        var fraseChar = "Programadores".charAt(12);
//        System.out.println("fraseChar = " + fraseChar);
//        System.out.println("Digite un caracter");
//        fraseChar = entrada.nextLine().charAt(0);a
//                
//        System.out.println("fraseChar = " + fraseChar);

//        int num1 = 5,num2 = 4;//Inicializar varias variables
//        var solucion = num1 + num2;
//        System.out.println("solucion de la suma: " + solucion);
//        solucion = num1 - num2;
//        System.out.println("solucion de la resta: " + solucion);
//        solucion = num1 * num2;
//        System.out.println("solucion de la multiplicación: " + solucion);
//        solucion = num1 / num2;
//        System.out.println("solucion de la división: " + solucion);
//        var solucion2 = 3.4 / num2;
//        System.out.println("solucion2 de la división: " + solucion2);
//        solucion = num1 % num2;//guarda residuo entero de la división
//        System.out.println("solucion del residuo de la división: " + solucion);
//        
//        if (num1 % 2 == 0)
//            System.out.println("Es un número par");
//        else 
//            System.out.println("El número es impar");
//int varNum1 = 1, varNum2 = 4;
//int varNum3 = varNum1 + 6 - varNum2;//Operación.
//        System.out.println("varNum3 = " + varNum3);
//        
//        varNum1 += 1;//Es igual a varNum = varNum1 + 1. Op. de COMPOSICIÓN
//        System.out.println("varNum1 = " + varNum1);
//        
//        // - * / %
//        varNum1 -= 1;
//        System.out.println("varNum1 = " + varNum1);
//        varNum1 *= 2;
//        System.out.println("varNum1 = " + varNum1);
//        varNum1 /= 2;
//        System.out.println("varNum1 = " + varNum1);
//        varNum1 %= 2;
//        System.out.println("varNum1 = " + varNum1);
        //Operadores unarios
//        var varA = 7;
//        var varB = -varA;
//        System.out.println("varA = " + varA);
//        System.out.println("varB = " + varB);
//        
//        //Operador de negación (aplica a los tipos Boolean)
//        
//        var varC = true;//por inferencia de tipos es boolean
//        var varD = !varC;//así se invierte el valor
//        System.out.println("varC = " + varC);
//        System.out.println("varD = " + varD);
//        
//        //Operadores unitarios de incremento y preincremento
//        var varE = 9;
//        var varF = ++varE;
//        System.out.println("varE = " + varE);//Se incrementa en la unidad
//        System.out.println("varF = " + varF);//Tiene el valor incrementado
//        
//        //Postincremento
//        var varG = 3;
//        var varH = varG++;
//        System.out.println("varG = " + varG);//Incrementa la primera variable
//        System.out.println("varH = " + varH);//Mantiene el valor de G
//        
//        //Operadores unarios de decremento. Predecremento
//        var varI = 4;
//        var varJ = ++varI;
//        System.out.println("varI = " + varI);
//        System.out.println("varJ = " + varJ);//El decremento afecta ambas var
//        
//        //Postdecremento
//        var varK = 8;
//        var varL = varK--;
//        System.out.println("varK = " + varK);//Le afecta el decremento
//        System.out.println("varL = " + varL);//guarda el primer valor
        //Operadores de igualdad y relacionales
//        var aNum = 5;
//        var bNum = 4;
//        var Cnum = (aNum == bNum);//Paréntesis opcionales
//        System.out.println("Cnum = " + Cnum);//resultado bool
//        
//        var dNum = aNum != bNum;
//        System.out.println("dNum = " + dNum);
//        
//        var cadenaA = "hello";
//        var cadenaB = "world";
//        var cadenaC = cadenaA == cadenaB;//Hace una comparación de referencia.
//        //No compara el contenido (lo vemos más adelante)
//        System.out.println("cadenaC = " + cadenaC);
//        var fVar = cadenaA.equals(cadenaB);
//        System.out.println("fVar = " + fVar);
//        
//        //Operadores relacionales
//        var varG = aNum >= bNum;
//        System.out.println("varG = " + varG);
//        if (aNum % 2 == 0) {
//            System.out.println("El número es par");
//        }
//        else;{
//            System.out.println("El número es impar");
//        }
//        
//        var edad = 15;
//        var mayorEdad = 18;
//        
//        if (edad > mayorEdad){
//        System.out.println("Usted es mayor de edad");
//        }
//        else {
//                System.out.println("Usted es menor de edad");
//                }
        //Operadores condicionales
//        var valorA = 7;
//        var valorMinimo = 0;//rango del 0 al 10
//        var valorMaximo = 10;
//        var respuesta = valorA >= 0 && valorA <= 10;
//        if (respuesta) {
//            System.out.println("Esta dentro del rango establecido");
//        } else {
//            System.out.println("Esta fuera del rango establecido");
//        }//Click derecho format aparecen las llaves
//
//        //Operador or
//        var vacaciones = false;
//        var diaLibre = true;
//        if (vacaciones || diaLibre) {
//            System.out.println("El padre puede asistir");
//        } else {
//            System.out.println("No podrá asistir");
//        }
        
        //Operador ternario (1°operador a evaluar,2°resultado o valor, 3° regre
        //sa otro valor
        
//        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
//        //      condicion   -evaluación  -resultado
//        System.out.println("resultadoT = " + resultadoT);
//        
//        var numeroT = 7;
//        resultadoT = (numeroT % 2 == 0) ? "El número es par" : "El número es impar";
//        System.out.println("resultadoT = " + resultadoT);
        
          //Prioridad de los operadores
//          var x = 5;
//          var y = 10;
//          var z = ++x + y--;
//          System.out.println("x = " + x);//6
//          System.out.println("y = " + y);//9, lo resta después
//          System.out.println("z = " + z);//16
//          
//          var solucionAritmetica = 4 + 5 * 6 / 3;//14 multiplicación y división
//          //tienen prioridad. Aunque el resultado debería ser 14
//          System.out.println("solucionAritmetica = " + solucionAritmetica);
//          solucionAritmetica = (4 + 5) * 6 / 3;//18, los paréntesis tienen 
//          //prioridad
          //Sacar área y perímetro de un rectángulo
          var ladoA = 7;
          var ladoB = 3;
          var area = ladoA * ladoB;
          System.out.println("El área del rectángulo es: " + area);
          var perímetro = (ladoA + ladoB)* 2;
          System.out.println("El perímetro del rectángulo es: " + perímetro);
          
          var numC1 = 5;
          var numC2 = 6;
          if (numC1 != numC2){
          var elNúmeroMayorEs = (numC1 > numC2) ? "El primer número es mayor" : "El segundo número es mayor";
              System.out.println(elNúmeroMayorEs);
          }//Anide el ternario dentro del if porque necesitaba una tercera opción
          else {
              System.out.println("Los números son iguales");
          }
          
    }

}
