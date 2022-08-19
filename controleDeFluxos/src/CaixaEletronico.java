public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        // como o valor solicitado é menor do que o saldo da conta, ele entra na condição e faz a operação
        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }
        
        System.out.println(saldo);
    }
}
