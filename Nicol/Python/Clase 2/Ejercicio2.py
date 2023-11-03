'''
Determinar la solución lógica de ((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)
'''
a = float(input('ingrese el valor de a: ')) # Al final, la veracidad depende del valor de las variables.
b = float(input('ingrese el valor de b: '))
resultado = ((3 + 5 * 8 ) < 3 and ((- 6/3 * 4 ) + 2 < 2)) or ( a > b)
print('El resultado lógico es verdadero') if resultado else print('El resultado lógico es falso')