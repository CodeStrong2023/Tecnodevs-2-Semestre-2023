class Persona:  # Creamos una clase
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  # Se llama init dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni  # este atributo está encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):  # self es igual a this en Java
        print(
            f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad} la dirección es: {self.args}, los datos importantes son: {self.kwargs}")


persona1 = Persona("Ariel", "Betancud", 35453215, 40)  # Necesitamos enviar argumentos
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)

persona2 = Persona("Osvaldo", "Giordanini", 29867043, 45)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")
print(f"Persona \"1\" es: {persona1.nombre} {persona1.apellido} de  {persona1.edad} años")

persona1.nombre = "Liliana"
persona1.apellido = "Buccella"
persona1.edad = 40
print(
    f"El objeto modificado persona1 de la clase persona es {persona1.nombre} {persona1.apellido} su edad es {persona1.edad}")

# Los atributos son: características
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()  # La referencia, en este caso, se pasa de manera automática
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1)  # Debemos pasarle una referencia para el self o dará error
persona1.telefono = '2624532345'
print(f'Este es el teléfono de {persona1.nombre}: {persona1.telefono}')

# print(persona2.telefono)  # El objeto persona2 no posee este atributo
persona3 = Persona('Rogelio', 'Romero', 18065764, 22, 'telefono', '22234564545', 'Calle Lopez', 737, 'Manzana', 7,
                   'Casa', 18,
                   Altura=1.83, Peso=105, CFavorito='Azul', Auto='Citroen', Modelo=2021)
persona3.mostrar_detalle()
# print(persona3._dni)  # esto no debe utilizarse en python, esto dice que lo desconocemos
# print(persona3.__nombre)  # este es un encapsulamiento estricto


