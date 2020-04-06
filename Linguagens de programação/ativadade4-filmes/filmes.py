#inserir filme é colocar um input - done
#listar filme é ver os dados input - done
#excluir filme, percorrer a lista feita e tirar da lista

#inserir avaliação igual ao filme
#listar avaliação semelhante tb - done
#associar mais dificil - id? banco?

#imprimir relatorio relatorio de filme e avaliação em um arquivo txt

insert_movie = open('/Users/daviguelfi/Desktop/workspace/logatti/Linguagens de programação/ativadade4-filmes/filme.txt', 'w')

list_movies = []
list_rating = [{'id': 1, 'nota:':'ruim'}, {'id': 2, 'nota': 'mais ou menos', 'id': 3},
               {'id': 4, 'nota': 'bom'}, {'id': 5, 'nota': 'muito bom'}]

while True:
    option = input("Opções: 1 - Inserir Filme / 2 - Listar Filmes / 3 - Remover filme /"
                   " 4 - Inserir avaliação / 5 - Listar Avaliações / 0 - Sair  ")
    if option == "1":
        movie = input('Informe o nome de um filme que gostaria de cadastrar:\n')
        list_movies.append({'id': str(len(list_movies)+1), 'nome': movie, 'nota': None})

    if option == "2":
        for m in list_movies:
            print(m)

    if option == "3":
        remove_movie = input('Informe o nome de um filme que gostaria de remover:\n')
        # newRemove = list_movies.filter(item => item.nome !== nome)
        # print(list_movies.filter(item => item.nome != nome))
        print(remove_movie)
        print(list_movies.nome)
        list_movies.nome.remove(str(remove_movie))

    if option == "4":
        print('Por favor, escolha o id do filme que gostaria de avaliar: ')
        for m in list_movies:
            print(m)
        list_movie = input('Qual filme vc escolheu?\n')
        rating = input('Informe a avaliação que gostaria de cadastrar:\n')
        print(next(m for m in list_movies if m["id"] == list_movie))
        next(m for m in list_movies if m["id"] == list_movie).nota = list_movie
        list_rating.append(rating)
        print(list_rating)

    if option == "5":
        for m in list_rating:
            print(m)

    if option == "0":
        break


insert_movie.close()