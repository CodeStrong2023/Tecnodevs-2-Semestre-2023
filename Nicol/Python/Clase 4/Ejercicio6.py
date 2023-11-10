#Ejercicio 6: Insertar elementos y ordenarlos
#Pedir números y meterlos en una lista, cuando el usuario introduzca un número 0, nuestro programa dejaría de insertar
#por último, mostrar los números ordenados de menor a mayor

lista = []
salir = False
while not salir:
    numero = int(input('Digite un número: '))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
#Ordenaremos los elementos de la lista
lista.sort()
print(lista)
seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad':36,'Altura':1.70,'Precio':'50 Millones', 'Posición': 'Delantero'},
    11: {'Nombre': 'Di María', 'Edad':34,'Altura':1.80,'Precio':'12 Millones', 'Posición': 'Delantero'},
    24: {'Nombre': 'Tu Abuelo', 'Edad':86,'Altura':1.80,'Precio':'500 Millones', 'Posición': 'Delantero'}

}
for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')