package yavirac.seguridad.feature.permiso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermisoService {

    @Autowired
    PermisoRepository permisoRepository;

    //CRUD = Create, Read, Update, Delete

    public Permiso save(Permiso permiso){

        return permisoRepository.save(permiso);
    }

    public Permiso findById(long id){
        return permisoRepository.findById(id).orElse(new Permiso());
    }

    public Permiso update(Permiso permiso){
        return permisoRepository.save(permiso);
    }

    public void deleteById(long id){
        permisoRepository.deleteById(id);
    }
    
}
