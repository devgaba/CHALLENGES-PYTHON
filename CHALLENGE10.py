print('{}'.format('='*8), 'CHALLENGE10', '{}'.format('='*8))
dinheiro_usuario = float(input('Digite a quantidade de dinheiro que você possui: R$'))
dolar = 3.27
calcConversao = dinheiro_usuario / dolar
print('Você pode comprar U${:.2f}, com R${:.2f}\n'.format(calcConversao,dinheiro_usuario))

print('Considerando que o dólar é U${}\n'.format(dolar))
print('{}'.format('='*13), 'FIM', '{}'.format('='*11))
