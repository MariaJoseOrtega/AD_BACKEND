package yavirac.seguridad.feature.comm.coment;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ComentRepository extends CrudRepository<Coment, Long> {

    List<Coment> findByNameLikeIgnoreCase(String term);
    
}
