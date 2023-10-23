class Cubo:
    """
    Crear la clase Cubo con los atributos, ancho, alto y profundidad, con 
    un metodo calcular_volumen que tendra la formula:
    volumen = ancho * alto * profundidad
    que el usuario ingrse los valores.
    
    """
    def __init__(self,ancho,altura,profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad
        
    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad
    
ancho = int(input("Coloque el ancho del cubo: "))
altura = int(input("Coloque el altura del cubo: "))
profundidad = int(input("Coloque la profundidad del cubo: "))

cubo1 = Cubo(ancho, altura, profundidad)
print(f"El volumen del cubo es: {cubo1.calcular_volumen()}")
        