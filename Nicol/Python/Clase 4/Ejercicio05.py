# Ejercicio 5: Factorial de un ´numero prositivo
# Hacer un programa para calcular el factorial de un número positivo
numero = int(input("Digite un número: "))
while numero < 0:
    print("Error - El número debe ser positvo")
    numero = int(input("Digite un número positivo: "))
factorial = 1
for i in range(1,numero+1):
    factorial *= i
print(f"El factorial del número es: {factorial}")