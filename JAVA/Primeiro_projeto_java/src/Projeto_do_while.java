import java.util.InputMismatchException;
import java.util.Scanner;


public class Projeto_do_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Verificador de Múltiplos ---");
        
        int nInicial = 0;
        int nAtual;
        boolean primeiroNumeroValido = false;
        // 1. Receber o Número Inicial (N_inicial)
        while (!primeiroNumeroValido) {
            try {
                System.out.print("1. Digite o número inicial (N_inicial - deve ser positivo): ");
                nInicial = scanner.nextInt();
                
                if (nInicial > 0) {
                    primeiroNumeroValido = true;
                } else {
                    System.out.println("O número inicial deve ser maior que zero. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); 
            }
        }
        // --- 2. Processamento dos Outros N Números ---
        System.out.println("\nAgora, informe outros números. O programa para quando for digitado um MÚLTIPLO de " + nInicial + ".");
        
        // Loop do-while: garante que pelo menos um número N_atual será solicitado.
        // O loop continua enquanto o resto da divisão for diferente de 0.
        do {
            try {
                System.out.print("Digite um número: ");
                nAtual = scanner.nextInt();
                
                if (nAtual < nInicial) {
                    System.out.printf("Número %d IGONORADO: é menor que o número inicial (%d).\n", nAtual, nInicial);
                    continue; // Pula para a próxima iteração do loop
                }

                // Verifica a condição de parada: resto da divisão é zero?
                if (nAtual % nInicial != 0) {
                    // O número não é múltiplo, o loop continua
                    System.out.printf("O número %d NÃO é múltiplo de %d (Resto: %d). Continue tentando...\n", 
                                      nAtual, nInicial, nAtual % nInicial);
                } else {
                    // O número é múltiplo, o loop será encerrado
                    System.out.printf("\nSUCESSO! O número %d é múltiplo de %d. Fim do programa.\n", nAtual, nInicial);
                    // Aqui a condição do 'while' será falsa e o loop encerrará
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Consome a entrada inválida
            }
            
        } while (true); // Loop infinito, controlado pelo 'break'

        // Fecha o scanner
        scanner.close();
    }
}
