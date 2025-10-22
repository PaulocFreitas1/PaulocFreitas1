import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        var option = scanner.nextInt();
        var message = switch (option) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Opção inválida";
        };
        System.out.println("O dia da semana é: " + message);
        scanner.close();
        }
    }