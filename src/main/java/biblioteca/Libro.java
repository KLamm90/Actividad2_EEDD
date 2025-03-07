package biblioteca;

public class Libro {

    /**
     * Clase que representa un libro con una colección de libros
     * Permite get y set el valor del titulo, autor, y año del publicación
     *
     * @author Kyle Lamm
     * @version 7.3.2025
     * titulo: representa el nombre del libro
     * autor: representa el autor del dicho libro
     * anioPublicacion: representa el año de publicación del dicho libro
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    /**
     * Constructor del Libro con parámetros
     *
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    /**
     * Devolver el nombre del autor.
     *
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Devuelve el año del dicho libro.
     *
     * @return anioPublicacion
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
