#EMostrar una frase sin espacios y contar su longitud
#Hacer un programa donde el usuario ingrese una frase, se le devolverá la misma frase pero sin espacios en blanco, y además
#un contador de cuántos caracteres tiene la frase (sin contar los espacios)

frase1 = input("Digite una frase: ")
frase2 = " "


for i in frase1:
    if i != " ":
        frase2 += i

frase1 = frase2
print(f"La frase final es: {frase1}")
print(f"La frase tiene {len(frase1)}")