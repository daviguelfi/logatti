#exercicio de inserção em arquivos

arq = open("/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/exercicio3/carro.txt", 'w')

texto = []

texto.append('Gol\n')
texto.append('Uno\n')
texto.append('Palio\n')
texto.append('EcoSport\n')
texto.append('Clio\n')
texto.append('Strada\n')
texto.append('Golf\n')


arq.writelines(texto)

arq.close()