package yavirac.seguridad.feature.registro;

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
@RequestMapping("/api/registro")
@CrossOrigin({"*"})
public class RegistroController {
    @Autowired
    RegistroService registroService;

    //Create
    @PostMapping("/save")
    public Registro save(@RequestBody Registro registro){
        return registroService.save(registro);
    }

    //Read
    @GetMapping("/{id}")
    public Registro findById(@PathVariable long id){
        return registroService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Registro update(@RequestBody Registro registro)
    {
        return registroService.save(registro);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        registroService.deleteById(id);
    }

    @GetMapping("/findAll")
    public List<Registro> findAll(){
        return registroService.findAll();
    }

    @GetMapping("/findByList/{term}")
    public List<Registro> findByList(@PathVariable String term){
        return registroService.findByList(term);
    }
}
