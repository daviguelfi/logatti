from django.db import models


class Tipo(models.Model):
    descricao = models.CharField(max_length=200)
    origem = models.CharField(max_length=150)
    
    def __str__(self):
        return self.descricao

class Opcao(models.Model):
    descricao = models.CharField(max_length=200)
    
    def __str__(self):
        return self.descricao

class Salada(models.Model):
    descricao = models.CharField(max_length=200)
    dtColheita = models.CharField(max_length=150)

    def __str__(self):
        return self.descricao


class Comida(models.Model):
    tipoComida = models.ForeignKey(Tipo, on_delete=models.SET_NULL, null=True)
    descricao = models.CharField(max_length=200)
    quantidade = models.BigIntegerField()
    opcoes = models.ForeignKey(Opcao, on_delete=models.SET_NULL, null=True)
    valorCalorico = models.BigIntegerField()
    salada = models.ForeignKey(Salada, on_delete=models.SET_NULL, null=True)

    def __str__(self):
        return self.descricao, self.tipoComida