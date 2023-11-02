# Llenar una lista:
# con números del 1 al 50,
# mostrar la lista con el ciclo For
# deben mostrarse de la siguiente manera: 1-2-3... etc

"""
lista = []
i = 1
while(i <= 50):
    lista.append(i)
    i += 1
"""
lista = list(range(1,51))   # Algoritmo más eficaz
for i in lista:
    print(i,end='-')

# Abreviatura