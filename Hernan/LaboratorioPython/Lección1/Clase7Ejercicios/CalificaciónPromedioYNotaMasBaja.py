# Calificación promedio y nota más baja de 10 alumnos
notaMasBaja = 0
sumaCalificacion = 0
promedioCalificacion = 0
for i in range(10):
    calificacion = float(input(f"Ingrese la calificación del alumno N°{i+1}: "))
    if notaMasBaja > calificacion:
        notaMasBaja = calificacion
    sumaCalificacion = sumaCalificacion + calificacion
promedioCalificacion = sumaCalificacion / i
print(f"El promedio de calificaciones es de {promedioCalificacion} "
      f"y la nota más baja es {notaMasBaja}")
