package yavirac.seguridad.auth.rol_authority;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolAuthorityService {
    
    @Autowired
    RolAuthorityRepository rolauthorityRepository;

    public Iterable<RolAuthority> find(){
        return rolauthorityRepository.findAll();
    }

    public RolAuthority save(RolAuthority rol){

        return rolauthorityRepository.save(rol);
    }


    public RolAuthority findById(long id){
        return rolauthorityRepository.findById(id).orElse(new RolAuthority());
    }

    public RolAuthority update(RolAuthority rol){
        return rolauthorityRepository.save(rol);
    }

    public void deleteById(long id){
        rolauthorityRepository.deleteById(id);
    }

}
