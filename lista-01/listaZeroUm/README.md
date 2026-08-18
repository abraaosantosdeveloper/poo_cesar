# Resolução da Lista de Exercícios 01

### 01. A diferença entre classes e objetos:

> Uma Classe pode ser comparada a uma "fábrica" de coisas, e os objetos, aos produtos fabricados por esta fábrica. Em outras palavras, uma Motocicleta é uma classe: afinal, existem várias motocicletas diferentes, cada qual com seus atributos. Já uma Honda Fireblade 1000cc é um objeto, ou seja, uma instância da classe motocicleta, com seus próprios atributos. De forma prática:


```java

// Classe/Modelo/"Fábrica"
public class Motocicleta {
    // atributos
    private String fabricante, modelo;
    private int cilindrada;

    public setFabricante(String fabNome){
        fabricante = fabNome;
    }
}

```
### Já os objetos...

```java

// Objeto -> Instância de uma classe;
Motocicleta m = new Motocicleta();

/*
*   É possível definir os atributos diretamente — se o nível de acesso permitir
*   usando o método a seguir: 
*   
*   [Classe].atributo = {valor}
*   ex:
*/

m.fabricante = "Honda";

/*
*   Se o nível de acesso for privado como na classe acima, é possível usar métodos.
*/

m.setFabricante("Yamaha");

```

### 02. Construtores, seu papel e regras de utilização:
> Os construtores servem para inicializar um objeto de uma classe, e possuem o mesmo nome de suas respectivas classes. Quando eles não são definidos, o compilador do java cria um construtor genérico sem parâmetros, o que, aliás, é sua principal função definir: os parâmetros dos novos objetos.

### Exemplo prático:
```java
public class Produto {
    private String nome;
    private int codigo;
    private double preco;

    public Produto(String nome_prod, int cod, double preco_prod){
        nome = nome_prod;
        codigo = cod;
        preco = preco_prod;
    }
}

Produto p = new Produto("Cafe 3 coracoes 100% arabica", 1, 25.00);

```

### 03. Conceito de abstração:
> A abstração, basicamente, consiste em trazer à tona aquilo que realmente importa. Por exemplo: para dirigir um carro não precisamos saber a fórmula completa que ele utiliza para realizar a combustão, ligar os faróis, quebrar a inércia e iniciar o movimento, realizar trabalho, etc. Tudo o que precisamos fazer é interagir com sua interface abstrata (volante, pedais, marcha, etc). No código, isso se traduz da seguinte forma:

- Para um e-commerce, o produto precisa de nome, valor e codigo;
- Para uma transportadora, apenas as dimensões e peso.

### Exemplo de abstração:

```java
public abstract class Pagamento {
    // Toda forma de pagamento possui um valor
    protected double valor;

    //=====================================================================================//
    //                                                                                     //
    //     Cada pagamento precisa ser processado. Como isso será feito, pouco importa.     //
    //     Contudo, quem realiza esse processamento precisa implementar sua forma.         //
    //                                                                                     //
    //=====================================================================================//
    public abstract void processarPagamento();
}

```
## ⚠️ Disclaimer ⚠️ 
#### Métodos que não são requisitos da questão e, ainda assim, estão presentes nas classes, foram criados para fins de testes. Os testes estão presentes na aplicação principal. Para acessar, [clique aqui](./src/App.java)

### 04. Classe: Funções Matemáticas
##### Acesse aqui: [Classe MathLib](./src/MathLib.java)

### 05. Classe: Pedido
##### Acesse aqui: [Classe Pedido](./src/Pedido.java)

### 06. Classe: Veículo
##### Acesse aqui: [Classe Veículo](./src/Veiculo.java)

### 07. Classe: Candidato
##### Acesse aqui: [Classe Candidato](./src/Candidato.java)
