#Ejercicio 4: Crea una funcion para calcular el total de un pago incluyendo
# un impuesto aplicado. (IVA)

def calcular_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total

pago_sin_impuestos = float(input("Coloque el pago sin impuestos: "))
impuesto = float(input("Coloque el monto del impuesto a aplicar: "))
pago_con_impuestos = calcular_pago(pago_sin_impuestos, impuesto)
print(f"El pago con impuesto es: {pago_con_impuestos}")