public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, int nascimento, double salario, String linguagem) {
        super(nome, nascimento, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("O programador trabalha com a linguagem: " + linguagem);
    }
}