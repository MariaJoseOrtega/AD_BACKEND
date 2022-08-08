package yavirac.seguridad.feature.register;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("register")
public class Register {

    @Id
    private long registerId;
    private String detalle;
    private Timestamp fechaHoraDesde;
    private Timestamp fechaHoraHasta;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private boolean archive;
    private Long permisoId;
    
    @MappedCollection(idColumn = "register_id")
    private Set <RegisterComent> coments = new HashSet<>();
}