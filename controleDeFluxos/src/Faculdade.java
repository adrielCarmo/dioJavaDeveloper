public class Faculdade {
    public static void main(String[] args) {
        // cenário 1 --> operador ternário composto (if e else)
        int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        // cenário 2 --> operador ternário encadeado (if, else if, else)
        nota = 6;
		resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
