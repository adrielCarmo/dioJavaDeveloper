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
        
        //OPERADOR TERNÁRIO
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";
        if (a == b) {
            resultado = "verdade";
        } else {
            resultado = "falso";    
        }

        System.out.println(resultado);

        a = 6;
        resultado = a == b ? "verdade" : "falso"; // operacao utilizando o ternario
        System.out.println(resultado);

        //OPERADORES RELACIONAIS

        int n1,n2;
        n1 = 6;
        n2 = 5;

        boolean result = n1 == n2;

        result = n1 > n2; // o num1 é maior que o n2? saída: true
        result = n1 < n2; // o num é menor que o n2? saída: false
        result = n1 != n2; // o num1 é diferente do n2? saída: true
        result = n1 >= n2; // o num1 é maior ou igual ao n1? saída: true
        result = n1 <= n2; // o num1 é menor ou igual ao n2? saída: false

        // no caso de objetos e textos, utilizamos comparacoes em metodos, como o equals por exemplo
        String nome = "Adriel";
        String nome2 = "Yann";

        System.out.println(nome == nome2); // nao é indicado

        System.out.println(nome.equals(nome2)); // forma indicada para comparar se os nomes sao iguais
    
        // operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condicoes sao verdadeiras!");
        } else {
            System.out.println("Alguma delas é falsa, ou todas sao falsas!");
        }

        if (condicao1 || condicao2) {
            System.out.println("Alguma das condicoes sao verdadeiras, ou as duas sao verdadeiras");
        }
    
    }
}