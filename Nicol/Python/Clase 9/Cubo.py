class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.profundidad * self.alto


ancho = int(input("Digite el ancho: "))
profundidad = int(input("Digite la profundidad: "))
alto= int(input("Digite el alto: "))


cubo = Cubo(ancho, profundidad, alto)

print(f"El volumen del cubo es: {cubo.calcular_volumen()}")