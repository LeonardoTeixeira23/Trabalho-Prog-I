

public class livro {

    String titulo, isbn, valor, autor, editora; 
    int estoque;

    public livro(String tl, String isbn, String vl,
                String aut, String edt, int est){
        this.titulo = tl;
        this.isbn = isbn;
        this.valor = vl;
        this.autor = aut;
        this.editora = edt;
        this.estoque = est;
    }
}
