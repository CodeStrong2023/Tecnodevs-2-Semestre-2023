# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuación
# Cree las siguientes listas (en las que no deben haber repeticiones)
# 1 Lista de palabras que aparecen en las listas
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aparecen en que aparecen en ambas listas

animales1 = ["perro", "gato", "elefante", "gato", "codorniz", "elefante"]
animales2 = ["gacela", "chita", "gato", "codorniz", "marmota"]

ConjuntoAnimales1 = set(animales1)  # Primero convertimos las listas a conjuntos
ConjuntoAnimales2 = set(animales2)  # Esto elimina las repeticiones y ayuda a trabar los elementos

ListaCompletaAnimales = list(ConjuntoAnimales1 | ConjuntoAnimales2)     # Agrupamos las dos lista
print(f"La lista completa de animales es: {ListaCompletaAnimales}")
SoloLista1 = list(ConjuntoAnimales1 - ConjuntoAnimales2)    # Restamos los elementos repetidos de la primera lista
print(f"Los elementos que aparencen en la lista 1 y no en la dos son: {SoloLista1}")
SoloLista2 = list(ConjuntoAnimales2 - ConjuntoAnimales1)    # Restamos los elementos repetidos de la segunda lista
print(f"Los elementos que aparencen en la lista 2 y no en la uno son: {SoloLista2}")
ListaEnComun = list(ConjuntoAnimales1 & ConjuntoAnimales2)      # Encontramos los elementos en común
print(f"La lista de los elementos en común son: {ListaEnComun}")
