package yavirac.seguridad.feature.register;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class RegisterComent {
    
    @Id private Long id;
    private Long registerId;
    private Long comentId;
}
