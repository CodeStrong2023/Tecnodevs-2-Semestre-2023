# las listas se los conoce como arreglos o vectores

# lista = 1 , 3 , 6

numeros = [3,6,9,12,15]
print(numeros[0])
print(numeros[2])
print(numeros[-1])
print(numeros[-2])

#print(numeros[0,3]) # Indice a mostrar: 0,1 y 2

# Modificamos un valos
numeros[2] = 83
print(numeros)

# Iterar una lista
for num in numeros:
    print(num)
else:
    print("Se acabaron los elementos de la lista")

# Preguntamos cuantos elementos tiene una lista
print(len(numeros))#Le pasamos como parametro nuestra lista

#Agregamos un elemento
numeros.append(100)
print(numeros)

#Insertar un elemento en un indice especifico
numeros.insert(0,200)
print(numeros)

#Eliminamos un elemento
numeros.remove(200)
print(numeros)

#Eliminar el ultimo elemento
numeros.pop()
print(numeros)

#Eliminamos un indice especifico
del numeros[2] # del(eliminar)
print(numeros)

#Eliminar todos los elementos
numeros.clear()
print(numeros)

#Eliminar la lista
del numeros

#Definimos una tupla
cocina = ("cuchara","cuchillo","tenedor")
print(len(cocina))

#Acceder a un elemento
print(cocina[2])

#Acceder a un rango
#print(cocina[0,-1])

#Recorremos los elementos de la tupla
for cocinar in cocina:
    print(cocinar, end=" ")#Usamos end para eliminar los saltos de linea
    
#Tipo set
colores = {"rojo","azul","lila"}

#Revisar si un elemento existe dentro del set
print("azul" in colores)

#Agregar un elemento
colores.add("amarillo") # add es una funcion

#Eliminar elemento
colores.remove("lila")
colores.discard("Rojo") # Esta funcion no nos presenta ningun error si nos equivocamos en el nombre

#Eliminar set o conjunto
del colores

# Un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key,value)
diccionarioNum ={
    1:"uno",
    2:"dos",
    4:"cuatro"
}

#Acceder a un diccionario con la llave
print(diccionarioNum[1])
print(diccionarioNum.get[4])

#Modificamos elemento
diccionarioNum[2] = "DOS"

# Funcion para recorrer un diccionario
for termino, valor in diccionarioNum.items():
    print(termino, valor)
    
#Mostrar solo llaves
for termino in diccionarioNum.keys():
    print(termino)
    
#Comprobar existencia de un elemento
print("hola" in diccionarioNum)

#Agregar un elemento
diccionarioNum[8] = "ocho"

#Eliminamos
del diccionarioNum

#Lista con diferentes tipos de datos
listaEjemplo = [1, 10, 100]
listaEjemplo.append("Hola")
listaEjemplo.append([30, 300])
listaEjemplo.append(True)
listaEjemplo.append(10.25)

#Concatenamos listas
lista1 = [1,2,3]
lista2 = [4,5,6]
lista3 = lista1 + lista2

#Funcion para agregar elementos a una lista
lista3.extend([7,8,9])

# Funcion para ubicar en que indice esta el valor ingresado
print(lista3.index(3))

#Cuantos valores repetidos hay dentro de una lista
print(lista3.count(1))

#Para poner al rever una lista
lista3.remove() #ordena de manera descendente

#Para que una lista repita sus elementos
lista3 = lista3 * 2

#Metodo de ordenamiento
lista3.sort() #ordena de manera ascendente

lista3.sort(reverse=True) #ordenar de manera descendente

#Las tuplas son listas inmutables, es decir, no se pueden modificar
tuplaEjemplo = (2,"ejem",7.77,"hola"[1,3,4])


#Para definir un conjunto
conjunto2 = set()
conjunto1 = {}
conjunto1.add(100)
conjunto2.add(7)#agregamos 
conjunto2.add("Hola")
print(3 not in conjunto1)#Preguntamos si en numero 3 no esta en el conjunto1

#Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2)

#Opreraciones en conjuntos

# -Union de conjuntos-
conjunto3 = conjunto1 | conjunto2 #La linea une a los conjuntos

conjunto3 = conjunto1 & conjunto2 #Que elemento tienen en comun

conjunto3 = conjunto1 - conjunto2 #Asigna el valor que esta en el conjunto1 y no en el conjunto2

conjunto3 = conjunto1 ^ conjunto2 #Son los elementos que no comparten y que son diferentes entre ambos

conjunto3 = conjunto1 | conjunto2 
print(conjunto2.issubset(conjunto3))# Preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto2))
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))# Preguntamos si los elementos del conjunto1 estan dentro del conjunto3
                                    # si es verdadero quiere decir que el conjunto3 es un superconjunto

# Como saber si ambos conjuntos son disconexos, esto es si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2))

# Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset #Esto hace que el conjunto sea totalmente inmutable, no se puede agregar
                      # ni modificar ni eliminar elementos del conjunto 

seleccionArgentina ={
    10: {"Nombre" : "Lionel Messi", "Edad" : 35, "Altura" : 1.70, "Precio" : "50 Millones", "Posicion" : "Extremo Derecho"},
    11: {"Nombre" : "Angel Di Maria", "Edad" : 34, "Altura" : 1.80, "Precio" : "12 Millones", "Posicion" : "Extremo Derecho"},
    24: {"Nombre" : "Paulo Dybala", "Edad" : 28, "Altura" : 1.77, "Precio" : "10 Millones", "Posicion" : "Media Punta"},
    19: {"Nombre" : "Nicolas Otamendi", "Edad" : 34, "Altura" : 1.83, "Precio" : "7 Millones", "Posicion" : "Defensa Central"},
    1: {"Nombre" : "Emiliano Martinez", "Edad" : 30, "Altura" : 2.01, "Precio" : "15 Millones", "Posicion" : "Portero"},
    34: {"Nombre" : "Enzo Fernandez", "Edad" : 24, "Altura" : 1.75, "Precio" : "10 Millones", "Posicion" : "Medio Campo"},
    15: {"Nombre" : "Julian Alvarez", "Edad" : 23, "Altura" : 1.71, "Precio" : "16 Millones", "Posicion" : "Extremo Derecho"},
}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)
    
print("En el diccionario hay una cantidad de ",end=" jugadores")
print(len(seleccionArgentina))

# Pilas usando listas
pila = [1,2,3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Sacamos elementos por el final
elementoBorrado = pila.pop()# Quita el ultimo elemento y lo guarda en la variable
print(f"Sacamos el elemento {elementoBorrado}")
print(f"La pila ahora quiedo asi: {pila}")

#Colas con listas
#Estructura de datos de tipo fifo( first input / first output)
cola = ["primero","segundo","terceto","cuarto","quinto"]

#Agregamos elementos al final de la cola
cola.append("sexto")

#Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f"Atendido el {seRetira} cliente")

seRetira = cola.pop(0)
print(f"Atendido el {seRetira} cliente")

seRetira = cola.pop(0)
print(f"Atendido el {seRetira} cliente")





