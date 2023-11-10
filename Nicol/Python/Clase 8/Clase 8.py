class Persona:
    def __init__(self, nombre , apellido , edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    #Definimos un método
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")

#Constructor
persona1 = Persona("Nicol", "Paidican" , 21)
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2  = Persona("Osvaldo", "Giordanini", 45)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.nombre = "Marisa"
persona1.apellido = "Salinas"
persona1.edad = 45
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.mostrar_detalle()
persona2.mostrar_detalle()