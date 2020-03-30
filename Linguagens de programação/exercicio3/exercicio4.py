#exercicio de inserção em arquivos

arq = open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/exercicio3/carro3.txt", 'r')

texto = arq.readlines()
print(texto)

# carros_ordenados = sorted(texto)
# print(carros_ordenados)

ordem_alfabetica = \
    open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/exercicio3/carro4.txt", 'w')

nomes = []
for linha in texto:
    nomes.append(str(linha.split("\n")[0]))

new_list = []
count = 1

for item in nomes:
    new_list.append(('{0} - {1}, ').format(count, item))
    count = count + 1
print(new_list)

ordem_alfabetica.writelines(new_list)

ordem_alfabetica.close()
arq.close()
