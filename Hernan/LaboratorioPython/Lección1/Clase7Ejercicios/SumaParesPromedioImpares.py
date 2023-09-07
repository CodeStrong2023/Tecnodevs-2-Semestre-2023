# Sumar números pares y promedio de impares
sumaPares = 0
sumaImpares = 0
conteoImpares = 0
promedioImpares = 0
cantidadNumeros = int(input("Ingrese la cantidad de números a ingresar: "))
for i in range(cantidadNumeros):
    numeros = int(input(f"Ingrese la posición \"{i+1}\": "))
    if numeros % 2 == 0:
        sumaPares += numeros
    elif numeros % 2 != 0:
        sumaImpares += numeros
        conteoImpares += 1
promedioImpares = sumaImpares / conteoImpares
print(f"La suma de los números pares es de {sumaPares} y el promedio de"
      f" los números impares es {promedioImpares}")