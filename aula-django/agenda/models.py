from django.db import models

class Agenda(models.Model):
    descricao = models.CharField(max_length=100)
    data = models.DateField(max_length=20)

    def __str__(self):
        return self.descricao
