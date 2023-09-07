# Sistema de Calificaciones.
calificacion = int(input("Ingrese su calificación: "))
notaAlfabetica = ""
if 0 < calificacion <= 5:
    notaAlfabetica = "F"
elif 5 < calificacion <= 6:
    notaAlfabetica = "D"
elif 6 < calificacion <= 7:
    notaAlfabetica = "C"
elif 7 < calificacion <= 8:
    notaAlfabetica = "B"
elif 8 < calificacion <= 10:
    notaAlfabetica = "A"
else:
    notaAlfabetica = "ingresar correctamente su nota"
print(f"con su nota: {calificacion} le corresponde {notaAlfabetica}")