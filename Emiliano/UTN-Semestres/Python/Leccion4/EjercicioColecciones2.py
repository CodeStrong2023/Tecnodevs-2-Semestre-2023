# Ejercicio 2: Operaciones de conjunto con listas
# Escriba un programa que tenga 2 listas y a continuacion cree las siguentes listas (sin repeticion)
# 1 Lista de palabras que aparecen en las listas 
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda 
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aparecen en ambas listas  

lista1 = [1,4,5,7,4,2,5,9]
lista2 = [9,3,5,7,6,2,3,3]

# Eliminamos elementos repetidos
conjunto1 = set(lista1)
conjunto2 = set(lista2)

# -- 1 Lista de palabras que aparecen en las listas --
union = list(conjunto1 | conjunto2) 

# -- 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda --
solo1 = list(conjunto1 - conjunto2)

# -- 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera --
solo2 = list(conjunto2 - conjunto1)

# -- 4 Lista de palabras que aparecen en ambas listas --
ambas = list(conjunto1 & conjunto2)  