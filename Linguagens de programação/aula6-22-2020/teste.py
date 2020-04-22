from calculadora import Calculadora

def imprimir():
    print("Valor A: {}".format(calculo.get_a()))
    print("Valor B: {}".format(calculo.get_b()))
    print(" * = {} ".format(calculo.multiplicar()))
    print(" / = {} ".format(calculo.dividir()))
    print(" + = {} ".format(calculo.somar()))
    print(" - = {} ".format(calculo.subtrair()))

calculo = Calculadora(1,2)

imprimir()
