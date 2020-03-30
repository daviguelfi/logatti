#exemplo 3 leitura de arquivo

arq = open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/aula3-25-03-2020/test1.txt", 'r')
texto = arq.readlines()
nomes = []

for linha in texto:
    nomes.append(str(linha.split(";")[1]))

nomes_ordenados = sorted(nomes)

for n in nomes_ordenados:
    print(n)

arq.close()
