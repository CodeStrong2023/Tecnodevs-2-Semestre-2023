# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario
# introduzca un número 0, nuestro programa dejaría de insertar.
# Por último, mostrar los números ordenados de menor a mayor

lista = []  # Creamos un a lista vacía
"""numero = 1  #Inicializamos la variable numero, donde se guardará lo que introduce el usuario
while(numero != 0):    #Mientras numero no sea 0, seguirá guardando números
    numero = int(input("Ingrese un número a la lista: "))
    lista.append(numero)    # Se agregan los números a la lista
lista.sort()    # Usamos la función sort para ordenar
print(lista)    # Imprimimos la lista ordenada"""

# Lo hacemos con bandera
salir = False
while not salir:
    numero = int(input("Digite un número: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort()
print(f"Usted ha ingresado \n{lista}")

