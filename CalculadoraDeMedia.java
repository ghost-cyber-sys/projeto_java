import java.util.Scanner;

public class CalculadoraDeMedia {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a primeira nota
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        // Solicita a segunda nota
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2) / 2;

        // Exibe o resultado com uma formatação clara
        System.out.printf("A média entre %.1f e %.1f é igual a %.1f%n", nota1, nota2, media);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
