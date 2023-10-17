# Ejercicio 2: Llenar una lista con los numeros del 1 al 10, luego modificar
# los elementos de la lista multiplicandolos por un valor ingresado por el usuario
lista = list(range(1,11))
print("Lista original")
for i in lista:
    print(i,end="-")
valor = int(input("\nColoque un valor a multiplicar: "))
#Multiplicamos los elementos de la lista
for indice, i in enumerate(lista):#Funciona para modificar los indices de la lista
    lista[indice] *= valor#El iterador solo recorre los indices

print(f"Lista final: {valor}")
for i in lista:
    print(i,end="-")