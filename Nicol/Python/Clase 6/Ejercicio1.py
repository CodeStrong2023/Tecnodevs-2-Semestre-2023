#No repetir caracteres
#Hacer un programa que pida una cadena por teclado, luego meter los caracteres en una lista sin repetir caracteres


cadena = input("Ingresa una cadena: ")

caracteres_unicos = set()

for caracter in cadena:
    caracteres_unicos.add(caracter)

lista_sin_repeticiones = list(caracteres_unicos)

print("Caracteres sin repetir:", lista_sin_repeticiones)