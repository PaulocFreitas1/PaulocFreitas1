def par_ou_impar(numero):
    """
    Verifica se um número inteiro é par ou ímpar.

    Args:
        numero: O número inteiro a ser verificado.

    Returns:
        Uma string 'Par' se o número for par, ou 'Ímpar' se for ímpar.
    """
    if numero % 2 == 0:
        return "Par"
    else:
        return "Ímpar"

# --- Exemplo com entrada do usuário ---

# Solicita ao usuário que digite um número e armazena a entrada na variável 'entrada_usuario'
entrada_usuario = input()

# Converte a entrada do usuário (que é uma string por padrão) para um número inteiro
try:
    numero_inteiro = int(entrada_usuario)

    # Chama a função e exibe o resultado
    resultado = par_ou_impar(numero_inteiro)
    print(resultado)

except ValueError:
    # Captura o erro se o usuário digitar algo que não seja um número e exibe uma mensagem
    print("Entrada inválida. Por favor, digite um número inteiro.")