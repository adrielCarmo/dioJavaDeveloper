public class Escolar {
    public static void main(String[] args) {
        // EXEMPLO PARA ESTRUTURA CONDICIONAL ENCADEADA
        int nota = 6;

        /* 
            se nota maior igual a 7, aprovado; caso nao, ele pula pra proxima
            condicao, de recuperacao no caso; caso não novamente, 
            ele pula pro senão final;
        */ 
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
            
    }
}
