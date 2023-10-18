#Ejercicio 5: Hacer un programa para calcular el factorial de un numero positivo

num = int(input("Coloque un numero: "))
while num < 0:
    print("Error, el numero tiene que ser positivo")
    num = int(input("Coloque un numero: "))
factorial = 1 
for i in range(1,num+1):
    factorial *= i
print(f"\nEl factorial del numero {num} ingresado es: {factorial}")