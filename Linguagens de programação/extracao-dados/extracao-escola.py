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


# print("city equals a 'CLEVELAND'")
# for l in lines:
#     coluna = l.split(',')
#     if 'CLEVELAND' in coluna:
#         print('find CLEVELAND')

print("SchoolName start with 'A'")
# how to do?

#
# print("StateCode equals a 'PR'")
# for l in lines:
#     coluna = l.split(',')
#     if 'PR' in coluna[5]:
#         print('find PR in State Code')


# print("SchoolName, City and StateCode equal '44106'")
# for l in lines:
#     coluna = l.split(',')
#     print("SchoolName: " + coluna[2])
#     print("City: " + coluna[4])
#     print("StateCode: " + coluna[5])
#     if '44106' in coluna[6]:
#         print('find 44106 in zipCode')

print("Count schools by city")