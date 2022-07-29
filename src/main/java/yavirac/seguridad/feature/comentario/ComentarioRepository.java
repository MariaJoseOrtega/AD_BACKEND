package yavirac.seguridad.feature.comentario;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ComentarioRepository extends CrudRepository<Comentario, Long> {

    List<Comentario> findByComentarioLikeIgnoreCase(String term);
    
}
