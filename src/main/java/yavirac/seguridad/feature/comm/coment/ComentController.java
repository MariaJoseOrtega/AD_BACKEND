package yavirac.seguridad.feature.comm.coment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/coment")
@CrossOrigin({"*"})
public class ComentController {

    @Autowired
    ComentService comentService;

    @GetMapping("/findByName/{term}")
    public List<Coment> findByName(@PathVariable String term){
        return comentService.findByName(term);
    } 

    @GetMapping("/findById/{id}")
    public Coment findById(@PathVariable long id){
        return comentService.findById(id);
    }

}
