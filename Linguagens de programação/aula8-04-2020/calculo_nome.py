
def nome_variado():
    nome_completo = str(input('Informe seu nome completo: '))
    caixa_alta = nome_completo.upper()
    caixa_baixa = nome_completo.lower()
    caracteres_nome = len(nome_completo.replace(" ", ""))
    primeiro_nome = len(nome_completo.split(None, 1)[0])


    print('Nome com letras maiusculuas: ', caixa_alta)
    print('Nome com letras minusculas: ', caixa_baixa)
    print('Numero sem espaco: ', caracteres_nome)
    print('Qtd de letras primeiro nome: ', primeiro_nome)


nome_variado()
