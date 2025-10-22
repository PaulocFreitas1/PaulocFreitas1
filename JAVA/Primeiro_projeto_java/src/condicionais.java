import java.util.Scanner;
public class condicionais {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        var name = scanner.next();
        System.out.println("Digite a sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Voce é emancipado? ");
        var emancipado = scanner.nextBoolean();
        
        var canDrive = (age >= 18 || (age >=16 && emancipado));
        var message = " ";
        if (canDrive) {
            message = name + ", você pode dirigir.\n";
        } else {
            message = name + ", você não pode dirigir.\n";            
        }
        System.out.println(message);
        System.out.println("Fim do programa.");
        scanner.close();


    }
}