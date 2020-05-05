import pymongo

myclient = pymongo.MongoClient("mongodb://localhost:27017")
mydb = myclient["mydatabase"]
mycol = mydb["customers"]

mydict = { "nome" : "davi", "email": "davi@teste.com", "telefone" : "16 8888 7777"}

x = mycol.insert_one(mydict)

print(x.inserted_id)
