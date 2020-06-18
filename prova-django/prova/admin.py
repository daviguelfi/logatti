from django.contrib import admin
from .models import Funcionario, Cliente, Produto, Venda
# Register your models here.


admin.site.register(Funcionario)
admin.site.register(Cliente)
admin.site.register(Produto)
admin.site.register(Venda)