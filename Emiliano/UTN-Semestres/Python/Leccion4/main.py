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
