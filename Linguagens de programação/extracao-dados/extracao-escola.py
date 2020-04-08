import csv
import string
import random
from collections import defaultdict

#exemplo mais fácil
arquivo = open('1617FedSchoolCodeList.xlsx - 4th Quarter FSC.csv', encoding = "ISO-8859-1")

lines = arquivo.readlines()

# print("Id, SchoolCode and SchoolName")
# for l in lines:
#     print(l)
#     coluna = l.split(',')
#     print("id: " + coluna[0])
#     print("schoolCode: " + coluna[1])
#     print("SchoolName: " + coluna[2])
#     print("*******************************")
#
# [i for i,x in enumerate([1,2,3,2]) if x==2] # => [1, 3]

# print("city equals a 'CLEVELAND'")
# for l in lines:
#     coluna = l.split(',')
#     if 'CLEVELAND' in coluna:
#         print('achou', ('CLEVELAND' in coluna))

# print("SchoolName start with 'A'")
# for l in lines:
#     coluna = l.split(',')
#     if 'CLEVELAND' in coluna:
#         print('achou', ('CLEVELAND' in coluna))


print("StateCode equals a 'PR'")
for l in lines:
    coluna = l.split(',')
    if 'PR' in coluna[5]:
        print('achouo estado')


# print("SchoolName, City and StateCode equal '44106'")
# for l in lines:
#     coluna = l.split(',')
#     if 'CLEVELAND' in coluna:
#         print('achou', ('CLEVELAND' in coluna))

# print("Count schools by city")

#exemplo mais genérico
# columns = defaultdict(list)
# rows = []
# def id_generator(size=8, chars=string.ascii_uppercase + string.digits):
#     return ''.join(random.choice(chars) for _ in range(size)).lower()
# with open('1617FedSchoolCodeList.xlsx - 4th Quarter FSC.csv', encoding = "ISO-8859-1") as f:
#     reader = csv.DictReader(f)
#     for row in reader:
#       for (k,v) in row.items():
#         rows.append({"codigo": v.split(',')[0], "nome": v.split(',')[1], "telefone": v.split(';')[2]})
#     print(rows)

