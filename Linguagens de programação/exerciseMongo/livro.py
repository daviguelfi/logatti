import pymongo


class People:
    def __init__(self, id, title, description, release_year, author,
                 publishing_company, qtd_pages, category,
                 mother_name):
        self.id = id
        self.title = title
        self.description = description
        self.release_year = release_year
        self.publishing_company = publishing_company
        self.qtd_pages = qtd_pages
        self.category = category

    def set_id(self, id):
        self.id = id

    def get_id(self):
        return self.id

    def set_title(self, title):
        self.title = title

    def get_title(self):
        return self.title

    def set_description(self, description):
        self.description = description

    def get_description(self):
        return self.description

    def set_release_year(self, release_year):
        self.release_year = release_year

    def get_release_year(self):
        return self.release_year

    def set_publishing_company(self, publishing_company):
        self.publishing_company = publishing_company

    def get_publishing_company(self):
        return self.publishing_company

    def set_qtd_pages(self, qtd_pages):
        self.qtd_pages = qtd_pages

    def get_qtd_pages(self):
        return self.qtd_pages

    def set_category(self, category):
        self.category = category

    def get_category(self):
        return self.category


myclient = pymongo.MongoClient("mongodb://localhost:27017/")
mydb = myclient["mydatabase"]
mycol = mydb["exercicio7"]

mylist = [
    {"id": 1, "title": "jogos vorazes", "description": "action in another universe",
        "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 2, "title": "jogos vorazes", "description": "action in another universe",
        "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 3, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 4, "title": "jogos vorazes", "description": "action in another universe",
        "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 5, "title": "jogos vorazes", "description": "action in another universe",
        "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 6, "title": "jogos vorazes", "description": "action in another universe",
        "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 7, "title": "jogos vorazes", "description": "action in another universe",
        "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 8, "title": "jogos vorazes", "description": "action in another universe",
        "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 9, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 10, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 11, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 12, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 13, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 14, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 15, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 16, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 17, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 18, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 19, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 20, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 21, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 22, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 22, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 23, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 24, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 25, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 26, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 27, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 28, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 28, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 29, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
    {"id": 30, "title": "jogos vorazes", "description": "action in another universe",
     "release_year": "2018", "author": "picasso", "publishing_company": "abril",
     "qtd_pages": "200", "category": "action"},
]

myquery = { "id": 30}
myupdate = { "id": 1}
mynewvalue = { "$set": {"name" : "TESTE"}}

# x = mycol.insert_many(mylist)
y = mycol.delete_one(myquery)
z = mycol.update_one(myupdate, mynewvalue)

