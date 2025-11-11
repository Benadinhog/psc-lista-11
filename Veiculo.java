// Classe abstrata Veiculo
abstract class Veiculo {
    // Atributos
    String marca;
    String modelo;
    int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método concreto
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    // Método abstrato
    public abstract void acelerar();
}