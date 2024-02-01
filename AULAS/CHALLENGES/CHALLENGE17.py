from math import hypot

print('{}'.format('='*8),'CHALLENGE17','{}'.format('='*8))
catOposto = float(input('Comprimento do cateto oposto: '))
catAdja = float(input('Comprimento do cateto adjacente: '))
hipot = hypot(catOposto, catAdja)
print('A hipotenusa vai medir {:.2f} '.format(hipot))

print('{}'.format('='*8),' FIM ', '{}'.format('='*8))
