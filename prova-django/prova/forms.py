from django import forms
from prova.models import Venda

class VendaForm(forms.ModelForm):
    class Meta:
        model = Venda
        fields = ['id', 'data', 'descricao', 'funcionario', 'cliente', 'produto']
