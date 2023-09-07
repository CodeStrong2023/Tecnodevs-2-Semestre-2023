"""
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la Tecnicatura"
# Python trabaja en ingles, asique figuran como error las palabras en español.
print(miVariable)
miVariable = 3.5  # Importante recordar que python reconoce variables flotates
# con el punto y no la coma a la coma la termina por reconocer como String.
print(miVariable)
# En el foco, aparece el comando reformat file, que ordena el código.
x = 10
y = 2
z = x + y
print(z)
print(id(x))
# Las literales(valores guardados en la memoria ram) se escriben de la
# la siguiente manera "x856", en el caso de la literal 10 que es la
# dirección de memoria.
print(id(y))  # Literal variable y x600
print(id(z))  # Literal varaible z x848
# A esto se le llama "referencia de memoria".

# a: str = 10  # Esta sintaxis es sólo una referencia, ya que no impone un typo de dato.
a = 10  # Esta es la sintaxis normal
print(type(a))  # Esto es una función dentro de otra (función print y función type)
a = 10.75
print(a)
a = True
print(type(a))

# Tipos Int, Float, Bool, String.
print("")
print("Tipos de datos")
x = 10
print(type(x))
x = 14.5
print(type(x))
x = "Hola alumnos"
print(type(x))
x = True
print(type(x))
x = False
print(type(x))
# Manejo de cadenas(Strings).
print("")
miGrupoFavorito = "Patricio Rey y sus Redonditos de Ricota"
caracteristicas = "Los mejores"
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristicas)  # La coma concatena con un espacio.
numero1 = "7"  # número en tipo cadena.
numero2 = "8"
print(int(numero1) + int(numero2))  # Así forzamos suma de cadenas.

# Tipos booleanos (bool)
miBooleano = 3 > 2
print(miBooleano)
if miBooleano:
    print("El resultado es Verdadero")
else:
    print("El resultado es falso")
# Prcesar entrada del usuario
# Función input()
# resultado = input("Digite un número ")
# print(resultado)
# Input regresa un dato de tipo String

# Conversión de la entrada de datos de la función input
numero1 = int(input("Escribe el primer número: "))
numero2 = int(input("Escribe el segundo número: "))
resultado = numero1 + numero2
print("Eñ resultado de la suma es:", resultado)
"""
"""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
# print(operandoA + operandoB)
# interpolación de variables
print(f"La suma de las variables es igual a: {suma}")  # interpolación

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")  # f es format. Sirve para incluir variables en una cadena
multiplicacion = operandoA * operandoB
print(f"Los números multiplicados son: {multiplicacion}")
division = operandoA / operandoB
print(f"La división de los números es: {division}")
division = operandoA // operandoB
print(f"La división de enteros(int) de los números es: {division}")  # Extrae el entero
modulo = operandoA % operandoB
print(f"El módulo o residuo de los números es: {modulo}")
exponente = operandoA ** operandoB
print(f"El resultado del exponente es {exponente}")
"""
'''
ancho = int(input("Ingrese el ancho de la figura: "))
alto = int(input("Ingrese el alto de la figura: "))
area = ancho * alto
perimetro = (alto + ancho) * 2
print(f"El perímetro de la figura es: {perimetro}")
print(f"El área de la figura es: {area}")
'''
'''
# operadores de asignación y comparación

miVariable3 = 10
print(miVariable3)
# Operadores de reasignación
miVariable3 = miVariable3 + 1  # incremento con reasignación
print(miVariable3)
miVariable3 += 1
print(miVariable3)
miVariable3 -= 2
print(miVariable3)
miVariable3 *= 3
print(miVariable3)
miVariable3 /= 2
print(miVariable3)
# Operadores de comparación
d = 4
b = 2
resultado = d == b  # Expresión. 1ro se evalúa lo que está a la derecha o los paréntesis.
print(resultado)
# operador diferente
resultado = d != b
print(resultado)

# operador mayor que
resultado = d > b
print(resultado)

#operador menor que
resultado = d < b
print(resultado)

# operador menor o igual que
resultado = d <= b
print(resultado)

# operador mayor o igual que
resultado = d >= b
print(resultado)
'''
# Ejercicio par o impar
"""
num = int(input("Ingrese un número a analizar: "))
print(f"El residuo de la división es: {num %2}")
if num % 2 == 0:
    print("El número ingresado es un número par")
else:
    print("El número ingresado es impar")
"""
"""
# Ejercicio número 2 - Mayor de edad

edad = int(input("Ingrese su edad "))
print(f"Su edad actual es de {edad}")
edadAdulto = 18
if edad >= edadAdulto:
    print(f"Eres mayor de edad con {edad} años")
else:
    print(f"No eres mayor de edad con {edad} años")
"""
"""
a = True
b = True
# Operador lógico "and"
resultado = a and b
print(resultado)
# Operador lógico "or"
resultado = a or b
print(resultado)
# Operador lógico "not"
resultado = not a
print(resultado)
"""
"""
#  Ejercicio valor dentro de un rango
valor = int(input("Ingrese un valor entre 0 a 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f"El valor {valor} se encuentra dentro del rango determinado")
else:
    print(f"El valor {valor} no se encuentra dentro del rango determinado")
"""

