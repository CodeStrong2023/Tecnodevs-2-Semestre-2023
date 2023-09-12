# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación
# elimine los elemntos repetidos. Por último mostrar la lista.

# Creamos una lista
lista = ["gato", "perro", "loro", "gato", 1, 3, 5, 5, 9, 1]
print(lista)

conjunto = set(lista)   # Convierte la lista en conjunto (el conjunto elimina los duplicados)
print(conjunto)

lista = list(conjunto)
print(f"Los elementos de la lista sin duplicados son: {lista}")

# lista = list(set(lista))  # Así se hace en una sola línea. Lista el conjunto que conjunta la lista. Funciona como un filtro
# print(lista)