package yavirac.seguridad.feature.person;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("persons")
public class Person {

    @Id
    private long personId;
    private String name;
    private String dni;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
}

