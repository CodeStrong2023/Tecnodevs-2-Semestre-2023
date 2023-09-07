# Listas

nombres = ['Ariel', 'Naty', 'Osvaldo', 'Hernán']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[2])
print(nombres[3])
print(nombres[-1])  # Puede recorrerse para atrás
print(nombres[0:2])  # Rango de muestra (Primer y segundo valor antes del indice 2); 0 y 1
print(nombres[:3])  # No es necesario poner el 0
print(nombres[0:])  # Si no se pone el segundo número se recorre hasta el final

# Modificación de un valor de la lista

nombres[2] = 'Liliana'
print(nombres)
nombres[1] = 'Natalia'
print(nombres)
# Iterar una lista
for nombre in nombres:  # La primer variable es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Preguntamos cuantos elementos tiene la lista
print(len(nombres))  # Le pasamos como parámetro nuestra lista
nombres.append('Marcelo')  # Se ingresa al final. El efecto se llama COLA
print(nombres)

# Insertar un nuevo elemento en un índice específico
nombres.insert(1, 'Alberto')  # Insert ubica un elemento en un índice específico
print(nombres)
nombres.insert(3, 'Débora')
print(nombres)

# Eliminamos elemento de la lista
nombres.remove('Alberto')
print(nombres)
nombres.pop()  # Borra el último de la lista, no el último ingreso
print(nombres)
del nombres[2]  # Eliminación de un índice específico
print(nombres)

# Eliminar, borrar o limpiar la lista de todos los elementos
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
# print(nombres)

# ____________________________________________________________________________________________

# Tuplas
# Las listas son mutables(modificables), pero las tuplas no. Son inmutables

cocina = ('cuchara', 'cuchillo', 'tenedor')
print(cocina)
print(len(cocina))

# Acceder a un elemento de una Tupla
print(cocina[0])
print(cocina[-1])

# Acceder a un rango de una Tupla
print(cocina[0:2])
# Ejemplo
# verduras = ('papa') # Si no se pone la coma es leido como String
# verduras = ('papa',) # Con la coma sí es una Tupla, aunque sea un sólo elemento

# Recorremos los elementos de una Tupla

for cocinar in cocina:
    # print(cocinar) # Print esta usando \n para realizar salto de línea
    print(cocinar, end=' ')  # end=' ' finaliza \n por lo que se imprime seguido
    # agregando un espacio

# cocina[0] = 'plato' # No puede hacerse una modificación en la tupla, nos muestra la original
print(cocina)

# Conversión de lista a tupla y de tupla a lista(intentar evitarlo, no es buena práctica)

cocinaLista = list(cocina)
print(cocinaLista)
cocinaLista[0] = 'plato'
cocina = tuple(cocinaLista)
print(cocina)
# no appent, remove, pop, etc. Pero puede eliminarse

# Eliminar una Tupla
# del cocina

# Tipo set
planetas = {'Marte', 'Jupiter', 'Venus'}
print(len(planetas))  # usamos la función len = lengh

# Revisar si un elemento esta dentro del set
print('Marte' not in planetas)

# Agregar un elemento
planetas.add('Tierra')  # Usamos .add para agregar un elemento
planetas.add('Marte')  # No agrega elementos duplicados
print(planetas)

# Sirve para evitar elementos duplicados.

# Eliminar elementos. Puede presentar un error si el elemento no existe
planetas.remove('Jupiter')  # Tira error si no existe el elemento
print(planetas)
planetas.discard('Tierra')  # No da error ante la falta del elemento
print(planetas)

# Limpiar Set
planetas.clear()
print(planetas)

# Eliminar Set
del (planetas)
# print(planetas)

# Diccionario. Esta compuesto por dos elementos
# LLAVE y VALOR asociado (key,value)
diccionario = {
    'IDE': 'Integrated Development Environment',
    'POO': 'Programación Orientada a Objetos',
    'SABD': 'Sistema de Admnistración de Base de Datos'
}
print(diccionario)
print(len(diccionario))  # No tiene índices, se accede por key

# Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))
print(diccionario.get('IDE'))

# Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario['IDE'])

# Como recorrer elementos
for termino in diccionario:  # Sólo puede recorrer las llaves
    print(termino)
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario

for termino in diccionario.keys():
    print(termino)  # Muestra solo las llaves
for valor in diccionario.values():
    print(valor)  # Muestra los valores sin las llaves

# Comprobar la existencia de un elemento en el diccionario
print('IDE' in diccionario)  # Devuelve un booleano

# Agregar un elemento al diccionario
diccionario['PK'] = 'Primary key'
print(diccionario)  # No acepta llaves duplicadas. Sobrescribe el antiguo valor

# Eliminar un elemneto
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario
# print(diccionario)

