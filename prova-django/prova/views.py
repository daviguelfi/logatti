from django.shortcuts import render, redirect
from prova.models import Venda
from prova.forms import VendaForm


def list_venda(request):
    vendas = Venda.objects.all()
    return render(request, 'venda.html', {'vendas': vendas})


def create_venda(request):
    form = VendaForm(request.POST or None)

    if form.is_valid():
        form.save()
        return redirect('list_venda')
    
    return render(request, 'venda-form.html', {'form': form})


def update_venda(request, id):
    venda = Venda.objects.get(id=id)
    form = VendaForm(request.POST or None, instance=venda)

    if form.is_valid():
        form.save()
        return redirect('list_venda')
    
    return render(request, 'venda-form.html', {'form': form, 'venda': venda})

def delete_venda(request, id):
    venda = Venda.objects.get(id=id)

    if request.method == 'POST':
        venda.delete()
        return redirect('list_venda')
    
    return render(request, 'venda-delete-confirm.html', {'venda': venda})