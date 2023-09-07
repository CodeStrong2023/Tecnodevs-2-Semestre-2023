# Sumar los N primeros números ingresados
hasta = int(input("Ingrese un número: "))
suma = 0
i = 0
for i in range(hasta):
    suma = suma + i
    print(suma)