import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Digite numero da sua conta:");
        numero = input.nextInt();
        System.out.println("Digite nome da sua agencia e nome do cliente");
        agencia = input.next();
        System.out.println("Digite nome do cliente");
        nomeCliente = input.next();
        System.out.println("Digite o saldo:");
        saldo = input.nextDouble();

        System.out.println("Conta Criada!");
    }
}
