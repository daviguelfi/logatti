import pymongo
import jsons
from cliente import Cliente
from farmacia import Farmacia
from medicamento import Medicamento

myclient = pymongo.MongoClient("mongodb://localhost:27017")
mydb = myclient["mydatabase"]
mycol = mydb["client"]

insert_client = Cliente(1, 'davi', 'av 22 de agosto', '123456789', 'aqa', 'sp', 
20)
insert_farmacia = Farmacia(1, 'farmacia do joaquim', 200, 5, 'rua1', '123456789',
 'aqa', 'sp')
insert_medicamento = Medicamento(1, 'paracetamol, tome quando tiver dor de cabeça')

# json.dumps(insert_client)

# x = mycol.insert_one(jsons.dump(insert_client))
# y = mycol.insert_one(jsons.dump(insert_farmacia))
z = mycol.insert_one(jsons.dump(insert_medicamento))