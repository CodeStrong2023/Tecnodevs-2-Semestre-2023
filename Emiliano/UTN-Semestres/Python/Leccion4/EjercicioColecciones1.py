# Ejercicio 1: Eliminar duplicados de una lista 
# Escriba un programa donde tenga una lista y a continuacion
#elimine los elementos repetidos, por ultimo mostrar la lista

#creamos una lista 
lista = [2,4,6,8,"siete","nueve",4,2,2,"nueve"]
conjunto = set(lista) #Convertimos la lista a un conjunto de tipo set
lista = list(conjunto) #Convertimos el conjunto a una lista
print(lista)
