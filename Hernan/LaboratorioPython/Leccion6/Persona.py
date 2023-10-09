class Persona: # Creamos una clase
    def __init__(self,nombre,apellido,edad):  # Se llama init dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")

persona1 = Persona("Ariel", "Betancud", 40)  # Necesitamos enviar argumentos
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)

persona2 = Persona("Osvaldo","Giordanini",45)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

print(f"Persona \"1\" es: {persona1.nombre} {persona1.apellido} de  {persona1.edad} años")

persona1.nombre = "Liliana"
persona1.apellido = "Buccella"
persona1.edad = 40
print(f"El objeto modificado persona1 de la clase persona es {persona1.nombre} {persona1.apellido} su edad es {persona1.edad}")

# Los atributos son: características
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle()
