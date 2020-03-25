#exemplo 3 leitura de arquivo

arq = open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/aula3-25-03-2020/lista.txt", 'r')

texto = arq.readlines()

for linha in texto:
    print(linha)

arq.close()
