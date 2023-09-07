conteoPositivos = 0
conteoNegativos = 0
conteoNeutros = 0
numero = 0
for i in range(10):
    numero = int(input(f"Reslice el ingreso N° \"{i}\":"))
    if numero > 0:
        conteoPositivos += 1
    elif numero == 0:
        conteoNeutros += 1
    else:
        conteoNegativos += 1
print(f"La cantidad de números postivos es de {conteoPositivos} "
      f"el conteo de números negativos es de {conteoNegativos} "
      f"el conteo de números neutros \"0\" es de {conteoNeutros}")
