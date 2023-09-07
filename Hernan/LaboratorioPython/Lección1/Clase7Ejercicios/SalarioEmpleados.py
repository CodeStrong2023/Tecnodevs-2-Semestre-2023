# Calcular el salario de 5 empleados
tarifa = 0
horas = 0
salario = 0
salarioTotal = 0
for i in range(4):
    horas = float(input(f"Ingrese las horas trabajadas del empleado N°{i+1}: "))
    tarifa = float(input(f"Ingrese la tarifa por hora del empleado N°{i}: $"))
    salario = horas * tarifa
    print(f"El salario del empleado N°{i} es: ${salario}")
    salarioTotal += salario
print(f"El salario total por los 5 empleados es de: ${salarioTotal}")
