#Ejercicio 7: Realiza un juego para adivinar el numero. Para ello se debe
#generer un numero aleatorio entre 1 - 100, luego ir pidiendo  
#numero indcado "es mayor" o "es menor" segun sea mayor o menor con respecto a N
#El proceso termina cuando el usuario acierta y alli se debe mostrara el numero de intentos.
import random
print("\n.:Juego adivina el numero:.")
aleatorio = random.randint(0,100) #Numero aleatorio
contador = 0
while True:
    num = int(input("Coloque un numero: "))
    contador += 1
    if num > aleatorio:
        print("\tNo es el numero, coloque un numero menor")
    elif num < aleatorio:
        print("\tNo es el numero, coloque un numero mayor")
    else:
        print(f"FELICIDADES, adivinaste el numero {aleatorio}")
        break
print(f"\nNumeros de intentos: {contador}")
