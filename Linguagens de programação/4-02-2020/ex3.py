lista = []
qtn = input('informe a quantidade de numeros: ')

for n in range(0,int(qtn)): 
    lista.append(int(input('Digite o número: '))) 
    #append faz a junção dos números a lista,
    #semelhante ao push outras linguagens, como javascript

print ('Maior número da lista: ', max(lista))
print ('Menos número da lista: ', min(lista)) 