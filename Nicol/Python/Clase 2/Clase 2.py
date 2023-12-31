#eliminar una tupla

# Tipo set
planetas = {'Marte', 'Jupiter', 'Venus'}

print(len(planetas))


print('Marte' not in planetas)

#Agregar un elemento
planetas.add('Tierra')
print(planetas)

#Eliminar elementos
planetas.remove('Jupiter')
print(planetas)
planetas.discard('Tierra')
print(planetas)

#Limpiar set
planetas.clear()
print(planetas)

del planetas

#Diccionario
#'Maradona' :10 Un diccionario esta compuesto por dos elementos
# Una llave y un valor
# dict(key, value)
diccionario = {
    'IDE' : 'Integrated Development Enviroment',
    'POO' : 'Programación Orientada a objetos',
    'SABD': 'Sistema de administración de base de datos'
}
#Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

#Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

print(diccionario.get('POO'))
print(diccionario.get('SABD'))

#Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

#Como recorrer los elementos
for termino in diccionario:
    print(termino)

for termino, valor in diccionario.items():
    print(termino,valor)

#Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino)

for valor in diccionario.values():
    print(valor)


print('IDE' in diccionario)

#Agregar un elemento
diccionario['PK'] = 'Primary key'
print(diccionario)

#Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

#Vaciar un diccionario
diccionario.clear()
print(diccionario)

#Eliminar un diccionario
del diccionario

#Concatenamos listas
lista1 = [1,2,3,]
lista2 = [4,5,6,]
lista3 = lista1 + lista2
print(lista3)

lista3.extend([7,8,9])
print(lista3)

print(lista3.index(5))

#valores repetidos hay dento de una lista
print(lista3.count(1))

#Para poner al revés una lista
lista3.reverse()
print(lista3)

lista3 = lista3 * 2
print(lista3)

#Método de ordenamiento
lista3.sort() #Ordena los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True)
print(lista3)

#Una tupla puede contener todos tipos de datos
tupla = (4,'hola',6.78,[1,2,78],4,'Hola')
print(tupla)

print(4 in tupla) #Nos dará verdadero o falso