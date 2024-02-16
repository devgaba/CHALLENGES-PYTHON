nome = str(input('Qual é o seu nome? '))
if nome =='Gabriel':
    print('Lindo nome!')
elif nome == 'Pedro' or nome =='Maria' or nome=='Ana' or nome=='Luísa' or nome=='Henrique':
    print('Nome bem normal {}'.format(nome))
elif nome in 'Ana Luísa; Gabriel Henrique; ':
    if nome == 'Ana Luísa':
        print('Vai casar com Gabriel Henrique')
    elif nome =='Gabriel Henrique':
        print('Vai casar com Ana Luísa')
else:
    print('Nome legal!')
    print('Bom dia {}'.format(nome))