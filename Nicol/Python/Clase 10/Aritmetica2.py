class Aritmetica:
    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    #Método para sumar
    def sumar(self):
        return self.operandoA + self.operandoB

    #Método para restar:
    def resta(self):
        return self.operandoA - self.operandoB

    #Método para multiplicar
    def multiplicar(self):
        return self.operandoA * self.operandoB

    #Método para dividir:
    def dividir(self):
        return self.operandoA / self.operandoB

aritmetica1 = Aritmetica(7,9)
print(aritmetica1.sumar())

print(f"La resta de los números es: {aritmetica1.resta()}")
print(f"La multiplicación de los números es: {aritmetica1.multiplicar()}")
print(f"La división de los números es: {aritmetica1.dividir():.2f}")