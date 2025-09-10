import java.util.Scanner;

public class DobroTercaParte {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();

        double dobro = numero * 2;
        double tercaParte = numero / 3;

        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("A terça parte de " + numero + " é " + tercaParte);

        entrada.close();
    }
}