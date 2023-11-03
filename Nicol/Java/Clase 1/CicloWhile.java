public class CicloWhile {
    public static void main(String[] args){
        var conteo = 0; // Inferencia de tipos
        while(conteo < 7){
            System.out.println("Conteo = " + conteo);
            conteo++; // Aumenta en uno la variable
        }

        // Ciclo Do While
        var contador = 0;
        do{
            System.out.println("Contador = " + contador);
            contador++;
        }while(contador < 6);

        // Ciclo For
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 == 0){
                System.out.println("Contando = " + contando);
                break;
            }
            
        }

        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 != 0){
                continue; 
            }
            System.out.println("Contando = " + contando);
        }

        // Etiquetas labels
        inicio:
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 != 0){
                continue; // Vamos a la siguiente iteracion
            }
            System.out.println("Contando = " + contando);
        }

    }
}