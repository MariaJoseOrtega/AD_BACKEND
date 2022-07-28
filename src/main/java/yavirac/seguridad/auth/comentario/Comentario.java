package yavirac.seguridad.auth.comentario;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("comentario")
public class Comentario {
    @Id
    @Column("comentario_id")
    private long comentarioId;
    private String opinion;
}