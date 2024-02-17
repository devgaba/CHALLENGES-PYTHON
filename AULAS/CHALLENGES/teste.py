print()
print()
print('{}'.format('='*8),' O PEREGRINO PELA HESTRADAH DA BAHEA ','{}'.format('='*8))

carro = str(input('Escreva o nome do carro: '))
ano = int(input('Digite o ano do carro! '))

if (carro == 'Uno quadrado' and ano <= 2010):
    print('Nossa, seu carro é maneiro! ')

else:
    print('\033[7,33mWoww, que carro doidão!\33[m')

