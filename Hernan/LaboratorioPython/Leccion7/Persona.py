class Persona():  # Esta clase hereda de la clase Object
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self):  # overrite o sebreescribir
        return f'Persona: [ Nombre: {self.nombre}, Edad {self.edad} ]'

class Empleado(Persona):  # Esta clase es hija de la clase Persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo



    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [ Sueldo: {self._sueldo} ], {super().__str__()}'


empleado1 = Empleado("Ariel", 40, 75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)
# print(empleado1.sueldo) # Se encapsuló el atributo

# tarea: encapsular los elementos y crear los métodos getter and setter
# Crear otro objeto, pasar los datos para nombre, edad y sueldo
# Mostrar esos datos, modificarlos y luego mostrarlos nuevamente

empleado2 = Empleado("Guardiola", 54, 570000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)