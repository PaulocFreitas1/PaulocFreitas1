conta_normal = True
conta_universitaria = False
conta_especial = False
saldo = 2000    
saque = 1000   
cheque_especial = 500

if conta_normal: 
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    elif saldo <= (saldo + cheque_especial):
        print("Saque realizado com cheque especial!")
    else:
        ("Saldo insuficiente para saque.")
elif conta_universitaria:
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    else:
        print("Saldo insuficiente para saque.")
elif conta_especial:
    print("Conta especial não implementada.")
else: 
    print("Sistema de conta inválido.")