package cl.duoc.biblioteca.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Libro {

    @Min(value = 1, message = "El ID debe ser mayor a 0.")
    private int id;

    @NotBlank(message = "El ISBN no puede estar vacío.")
    @Size(min = 10, max = 13, message = "El ISBN debe tener entre 10 y 13 caracteres.")
    private String isbn;

    @NotBlank(message = "El título es obligatorio.")
    private String titulo;

    @NotBlank(message = "La editorial es obligatoria.")
    private String editorial;

    @Min(value = 1450, message = "El año de publicación debe ser mayor a 1450.")
    private int fechaPublicacion;

    @NotBlank(message = "El autor es obligatorio.")
    private String autor;
}
