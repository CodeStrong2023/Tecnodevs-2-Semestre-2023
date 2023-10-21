class Persona: #Creamos una clase
    def __init__(self,nombre,apellid,edad): #Se lo llama metodo init Dunder
        self.nombre = nombre
        self.apellido = apellid
        self.edad = edad
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")

persona1 = Persona("Emiliano","Grossi",19)
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona("Ariel","Betancud",40)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

#(TAREA)
persona2 = Persona("Emiliano","Grossi",19)
print(f"El objeto de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.nombre = "Liliana"
persona1.apellido = "Buccella"
persona1.edad = 40
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.mostrar_detalle()
persona2.mostrar_detalle()