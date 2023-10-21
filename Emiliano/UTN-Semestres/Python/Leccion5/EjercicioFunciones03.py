#Ejercicio 3: imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas 
#Puede ser cualquier valor positivo, por ejemplo, si pasamos el valor  de 5 debe imprimir:
# 5
# 4
# 3
# 2
# 1
#Si se ingresa numeros negativos no imprime nada
def numeros_recursivos(numero):
    if numero >= 1:
        print(numero)
        numeros_recursivos(numero-1)
    elif numero == 0:
        return  
    elif numero <= 0:
        print("Valor ingresado incorrecto")
        
nume = int(input("Coloque el numero: "))
resultado = numeros_recursivos(nume)
print(f"El factorial del numero {nume} es: {resultado}")    