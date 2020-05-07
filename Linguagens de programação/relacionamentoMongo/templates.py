
class Client:
    def __init__(self, id, name, tel, address, city, state, birth_date):
        self.id = id
        self.name = name
        self.tel = tel
        self.addres = address
        self.city = city
        self.state = state,
        self.birth_date = birth_date

class Product:
    def __init__(self, id, name, price, departure_date, date_entry):
        self.id = id
        self.name = name
        self.price = price
        self.departure_date = departure_date
        self.date_entry = date_entry

class Employe:
    def __init__(self, id, name, tel, address, city, state, birth_date, salary):
        self.id = id
        self.name = name
        self.tel = tel
        self.addres = address
        self.city = city
        self.state = state,
        self.birth_date = birth_date
        self.salary = salary


class Sale:
    def __init__(self, id, description, product, employe, client, date):
        self.id = id
        self.description = description
        self.product = product
        self.employe = employe
        self.client = client
        self.date = date