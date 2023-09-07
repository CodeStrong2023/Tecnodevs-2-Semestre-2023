# En esta clase veremos la sentencia if/else
'''
condicion = "Hola alumnos"
if condicion == True:
    print("La condición es verdadera")
elif condicion == False:
    print("La condición es falsa")
else:
    print("La condición esta sin espeficar")
'''
# Conversión de número a texto
num = int(input("Ingrese un número del 1 al 3: "))
numTexto = ''
if num == 1:
    numTexto = " - número uno"
elif num == 2:
    numTexto = " - número dos"
elif num == 3:
    numTexto = " - número tres"
else:
    print(f"Lo ingresado ({num}) no se encuentra dentro de las especificaciónes del requerimiento")
print(f"El número ingresado es {num}{numTexto}")