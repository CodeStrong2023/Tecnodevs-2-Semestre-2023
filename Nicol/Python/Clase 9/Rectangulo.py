class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    #Método para calcular el área
    def area(self):
        return self.base * self.altura

#Pedimos los datos al usuariobase = int(input("Digite la base del rectangulo: "))
altura = int(input("Digite la altura del rectangulo:"))


rectangulo = Rectangulo(base, altura)

print(f"El area del rectangulo es: {rectangulo.area()}")