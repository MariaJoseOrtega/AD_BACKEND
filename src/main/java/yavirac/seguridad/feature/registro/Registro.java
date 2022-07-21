package yavirac.seguridad.feature.registro;

import java.sql.Date;
import java.sql.Timestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("registro_actividad")
public class Registro {
    @Id
    @Column("registro_actividad_id")
    private long registroActividadId;
    private int actividad;
    private String comentario;
    private Date fecha;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private boolean archive;
    private String usuario;
}
