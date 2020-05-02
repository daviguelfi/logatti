class Medicamento:
    def __init__(self, id, description):
        self.id = id
        self.description = description

    def set_id(self, id):
        self.id = id

    def get_id(self):
        return self.id

    def set_description(self, description):
        self.description = description

    def get_description(self):
        return self.description

