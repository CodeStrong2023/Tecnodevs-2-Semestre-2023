#Desempaquetado de listas o list Unpacking
def show(name,lastName):
    print(name+' '+lastName)
persona = ["Nicol", "Paidican"]
show(persona[0],persona[1])
show(*persona)

persona2 = ("Fabian","Marisa")
show(*persona2)
persona3 = {"lastName":"Halo", "name":"3"}
show(**persona3)

#Repaso forelse

numbers = [1,2,3,4,5]
for n in numbers:
    print(n)
else:
    print("Esto se terminó")

names = ["R0berto", "Carlos", "Jano","Mariano"]
alongP = [p for p in names if p[0] == "P"]
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"}
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)
#Argumentos (funciones)

def mi_funcion2(name, lastName):
    print("Saludos a todos")
    print(f"Nombre: {name}, Apellido: {lastName}")

mi_funcion2("Nicolas","Paidican")

#Palabra return
def sumar(a,b):
    return a + b
resultado = sumar(100, 200)
print(f"El resultadoe es: {resultado}")

def sumar2(a = 20, b =70):
    return a + b
resultado = sumar2()

def listarNombres(*nombres):
    for nombre in nombres:
        print(nombre)

listarNombres('Lucas','Jesus','Natalia','Valentin','Romina')