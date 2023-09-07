# Dada la siguiente Tupla
tupla = (13, 1, 8, 3, 2, 5, 8)  # definimos la tupla
# Crear una lista que sólo contenga los números menores a 5
# E imprima por consola 1, 3, 2
lista = []
for tup in tupla:
    if tup < 5:
        lista.append(tup)
print(lista, end=', ')
