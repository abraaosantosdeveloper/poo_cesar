// 6. Defina uma classe para representar um Veículo. Esta classe deve utilizar
// encapsulamento, contendo atributos para armazenar o número da placa, o nome
// do seu dono, o modelo do carro, o fabricante e o valor de mercado do carro.
// Defina também um construtor.

public class Veiculo {
    private String numeroPlaca, nomeProprietario, modeloVeiculo, nomeFabricante;
    private double valorMercado;

    public Veiculo(String placa, String proprietario, String modelo, String fabricante, double valor) {
        numeroPlaca = placa;
        nomeProprietario = proprietario;
        modeloVeiculo = modelo;
        nomeFabricante = fabricante;
        valorMercado = valor;
    }

    public String getInformacaoVeiculo() {
        return "\nPlaca: " + numeroPlaca + "\nProprietário: " + nomeProprietario + "\nFabricante: " + nomeFabricante
                + "\nModelo: " + modeloVeiculo + "\nValor: " + valorMercado;
    }
}
