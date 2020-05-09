import pymongo

class People:
    def __init__(self, id, name, address, tel, city, email, father_name,
     mother_name):
        self.id = id
        self.name = name
        self.address = address
        self.tel = tel
        self.city = city
        self.email = email
        self.father_name = father_name
        self.mother_name = mother_name6

    def set_id(self, id):
        self.id = id

    def get_id(self):
        return self.id

    def set_name(self, name):
        self.name = name

    def get_name(self):
        return self.name

    def set_address(self, address):
        self.address = address

    def get_address(self):
        return self.address

    def set_tel(self, tel):
        self.tel = tel

    def get_tel(self):
        return self.tel

    def set_city(self, city):
        self.city = city

    def get_city(self):
        return self.city

    def set_email(self, email):
        self.email = email

    def get_email(self):
        return self.email

    def set_father_name(self, father_name):
        self.father_name = father_name

    def get_father_name(self):
        return self.father_name

    def set_mother_name(self, mother_name):
        self.mother_name = mother_name

    def get_mother_name(self):
        return self.mother_name



myclient = pymongo.MongoClient("mongodb://localhost:27017/")
mydb = myclient["mydatabase"]
mycol= mydb["exercicio7"]

mylist = [
    { "id": 1, "name": "Davi", "tel": "123456789",
        "addres": "aqa", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 2, "name": "Davi1", "tel": "123456789",
    "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 3, "name": "Davi2", "tel": "123456789",
        "addres": "aqa2", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 4, "name": "Davi3", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 5, "name": "Davi4", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 6, "name": "Davi", "tel": "123456789",
        "addres": "aqa", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 7, "name": "Davi1", "tel": "123456789",
    "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 8, "name": "Davi2", "tel": "123456789",
        "addres": "aqa2", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 9, "name": "Davi3", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 10, "name": "Davi4", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 11, "name": "Davi", "tel": "123456789",
        "addres": "aqa", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 12, "name": "Davi1", "tel": "123456789",
    "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 13, "name": "Davi2", "tel": "123456789",
        "addres": "aqa2", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 14, "name": "Davi3", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 15, "name": "Davi4", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 16, "name": "Davi", "tel": "123456789",
        "addres": "aqa", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 17, "name": "Davi1", "tel": "123456789",
    "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 18, "name": "Davi2", "tel": "123456789",
        "addres": "aqa2", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 19, "name": "Davi3", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 20, "name": "Davi4", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 21, "name": "Davi", "tel": "123456789",
        "addres": "aqa", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 22, "name": "Davi1", "tel": "123456789",
    "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 23, "name": "Davi2", "tel": "123456789",
        "addres": "aqa2", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 24, "name": "Davi3", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 25, "name": "Davi4", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 26, "name": "Davi", "tel": "123456789",
        "addres": "aqa", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 27, "name": "Davi1", "tel": "123456789",
    "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 28, "name": "Davi2", "tel": "123456789",
        "addres": "aqa2", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 29, "name": "Davi3", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
    { "id": 30, "name": "Davi4", "tel": "123456789",
        "addres": "aqa1", "email": "davi@teste.com", "father_name":"davi1", "mother_name":"davi2" },
]

myquery = { "id": 29}

myupdate = { "id": 1}
mynewvalue = { "$set": {"name" : "TESTE"}}

# x = mycol.insert_many(mylist)
# y = mycol.delete_one(myquery)
z = mycol.update_one(myupdate, mynewvalue)