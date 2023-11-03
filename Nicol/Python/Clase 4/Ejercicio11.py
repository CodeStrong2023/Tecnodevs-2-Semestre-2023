# Ejercicio 11: Agenda telefónica
# Hacer un progrma que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor
# sea el teléfono, el programa tendrá el siguiente menú de opciones:
#       1. Nuevo contacto
#       2. Borrar contacto
#       3. Ver contactos existentes
#       4. Salir
agenda = {}
while True:
    print('1. Nuevo contacto')
    print('2. Borrar contacto')
    print('3. Ver contactos existentes')
    print('4. Salir')
    opcion = int(input('Elija una opción: \n')) # Transformar primero en int es importante
    if opcion == 1:
        nombre = input('\nIngrese nombre del contacto: \n')
        telefono = input('\nIngrese número de teléfono: \n')
        if nombre not in agenda:    # Si el nombre no está en la agenda se agrega
            agenda[nombre] = telefono   # Se agrega en el diccionario el valor de nombre como key y el de teléfono como value
            print('\nEl contacto se agregó de forma exitosa\n')
        else:
            print('\nNo es posible agregar el contacto\n')
    elif opcion == 2:
        nombre = input('\nIngrese el nombre del contacto a eliminar: \n')
        if nombre in agenda:
            del (agenda[nombre])    # Se borra el elemento del diccionario
            print('\ncontacto eliminado\n')
        else:
            print(f'\nno existe contacto {nombre} en la agenda\n')
    elif opcion == 3:
        print('\nAgenda de contactos\n')
        for clave, valor in agenda.items(): # Se utiliza .items para que sea mostrado tanto key como value
            print(f'Nombre: {clave} - Teléfono: {valor}\n1') # Se utiliza clave y valor para mostrar ambos
    elif opcion == 4:
        print('\nGracias por utilizar su agenda de contactos\n')
        break
    else:
        print('\nEl valor ingresado no está en el menú \n')
