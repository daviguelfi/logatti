import time
import random


def mega():

    game = []
    for a in range(6):
        num = int(
            input("Digite o {}° número de 6 (entre 1 e 60): ".format(a+1)))

        while num < 1 or num > 60:
            num = int(
                input("O número digitado não está entre 1 e 60.\nDigite o {}° número de 6 (entre 1 e 60): ".format(a+1)))

        while num in game:
            num = int(
                input("O número digitado já foi escolhido.\nDigite o {}° número de 6 (entre 1 e 60): ".format(a+1)))
        game.append(num)

    print("Você usou esses números no seu jogo: {}".format(game))

    number_draw = []
    number_of_try = 0
    while game != number_of_try:
        number_of_try = []
        a = 0

        while a < 6:
            b = random.randint(1, 60)
            if b not in number_draw:
                number_draw.append(b)
                a += 1
        number_of_try += 1
        if number_of_try % 1 == 0:
            print(
                f'Seu Jogo: {game}\nSorteio Oficial: {number_draw}\nTentativa n {number_of_try}\n')

    print("Procesando...")
    print("Sorteio Oficial: {}".format(number_draw))
    print("******")
    time.sleep(3)
    print("Você precisou de {} tentativas, para acertar!".format(number_of_try))


mega()
