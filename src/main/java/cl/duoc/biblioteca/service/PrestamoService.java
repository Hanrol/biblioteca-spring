package cl.duoc.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.biblioteca.model.Prestamo;
import cl.duoc.biblioteca.repository.PrestamoRepository;


@Service
public class PrestamoService {
    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> getPrestamos() {
        return prestamoRepository.obtenerPrestamos();
    }

    public Prestamo savePrestamo(Prestamo prestamo) {
        return prestamoRepository.guardar(prestamo);
    }

    public Prestamo getPrestamoId(int id) {
        return prestamoRepository.buscarPorId(id);
    }

    public Prestamo updatePrestamo(Prestamo prestamo) {
        return prestamoRepository.actualizar(prestamo);
    }

    public String deletePrestamo(int id) {
        prestamoRepository.eliminar(id);
        return "Prestamo Eliminado";
    }

}
