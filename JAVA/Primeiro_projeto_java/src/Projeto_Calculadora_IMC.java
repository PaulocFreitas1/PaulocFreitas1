import java.util.Scanner;
public interface Projeto_Calculadora_IMC {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em kg: ");
        var peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        var altura = scanner.nextDouble();
        var imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);
        String categoria;
        if (imc < 18.6) {
            categoria = "Abaixo do peso";
        } else if (imc < 24.9) {
            categoria = "Peso ideal";
        } else if (imc < 29.9) {
            categoria = "Levemente acima do peso";
        } else if (imc < 34.9) {
            categoria = "Obesidade grau I";
        } else if (imc < 39.9) {
            categoria = "Obesidade grau II";
        } else {
            categoria = "Obesidade";
        }
        System.out.println("Categoria: " + categoria);
        scanner.close();
    }
    
}
