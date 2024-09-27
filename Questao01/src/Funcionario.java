public class Funcionario {
    private String nome;
    private int nascimento;
    private double salario;

    public Funcionario(String nome, int nascimento, double salario) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.println("O salário do funcionário é: " + salario);
    }

    public int calcularIdade() {
        int anoAtual = 2024; // Substitua pelo ano atual
        return anoAtual - nascimento;
    }

    public String getNome() {
        return nome;
    }
}