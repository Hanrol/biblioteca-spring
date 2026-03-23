package cl.duoc.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.biblioteca.model.Libro;
import cl.duoc.biblioteca.service.LibroService;
import jakarta.validation.Valid;




@RestController
@RequestMapping("api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregarLibro(@Valid @RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @GetMapping("{id}/id")
    public Libro buscarLibro(@PathVariable int id) {
        return libroService.getLibroId(id);
    }

    @GetMapping("{isbn}/isbn")
    public Libro buscarLibroIsbn(@PathVariable String isbn) {
        return libroService.getLibroIsbn(isbn);
    }

    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @Valid @RequestBody Libro libro) {
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id) {
        return libroService.deleteLibro(id);
    }

    @GetMapping("/total")
    public int totalLibros() {
        return libroService.totalLibros();
    }

    @GetMapping("{fechaPublicacion}/AñoPublicacion") 
    public int anioPulicacion(@PathVariable int fechaPublicacion) {
        return libroService.totalLibroYear(fechaPublicacion);
    }
    
    @GetMapping("autor/{autor}")
    public List<Libro> listarLibrosAutor(@PathVariable String autor) {
        return libroService.getLibroAutor(autor);
    }
    
    @GetMapping("/antiguo")
    public Libro libroMasAntiguo() {
        return libroService.getMasAntiguo();
    }

    @GetMapping("/nuevo")
    public Libro libroMasNuevo() {
        return libroService.getMasNuevo();
    }

    @GetMapping("/ordenados")
    public List<Libro> listarOrdenados() {
        return libroService.getLibrosOrdenados();
    }
}
