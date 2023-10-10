nombres = ["Nicol","Hernan","Emiliano","Matias"]
#arranca desde la posicion 0
#Nicol->0,Hernan->1,Emiliano->2,Matias->3
print(nombres)
print(nombres[0:2]) #recorre posicion 0 a 1, el 2 no lo toma
print(nombres[ :3]) #desde el indice 0 al 3 incluido
print(nombres[1: ]) #desde el indice indicado hasta el final
#modificamos un indice de la lista, cambiamos de nombre
nombres[3] = "Federico"
nombres[0] = "Ezequiel"
print(nombres)
#mostrar lista vertical, nombre por nombre separados verticalmente
for nombre in nombres: #nombre singular, nombres plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

#Preguntamos la cantidad de elementos en la lista
print(len(nombres)) #ponemos los parametros de la lista

#agreamos un elemento
nombres.append("Tomas")
print(nombres)

#agregamos un elemento en un indice especificado
nombres.insert(1, "Liliana")
print(nombres)
nombres.insert(3, "Ana")
print(nombres)

#eliminar un elemento
nombres.remove("Liliana")
print(nombres)

#eliminar el ultimo elemento
nombres.pop()
print(nombres)

#eliminar el indice especificado
del nombres[1]
print(nombres)

#eliminar, borrar, limpiar todos los elementos
nombres.clear()
print(nombres)

#eliminar lista
del nombres
print(nombres)
#verificamos como trabajar en git
