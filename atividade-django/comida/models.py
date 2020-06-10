from django.db import models

class Comida(models.Model):
    id = models.AutoField(primary_key=True)
    tipoComida = models.CharField(max_length=100)
    descricao = models.CharField(max_length=200)
    quantidade = models.BigIntegerField()
    opcoes = models.CharField(max_length=150)
    valorCalorico = models.BigIntegerField()
    salada = models.CharField(max_length=100)