class Aritmetica:
    """
    El nombre de este tipo de comentario en: DocString
    esto es documentacion en la clase Python
    
    """
    
    def __init__(self,operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    
    # Metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB
    
    def resta(self):
        return self.operandoA - self.operandoB
    
    def multiplicar(self):
        return self.operandoA * self.operandoB
    
    def dividir(self):
        return self.operandoA / self.operandoB
    
aritmetica1 = Aritmetica(7, 9) # Le pasamos los argumentos para los operados 
print(f"la suma de los numeros es:  {aritmetica1.sumar()}")
print(f"la resta de los numeros es:  {aritmetica1.resta()}")
print(f"la multiplicacion de los numeros es:  {aritmetica1.multiplicar()}")
print(f"la devision de los numeros es:  {aritmetica1.dividir():.2f}")
