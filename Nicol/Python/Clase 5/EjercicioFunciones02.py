# Ejercicio 2: Función con * args para multiplicar
# Crear una función para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumentos
def multiplicacion_de_numeros(*numeros):
    # Pongo resultado valor 1 porque toda multiplicación por 0 es 0
    resultado = 1
    for valor in numeros:
        resultado *= valor
    return resultado


print(multiplicacion_de_numeros(2, 2, 2))
