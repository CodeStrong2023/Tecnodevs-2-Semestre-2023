# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3.
nums = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
for num in nums:
    if (num % 3 == 0):
        print(num)

# Ejercicio 2: Crear un rango de números de 2 a 6 e imprímelos
print(nums[2:7])  # Pongo 7 porque 6 termina en el 5 y no cumple la consigna

# Ejercicio 3: Crear un rango de 3 a 10 pero que el incremento sea de 2 en 2, en vez de 1 en 1
print(nums[3:10:2])

# _____________________________________________________________________________________________
# Resolución del vídeo

# Ejercicio 1:
print('Crear rango del 0 al 10 con números divisibles por 3')
for i in range(11):
    if i % 3 == 0:
        print(i)

# Ejercicio 2:
print('Rango con valores de inicio = 2 y final = 6')
for i in range(2, 6):
    print(i)

# Ejercicio 3:
print('Rango de 3 a 10 con incremento de 2 en 2')
for i in range(3, 11, 2):
    print(i)
