print('{}'.format('='*8),'CHALLENGE032','{}'.format('='*8))

ano = int(input('Digite o ano: '))

if (ano % 4) == 0:
    print('{} é um ano bissexto!'.format(ano))
else:
    print('{} não é um ano bissexto!'.format(ano))
    
print('{}'.format('='*8),' FIM ','{}'.format('='*8))