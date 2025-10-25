import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe principal para encontrar e exibir números pares ou ímpares
 * em um intervalo fornecido pelo usuário, em ordem decrescente.
 */
public class Projeto_calculo_de_pares {

    public static void main(String[] args) {
        // Inicializa o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        String escolha;

        try {
            System.out.println("--- Buscador de Números no Intervalo ---");
            
            // 1. Receber o primeiro número (N1)
            System.out.print("Digite o primeiro número (N1): ");
            numero1 = scanner.nextInt();

            // 2. Receber o segundo número (N2), garantindo que N2 > N1
            boolean entradaValida = false;
            while (!entradaValida) {
                System.out.print("Digite o segundo número (N2) - deve ser maior que N1: ");
                numero2 = scanner.nextInt();

                if (numero2 > numero1) {
                    entradaValida = true;
                } else {
                    System.out.println("Erro: O segundo número (N2) deve ser maior que o primeiro (N1). Tente novamente.");
                }
            }
            // 3. Receber a escolha do usuário: "PAR" ou "IMPAR"
            entradaValida = false;
            do {
                System.out.print("Escolha o tipo de número (PAR ou IMPAR): ");
                escolha = scanner.next().toUpperCase(); // Converte para maiúsculas para facilitar a comparação

                if (escolha.equals("PAR") || escolha.equals("IMPAR")) {
                    entradaValida = true;
                } else {
                    System.out.println("Escolha inválida. Por favor, digite 'PAR' ou 'IMPAR'.");
                }
            } while (!entradaValida);
            
            System.out.println("\n------------------------------------------------");
            System.out.printf("Números %s entre %d e %d (Decrescente):\n", escolha, numero1, numero2);
            
            int moduloDesejado = escolha.equals("PAR") ? 0 : 1; 

            // Loop for decrescente: começa em N2 e vai até N1
            for (int i = numero2; i >= numero1; i--) {
                if (i % 2 == moduloDesejado) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n------------------------------------------------");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
            scanner.close();
    }
    }
}
