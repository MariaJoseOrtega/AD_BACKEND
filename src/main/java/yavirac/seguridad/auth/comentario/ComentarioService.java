package yavirac.seguridad.auth.comentario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ComentarioService {

    @Autowired
    ComentarioRepository comentarioRepository;

    public List<Comentario> findByName(String term){
        return comentarioRepository.findByNameLikeIgnoreCase(term+"%");
    }

    public Comentario findById(long id){
        return comentarioRepository.findById(id).orElse(new Comentario());
    }
    
}







