ladoA = int(input('Digite uma medida para o lado A: '))
ladoB = int(input('Digite uma medida para o lado B: '))
ladoC = int(input('Digite uma medida para o lado C: '))

if ladoA<=0 or ladoB<=0 or ladoC<=0:
    print('Por favor, informe lados válidos')

elif ladoA==ladoB and ladoB==ladoC:
    print('Triangulo equilatero')

elif ladoA==ladoB or ladoB==ladoC or ladoC==ladoA:
    print('Triangulo isosceles')

else:
    print("Triangulo escaleno.")