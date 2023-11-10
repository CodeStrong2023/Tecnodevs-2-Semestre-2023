#Sumar números pares dentro de un rango
#Hacer un programa para sumar números pares dentro de un rango.

a = int(input("Digite desde donde va a comenzar la suma: "))
b = int(input("Diget hasta donde quiere llegar a sumar: "))

#Inicializamos la variable suma en 0
suma = 0
#Iteramos el rango definido
for i in range(a,b+1):
    if i%2 == 0:
        suma += i

print(f"La suma de los números pares dentro del rango {a}-{b} es: {suma}")