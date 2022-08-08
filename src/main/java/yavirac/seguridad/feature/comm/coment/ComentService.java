package yavirac.seguridad.feature.comm.coment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ComentService {

    @Autowired
    ComentRepository comentRepository;

    public List<Coment> findByName(String term){
        return comentRepository.findByNameLikeIgnoreCase(term+"%");
    }

    public Coment findById(long id){
        return comentRepository.findById(id).orElse(new Coment());
    }
    
}







