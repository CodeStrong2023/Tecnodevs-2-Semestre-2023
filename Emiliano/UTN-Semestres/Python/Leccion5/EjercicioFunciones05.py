#Ejercicio 5: realizar dos funciones para convertir de grados celsius a fahrenheit y viseversa

def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32

def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9

celsius = float(input("Coloque el valor de celsius: "))
resultado = celsius_fahrenheit(celsius)
print(f"{celsius} C a F = {resultado:.2f}")

fahrenheit = float(input("Coloque el valor de fahrenheit: "))
resultado = fahrenheit_celsius(fahrenheit)
print(f"{fahrenheit} F a C = {resultado:.2f}")