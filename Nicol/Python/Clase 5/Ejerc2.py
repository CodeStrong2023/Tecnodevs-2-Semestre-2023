#Factorial de un número positivo
#Hacer un programa para calcular el factorial de un número positivo


num = int(input("Digite un número: "))

while num <0:
    print("Error => El número debe ser positivo")
    num = int(input("Digite otro número: "))

factorial = 1
for i in range(1,num + 1):
    factorial *= i

print(f"El factorial del número {num} positivo ingresado es: {factorial}")