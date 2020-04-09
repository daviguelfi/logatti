import random
import time


def magic_game():
    typed_number = str(input('Informe um número de 1 a 5: '))
    sorted_number = str(random.randint(1, 5))
    time.sleep(3)

    if typed_number == sorted_number:
        print('Parabéns, você acertou o número!!!')
    else:
        print('O número sorteado foi ' + sorted_number + ' e o número escolhido foi ' + typed_number)


magic_game()
