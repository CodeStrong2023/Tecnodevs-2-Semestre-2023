#Tabla de multiplicar
#Hacer un programa que pida un número por teclado y guarde en una lista su tabla de multiplicar hasta el 10.


num = int(input("Digite un número a multiplicar: "))
#tabla vacía
listaDeTabla = []

i = 0

for i in range(0,11):
   listaDeTabla.append(i*num)

print(f"Tabla de multiplicar del número {num}: {listaDeTabla}")