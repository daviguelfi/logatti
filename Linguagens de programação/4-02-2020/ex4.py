import math

valorImovel = float(input("Digite o valor do Imovel: "))
valorSalario = float(input("Digite o valor do Salario: "))
qtdParcelas = int(input("Digite a quantidade de Parcelas: "))


valorParcela = valorImovel / qtdParcelas

if valorParcela <= (valorSalario * 0.3):
    print('é possivel pagar :)')
    print('O valor do imovel é: ', valorImovel)
    print('O valor do salario é: ',valorSalario)
    print('O valor da parcela é: ', valorParcela)

else:
    print('não dá pra pagar as parcelas ;/')
