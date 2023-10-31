class Persona2:
    def __init__(self, nombre, apellido, edad):
        self.nombre = _nombre
        self.apellido = _apellido
        self.edad = _edad
        
    def mostrar_detalle(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property #Decorador
    def nombre(self): #Metodo Getter
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre): #Metodo Setter
        self._nombre = nombre
        
    @property
    def apellido(self):
        return self._apellido
    
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
        
    @property
    def edad(self):
        return self._edad
    
    @edad.setter
    def edad(self,edad):
        self._edad = edad
        
    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")
        
if __name__ == "__main__":
    persona1 = Persona2("Emiliano","Grossi",19)
    print(persona1.nombre())#Llamamos al metodo Getter
    persona1.nombre = "Juan"#Llamamos el metodo Setter
    print(persona1.nombre)
    print(persona1.mostrar_detalle())#Llamamos el metodo mostrar_detalle
    # Atributo read-only seria la edad porque no tiene el metodo set
    #persona1.edad = 40 # no se debe hacer
    print(persona1.edad)

    #Tarea: crear 3 objetos mas, utilizando los metodos getter and setter
    # para modificar y mostrar los cambios con el metodo mostrar detalles

    persona2 = Persona2("Ramon","Flores",39)
    persona2.nombre = "Pepe"
    persona2.apellido = "Ventira"
    persona2.edad = 31
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    print(persona2.mostrar_detalle())

    persona3 = Persona2("Julian","Alvarez",19)
    persona3.nombre = "Luis"
    persona3.apellido = "Gomez"
    persona3.edad = 23
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    print(persona3.mostrar_detalle())

    persona4 = Persona2("Juan","Martos",25)
    persona4.nombre = "Martin"
    persona4.apellido = "Garcia"
    persona4.edad = 27
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    print(persona4.mostrar_detalle())

    print(__name__)

        
        
    