# Concatenar Listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2
print(lista3)
lista3.extend([7, 8, 9])    # Se usa para agregar varios valores
print(lista3)
print(lista3.index(5))      # Función para buscar en la lista. Si no está en la lista genera error
print(lista3.count(1))      # Conteo de valores repetidos
lista3.reverse()     # Invertir indices de la lista
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista = [1,2,3] * 2     # Repite la lista, no la multiplica
print(lista)
lista3 = lista3 * 2

# Metodos de Ordenamiento
lista3.sort()
print(lista3)
lista3.sort(reverse=True)
print(lista3)

# Repaso TUPLAS
tupla = (4, 'hola', 6.4, [1, 2, 68], 4, 'hola')     # Puede tener diferentes tipos de
# datos
print(tupla)

# Buscar elementos en la tupla
print('hola' in tupla)
print('hola' not in tupla)

# Repaso de set o conjunto
# Para definir un conjunto
conjunto2 = set()
conjunto1 = {"bye"}
conjunto2.add(7)
conjunto2.add("HOLA")       # No admite valores repetidos
conjunto2.add("hola")
print(conjunto2)
conjunto1.add("hola")
print(conjunto1)
print(3 not in conjunto1)       # Pregunta si el número 3 está en el conjunto1.

# Como hacer la igualdad de los conjuntos.
print(conjunto1 == conjunto2)       # Devuelve un valor booleano

# Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2
print(conjunto3)

# Intersección
conjunto3 = conjunto1 & conjunto2
print(conjunto3)        # Muestra los elementos repetidos (Elemento en común)

conjunto3 = conjunto1 - conjunto2       # Asigna conjunto1 y no el conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1       # Asigna conjunto2 y no el conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2
print(conjunto3)        # Elementos que no se comparten entre conjuntos

conjunto3 = conjunto1 | conjunto2
print(conjunto3)
print(conjunto1.issubset(conjunto3))        # Si un conjunto es un subconjunto dentro de otro.
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1))      # Si los elementos están dentro del conjunto3
print(conjunto3.issuperset(conjunto2))      # De estar, conjunto3 sería un superconjunto
print(conjunto1.issuperset(conjunto3))

print(conjunto1.isdisjoint(conjunto2))      # Pregunta si son disconexos. no hay cosas en común

# Convertir un conjunto en inmutable
conjunto1 = frozenset       # No se pueden agregar ni eliminar elementos del conjunto.

# Repaso de diccionario
diccionarioNuevo = {"azul": "blue", "rojo": "red", "verde": "green", "amarillo": "yellow"}

# Eliminar elementos del diccionario
del (diccionarioNuevo["azul"])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {"Ariel": {"edad":40,"altura":1.83}, "Osvaldo": [45,1.85], "Natalia": [35,1.67]}
print(diccionario2)

seleccionArgentina = {
    10: {"Nombre": "Lionel Messi", "Edad": 35, "Altura": 1.70, "Precio": "50 millones", "Posición": "Extremo Derecho"},
    11: {"Nombre": "Angel Di Maria", "Edad": 34, "Altura":1.80, "Precio": "12 millones", "Posiión": "Extremo Izquierdo"},
    24: {"Nombre": "Paulo Dybala", "Edad": 28, "Altura": 1.77, "Precio": "35 millones", "Posición": "Media Punta"},
    19: {"Nombre": "Nicolas Otamendi", "Edad": 34, "Altura": 1.83, "Precio": "3.5 millones", "Posición": "Defensor Central"},
    1 : {"Nombre": "Franco Armani", "Edad": 35, "Altura": 1.89, "Precio": "3.5 millones", "Posición": "Arquero"},
    22: {"Nombre": "Lautaro Martinez", "Edad": 26, "Altura": 1.77, "Precio": "90 millones", "Posición": "Delantero Centro"},
    20: {"Nombre": "Alexis Mac Allister", "Edad": 24, "Altura": 1.74, "Precio": "40 millones", "Posición": "Mediocampista"},
    4 : {"Nombre": "Gonzalo Montiel", "Edad": 26, "Altura": 1.75, "Precio": "4.8 millones", "Posición": "Lateral Derecho"},
    5 : {"Nombre": "Leandro Paredes", "Edad": 29, "Altura": 1.82, "Precio": "9.1 millones", "Posición": "Centrocampista"},
}
for llave, valor in seleccionArgentina.items():
    print(llave,valor)

print("Tenemos cargados en Selección Argentina la cantidad de: ", end=" ")
print(len(seleccionArgentina))

# Método pilas
pila = [1, 2, 3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacar elementos desde el final
pila.pop()      # Elimina el último elemento
print(pila)
elementoQuitado = pila.pop()
print(f"Sacamos el elemento: ", elementoQuitado)
print(f"La pila quedó de la siguiente manera: ", pila)

# Colas con listas (metodo fifo = first input / first output)
cola = ["Ariel","Osvaldo","Liliana","Pilar"]

# Agregamos elementos al final de la lista
cola.append("Natalia")
cola.append("José")
print(f"Así quedó nuestra lista", cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f"Atendido: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido: {seRetira}")
print(cola)