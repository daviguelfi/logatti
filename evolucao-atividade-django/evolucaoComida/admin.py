from django.contrib import admin
from .models import Tipo, Opcao, Salada, Comida


admin.site.register(Tipo)
admin.site.register(Opcao)
admin.site.register(Salada)
admin.site.register(Comida)