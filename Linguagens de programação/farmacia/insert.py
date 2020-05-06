import pymongo
import json
from cliente import Cliente
from farmacia import Farmacia


myclient = pymongo.MongoClient("mongodb://localhost:27017")
mydb = myclient["mydatabase"]
mycol = mydb["client"]

insert_client = dict(Cliente(1, 'davi', 'av 22 de agosto', '123456789', 'aqa', 'sp', 20))

print(insert_client)

# json.dumps(insert_client)

# x = mycol.insert_one(insert_client)


# print(json.dumps(a))
# print