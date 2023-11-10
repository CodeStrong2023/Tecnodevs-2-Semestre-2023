
def listarTerminos(**terminos):
    for llave, valor in terminos.items():
        print(f"{llave}:{valor}")


listarTerminos()
listarTerminos(IDE = "Integrated Develoment Enviroment", PK = "Primary Key")
listarTerminos(Nombre = "Leonel Messi")

#Definimos una función desplegarNombres
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Tito", "Pedro", "Carlos"]
desplegarNombres(nombres2)
desplegarNombres("Carla")
desplegarNombres((10,11))
desplegarNombres([22,55])
#Funciones recursivas
def factorial(numero):
    if numero == 1:
        return 1
    else:
        return numero * factorial(numero -1)
numeroFactorial = int(input("Digite un número: "))
resultado = factorial(numeroFactorial)
print(f"El factorial del número 5 es: {resultado}")