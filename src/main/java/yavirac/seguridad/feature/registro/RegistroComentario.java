package yavirac.seguridad.feature.registro;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data

public class RegistroComentario {
    
    @Id 
    private long id;
    private Long registroActividadId;
    private Long comentarioId;
    private String comentario;
}
