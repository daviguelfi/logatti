class Cliente:
    def __init__(self, id, name, address, tel, city, state, age):
        self.id = id
        self.name = name
        self.address = address
        self.tel = tel
        self.city = city
        self.state = state
        self.age = age

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

    def set_age(self, age):
        self.age = age

    def get_age(self):
        return self.age