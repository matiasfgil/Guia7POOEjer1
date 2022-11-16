package atributoLibro;

public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumPag;

    //constructor vacio
    public Libro() {

    }

    //constructor por parametros
    public Libro(int ISBN, String Titulo, String Autor, int NumPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPag = NumPag;
    }

    @Override
    public String toString() {
        return "Libro{ " + "ISBN= " + ISBN + ", Titulo= " + Titulo + ", Autor= " + Autor + ", Paginas= " + NumPag + '}';
    }

}
