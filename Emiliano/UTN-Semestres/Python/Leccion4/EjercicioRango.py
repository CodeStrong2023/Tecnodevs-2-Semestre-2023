import math #Importamos la clase math pata hacer uso de la clase sqrt(raiz cuadrada)

# Ejercicio 1: iterar un rango de 0 a 10 e imprimir numeros divisibles entre 10.

# for i in range(11):
#     if i % 3 == 0:
#         print(i)

# Ejercicio 2: crea un rango de numeros de 2 a 6 e imprimelos.

# for i in range(2, 7):
#     print(i)

# Ejercicio 3: crea un rango de 3 a 10 pero con incremento de 2 en 2.
#for i in range(3, 11, 2):
#   print(i)

# Ejercicio 4: dada la siguiente tupla crea una lista que solo incluya numenos menores a 5
tupla = (12, 1, 8, 3, 2, 5, 8)
lista = []
for numero in tupla:
    if numero < 5:
     lista.append(numero)
print(lista)

# Ejercicio: Sacar la raiz cuadrada de un numero positivo
numero = int(input("Coloque un numero: "))
while numero < 0:
    print("Incorrecto, debe ser numero positivo")
    numero = int(input("Coloque un numero positivo: "))
print(f"\nLa raiz cuadrada es {math.sqrt(numero):.2f}")