#Ejercicio 3: Pedir numeros y meterlos en una lista, cuando el usuario
#introduzca un numero 0, nuestro programa dejaria de insertar.
#Por ultimo mostrar los numeros ordenados de menor a mayor

lista = []
salir = False


while not salir:
    num = print(input("Coloque un numero: "))
    if num == 0:
        salir = True
    else:
        lista.append(num)
lista.sort() #Ordena la lista
print(f"\nLista ordenada: \n{lista}")

