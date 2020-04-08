import csv
from collections import defaultdict

arquivo = open('dados.csv',encoding = "ISO-8859-1")

lines = arquivo.readlines()

for l in lines:
    coluna = l.split(';')
    print("Codigo: " + coluna[0])
    print("Nome: " + coluna[1])
    print("Telefone: " + coluna[2])
    print("*******************************")


import csv
import json
import string
import random
from collections import defaultdict
columns = defaultdict(list)
rows = []
def id_generator(size=8, chars=string.ascii_uppercase + string.digits):
    return ''.join(random.choice(chars) for _ in range(size)).lower()
with open('dados.csv', encoding = "ISO-8859-1") as f:
    reader = csv.DictReader(f)
    for row in reader:
      for (k,v) in row.items():
        rows.append({"codigo": v.split(';')[0], "nome": v.split(';')[1], "telefone": v.split(';')[2]})
print(rows)

