public class Main {
    public static void main(String[] args) {

        //Utilização de try/catch para mostrar as validações criadas
        System.out.println("Teste: Fluxo normal ");
        try {
            Veiculo caminhao = new Caminhao("ABC1D23", 1000.0, 4);
            Pacote pacote = new Pacote("PKG001", 200.0, "PENDENTE");

            Rota rota = new Rota(pacote, caminhao);
            rota.iniciarEntrega();

            System.out.println("Status atual: " + pacote.getStatus());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\nTeste: Peso maior que capacidade ");
        try {
            Veiculo moto = new Moto("XYZ1A23", 50.0, true);
            Pacote pacote = new Pacote("PKG002", 100.0, "PENDENTE");

            Rota rota = new Rota(pacote, moto); // deve falhar

        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        System.out.println("\nTeste: Placa inválida ");
        try {
            Veiculo caminhao = new Caminhao("1234567", 500.0, 2); // inválida

        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        System.out.println("\nTeste: Peso inválido ");
        try {
            Pacote pacote = new Pacote("PKG003", -10.0, "PENDENTE");

        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        System.out.println("\nTeste:: Código vazio ");
        try {
            Pacote pacote = new Pacote("", 10.0, "PENDENTE");

        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        System.out.println("\nTeste: Status vazio ");
        try {
            Pacote pacote = new Pacote("PKG004", 10.0, "");

        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        System.out.println("\nTeste: Caminhão com eixo inválido ");
        try {
            Veiculo caminhao = new Caminhao("DEF2G34", 800.0, 0);

        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        System.out.println("\n Teste Finalizado");
    }
}