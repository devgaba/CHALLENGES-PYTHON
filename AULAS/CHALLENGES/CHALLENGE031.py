print('{}'.format('='*8),'CHALLENGE031','{}'.format('='*8))

distancia = float(input('Qual a distância da viagem em Km? '))

if distancia <= 200.00:
    taxa = 0.50
    calcPreco = distancia * taxa
    print('O preço da viagem com taxa de R${:.2f} é R${:.2f}'.format(taxa, calcPreco))
else:
    taxa = 0.45
    calcPreco = distancia * taxa
    print('O preço da viagem com taxa de R${:.2f} é R${:.2f}'.format(taxa, calcPreco))
    

print('{}'.format('='*8),' FIM ','{}'.format('='*8))