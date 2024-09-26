import java.util.ArrayList;
public static void main(String[] args) {
    ArrayList<Livro> livros = new ArrayList<>();

    livros.add(new Livro("Java para iniciantes","Cleitin",111.99));
    livros.add(new Ebook("Como codar em java e ser feliz","Marcelin",89.90, 40));
    livros.add(new Livro("Estrutura de dados em python","Rogerin",150));
    livros.add(new Ebook("Effective Java","Carmelia",59.99, 150));

    for (Livro livro : livros) {
        livro.exibirDetalhes();
        System.out.println();
    }
}