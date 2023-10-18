#Ejercicio 11: Hacer un programa que simule una agenda de contactos. Crear un diccionario
#desde la clave sea el nombre del usuario y el valor sea el telefono, el programa tengra
#el siiguiente menu de opciones
#       1.Nuevo contacto
#       2.Borrar contacto
#       3.Contactos existentes
#       4.Salir
agenda = {}
while True:
    print("\tMENU")
    print("1.Nuevo contacto")
    print("2.Borrar contacto")
    print("3.Contactos existentes")
    print("4.Salir")
    opcion = int(input("Coloque la opcion de menu: "))
    if opcion == 1:
        nom = input("Coloque el nombre del contacto: ")
        num = input("Coloque el numero del contacto: ")
        if nom not in agenda:
            agenda[nom] = num
            print("Contacto agregado!!")
        else:
            print("El nombre de contaco ya existe")
    elif opcion == 2:
        nom = input("Coloque el nombre del contacto: ")
        if nom in agenda:
            del (agenda[nom])
            print("Se ha eliminado exitosamente!!")
        else:
            print("Contaco no existente")
    elif opcion == 3:
        print("Agenda de contacto")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Telefono: {valor}")
    elif opcion == 4:
        print("Gracias por utilizar su agenda de contacto")
        break
    else:
        print("Opcion de menu incorrecto")
        print("")
        