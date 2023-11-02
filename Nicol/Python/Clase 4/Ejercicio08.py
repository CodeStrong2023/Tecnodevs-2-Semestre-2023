# Ejercicio 8: Menú interactivo - Cajero automático
# Hacer un programa que simule un cajero automático con un saldo
# inicial de $1000 y tendrá el siguiente menú de opciones:
#           1. Ingreasar dinero en la cuenta
#           2. REtirar dinero de la cuenta
#           3. Mostrar dinero disponible
#           4. Salir
saldo = float(1000)     # Debe estar fuera del ciclo para no reiniciar el saldo
while True:
    print("MENÚ")
    print(" 1 - Ingresar dinero \n 2 - Retirar dinero \n 3 - Mostrar dinero en cuenta \n 4 - Salir") #   Me pareció eficiente hacerlo en una sola línea
    opcion = int(input("Digite una opción: "))
    if opcion == 1:
        extra = float(input("Digite el dinero a ingresar: "))
        saldo += extra  # Operador simplificado
        print(f"Su saldo actual es de {saldo}")
    elif opcion == 2:
        retiro = float(input("Ingrese el monto a retirar: "))
        if retiro > saldo:
            print("No posee saldo suficiente para la extracción")   # Corrige si la extracción es mayor al saldo
        else:
            saldo -= retiro
            print(f"Su saldo actual es de {saldo}")
    elif opcion == 3:
        print(f"Su saldo disponible es {saldo}")
    elif opcion == 4:
        print("\tGRACIAS POR VISITAR SU CAJERO AUTOMÁTICO")     # Aguregué una tabulación al inicio
        break   # Rompe los ciclos
    else:
        print("Ingreso incorrecto")     # Limita a las opciones dadas

