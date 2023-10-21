#Ejercicio 2: Crear una funcion para multiplicar los valores recibidos de tipo numerico
#utilizando argumentos variables *args como parametro de la funcion y regresar por
#por como resultado la multiplicacion de todos los valores pasados como argumentos

def multiplicar_valores(*numeros):
    resultado = 1
    for num in numeros:
        resultado *= num
    return resultado

print(multiplicar_valores(3,10,15,5))    