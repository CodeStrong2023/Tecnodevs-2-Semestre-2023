# Ejercicio 4: Sumar núeros pares dentro de un rango
# Hacer un programa para sumar números pares dentro
# de un rango, por ejemplo:
#                           Suma de números pares del 2 al 30
#                           Suma = 240
a = int(input("Digite el comienzo de la suma: "))
b = int(input("Digite el final de la suma: "))
suma = 0
for i in range(a,b+1):
    if i % 2 == 0:
        suma += i
print(f"La suma de los números pares es: {suma}")