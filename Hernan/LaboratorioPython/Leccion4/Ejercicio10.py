# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres

cadena = input('Ingrese una cadena: \n')
lista = []  # Lista vacía
for i in cadena:    # Recorrer cadena
    if i not in lista:  # Si el interador no está en lista
        lista.append(i)     # Se agrega caracter que no esté en la lista previamente
print(f'La cadena sin caracteres repetidos es: \n {lista}')