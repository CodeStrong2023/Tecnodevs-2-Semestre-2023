class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property
    def nombre(self):
        print('Estamos utilizando método get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        print("Estamos utilizando el método set")
        self._nombre = nombre

    # Tarea definir los getter y setter de apellido y edad

    # Getter y setter del atributo apellido
    @property
    def apellido(self):
        print("Estamos utilizando un método get")
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        print("Estamos utilizando el método set")
        self._apellido = apellido

    # Getter y setter del atributo edad
    @property
    def edad(self):
        print("Estamos utilizando un método get")
        return self._edad

    @edad.setter
    def edad(self, edad):
        print("Estamos utilizando el método set")
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')

if __name__ == ' main ':
    persona1 = Persona2("Ariel", "Bentacud", 41)
    print(persona1.nombre)
    persona1.nombre = "Juan Pedro"
    print(persona1.nombre)
    print(persona1.mostrar_detalles())
    print(persona1.edad)

    # Tarea: Crear tres objetos más
    persona2 = Persona2("Romina", "Zuber", 26)
    persona3 = Persona2("Jesus", "Castro", 21)
    persona4 = Persona2("Carlos", "Salinas", 82)

    # Objeto 1
    persona2.nombre = "Romina"
    persona2.apellido = "Zuber"
    persona2.edad = 26
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.mostrar_detalles()

    # Objeto 2
    persona3.nombre = "Jesus"
    persona3.apellido = "Castro"
    persona3.edad = 21
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.mostrar_detalles()

    # Objeto 3
    persona4.nombre = "Carlos edgardo"
    persona4.apellido = "Salinas"
    persona4.edad = 82
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona4.mostrar_detalles()

print(__name__)