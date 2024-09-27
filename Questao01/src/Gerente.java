public class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, int nascimento, double salario, String projeto) {
        super(nome, nascimento, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("O gerente está trabalhando no projeto: " + projeto);
    }
}