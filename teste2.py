numUsuario1 = int (input('Digite o primeiro número: '))
numUsuario2 = int (input('Digite o segundo número: '))
numUsuario3 = int (input('Digite o terceiro número: '))

if numUsuario1 != numUsuario2 and numUsuario1 != numUsuario3 and numUsuario3 != numUsuario2:
    print('\nNão existem números iguais!')

elif numUsuario1 == numUsuario2 and numUsuario1 == numUsuario3 and numUsuario3 == numUsuario2:
    print('\nExistem 3 números iguais!')

elif numUsuario1 == numUsuario2 and numUsuario1 != numUsuario3 or numUsuario1 == numUsuario3 and numUsuario1 != numUsuario2 or numUsuario1 != numUsuario2 and numUsuario2 == numUsuario3:
    print('\nExistem 2 números iguais!')
