Python 3.10.11 (tags/v3.10.11:7d4cc5a, Apr  5 2023, 00:38:17) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> nome = input('Digite um nome ')
Digite um nome Gabriel
>>> nome
'Gabriel'
>>> Restart Shell
SyntaxError: incomplete input
>>> 
================================ RESTART: Shell ================================
>>> nome = input("Qual seu nome? ")
Qual seu nome? Gabriel
>>> idade = input ("Qual sua idade? ")
Qual sua idade? 24 anos
>>> peso = input ('Qual o seu peso atual? ')
Qual o seu peso atual? 65.5 kg
>>> print("Meu nome é " + nome, ", tenho " idade, " e peso" peso)
SyntaxError: invalid syntax. Perhaps you forgot a comma?
>>> print("Meu nome é " + nome, ", tenho " + idade, " e peso" + peso)
Meu nome é Gabriel , tenho 24 anos  e peso65.5 kg
>>> print("Meu nome é " + nome,", tenho " + idade, " e peso" + peso)
Meu nome é Gabriel , tenho 24 anos  e peso65.5 kg
>>> nome
'Gabriel'
