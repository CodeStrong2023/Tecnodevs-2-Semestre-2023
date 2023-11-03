# Ciclo While (mientras o durante)
"""contador = 0
while contador < 68:
    print("Ejecutamos nuestro ciclo while")
    contador += 1
else:
    print("Termina ciclo while")"""
# Imprimir números del 0 al 5 con ciclo while
"""contador = 0
while contador <= 5:
    print(contador)
    contador += 1"""
# Imprimir números del 5 al 0 con ciclo while
"""contador = 5
while contador >= 0:
    print(contador)
    contador -= 1"""
# Ciclo for
"""cadena = "hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")"""
# Palabra reservada break
"""for letra in "Alemania":
    if letra == "a":
        print(f"Letra encontrada {letra}")
        break
else:
    print("fin del ciclo for")"""
# Palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f"valor {i}")
for i in range(6):
    if i % 2 != 0:
        continue
    print(f'valor {i}')
