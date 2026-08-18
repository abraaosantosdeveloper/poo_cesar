public class MathLib {
    // Definir um construtor privado impede que a classe seja instanciada.
    private MathLib() {
        throw new IllegalStateException("Esta classe não pode ser instanciada.");
    }

    // Definir métodos estáticos permite o acesso direto aos métodos.
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double media(double[] numeros) {
        // Acumulador para somar os valores do vetor recebido
        double acumulador = 0;

        // Verifica se o número é zero ou se o array é vazio.
        if (numeros == null || numeros.length == 0) {
            return 0;
        }

        for (int i = 0; i < numeros.length; i++) {
            acumulador = soma(acumulador, numeros[i]);
        }

        // Realiza o cálculo de média
        double resultado_media = acumulador / numeros.length;

        return resultado_media;
    }

    public static boolean ehPrimo(int numero) {
        // Números menores e iguais a 1 não são primos
        if (numero <= 1) {
            return false;
        }

        // O número dois é, obrigatoriamente, primo e o único primo par.
        if (numero == 2) {
            return true;
        }

        // Se o número for par e maior que 2, não é primo
        if (numero % 2 == 0) {
            return false;
        }

        // Testa os divisores ímpares a partir de 3 até a raíz quadrada do número.
        // O operador de módulo (%) verifica se o resto da divisão é 0. Se for, o número
        // não é primo.
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

};
