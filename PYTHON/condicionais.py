MAIOR_IDADE = 18
IDADE_ESPECIAL = 17

idade = int(input("Digite sua idade: "))
if idade >= MAIOR_IDADE:
    print("Maior de idade, pode tirar a CNH.") 
if idade < MAIOR_IDADE:
    print("Menor de idade, nao pode tirar a CNH.") 

if idade >= MAIOR_IDADE:
    print("Pode tirar a CNH.")
elif idade == IDADE_ESPECIAL:
    print("Pode tirar a CNH com autorização dos pais.")
else: 
    print("Idade inválida para CNH.")