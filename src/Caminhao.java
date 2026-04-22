public class Caminhao extends Veiculo {
    private int quantEixos;

    public Caminhao(String placa, double capacidade, int quantEixos){
        super(placa, capacidade);
        setQuantEixos(quantEixos);
    }

    public int getQuantEixos(){
        return quantEixos;
    }

    public void setQuantEixos(int quantEixos){
        if (quantEixos <= 0) {
            throw new IllegalArgumentException("Quantidade de eixos deve ser maior que zero");
        }
        this.quantEixos = quantEixos;
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}