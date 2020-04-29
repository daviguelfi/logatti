import pymongo

myclient = pymongo.MongoClient("mongodb://localhost:27017/")
mydb = myclient["mydatabase"]
mycol= mydb["customers"]

mylist = [
    { "name": "Any", "addres": "Apple st 652" },
    { "name": "Hannah", "addres": "Mountain 21" },
    { "name": "MIchael", "addres": "Valley 345" },
    { "name": "Sandy", "addres": "Ocean blvd 2" },
    { "name": "Betty", "addres": "Green Grass 1" },
    { "name": "Richard", "addres": "Sky st 331" },
    { "name": "Susan", "addres": "One way 98" },
    { "name": "Vicky", "addres": "Yellow Garden 2" },
    { "name": "Ben", "addres": "Yellow Garden 2" },
    { "name": "William", "addres": "Park Lane 38" },
    { "name": "Chuck", "addres": "Central st 954" },
    { "name": "Viola", "addres": "Sideway 1633" },
]

x = mycol.insert_many(mylist)

print(x.inserted_ids)
