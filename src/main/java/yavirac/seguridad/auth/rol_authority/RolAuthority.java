package yavirac.seguridad.auth.rol_authority;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;

@Data
public class RolAuthority {
    @Id
    private long id;
    
    @Column("rol_id")
    private long rolid;
    
    @Column("authority_id")
    private long authorityid;
    
}
