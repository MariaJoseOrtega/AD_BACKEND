package yavirac.seguridad.feature.rol;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("roles")
public class Rol {

    @Id
    @Column("rol_id")
    private long rolId;
    private String name;
    private boolean admin;
    private boolean enable;
    private boolean archived;
    private Timestamp updated;
    private Timestamp created;

    @MappedCollection(idColumn = "rol_id")
    private Set<RolAuthority> authorities = new HashSet<>();
}
