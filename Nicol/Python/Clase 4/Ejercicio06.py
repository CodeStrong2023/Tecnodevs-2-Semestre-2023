# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y muestre
# en una lista su tabla de multiplicar
# si digita el n° 5 entonces sería: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50.
numero = int(input("Ingrese un número para proveer tabla de multiplicar: ")) #  Pedimos que se ingrese un número
tablaDeMultiplicar = [] #   Creamos una lista vacía
i = 1
for i in range(1,11): # Realizamos un ciclo for
    tablaDeMultiplicar.append(i * numero)
print(f"La tabla de multiplicar es la siguiente: \n {tablaDeMultiplicar} \n")
for indice, i in enumerate(tablaDeMultiplicar): #    Recorremos la tabla de multiplicar con un nuevo iterador
    print(f"{numero} X {indice+1} = {tablaDeMultiplicar[indice]}") #    Si pongo i n vez de índice da el número
    #   directo de la multiplicación, para usar el contador debo poner índice+1, dado que, de no ponerlo, la tabla
    #   comienza con 0 X N.
    #   OBSERVACIÓN: De quitar i, el programa responde error. i funciona como los valores de la multiplicación, mientras
    #   que índice es tanto el iterador del ciclo como el índice de la lista.