def contar_vogais(texto):
    texto_minusculo = texto.lower()
    vogais = "aeiou"
    contador = 0
    for caractere in texto_minusculo:
        if caractere in vogais:
            contador += 1
    return contador


if __name__ == "__main__":
    exemplo_texto = input()
    numero_de_vogais = contar_vogais(exemplo_texto)
    print(f"O número de vogais na string '{exemplo_texto}' é: {numero_de_vogais}")