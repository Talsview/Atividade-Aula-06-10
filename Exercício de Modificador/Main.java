public class Main {
    
    public static void main(String[] args) {
        Livro livro = new Livro(" 1915", "Franz Kafka", 200);
        livro.exibirInfo();
        //Quando tento acessar o autor da um erro de visibilidade por conta que ele e private
    }
}
