Instalação das bibliotecas
Instalar Django: 
```
pip install django
```
Instalar Crispy-forms: 
```
pip install django-crispy-forms
```
Criar projeto e Atualizar base de dados
Criar projeto: 
```
django-admin startproject webapp .
```
Criar app: 
```
python manage.py startapp agenda
```
Atualizar models (banco de dados):
```
 python manage.py makemigrations
 ```
Atualizar banco de dados:
```
 python manage.py migrate
```

Executar Aplicação: 
```
python manage.py runserver
```