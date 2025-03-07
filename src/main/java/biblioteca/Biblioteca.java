package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que represeenta una biblioteca con una colección de libros
 * Permite agregar, eliminar, y buscar libros por título y por autor
 *
 * @author Kyle Lamm
 * @version 7.3.2025
 * @see Libro
 */

public class Biblioteca {

    /**
     * Lista de libros disponibles en la biblioteca
     */
    private final List<Libro> libros;

    /**
     * Constructor por defecto de la biblioteca sin libros
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor con parámetros.
     *
     * @param libros lista de libros con la que se inicializa la biblioteca
     */

    //  NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Agrega un libro a la biblioteca
     *
     * @param libro Un libro para agregar
     * @return {@code true} si el libro se ha agregado correctamente o {@code false} si el libro no se ha agregado correctamente
     * @see Libro
     */

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }


    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }


    /**
     * Devuelve la lista de libros de la biblioteca
     *
     * @return Lista de libros de la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Buscar un libro por titulo. Si no existe, revuelve null.
     *
     * @param titulo Titulo del libro para buscar
     * @return Un libro lo cual hemos buscado
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    //  No testearlo

    /**
     * @param autor Un autor cuyo libro buscamos
     * @return Un libro del autor determinado
     * @deprecated Este metodo ha quedado obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)}
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }


    /**
     * Busca totods los libros de un autor determinado
     *
     * @param autor Un autor para cuyos libros buscamos
     * @return lista de libros escritos por un autor determinado
     * @since V2.0
     * Sustituye al metodo {@link #encuentraLibroPorAutor(String)}
     */

    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}



