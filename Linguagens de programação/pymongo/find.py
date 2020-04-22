import pymongo

myclient = pymongo.MongoClient("mongodb://localhost:27017/")
mydb = myclient["mydatabase"]
mycol = mydb["customers"]

#sort("name", 1) #ascending
#sort("name", -1) #descending

mydoc = mycol.find().sort("name", 1)

#list all collumns
for x in mydoc:
    print(x)

#list only name collumn and addres collumn
for x in mycol.find({}, { "_id": 0, "name": 1, "addres": 1 }):
    print(x)

#not list address
for x in mycol.find({}, {"address": 0}):
    print(x)