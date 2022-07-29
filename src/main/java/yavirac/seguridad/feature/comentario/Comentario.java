package yavirac.seguridad.feature.comentario;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Comentario {
    @Id
    private long comentarioId;
    private String opinion;
}