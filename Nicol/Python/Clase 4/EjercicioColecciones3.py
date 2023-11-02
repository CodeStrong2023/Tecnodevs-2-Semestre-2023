# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del Señor de los anillos
# Nombre: Aragon
# Clase: Guerrero
# Raza: Dunadan del norte

# Nombre: Gamdalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sinder

PersonajesLOTR = []     # Creamos una lista vacía
Personaje = {"Nombre: ": "Aragon", "Clase: ": "Guerrero", "Raza: ": "Dunadan del Norte"}    # Realizamos diccionario con los atributos del personaje
PersonajesLOTR.append(Personaje)
Personaje = {"Nombre: ": "Gandalf", "Clase: ": "Mago", "Raza: ": "Istar"}   # Reutilizamos la variable. Siempre que hicieramos el append primero
PersonajesLOTR.append(Personaje)
Personaje = {"Nombre: ": "Legolas", "Clase: ": "Arquero", "Raza: ": "Elfo Sinder"}  # La variable queda con el último valor, pero la lista se ha ido sumando
PersonajesLOTR.append(Personaje)
print(PersonajesLOTR)   # Imprimimos el resultado
