package yavirac.seguridad.feature.permiso;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class PermisoAuthority {

    @Id private long id;
    private Long permisoId;
    private Long authorityId;
    
}
