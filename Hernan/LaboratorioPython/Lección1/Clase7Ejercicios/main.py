# Es o no es año bisiesto

repetidor = True
while repetidor == True:
    anio = float(input("ingrese el año: "))
    if (anio % 4 == 0) and (anio % 100 != 0) or (anio %400 == 0):
        print("El año es bisiesto")
        repetidor = False
        repetidor = int(input("Si desea controlar otra fecha presione \"1\", seguido de ENTER: "))
        if repetidor == 1:
            repetidor = True
    else:
        print("El año no es bisiesto")
        repetidor = False
        repetidor = int(input("Si desea controlar otra fecha presione \"1\", seguido de ENTER: "))
        if repetidor == 1:
            repetidor = True
