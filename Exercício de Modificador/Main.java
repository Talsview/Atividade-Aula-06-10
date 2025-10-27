public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("1915", "Franz Kafka", 200);

        livro.exibirInfo();

        System.out.println("\nAutor: " + livro.getAutor());

        livro.setAutor("F. Kafka");
        System.out.println("Autor: " + livro.getAutor());
    }
}


