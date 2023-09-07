
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; //Inferencia de tipos
        while(conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++; //Vamos aumentando en 1 la variable
        }
        var contador = 0;
        do{
        System.out.println("contador = " + contador);
        contador++;
        }while(contador <= 7);
        
        //Etiquetas Labels. No es recomendable
        inicio:
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 != 0){
                continue inicio;
            }
            System.out.println("contando = " + contando);
        }
    }
}
