package yavirac.seguridad.feature.rol;

import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<Rol, Long> {
     List<Permiso> findAll();
     List<Permiso> findByNameLikeIgnoreCase(String term);  
}