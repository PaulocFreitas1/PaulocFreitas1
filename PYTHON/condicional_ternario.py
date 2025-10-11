saldo = 2000
saque = 3000

status = "Sucesso" if saldo >= saque else "Saldo insuficiente"
print(f"Saque realizado com {status}!") if saldo >= saque else print("Saldo insuficiente para saque.")