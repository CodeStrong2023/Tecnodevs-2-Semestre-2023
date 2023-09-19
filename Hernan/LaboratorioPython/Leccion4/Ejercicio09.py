# Ejercicio 9: Mostraruna frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le
# devolverá la misma frase pero sin espacios en blancom y
# además, un contador de cuántos caracteres tiene la frase
# (sin contar los espacios en blanco)
# Ejemplo:      frase = vivir por siempre en paz
#               frase final = vivirporsiempreenpaz
#               N° de caracteres = 20
frase1 = input("Ingrese una frase: \n")
frase2 = ""     # Poner un espacio en frase 2 suma un caracter extra. Por lo que inicialicé la variable vacía
for letra in frase1:
    if letra != " ":        # Se omite incluir el espacio en frase2
        frase2 += letra
    frase1 = frase2
    print(f"\n Frase final: {frase1}")
    print(f"\n N° de caracteres: {len(frase1)}")