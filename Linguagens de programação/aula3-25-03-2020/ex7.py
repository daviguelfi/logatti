idade = int(input("Você tem quantos anos? "))

#ex if

if idade == 18:
    print("Você tem mais de 18 anos")
elif idade > 18:
    print("Você é menor de idade")

#switch case

var1 = int(input("Digite um número para var1: "))
var2 = int(input("Digite um número para var2: "))

if var1 == 1:
    print("Número var1 igual a 1")
elif var1 == 2 or var2 == 3:
    print("var1 diferente de 1 ou var2 diferente de 2")
elif var1 >= 1000 or var2 <= -1000:
    print("var1 maior que 1000 ou var2 menor que -1000")
else:
    print("nenhuma das alternativas anteriores")


#range

print(range(10))
print(range(5, 10))
print(range(10, 0))
i = int(input("Digite um número: "))
if i in range(0, 10):
    print("Está contido")
else:
    print("Não está contido")