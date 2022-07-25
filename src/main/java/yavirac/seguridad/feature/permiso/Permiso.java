package yavirac.seguridad.feature.permiso;

//import java.sql.Time;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("permisos")
public class Permiso {

    @Id
    @Column("permiso_id")
    private long permisoId;
    private String name;
    private String type;
    private String description;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    
}
