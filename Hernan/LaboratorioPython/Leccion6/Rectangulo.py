class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base.
    El nombre del método será calucular área. utilizaremos la fórmula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por
    el usuario y los objetos deben ser tres.
    """
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura

base = int(input('Digite el número para la base del rectángulo 1: '))
altura = int(input('Digite el número para la altura del rectángulo: '))
rectangulo1 = Rectangulo(base, altura)
print(f'El area del rectángulo es: {rectangulo1.calcular_area()}')

base = int(input('Digite el número para la base del rectángulo 2: '))
altura = int(input('Digite el número para la altura del rectángulo: '))
rectangulo2 = Rectangulo(base, altura)
print(f'El area del rectángulo es: {rectangulo2.calcular_area()}')

base = int(input('Digite el número para la base del rectángulo 3: '))
altura = int(input('Digite el número para la altura del rectángulo: '))
rectangulo3 = Rectangulo(base, altura)
print(f'El area del rectángulo es: {rectangulo3.calcular_area()}')
