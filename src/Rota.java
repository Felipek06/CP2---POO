public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null) {
            throw new IllegalArgumentException("Pacote não pode ser nulo");
        }
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo não pode ser nulo");
        }
        if (pacote.getPeso() > veiculo.getCapacidade()) {
            throw new IllegalArgumentException("Peso do pacote excede a capacidade do veículo");
        }

        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {
        pacote.atualizarStatus("EM ROTA");

        System.out.println(
                "Levando pacote " + pacote.getCodigo() +
                        " no veiculo com placa " + veiculo.getPlaca() +
                        " com carga de " + veiculo.getCapacidade() +
                        " " + veiculo.getTipoCapacidade()
        );
    }
}