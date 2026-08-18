// 7. Defina uma classe para representar um candidato a uma eleição. Esta classe
// deve utilizar encapsulamento, contendo atributos para armazenar o número do
// candidato, seu nome e o número de votos que ele possui. Defina também um
// método para incrementar o número de votos e um construtor.

public class Candidato {
    private String nomeCandidato;
    private int numeroCandidato, qtdVotos = 0;

    public Candidato(String nome, int numero) {
        nomeCandidato = nome;
        numeroCandidato = numero;
    }

    public void setVotos(int novosVotos) {
        qtdVotos += novosVotos;
    }

    public String getInformacaoCandidato() {
        return "\nCandidato: " + nomeCandidato + "\nNúmero eleitoral: " + numeroCandidato + "\nTotal de votos: "
                + qtdVotos;
    }
}
