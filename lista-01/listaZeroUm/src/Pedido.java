// 5. Defina uma classe para representar um Pedido. Esta classe deve utilizar
// encapsulamento, contendo atributos para armazenar o número do pedido, o
// nome do cliente e o valor total do pedido. Defina também um construtor.

public class Pedido {
    private int numeroPedido;
    private String nomeCliente;
    private double valorTotal;

    public Pedido(int numero, String nome, double valor) {
        numeroPedido = numero;
        nomeCliente = nome;
        valorTotal = valor;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getNome() {
        return nomeCliente;
    }

    public double getValor() {
        return valorTotal;
    }

}
