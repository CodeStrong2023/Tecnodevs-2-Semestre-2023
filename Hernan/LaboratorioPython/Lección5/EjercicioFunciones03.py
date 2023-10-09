# Ejercicio 3: Función Recursiva
# Imprimir números de 5 a 1 de manera descendente usando funcionaes recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5, de imprimir:
# 5
# 4
# 3
# 2
# 1
# Em caso de ser el número 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan números negativos no imprime nada

def impresion_de_numeros(num):
    if num >= 1 & num <= 5:  # Caso base
        print(num)
        impresion_de_numeros(num-1)  # Caso recursivo
    elif num < 1:
        print('Número fuera de rango')


numero = int(input('Ingrese un número: '))
impresion_de_numeros(numero)