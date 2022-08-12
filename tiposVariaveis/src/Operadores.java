public class Operadores {
    public static void main(String[] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
        System.out.println(nomeCompleto);
        
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

        int numero = 5;
                
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        //fluxo de repetição
        int num = 5;

        num = num + 1; //atribur o valor que esta mais um

        num++; // incrementando em mais uma unidade

        System.out.println(num++); // aqui o valor antigo (antes da operação de incremento) será impresso

        //System.out.println(num); // aqui sera impresso o valor atualizado, pois o programa imprime primeiro e depois faz a operação
        System.out.println(++num);
    
    }
}