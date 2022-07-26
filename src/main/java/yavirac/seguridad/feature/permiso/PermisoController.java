package yavirac.seguridad.feature.permiso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/permiso")
@CrossOrigin({"*"})
public class PermisoController {
    
    @Autowired
    PermisoService permisoService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Permiso save(@RequestBody Permiso permiso){
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println(permiso);
        return permisoService.save(permiso);
    }

    //Read
    @GetMapping("/{id}")
    public Permiso findById(@PathVariable long id){
        return permisoService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Permiso update(@RequestBody Permiso permiso)
    {
        return permisoService.save(permiso);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        permisoService.deleteById(id);
    }


}