n1 = float(input('Nota 1: '))
n2 = float(input('Nota 2: '))
m = (n1 + n2)/2
print('A MÉDIA É: {:.1f}'.format(m))

if m == 6:
    print('Média boa! Parabéns')
elif m >= 8:
    print('Média ótima! Congratulations!')
else:
    print('Média ruim! Estude mais!')