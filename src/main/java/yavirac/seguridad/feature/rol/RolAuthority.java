package yavirac.seguridad.feature.rol;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class RolAuthority {

    @Id private long id;
    private Long rolId;
    private Long authorityId;
    
}