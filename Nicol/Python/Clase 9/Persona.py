class Persona:
    def __init__(self, nombre , apellido , edad, dni, *args, **kwargs):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
        self._dni = dni

    #Definimos un método
    def mostrar_detalle(self):
        print(f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad} {self._dni}, la dirección es: {self.args}, los datos importantes son: {self.kwargs}")

#Constructor
persona1 = Persona("Nicol", "Paidican" , 85, 44057662)
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2  = Persona("Osvaldo", "Giordanini", 45)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

#Tarea => print de persona1
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.nombre = "Marisa"
persona1.apellido = "Salinas"
persona1.edad = 45
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.mostrar_detalle()
persona2.mostrar_detalle()

#Persona.mostrar_detalle()
persona1.telefono = '2964789403'
print(persona1.telefono)

persona3 = Persona("Maria", "Funes ", 46, "Teléfono: ", "56768787", "Calle Algarrobos", 356, "Manzana: ", 67, "Casa", 34, Altura=1.70, Peso= 85, CFavorito= "Azul", Auto="Golsito", Modelo= 2018 )
persona3.mostrar_detalle()

persona4 = Persona("Manuel", "Rodrigez ", 32, "Teléfono: ", "2964650562", "Calle Olmos", 3045, "Manzana: ", 5, "Casa", 4, Altura=1.67, Peso= 70, CFavorito= "Amarillo", Auto="Corsa", Modelo= 2015 )
persona4.mostrar_detalle()