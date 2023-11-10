# para definir un conjunto
conjunto = set()
conjunto1 = {'Hola'}
conjunto.add(7)
conjunto.add('HOLA')
print(conjunto)
conjunto1.add(9)
print(conjunto1)
print(3 not in conjunto1)

#Hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto)

#Operaciones en conjunto
conjunto3 = conjunto1 | conjunto
print(conjunto3)

conjunto3 = conjunto1 & conjunto
print(conjunto3)

conjunto3 = conjunto1 - conjunto #Asigna el valor que esta en el conjunto1 y no en el conjunto2
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto
print(conjunto3)

conjunto3 = conjunto1 | conjunto
print(conjunto1.issubset(conjunto3))
print(conjunto.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))

print(conjunto3.issuperset(conjunto1))
print(conjunto3.issuperset(conjunto))
print(conjunto.issuperset(conjunto3))

#disconexos
print(conjunto1.isdisjoint(conjunto))

#Convertir un conjunto en inmutable
conjunto1 = frozenset #Esto hace que el conjunto sea inmutable

#Repaso de diccionarios
diccionarioNuevo = {'Azul' : 'Blue', 'Rojo' : 'Red', 'Verde' : 'Green', 'Amarillo' : 'Yellow'}
print(diccionarioNuevo)

#eliminar
del(diccionarioNuevo['Azul'])
print(diccionarioNuevo)

diccionario2 = {'Nicol':{'Edad':21, 'Altura': 1.45}, 'Melina': [21,1.55], 'Nicolas' :[12,1.70]}
print(diccionario2)

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad':36,'Altura':1.70,'Precio':'50 Millones', 'Posición': 'Delantero'},
    11: {'Nombre': 'Di María', 'Edad':34,'Altura':1.80,'Precio':'12 Millones', 'Posición': 'Delantero'},
    24: {'Nombre': 'Tu Abuelo', 'Edad':86,'Altura':1.80,'Precio':'500 Millones', 'Posición': 'Delantero'}

}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

#Pilas usando listas
pila = [1,2,3]

#Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Sacamos elementos desde el final
elementoBorrado = pila.pop()
print(f'Sacamaos el elemento: {elementoBorrado} y la pila quedó así: {pila}')

#Estructuras de datos de tipo fifo
cola = ['Nicol', 'Melina', 'Nicolas', 'Nayla']

#Agregar elementos al final de la cola
cola.append('Nicolas')
cola.append('Marisa')
print(cola)

#Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido: {seRetira}')
print(cola)