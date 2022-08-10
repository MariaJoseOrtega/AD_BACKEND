package yavirac.seguridad.feature.permiso;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class PermisoRegister {

    @Id 
    private long id;
    private Long permisoId;
    private Long registerId;
    
}
