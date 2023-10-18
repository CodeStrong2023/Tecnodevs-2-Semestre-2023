#Ejercicio 10: Hacer un programa que pida una cadena por teclado, luego 
# meter los caracteres en una lista sin reoetir carateres
cadena = input("Coloque una cadena: ")
lista = []
for i in cadena:
    if i not in lista:
        lista.append(i)#Lo agregamos a la lista
print(f"\nLista de caracteres sin repetir nuinguno: \n {lista}")
        