# Ejercicio operador or. Preguntar si un padre puede ir al partido de su hijo
# utilizar estructura if else
# Verificar si esta de vacaciones o de día libre.
# Imprimir.
# Operador not.
"""
vacaciones = False
diaLibre = False
if not (vacaciones or diaLibre):#Si devuelve True, not va a devolver False.
    print(f"El padre puede ir al partido de su hijo.")
else:
    print("Todavía tienes trabajo que hacer.")
"""
# Rango entre edades de 20 y 30 años
# Preguntar al usuario
# Usar los operadores and y or para saber si se está dentro del rango

#edad = int(input("Ingrese su edad: "))
#veinte = edad >= 20 and edad <= 30
#treinta = edad >= 30 and edad <= 40
"""
if veinte or treinta:
    if veinte:
        print(f"Con {edad} años de edad, estas dentro de los 20s")
    elif treinta:
        print(f"Con {edad} años de edad, estas dentro de los 30s")
    else:
        print(f"Con {edad} no estas dentro de los 20s ni de los 30s")
else:
    print(f"Con {edad} no estas dentro de los 20s ni de los 30s")
"""
"""
#Sintaxis Simplificada.
if (20 <= edad < 30) or (30 <= edad < 40):
    print(f"Con {edad} años, entras en el rango")
else:
    print(f"Con {edad} años, no entras dentro del rango")
"""
# Ejercicio: El mayor de dos números.
# Solicitar dos valores: numero1 y numero2.
# Se debe imprimir el mayor de los números.
# La salida debe decir "Digite el valor para número1/2.
# numero mayor = numeroMayor.
"""
numero1 = int(input("Digite el valor para número1: "))
numero2 = int(input("Digite el valor para número2: "))
if numero1 > numero2:
    print(f"El número mayor es {numero1}")
elif numero2 > numero1:
    print(f"El número mayor es {numero2}")
else:
    print("Los números son iguales")
"""
# Ejercicio: Tienda de libros.
# Pedir digite nombre, id, precio y envio del libro.
# Imprimir.
nombreLibro = input("Digite nombre del libro: ")
idLibro = int(input("Ingrese ID del Libro: "))
precio = float(input("Digite precio del libro: "))
envio = input("Indique si el envío es gratuito: ")
if bool(envio) == True:
    envio = True
elif envio == False:
    envio = False
else:
    print("Debe escribir True o False")
print(f'''
        Nombre: {nombreLibro}
        ID: {idLibro}
        Precio: {precio}
        Envío Gratuito: {envio}
''')