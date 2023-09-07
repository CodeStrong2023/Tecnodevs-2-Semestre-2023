# Ejercicio: Calcular la estación del año
mes = int(input('Ingrese el número del mes del 1 al 12: '))
estacion = None
if (mes == 1 or mes == 2 or mes == 3):
    estacion = "verano"
elif (mes == 4 or mes == 5 or mes == 6):
    estacion = "otoño"
elif (mes == 7 or mes == 8 or mes ==9):
    estacion = "invierno"
elif (mes == 10 or mes == 11 or mes == 12):
    estacion = "primavera"
else:
    Estacion = "número no especificado dentro del rango"
print(f"El mes ingresado {mes} corresponde a {estacion}")