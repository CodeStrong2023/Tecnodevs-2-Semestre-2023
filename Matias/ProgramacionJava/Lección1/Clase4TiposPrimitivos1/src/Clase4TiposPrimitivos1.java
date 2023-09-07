
public class Clase4TiposPrimitivos1 {
    public static void main(String[] args) {
        //Clases siempre empiezan con MAYÚSCULA.
        //Tipo Byte
        byte numEnteroByte = (byte)129;
        /*Al poner un tipo entre paréntesis antes del valor, estamos
        forzando a converitir en ese tipo
        */
        System.out.println("Valor mínimo del Byte" + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte" + Byte.MAX_VALUE);
        /*Se realiza una "PÉRDIDA DE PRECISIÓN" al convertir los tipos
        cuando el valor ingreaasdo supera el valor máximo de la variable.
        En el caso que sigue, al forzar el formato BYTE, encontramos que
        ,al superar el valor de los números positivos, utiliza espacios de
        los números negativos.
        */
        System.out.println(numEnteroByte);
        numEnteroByte = 127;
        
        //Tipo Short
        short numEnteroShort = (short)32768;
        System.out.println("Valor mínimo del Short" + Short.MIN_VALUE);
        System.out.println("Valor máximo del SHort" + Short.MAX_VALUE);
        System.out.println(numEnteroShort);
        numEnteroShort = 32000;
        
        //Tipo Int (Entero)
        int numEnteroInt = (int)2147483648L;/*no tiene solución forzando clase
        solamente. Debe añadirse "L" al final de la literal para solucionar este
        error. La letra "L" corresponde a la clase Long. Se utiliza, por
        convención y buenas prácticas, la letra "L" en mayúscula, para evitar
        confundirla con un uno. Sin embargo, la perdida de presición se ocurre
        de todas formas.
        
        */
        System.out.println("Valor mínimo del Int" + Integer.MIN_VALUE);
        System.out.println("Valor máximo del Int" + Integer.MAX_VALUE);
        System.out.println(numEnteroInt);
        numEnteroShort = 32000;
        
        //Tipo Long
        long numEnteroLong = (long)9223372036854775807L;/*Este es el número
        máximo para usar como entero. Java toma por defoult el tipo int
        por lo que es necesario agregar "L" al final. Si necesitamos trabajar
        con números mayores necesitamos los tipos FLOAT.
        */
        System.out.println("Valor mínimo del Long" + Long.MIN_VALUE);
        System.out.println("Valor máximo del Long" + Long.MAX_VALUE);
        System.out.println(numEnteroLong);
        
        //Tipo Float
        float numFloat = (float)3.4028235E39D;/*El tipo default es de Double, 
        por ello debe ponerse (float) o la "F" al final. "E" es de Exponente.
        */
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor mínimo de Float es" + Float.MIN_VALUE);
        System.out.println("El valor máximo de Float es" + Float.MAX_VALUE);
        numFloat = 3.402823E3F;
        
        //Tipo Double. El más grande en Java y es el que usa por Defalut.
        double numDouble = 1.7976931348623157E308;
        System.out.println("El valor mínimo del Double es" + Double.MIN_VALUE);
        System.out.println("El valor máximo del Double es" + Double.MAX_VALUE);
        
        
    }
    
}
