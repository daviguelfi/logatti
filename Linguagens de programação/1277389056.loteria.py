#/usr/bin/env python
#coding: utf-8
#Programa gerador de numeros para Mega Sena
#Construido por
#Lu�s Eduardo Boiko Ferreira
#Voc� pode modificar e distribuir o c�digo desde que
#n�o retire o nome do autor.
import random
linha='-'*75
text0='por Luis Eduardo Boiko Ferreira'
text1='Mega-Sena Generator'
sequencia=random.sample(xrange(100),6)
print (linha)
print(text1.center(75,'*'))
print (linha)
print '\n\n'
print 'Se voc� deu sorte os numeros ser�o: ', sequencia,'.'
print '\n\n'
print(text0.center(75,'-'))

#grava todas as sequencias em um arquivo.txt para ver quando precisar
arquivo = open("Mega_Sena.txt","a+")
data=datetime.datetime.now().strftime("%A (%a) %d/%m/%Y %I:%M:%S %p")
arquivo.write("\n Data: %s - numeros da sorte: %s" % (data, sequencia))
arquivo.close()
ler = open("Mega_Sena.txt","r")
texto = ler.read()
ler.close()
#print (texto)


