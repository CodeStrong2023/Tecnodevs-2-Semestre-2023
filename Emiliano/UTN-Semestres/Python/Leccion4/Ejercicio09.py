#Ejercicio 9:Hacer un programa donde el usuario ingrese una frese, se le devolverá
#la misma frase pero sin espacios en blanco, y ademas un contador de cuantos
#caracteres tiene la frase sin contar los espacios en blanco
frase1 = input("Coloque una frase: ")
frase2 = " "
for i in frase1:
    if i != " ":
        frase2 += i
frase1 = frase2
print(f"\nFrase final: {frase1}")
print(f"N° de caracteres: {len(frase1)}")

