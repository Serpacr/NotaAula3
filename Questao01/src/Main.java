public class Main {
    public static void main(String[] args) {
        // Criação de objetos
        Gerente gerente = new Gerente("João", 1980, 10000.0, "Desenvolvimento de Software");
        Programador programador = new Programador("Maria", 1990, 8000.0, "Java");

        // Chamada de métodos
        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        gerente.informarSalario();
        System.out.println("Idade: " + gerente.calcularIdade());
        gerente.informarProjeto();

        System.out.println("\nProgramador:");
        System.out.println("Nome: " + programador.getNome());
        programador.informarSalario();
        System.out.println("Idade: " + programador.calcularIdade());
        programador.informarLinguagem();
    }
}