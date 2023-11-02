# Ejercicio 01: Crear una funci´n para sumar los valores recibidos de tipo
# numéricos, utilizando argumentos variables *args como parámetro de la
# Función y agregar como resultado la suma de todos los valores pasados
# como argumentos.
def sumar_valor(*args):  # la cantidad de parámetros es indefinidos
    resultado = 0
    # pass sirve para dejar vacía una función sin que aparezca error
    # iteramos cada elemento
    for valor in args:
        resultado += valor
    return resultado  # Retorna el valor sumado


# Llamamos a la función

print(sumar_valor(3, 5, 9, 5, 7, 9))
