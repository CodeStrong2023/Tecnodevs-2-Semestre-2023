# Ejercicio 7: Juego adivina el número
# Realizar un juego para adivinar un número. Para ello se debe
# generar un número aleatorio entre 1 - 100, y luego ir pidiendo
# número indicando "es mayor" o "es menor" según sea mayor o menor
# con respecto a N, El proceso termina cuando el usuario acierta
# y allí se debe mostrar el número de intentos.
import random
numeroAleatorio = random.randint(0,100) #   0 a 100 literal
contador = 0
while True:
    numero = int(input("Digite un número: "))
    if numero < numeroAleatorio:
        print("\t El número ingresado es menor, digite un número mayor")
        contador += 1
    elif numero > numeroAleatorio:
        print("\t El número ingresado es mayor, digite un número menor")
        contador += 1
    else:
        print("\t\t ¡FELICIDADES! HAS ENCONTRADO EL NÚMERO")
        contador += 1
        break
print(f"\t\t El número de intentos realizados es: {contador}")

