# En esta clase veremos la sentencia if, else.
'''
condicion = True
if condicion == True:
    print("La condición es verdadera") # condiciones no bool, comprueba si esta vacía o no.
elif condicion == False:
    print("La condición es falsa")
else:
    print('La condición esta sin especificar')
'''
# Conversión de número a texto.
'''
num = int(input('Ingrese un número del 1 al 3: '))
numTexto = ''
if num == 1:
    numTexto = 'Número uno'
elif num == 2:
    numTexto = 'Número dos' # No me funciona ctrl + / ...
elif num == 3:
    numTexto = 'Número tres'
else:
    print('El ingreso no se encuentra en rango')
print(f'El número ingresado es {num} - {numTexto}')
'''

condicion = True
'''
if condicion
    print('Es verdadera')
else:
    print('Es falso')
'''
print('Es verdadera') if condicion else print('Es falsa')



