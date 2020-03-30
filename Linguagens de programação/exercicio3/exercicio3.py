#exercicio de inserção em arquivos

arq = open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/exercicio3/carro.txt", 'r')

texto = arq.readlines()
print(texto)

carros_ordenados = sorted(texto)
print(carros_ordenados)

ordem_alfabetica = \
    open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/exercicio3/carro3.txt", 'w')

ordem_alfabetica.writelines(carros_ordenados)

ordem_alfabetica.close()
arq.close()
