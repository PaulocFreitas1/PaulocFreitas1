# A função 'soma_tupla' para receber uma tupla de números inteiros como argumento
def somar_tupla(lista_string):
    # Utiliza a função 'sum()' nativa do Python para somar os elementos da tupla
    soma = sum(lista_string)
    return soma

if __name__ == "__main__":
    # Pede ao usuário para digitar uma linha de números separados por espaço
    elementos = input()

    # Converte a string de entrada para uma tupla de inteiros
    # .split() divide a string em uma lista de strings
    # map(int, ...) converte cada string para um inteiro
    # tuple() converte o objeto map em uma tupla
    try:
        lista_string = tuple(map(int, elementos.split()))

        # Chama a função para calcular a soma e imprime o resultado
        resultado = somar_tupla(lista_string)
        print(f"A soma dos elementos da tupla é: {resultado}")
    except ValueError:
        print("Erro: Entrada inválida. Por favor, digite apenas números inteiros separados por espaço.")
