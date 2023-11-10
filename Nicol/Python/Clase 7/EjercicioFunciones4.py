#Ejercicio 4: Convertidor de temperaturas
#Realizar dos funciones para convertir de grados celsius a fahrengeit y viseversa

#celsius a fahrenheit
def celcius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32

#fahrenheit a celsius
def fahrenheit_celcius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9

celcius = float(input("Digite el valor de celsius: "))
resultado = celcius_fahrenheit(celcius)
print(f"{celcius} C a F = {resultado:.2f}")

fahrenheit = float(input("Digite el valor de fahrenheit: "))
resultado = fahrenheit_celcius(fahrenheit)
print(f"{fahrenheit} F a C = {resultado:.2f}")