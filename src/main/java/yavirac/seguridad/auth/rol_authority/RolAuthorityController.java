package yavirac.seguridad.auth.rol_authority;

import java.util.List;

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
@RequestMapping("/api/rolauthority")
@CrossOrigin({"*"})
public class RolAuthorityController {
    
    @Autowired
    RolAuthorityService authorityService;

  //CRUD

    //Create
    @PostMapping("/save")
    public RolAuthority save(@RequestBody RolAuthority rol){
        return authorityService.save(rol);
    }
    
    //Obtener todos 
    @GetMapping("/all")
    public Iterable<RolAuthority> buscarTodos(){
        return authorityService.find();
    }

    //Read
    @GetMapping("/{id}")
    public RolAuthority findById(@PathVariable long id){
        return authorityService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public RolAuthority update(@RequestBody RolAuthority rol)
    {
        return authorityService.save(rol);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        authorityService.deleteById(id);
    }
}
