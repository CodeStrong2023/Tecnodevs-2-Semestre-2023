#Ejercicio 4:Calculadora de Impuestos
#Crear una función para calcular el total de un pago incluyendo un impuesto aplicado. (IVA)
#Formula: pago_ total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)

def calculadora(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total

pago_sin_impuesto = float(input("Digite el pago sin impuestos: "))
impuesto = float(input("Digite el monto del impuesto a aplicar: "))

pago_con_impuesto = calculadora(pago_sin_impuesto, impuesto)

print(f"El precio a pagar es de: {pago_con_impuesto}")