#exemplo 2 leitura de arquivo

arq = open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/aula3-25-03-2020/telefone.txt", 'r')

texto = arq.read()

print(texto)

arq.close()