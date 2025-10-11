# exercicio2-bissexto.py
def verificador_ano_bissexto(ano):
   
    if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
        # AS instruçãoes return devem estar dentro do bloco if
     return "SIM"
    else:
        return "NÃO"

# Fora da função, você solicita o input e chama a função
try:
    ano = int(input())
    resultado = verificador_ano_bissexto(ano)
    print(f'{resultado}')
except ValueError:
    print("Por favor, digite um número inteiro.")