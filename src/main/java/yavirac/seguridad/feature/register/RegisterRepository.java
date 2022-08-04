package yavirac.seguridad.feature.register;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RegisterRepository extends CrudRepository<Register, Long> {
    
    List<Register> findAll();
    List<Register> findByDetalleLikeIgnoreCase(String term);
}
 