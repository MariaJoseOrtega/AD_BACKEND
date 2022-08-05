package yavirac.seguridad.feature.permiso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/permiso")
@CrossOrigin({"*"})
public class PermisoController {
    
    @Autowired
    PermisoService permisoService;

    @GetMapping("/findAll")
    public List<Permiso> findAll(){
        return permisoService.findAll();
    }

    @GetMapping("/findById{id}")
    public Permiso findById(@PathVariable long id){
        return permisoService.findById(id);
    }
}