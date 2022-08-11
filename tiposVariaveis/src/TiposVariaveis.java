public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        byte idade = 18;
        short ano = 2022;
        int cep = 79654232; // se começar com 0, o número será desconsiderado na compilação
        long cpf = 98567432422L; // se começar com 0, o número será desconsiderado na compilação
        float OUTRO_PI = 3.1415F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; // não é possível fazer isso, pois o tipo short não comporta a possível precisão do tipo int

        // CONSTANTES
        final double PI = 3.1415;
        
        // VARIÁVEIS
        char nome = 'a';
        String meuNome = "Adriel Carmo";
    }
}