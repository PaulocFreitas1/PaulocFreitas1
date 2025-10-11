
import java.util.Scanner;


    public class CalculaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.printf("Olá %s, sua idade é: %s anos.\n", nome, idade);

        scanner.close();
    
  }
}