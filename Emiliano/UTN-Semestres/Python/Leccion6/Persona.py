class Persona: #Creamos una clase
    def __init__(self,nombre,apellid,dni,edad,*args,**kwargs): #Se lo llama metodo init Dunder
        self.nombre = nombre
        self.apellido = apellid
        self._dni = dni #Este atributo esta encapsulado de manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
    def mostrar_detalle(self):
        print(f"La clase Persona tiene los siguientes datos: {self.nombre} {self._dni} {self.apellido} {self.edad}, la direccion es: {self.args}, los datos importantes son: {self.kwargs}")

persona1 = Persona("Emiliano","Grossi",34956788,19)
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona("Ariel","Betancud",40339433,40)
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

# Persona.mostrar_detalle(persona1) Debemos pasarle una referencia para el self o dara un error 
persona1.telefono = "12345"
print(f"Telefono: {persona1.telefono}") #Hemos creado un atributo de un objeto

# print(persona2.telefono)  El objeto persona no tiene este atributo, da error  
persona3 = Persona("Rogelio","Romero",45654344,22,"Telefono","12365476","Calle Lopez",897,"Manzana",77, "Casa",18, Altura=1.82,Peso=100,CFavorito="Azul",Auto="Citroen",Modelo=2021)
persona3.mostrar_detalle()
# print(persona3._dni)  Esto no se debe utilizar(esta encapsulado)
# persona3.__nombre    Esta totalmente encapsulado