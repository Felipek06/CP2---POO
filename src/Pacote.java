public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        setCodigo(codigo);
        setPeso(peso);
        setStatus(status);
    }

    public void atualizarStatus(String novoStatus) {
        setStatus(novoStatus);
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getStatus() {
        return status;
    }

    private void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código não pode ser vazio");
        }
        this.codigo = codigo;
    }

    private void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero");
        }
        this.peso = peso;
    }

    private void setStatus(String status) {
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("Status não pode ser vazio");
        }
        this.status = status;
    }
}