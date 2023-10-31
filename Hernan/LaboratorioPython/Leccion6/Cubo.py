class Cubo:
    """
    DocString: Crear la clase Cubo con los atributos, ancho, alto y profundidad, con
    un método calcular_voliumen que tendrá la fórmula:
    volumen = ancho * altura * profundidad
    que el usuario ingrese los valores
    """
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.alto * self.ancho * self.profundidad

ancho = int(input('Digite el ancho del cubo: '))
altura = int(input('Digite la altura del cubo: '))
profundidad = int(input('Digite la profundidad del cubo: '))

cubo1 = Cubo(ancho, altura, profundidad)
print(f'El volumen del cubo es: {cubo1.calcular_volumen()}')