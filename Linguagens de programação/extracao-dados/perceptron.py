import matplotlib.pyplot as plt  # Para visualizacao dos dados e do erro
import numpy as np  # Biblioteca de manipulacao de arrays Numpy
from matplotlib.colors import ListedColormap  # Lista de cores para plotagens
import pandas as pd


# Carregar iris dataset
# df = pd.read_csv("/home/davi/Área de Trabalho/workspace/logatti/Linguagens de programação/extracao-dados/Dados_Treinamento_Sinal.csv",encoding = "ISO-8859-1")
# df.head()

# X = df.iloc[0:40,[0,1,2,3]].values
# y = df.iloc[0:40,4].values

# print(X)
# print("Y:", y)

# Assumindo que Setosa(0) seja -1 e Versicolor = 1
# Plotar o grafico
# vermelhos ----> Classe2 (-1)
# azuis ----> Classe1 (1)

# cm_bright = ListedColormap(['#FF0000', '#0000FF'])
# plt.figure(figsize=(7,5))
# plt.scatter(X[:,0], X[:,1], c=y, cmap=cm_bright)
# plt.scatter(None, None, color = 'r', label='Classe1')
# plt.scatter(None, None, color = 'b', label='Classe2')
# plt.legend()
# plt.title('Visualizacao do Dataset')
# plt.show()

# Construindo Adaline

class Percetron:
    w1 = 1
    w2 = 1
    bias = -0.5

    # def():

