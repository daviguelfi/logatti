class Farmacia:
    def __init__(self, id, description, qtd_medicines, qtd_employee, address, tel, city, state):
        self.id = id
        self.description = description
        self.qtd_medicines = qtd_medicines
        self.qtd_employee = qtd_employee
        self.address = address
        self.tel = tel
        self.city = city
        self.state = state

    def set_id(self, id):
        self.id = id

    def get_id(self):
        return self.id

    def set_description(self, description):
        self.description = description

    def get_description(self):
        return self.description

    def set_qtd_medicines(self, qtd_medicines):
        self.qtd_medicines = qtd_medicines

    def get_qtd_medicines(self):
        return self.qtd_medicines

    def set_qtd_employee(self, qtd_employee):
        self.qtd_employee = qtd_employee

    def get_qtd_employee(self, qt):
        return self.qtd_employee

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
