public class App {
    public static void main(String[] args) throws Exception {
        double[] listaNumeros = { 10.0, 8.0 };
        double[] listaNumeros2 = { 10.0, 8.0, 21.0, 14.0, 11.5 };
        int numero = 5;

        // testes MathLib
        System.out.println(MathLib.soma(listaNumeros[0], listaNumeros[1])); // 18
        System.out.println(MathLib.somatorio(listaNumeros2)); // 64,5
        System.out.println(MathLib.somatorio_var_args(listaNumeros2)); // 64,5
        System.out.println(MathLib.somatorio_var_args(7, 3, 1, 10, 20, 15, 19)); // 75
        System.out.println(MathLib.multiplicacao(7, 3, 1, 10, 20, 15, 19)); // 1.197.000
        System.out.println(MathLib.media(listaNumeros)); // 9.0
        System.out.println(MathLib.ehPrimo(numero)); // True

        // testes Pedido
        Pedido novoPedido = new Pedido(1, "Maurício", 25.00);
        System.out.println("\nNúmero do pedido: " + novoPedido.getNumeroPedido() + "\nNome do cliente: "
                + novoPedido.getNome() + "\nValor: " + novoPedido.getValor());

        // testes Veículo
        Veiculo novoVeiculo = new Veiculo("AB1C9E12", "Maurício", "Civic", "Honda", 135.900);
        System.out.println(novoVeiculo.getInformacaoVeiculo());

        // testes Candidato
        Candidato candidato = new Candidato("Ernesto", 71);
        candidato.setVotos(100);
        candidato.setVotos(200);
        System.out.println(candidato.getInformacaoCandidato()); // Ernesto | 71 | 300
    }
}
