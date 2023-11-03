'''
Ejercicio 1:
Pasar una expresión matemática a una expresión algorítmica (hacerla en código)
'''
a = float(input('Digite el valor de a: '))
b = float(input('Digite el valor de b: '))
c = float(input('Digite el valor de c: '))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
print(f'El resultado es : {resultado}')