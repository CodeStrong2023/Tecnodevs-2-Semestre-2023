# Ejercicio 4: Calculadora de Impuestos
# Crear una función para calcular el total de un pago incluyendo
# un impuesto aplicado. (IVA)
# Formula: pago_total = pago_sin_impuestos + pago_sin_impuestos * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxxx


def total_de_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total


pago_sin_impuesto = float(input('Ingrese el monto sin impuestos: '))
impuesto = float(input("Ingrese el porcentaje del impuesto: "))
print(f'El pago total realizado es de: {total_de_pago(pago_sin_impuesto,impuesto)}')
