
#exercicio de inserção em arquivos

arq = open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/exercicio3/carro.txt", 'r')

texto = arq.readlines()

nomes = []

for linha in texto:
    nomes.append(str(linha.split("\n")[0]))

nomes.reverse()
print('nomes', nomes)

carro_ordenado = \
      open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/exercicio3/carro2.txt", 'w')

carro_ordenado.writelines(nomes)

carro_ordenado.close()
arq.close()
