public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Datena");
        Gato gato = new Gato("Marçal");


        System.out.println("Cachorro:");
        System.out.println("Nome: " + cachorro.getNome());
        cachorro.caminha();
        cachorro.late();

        System.out.println("\nGato:");
        System.out.println("Nome: " + gato.getNome());
        gato.caminha();
        gato.mia();
    }
}