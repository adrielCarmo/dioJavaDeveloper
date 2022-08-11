public class Operadores {
    public static void main(String[] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); // 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); // 1111

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao); // 1111

        concatenacao = "1"+1+1+1; 
        System.out.println(concatenacao); // 1111

        concatenacao = "1"+(1+1+1); // primeiro resolve os parenteses, depois as outras operacoes
        System.out.println(concatenacao); // 13
    }
}