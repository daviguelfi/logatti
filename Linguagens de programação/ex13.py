arq = open('/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/aula2-11-03-2020/lista.txt', 'w')
text = []
text.append('Lista de Alunos \n')
text.append('----\n')
text.append('Joao da Silva \n')
text.append('Jose Lima \n')
text.append('Maria das Dores \n')
arq.writelines(text)
arq.close()

arq = open('/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/aula2-11-03-2020/lista.txt', 'r')
text = arq.read()
print(text)
arq.close()

arq = open('/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/aula2-11-03-2020/lista.txt', 'r')
text = arq.readline()
for line in text:
    print(line)
arq.close()


