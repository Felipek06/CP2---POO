public abstract class Veiculo {
    private String placa;
    private Double capacidade;
    private final String tipoCapacidade = "Kg";

    public Veiculo(String placa, Double capacidade){
        setPlaca(placa);
        setCapacidade(capacidade);
    }

    public abstract String getTipo();

    public String getPlaca(){
        return placa;
    }

    public Double getCapacidade(){
        return capacidade;
    }

    public String getTipoCapacidade(){
        return tipoCapacidade;
    }

    public void setPlaca(String placa){
        if (placa == null || !placa.toUpperCase().matches("[A-Z]{3}[0-9][A-Z][0-9]{2}")) {
            throw new IllegalArgumentException("Placa inválida (padrão Mercosul AAA1A11)");
        }
        this.placa = placa.toUpperCase();
    }

    public void setCapacidade(Double capacidade){
        if (capacidade == null || capacidade < 0) {
            throw new IllegalArgumentException("Capacidade não pode ser negativa");
        }
        this.capacidade = capacidade;
    }
}