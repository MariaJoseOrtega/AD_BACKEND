package yavirac.seguridad.auth.comentario;

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

    @GetMapping("/findByName/{term}")
    public List<Comentario> findByName(@PathVariable String term){
        return comentarioService.findByName(term);
    }

    @GetMapping("/findById/{id}")
    public Comentario findById(@PathVariable long id){
        return comentarioService.findById(id);
    }

}
