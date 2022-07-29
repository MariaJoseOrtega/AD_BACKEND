package yavirac.seguridad.feature.comentario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/comentario")
@CrossOrigin({"*"})
public class ComentarioController {

    @Autowired
    ComentarioService comentarioService;

    @GetMapping("/findByComentario/{term}")
    public List<Comentario> findByComentario(@PathVariable String term){
        return comentarioService.findByComentario(term);
    }

    @GetMapping("/findById/{id}")
    public Comentario findById(@PathVariable long id){
        return comentarioService.findById(id);
    }

}
