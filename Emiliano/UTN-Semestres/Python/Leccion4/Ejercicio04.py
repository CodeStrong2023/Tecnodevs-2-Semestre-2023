#Ejercicio 4: Hacer un programa para sumar numeros pares de un rango.
# Por ejemplo: sumar de numeros pares del 2 al 30      suma = 240

num1 = int(input("Coloque de donde va a comenzar la suma: "))
num2 = int(input("Coloque hasta donde quiere sumar: "))
suma = 0
for i in range(num1, num2+1):
    if i % 2 == 0:
        suma += i #Esto es si el numero es par
print(f"\nLa suma de los numeros pares dentro del rango es {suma}")