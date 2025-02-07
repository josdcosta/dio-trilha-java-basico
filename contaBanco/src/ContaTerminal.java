import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeCliente;
        int numeroDaConta;
        String agenciaDaConta;
        float saldoConta;

        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        agenciaDaConta = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        saldoConta = scanner.nextFloat();

        System.out.printf((
                "Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d " +
                "e seu saldo %.2f já está disponível para saque"),
                nomeCliente, agenciaDaConta, numeroDaConta, saldoConta);
    }
}