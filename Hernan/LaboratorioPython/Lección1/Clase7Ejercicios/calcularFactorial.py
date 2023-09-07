# Calcular factorial de un número N

numero = 0
while numero == 0:
    numero = int(input("Digite un número positivo: "))
factorial = 1
for i in range(numero + 1):
    if i == 0:
        i = 0
    else:
        factorial *= i
print(f"El factorial de el número {numero} es {factorial}")