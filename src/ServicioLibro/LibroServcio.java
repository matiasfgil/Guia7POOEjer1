package ServicioLibro;

import atributoLibro.Libro;
import java.util.Scanner;

public class LibroServcio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro() {
        System.out.println("Introducir la ISBN: ");
        int ISBN = leer.nextInt();
        System.out.println("Introducir el titulo: ");
        String Titulo = leer.next();
        System.out.println("Introducir el autor: ");
        String Autor = leer.next();
        System.out.println("Introducir el numero de paginas: ");
        int NumPag = leer.nextInt();
        
        return new Libro(ISBN, Titulo, Autor, NumPag);
        
    }
}
