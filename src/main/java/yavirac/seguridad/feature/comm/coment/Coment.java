package yavirac.seguridad.feature.comm.coment;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Coment {
    @Id
    private long id;
    private String name;
}