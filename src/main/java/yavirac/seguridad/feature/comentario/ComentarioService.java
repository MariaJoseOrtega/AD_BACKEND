package yavirac.seguridad.feature.comentario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ComentarioService {

    @Autowired
    ComentarioRepository comentarioRepository;

    public List<Comentario> findByOpinion(String term){
        return comentarioRepository.findByOpinionLikeIgnoreCase(term+"%");
    }

    public Comentario findById(long id){
        return comentarioRepository.findById(id).orElse(new Comentario());
    }
    
}







