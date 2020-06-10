from django import forms
from evolucaoComida.models import Comida

class ComidaForm(forms.ModelForm):
    class Meta:
        model = Comida
        fields = ['tipoComida', 'descricao',  'quantidade', 'opcoes', 'valorCalorico', 'salada']
