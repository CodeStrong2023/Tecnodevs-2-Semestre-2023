# Ejercicio 2: Modificar los elementos de una lista
# Llenar una lista con los números del 1 al 10, luego modificar los
# elementos de la lista multiplicándolos por un valor ingresado por el usuario

lista = list(range(1,11))   # De forma abreviada creamos la lista

for i in lista[0:8]:    # Mostramos la lista con terminación de guiones (-1)
    print(f"{i}",end="-")
print(lista[9])     # Mostramos el último elemento de la lista fuera del ciclo para que no aparezca el último guión
valor = int(input("\n Digite un número a multiplicar: "))

for indice,i in enumerate(lista):
    lista[indice] *= valor      # Realizamos la multiplicación

for i in (lista[0:9]):
    print(i, end= "-")
print(lista[9])     # Mostramos el último elemento de la lista fuera del ciclo para que no aparezca el último guión