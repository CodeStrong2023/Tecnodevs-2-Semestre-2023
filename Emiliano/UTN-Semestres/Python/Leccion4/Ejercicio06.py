#Ejercicio 6: hacer un programa que pida un numero por teclado y guarde
#en una lista su tabla de multiplicar hasta el 10. Por ejemplo: 
#                                      si digita el 5 la lista es: 5,10,15,20,25

num = int(input("Coloque un numero: "))
lista = []
for i in range(1,11):
    lista.append(i*num)
print(f"\nTabla de multiplicar del {num}: \n {lista}")
for indice,i in enumerate(lista):
    print(f"{num} X {i} = {lista[indice]}")#Para ver formato de la tabla de multiplicar