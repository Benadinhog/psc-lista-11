// Classe Carro que herda de Veiculo
class Carro extends Veiculo {

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Implementação do método acelerar()
    @Override
    public void acelerar() {
        System.out.println(modelo + " " + marca + " está acelerando de 0 a 100 km/h em X segundos.");
    }
}