import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a Classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela Classe Scanner os valores digitados no Terminal
        // Exibir a mensagem final
        int numero;
        String agencia, nomeCliente;
        double saldo;
        Scanner r = new Scanner(System.in);

        System.out.println("Olá! Digite o número da conta: ");
        System.out.print("> ");
        numero = Integer.parseInt(r.nextLine());

        System.out.println("Digite o número da agência: ");
        System.out.print("> ");
        agencia = r.nextLine();

        System.out.println("Digite o seu nome: ");
        System.out.print("> ");
        nomeCliente = r.nextLine();

        System.out.println("Por fim, digite o saldo de sua conta: ");
        System.out.print("> R$");
        saldo = Double.parseDouble(r.nextLine());

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}