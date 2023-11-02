# Comenzamos con funciones

# mi_funcion() No puede llamarse antes de ser definida.

# Definimos una función
def mi_funcion():  # Parámetros
    print("Saludos a todos en la tecnicatura")


mi_funcion()  # Llamamos la función
mi_funcion()  # Debe definirse la función antes de ser llamada
mi_funcion()  # Puede llamarse N veces


# Si la función se define en otro módulo, lo que se hace es importar para poder llamarla.

# Desempaquetado de listas o List Unpacking
def show(name, lastname):
    print(name + ' ' + lastname)


person = ['Ariel', 'Betancud']
show(person[0], person[1])  # Pasamos uno por uno los datos de la lista a la función
show(*person)  # Muestra todo
person2 = ('Osvaldo', 'Giordanini')
show(*person2)
person3 = {"lastname": "Lucero", "name": "Natalia"}
show(**person3)

numbers = [1, 2, 3, 4, 5]  # Aún sin elementos en la lista se ejecuta el else
for n in numbers:
    print(n)
else:  # El else siempre se ejecuta, a menos que se agregue un break antes
    print('Esto se terminó')

# List Comprehension o Lista de Comprensión
names = ['Hernan', 'Pablo', 'Hugo', 'Victoria']
alongP = [h for h in names if h[0] == 'H']  # Esto regresa una nueva lista
print(alongP)  # Devuelve sólo los elementos empezados por h. Extrae pero no modifica los elementos de la lista

# También puede usarse con diccionarios y tuplas
bottleC = [
    {'name': 'Quilmes', 'country': 'Arg'},
    {'name': 'Corona', 'country': 'Mex'},
    {'name': 'Stella Artois', 'country': 'Belgium'}
]
Arg = [b for b in bottleC if b['country'] == 'Arg']
print(Arg)
print(bottleC)


# Paso de argumentos (Funciones)
def miFuncion2(name, lastname):
    print('Saludos a todos los que ven en el canal de YouTube')
    print(f'nombre {name} - apellido {lastname}')


miFuncion2('Jorge', 'Lucero')
miFuncion2('Ariel', 'Betancud')
miFuncion2('Hernán', 'Vega')


# La palabra return en Funciones
def sumar(a, b):
    return a + b


# resultado = sumar(72, 68)
# print(f'El resultado de la suma es {resultado}')
print(f'El resultado es: {sumar(72, 68)}')


# Valores por Default en los parámetros de una función
def sumar2(a=0, b=0):  # Le damos un valor por default
    return a + b


resultado = sumar2()
print(f'La suma con parámetros default es {resultado}')  # Da error si no se da valor por default
print(f'El resultado de la suma es {sumar2(22, 78)}')  # En el mismo print puede pasarse un valor válido


# Argumentos variables en funciones
def listarNombres(*nombres):  # Normalmente se utiliza *args
    for nombre in nombres:  # Se convierte en una tupla
        print(nombre)


listarNombres('Ariel', 'Osvaldo', 'Natalia', 'Hernan', 'Claudia')
listarNombres('Victoria', 'Maria', 'Rosa', 'Alejandra')

def ListarTerminos(**terminos):  # Lo más utilizado es **kwargs (key word argument)
    for llave, valor in terminos.items():
        print(f'\n{llave} : {valor}')

ListarTerminos()  # Nada se va a mostrar
ListarTerminos(IDE='Integrated Develomend Enviroment', PK='Primal Key')
ListarTerminos(nombre='Lionel Messi')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Hernán', 'Pablo', 'Vega']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10)  # tira error. que no es iterable
desplegarNombres((10,11))  # creamos una tupla para iterar valores numéricos
desplegarNombres([22,55])  # se convierte en una lista. Es iterable
desplegarNombres((10,))  # en un sólo elemento no olvidar la coma


# Funciones recursivas
def factorial(numero):
    if numero == 1:
        return 1
    else:
        return numero * factorial(numero-1)  # Caso de recursividad


resultado = factorial(5) #  Lo hacemos en código dura
print(f'El factorial del número 5 es: {resultado}')

factorial2 = int(input('Ingrese un número: \n'))
print(f'El factorial del número {factorial2} es {factorial(factorial2)}')

