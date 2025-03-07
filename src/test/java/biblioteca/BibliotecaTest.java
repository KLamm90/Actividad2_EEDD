package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }


    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro));
    }

    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.eliminarLibro(libro));
    }


    @Test
    void encuentraLibroPorTitulo() {
        List<Libro> libros = new ArrayList<Libro>();

        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(libro);
        for (Libro libro1 : libros) {
            assertTrue(libro1.getTitulo().equals("The Art of Computer Programming"));
        }
    }
    @Test
    void encuentraLibroPorTituloNoExiste() {
        List<Libro> libros = new ArrayList<Libro>();

        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(libro);
        for (Libro libro1 : libros) {
            assertTrue(libro1.getTitulo().equals("The Art of Science"));
        }
    }

    @Test
    void encuentraLibrosPorAutor() {
        List<Libro> libros = new ArrayList<Libro>();

        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(libro);
        for (Libro libro1 : libros) {
            assertTrue(libro1.getAutor().equals("Donald Knuth"));
        }

    }

    @Test
    void encuentraLibrosPorAutorNoExist() {
        List<Libro> libros = new ArrayList<Libro>();

        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(libro);
        for (Libro libro1 : libros) {
            assertFalse(libro1.getAutor().equals("James"));
        }

    }
}