class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalle(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property  # decorador
    def nombre(self):  # Método getter
        print('Estamos usando el método get')
        return self._nombre

    @property
    def apellido(self):
        return self._apellido

    @property
    def edad(self):
        return self._edad

    @nombre.setter
    def nombre(self, nombre):  # Método Setter
        print('Estamos usando el método set')
        self._nombre = nombre

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')


if __name__ == '__main__':
    persona1 = Persona2('Ariel', 'Betancud', 41)
    print(persona1.nombre)  # Llamamos al método getter

    persona1.nombre = "Juan Pedro"  # Llamamos al método setter
    print(persona1.nombre)  # No es necesario poner paréntesis para acceder a los métodos get y set
    print(persona1.mostrar_detalle())
    # Atributo read-only (sólo lectura) seria la edad porque no tiene el método set
    print(persona1.edad)

    # Tearea crear tres objetos más utlizando los métodos getter and setter
    # para modificar y mostrar los cambios con el método mostrar_detalle

    # Objeto 1 de la tarea
    persona2 = Persona2('Hernan', 'Vega', 34)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Pablo'
    persona2.apellido = 'Quevedo'
    persona2.edad = 33
    print(persona2.mostrar_detalle())

    # Objeto 2 de la tarea
    persona3 = Persona2('Maria', 'Arancibia', 34)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Victoria'
    persona3.apellido = "Abrahan"
    persona3.edad = 33
    print(persona3.mostrar_detalle())

    persona4 = Persona2('Lucas', 'Pesalaccia', 33)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Jesús'
    persona4.apellido = 'Perez'
    persona4.edad = 34
    print(persona4.mostrar_detalle())

    print(__name__)
