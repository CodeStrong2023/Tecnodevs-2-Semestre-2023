
# Definimos una funcion

def miFuncion(): #Para identificar a la funcion necesitamos parentesis
    print("Hola Mundo")

miFuncion() #Estamos llamando a la funcion
miFuncion() # Se puede llamar a la funcion N cantidad de veces

# Dsempaquetado de listas o list Unpacking
def show(name,lastname):
    print(name+""+lastname)
persona1 = ["Emiliano","Grossi"]
show(persona1[0],persona1[1])#pasamos uno por uno los datos de la lista a la funcion
show(*persona1)#Lo mismo que lo anterior pero pasamos todo junto
persona2 = ("Tomas","Gonzalez")#A travez de tuplas
show(*persona2)
persona3 = {"Hola","Mundo"}
show(*persona3)

#Repaso for else
nom = [1,2,3,4]
for n in nom:
    print(n)
else:
    print("Se termina")
    
#Lista de compresion

numeros = ["uno","dos","tres","cuatro"]
alongP = [p for p in numeros if p[0] == "P"]#Regresa una nueva lista
print(alongP)

#Paso de argumentos (funciones)
def mifuncion2(name,lastName):
    print("Saludos a mi Hola Mundo")
    print(f"Nombre: {name}, Apellido: {lastName}")
mifuncion2("Tamara","Piccinni")
mifuncion2("Osman","Herrera")

# Palabra return en funciones
def sumar(a,b):
    return a + b
#resultado = sumar(55,33)
#print(f"El resultado es: {resultado}")
print(f"El resultado es: {sumar(20,30)}")

def sumar2(a = 0, b = 0 ):
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(20,40)}")

# Argumentos, variables en funciones
def listaNombres(*nombres): #Normalmente se utiliza: *args
    for nombre in nombres: #Se comvierte en una tupla
        print(nombre)
listaNombres("Lucas","Nicolas","Romina")
listaNombres("Luis","Julian","Tamara")
