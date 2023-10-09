# Ejercicio 5: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados celsius
# a fahrenheit y viseversa
# Investigar las fórmulas (°F = (°C * (9/5) +32) || °C = (°F-32) * (5/9)


def transformar_a_fahrenheit(grados_celsius):
    grados_f = grados_celsius * (9/5) + 32
    return grados_f


def transformar_a_celsius(grados_fahrenheit):
    grados_c = (grados_fahrenheit - 32) * (5/9)
    return grados_c


opcion = 0

while True:
    print('\n¿Qué desea hacer?')
    opcion = int(input('1 - pasar de grados Celcius a Fahrenheit \n'
                       '2 - pasar de grados Fahrenheit a Celsius \n'
                       '3 - salir de la aplicación \n'))
    if opcion == 1:
        celsius = float(input('Ingrese los grados celcius a transformar: '))
        transformar = transformar_a_fahrenheit(celsius)
        print(f'{celsius:.2f}°C equivalen a {transformar:.2f}°F')
    elif opcion == 2:
        fahrenheit = float(input('Ingrese los grados fahrenheit a transformar: '))
        transformar = transformar_a_celsius(fahrenheit)
        print(f'{fahrenheit:.2f}°F equivalen a {transformar:.2f}°C')
    elif opcion == 3:
        print('Gracias por usar el convertidor')
        break
    else:
        print('Opción no válida')