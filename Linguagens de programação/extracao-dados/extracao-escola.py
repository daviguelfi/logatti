arquivo = open('/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/extracao-dados/1617FedSchoolCodeList.xlsx - 4th Quarter FSC.csv', 'r')

lines = arquivo.readlines()

for l in lines:
    print(l)
    # coluna = l.split(';')
    # print("Codigo: " + coluna[0])
    # print("Nome: " + coluna[1])
    # print("Telefone: " + coluna[2])
    # print("*******************************")
