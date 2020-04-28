#inserir filme é colocar um input - done
#listar filme é ver os dados input - done
#excluir filme, percorrer a lista feita e tirar da lista

#inserir avaliação igual ao filme
#listar avaliação semelhante tb - done
#associar mais dificil - id? banco?

#imprimir relatorio relatorio de filme e avaliação em um arquivo txt

# insert_movie = open('/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/ativadade4-filmes/filme.txt', 'w')

list_movies = []
# list_rating = [{'id': 1, 'nota:':'ruim'}, {'id': 2, 'nota': 'mais ou menos', 'id': 3},
#                {'id': 4, 'nota': 'bom'}, {'id': 5, 'nota': 'muito bom'}]
ratings = []
connect_movies = []

z = 1
y = 1
n = 1
i = 1
q = 1


while True:
    option = input("Opções: 1 - Inserir Filme / 2 - Listar Filmes / 3 - Remover filme / \n"
                   " 4 - Inserir avaliação / 5 - Listar Avaliações / 6 - Associar Avaliações-Filmes / \n"
                   "7 - Imprimir Relátorio / 0 - Sair  ")

    if option == "1":
        movie = input('Informe o nome de um filme que gostaria de cadastrar:\n')
        list_movies.append(movie)

    if option == "2":
        if not list_movies:
            print("Lista de filmes esta vazia!\n\n")
        for m in list_movies:
            print(str(z) + " - " + m)
            z += 1

    if option == "3":
        if not list_movies:
            print("A lista de filmes esta vazia!")
        else:
            ex = str(input("Qual Filme deseja excluir?:"))
            if list_movies.__contains__(ex):
                list_movies.remove(ex)
                print("Filme Excluido da lista!")
            else:
                print("Filme não encontrado")

    if option == "4":
        rating = input("Digite sua avaliação:")
        ratings.append(rating)
        print("Avaliação adicionada!")

    if option == "5":
        if not ratings:
            print("Lista vazia")
        else:
            print("Lista de avaliações: ")
            for note in ratings:
                print(str(y) + ' - ' + note)
                y += 1

    elif option == "6":
        if not list_movies or not ratings:
            print("Não há dados suficientes para serem associados!")
        else:
            q = 1
            for f in list_movies:
                print("%d - %s" % (q, f))
                q += 1
            opfilme = int(input("Informe o número do filme: ")) - 1
            connect_movies.append(list_movies[opfilme])

            k = 1
            for a in ratings:
                print("%d - %s" % (k, a))
                k += 1
            opavaliacao = int(input("Informe o numero da avaliação: ")) - 1
            connect_movies.append(ratings[opavaliacao])
            print("O filme: %s teve a avaliação: %s!" % (list_movies[opfilme], ratings[opavaliacao]))
    # if option == "6":
    #     if not list_movies or not ratings:
    #         print("Não há dados suficentes para assosciar")
    #     else:
    #         q = 1
    #         for f in list_movies:
    #             print("%d - %s" % (q, f))
    #             q += 1
    #         option_movie = int(input("Informe o número do filme: ")) - 1
    #         connect_movies.append(list_movies[option_movie])
    #
    #         k = 1
    #         print("Avaliações cadastradas")
    #         for a in ratings:
    #             print("%d - %s" % (k, a))
    #             k += 1
    #         option_rating = int(input("Informe o número da avaliação: ")) - 1
    #         connect_movies.append(ratings[option_rating])
    #     print("O filme: %s teve a avaliação: %s!" % (list_movies[option_movie], ratings[option_rating]))

    if option == "7":
        if not connect_movies:
            print("Por favor, avalie primeiro")
        else:
            arq = open("filme.txt", "w")
            i = 0
            for j in connect_movies:
                if i % 2 == 0:
                    arq.write("%s -" % (connect_movies[i]))
                else:
                    arq.write("%s\n" % (connect_movies[i]))
            i += 1
            print("Relatório gerado com sucesso")
            arq.close()
        arq.close()

    if option == "0":
        break

