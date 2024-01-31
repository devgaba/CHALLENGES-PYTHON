print('{}'.format('='*8), 'CHALLENGE11', '{}'.format('='*8))

largura = float(input('Largura da parede: '))
altura = float(input('Altura da parede: '))
area = largura * altura
litro = 2
print('A parede tem uma área de {:.2f}m².'.format(area),
      '\nA quantidade de tinta necessária para pintar são {:.2f}L'.format(area/litro,))
print('{}'.format('='*10),' FIM ','{}'.format('='*10))
