package cl.duoc.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.duoc.biblioteca.model.Prestamo;

@Repository
public class PrestamoRepository {

    private final List<Prestamo> listaPrestamos = new ArrayList<>(); 

    public List<Prestamo> obtenerPrestamos() {
        return listaPrestamos;
    }

    public Prestamo guardar(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
        return prestamo;
    }

    public Prestamo buscarPorId(int id) {
        return listaPrestamos.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
    }

    public Prestamo actualizar(Prestamo prestamo) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            if (listaPrestamos.get(i).getId() == prestamo.getId()) {
                listaPrestamos.set(i, prestamo);
                return prestamo;
            }
        }
        return null;
    }

    public void eliminar(int id){
        listaPrestamos.removeIf(x -> x.getId() == id);
    }

}
