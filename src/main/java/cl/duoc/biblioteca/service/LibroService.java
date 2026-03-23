package cl.duoc.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.biblioteca.model.Libro;
import cl.duoc.biblioteca.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id);
    }

    public Libro getLibroIsbn(String isbn) {
        return libroRepository.buscarPorIsbn(isbn);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id) {
        libroRepository.eliminar(id);
        return "Libro Eliminado";
    }

    public int totalLibros() {
        return libroRepository.totalLibros();
    }

    public int totalLibroYear(int anio) {
        return libroRepository.totalLibrosAnio(anio);
    }

    public List<Libro> getLibroAutor(String autor) {
        return libroRepository.buscarLibroAutor(autor);
    }

    public Libro getMasAntiguo() {
        return libroRepository.obtenerMasAntiguo();
    }

    public Libro getMasNuevo() {
        return libroRepository.obtenerMasNuevo();
    }

    public List<Libro> getLibrosOrdenados() {
        return libroRepository.obtenerOrdenadosPorAnio();
    }
}
