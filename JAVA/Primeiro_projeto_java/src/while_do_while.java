import java.util.Scanner;
public class while_do_while {
    public static void main(String[] args) {
       var name = " ";
       var scanner = new Scanner(System.in);
       while (!name.equals("exit")) {
           System.out.println("Digite um nome (ou 'sair' para encerrar): ");
           name = scanner.next();
           System.out.println("Olá, " + name + "!");
       }
    }
}