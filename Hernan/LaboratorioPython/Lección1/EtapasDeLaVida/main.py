# Ejercicio: Las etapas de la vida.
edad = int(input("Ingrese su edad: "))
mensaje = None
if 0 <= edad <= 10:
    mensaje = "La infancia es increible y bella"
elif 10 < edad <= 20:
    mensaje = "Tienes muchos cambios, mucho que estudiar"
elif 20 < edad <= 30:
    mensaje = "Amor y comienza el trabajo"
elif 30 < edad <= 40:
    mensaje = "Libertad y nuevos horizontes"
else:
    mensaje = "Rango de edad no cargado"
print(mensaje)