import pymongo
import json
from cliente import Cliente
from farmacia import Farmacia


myclient = pymongo.MongoClient("mongodb://localhost:27017")
mydb = myclient["mydatabase"]
mycol = mydb["client"]

# insert_client = json.dumps(Cliente(1, 'davi', 'av 22 de agosto', '123456789', 'aqa', 'sp', 20))
#
# x = mycol.insert_one(insert_client)


a = { "c": 'teste', "n": "ene" }

print(json.dumps(a))
print