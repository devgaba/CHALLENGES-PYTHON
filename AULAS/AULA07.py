# 5 + 2 == 7
# 5 -2 == 3
# 5 * 2 == 10
# 5 / 2 == 2.5
# 5 ** 2 == 25
# 5 //2 ==  2
# 5 % 2 == 1

# Ordem de Precedência
# 1 -> () - parênteses
# 2 -> ** - exponenciação
# 3 -> *, /, //, % - mult, div, mult. inteira, resto
# 4 -> + - -  soma e subtração

n1 = int(input('Digite o primeiro número: '))
n2 = int(input('Digite o segundo número: '))
s = n1 + n2
m = n1 * n2
d = n1 / n2
p = n1 ** n2
di = n1 // n2
r = n1 % n2
print('A soma é {}. O produto é {}. A divisão é {:.3f}. '.format(s,m,d))
print('A divisão inteira é {}. O resto da divisão é {}'.format(di, r))
print('A potência {}'.format(p))

# end='' -> tira a quebra de linha
# \n -> coloca a quebra de linha