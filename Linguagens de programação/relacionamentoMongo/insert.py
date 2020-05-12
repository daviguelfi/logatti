import pymongo
import jsons
from templates import Client, Product, Employe, Sale
myclient = pymongo.MongoClient("mongodb://localhost:27017")
mydb = myclient["mydatabase"]
mycol = mydb["relacionamento"]

client = Client(1, 'davi', '123456789', 'av 22 de agosto',  'aqa', 'sp', 
'10/12/1999')

client = Client(str(input()))

employe = Employe(1, 'felipe', '123456789', 'av 22 de agosto', 
'aqa', 'sp', '10/12/1995', '1000')

prodcut = Product(1, 'tv', 200, '10/12/2019', '6/05/2020')

sale = Sale(1, 'Primeira venda de hoje', prodcut, employe, client, '06/05/2020')

x = mycol.insert_one(jsons.dump(client))
y = mycol.insert_one(jsons.dump(employe))
z = mycol.insert_one(jsons.dump(prodcut))
w = mycol.insert_one(jsons.dump(sale))