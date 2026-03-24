package cl.duoc.biblioteca.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Prestamo {

    @Min(value = 1, message = "El ID debe ser mayor a 0.")
    private int id;

    @Min(value = 1, message = "El ID del libro debe ser mayor a 0.")
    private int idLibro;

    @NotBlank(message = "El RUN es obligatorio.")
    @Size(min = 8, max = 9, message = "El RUN debe tener entre 8 y 9 caracteres.")
    private String run;

    @NotNull(message = "La fecha de solicitud es obligatoria.")
    @PastOrPresent(message = "La fecha de solicitud no puede ser una fecha futura.")
    private LocalDate fechaSolicitud;

    private LocalDate fechaEntrega;

    @Min(value = 1, message = "La cantidad de días debe ser al menos 1.")
    private int cantDias;

    @Min(value = 0, message = "La cantidad de multas debe ser positiva o 0.")
    private int multas;
}
