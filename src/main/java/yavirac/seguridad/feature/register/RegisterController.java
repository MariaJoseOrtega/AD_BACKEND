package yavirac.seguridad.feature.register;

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
@RequestMapping("/api/register")
@CrossOrigin({"*"})
public class RegisterController {
    
    @Autowired
    RegisterService registerService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Register save(@RequestBody Register register){
        return registerService.save(register);
    }

    //Read
    @GetMapping("/{id}")
    public Register findById(@PathVariable long id){
        return registerService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Register update(@RequestBody Register register)
    {
        return registerService.save(register);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        registerService.deleteById(id);
    }

    @GetMapping("/findAll")
    public List<Register> findAll(){
        return registerService.findAll();
    }

    @GetMapping("/findByDetalle/{term}")
    public List<Register> findByDetalle(@PathVariable String term){
        return registerService.findByDetalle(term);
    }
}