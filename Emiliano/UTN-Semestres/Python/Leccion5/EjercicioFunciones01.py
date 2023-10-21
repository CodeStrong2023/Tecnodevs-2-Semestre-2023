#Ejercicio 1: Crear una funcion para sumar los valores recibidos de tipo
#numericios, utilizando argumentos variables *args como paramereo de la
#funcion y agragar como resultado la suma de todos los valores pasados 
#como argumentos

#Definimos una funcion
def sumarValor(*args): #Recivimos una cantidad de parametros indefinidos 
    resultado = 0
    for valor in args:
        resultado += valor
    return resultado

#Llamamos a la funcion
print(sumarValor(3,4,5))
