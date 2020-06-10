
class Client:
    def __init__(self, id, name, tel, address, city, state, birth_date):
        self.id = id
        self.name = name
        self.tel = tel
        self.addres = address
        self.city = city
        self.state = state,
        self.birth_date = birth_date

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

    def set_state(self, state):
        self.state = state

    def get_state(self):
        return self.state

     def set_birth_date(self, birth_date):
        self.birth_date = birth_date

    def get_birth_date(self):
        return self.birth_date


class Product:
    def __init__(self, id, name, price, departure_date, date_entry):
        self.id = id
        self.name = name
        self.price = price
        self.departure_date = departure_date
        self.date_entry = date_entry
    
     def set_id(self, id):
        self.id = id

    def get_id(self):
        return self.id

    def set_name(self, name):
        self.name = name

    def get_name(self):
        return self.name
    
     def set_price(self, price):
        self.price = price

    def get_price(self):
        return self.price
     
    def set_departure_date(self, departure_date):
        self.departure_date = departure_date

    def get_departure_date(self):
        return self.departure_date

    def set_date_entry(self, date_entry):
        self.date_entry = date_entry

    def get_date_entry(self):
        return self.date_entry

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

    def set_state(self, state):
        self.state = state

    def get_state(self):
        return self.state

     def set_birth_date(self, birth_date):
        self.birth_date = birth_date

    def get_birth_date(self):
        return self.birth_date
    
    def set_salary(self, salary):
        self.salary = salary

    def get_salary(self):
        return self.salary

class Sale:
    def __init__(self, id, description, product, employe, client, date):
        self.id = id
        self.description = description
        self.product = product
        self.employe = employe
        self.client = client
        self.date = date
    
    def set_id(self, id):
        self.id = id

    def get_id(self):
        return self.id
    
    def set_description(self, description):
        self.description = description

    def get_description(self):
        return self.description
    
    def set_product(self, description):
        self.description = description
    
    def get_product(self):
        return self.description

    def set_employe(self, employe):
        self.employe = employe

    def get_employe(self):
        return self.employe

    def set_client(self, client):
        self.client = client

    def get_client(self):
        return self.client
    
    def set_date(self, date):
        self.date = date

    def get_date(self):
        return self.date