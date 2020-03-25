#exemplo 13

arq = open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/aula3-25-03-2020/lista.txt", 'w')

texto = []
texto.append('Uva\n')
texto.append('banana\n')
texto.append('cenoura\n')

arq.writelines(texto)

arq.close()
