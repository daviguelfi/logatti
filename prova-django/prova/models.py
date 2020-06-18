from django.db import models

class Funcionario(models.Model):

    nome = models.CharField(max_length=200)
    salario = models.BigIntegerField()
    cpf = models.CharField(max_length=14)

    def __str__(self):
        return self.nome


class Cliente(models.Model):
    nome = models.CharField(max_length=200)
    cpf = models.CharField(max_length=14)
    
    def __str__(self):
        return self.nome


class Produto(models.Model):
    
    descricao = models.CharField(max_length=250)
    valor = models.BigIntegerField()

    def __str__(self):
        return self.descricao


class Venda(models.Model):

    data = models.CharField(max_length=10)
    descricao = models.CharField(max_length=100, null=True)
    funcionario = models.ForeignKey(Funcionario, on_delete=models.SET_NULL, null=True)
    cliente = models.ForeignKey(Cliente, on_delete=models.SET_NULL, null=True)
    produto = models.ForeignKey(Produto, on_delete=models.SET_NULL, null=True)

    def __str__(self):
        return self.data, self.descricao , self.funcionario, self.cliente, self.produto