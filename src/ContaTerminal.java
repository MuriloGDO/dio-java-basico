import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        double numeroDaConta = sc.nextDouble();

        sc.nextLine(); // Consumir a quebra de linha que fica após o nextDouble

        System.out.println("Digite o número da agência: ");
        String numeroDaAgencia = sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeDoCliente = sc.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        String mensagem = "Olá "
                        .concat(nomeDoCliente)
                        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                        .concat(numeroDaAgencia)
                        .concat(", conta ")
                        .concat(String.format("%.0f", numeroDaConta))
                        .concat(" e seu saldo R$")
                        .concat(String.format("%.2f", saldo))
                        .concat(" já está disponível para saque.");
        System.out.println(mensagem);
    }
}
