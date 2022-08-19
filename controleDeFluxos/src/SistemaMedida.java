public class SistemaMedida {
    public static void main(String[] args) {

        /* cenário com estrutura de ifs encadeados
		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MEDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
        */

        // mesma condicao com a estrutura switch
        String sigla = "M";

        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break; // sem o break, ele continua executando os outros casos, mesmo que já a condição já tenha sido atendida aqui
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default: // se nenhuma das condições forem atendidas, o fluxo cai aq (else)
                System.out.println("INDEFINIDO");
                break;
        }
    }
}
