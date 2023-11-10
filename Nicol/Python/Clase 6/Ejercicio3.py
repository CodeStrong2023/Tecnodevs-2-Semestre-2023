#Crear una función para sumar los valores recibidos de tipo numéricos, utilizando argumentos variables *args como parametros de la
#función y agreagar como resultado la suma de todos los valores pasados
#como argumentos.

#Definimos la función sumarValores
def sumarValores(*args):
    resultado = 0
    for valor in args:
        resultado += valor
    return resultado

print(sumarValores(3,5,9,2,1))