package yavirac.seguridad.feature.register;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("register")
public class Register {

    @Id
    @Column("register_id")
    private long registerId;
    private String detalle;
    private Timestamp fechaHoraDesde;
    private Timestamp fechaHoraHasta;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private boolean archive;
    
}
